package de.hybris.trainingSaurav.core.customQualifierProvider;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.provider.Qualifier;
import de.hybris.platform.solrfacetsearch.provider.QualifierProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.CurrencyQualifierProvider;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.*;

public class CustomUserPriceGroupQualifierProvider implements QualifierProvider {

  Logger logger=Logger.getLogger(CustomUserPriceGroupQualifierProvider.class);

    private CommonI18NService commonI18NService;
    private final Set<Class<?>> supportedTypes;
    private SessionService sessionService;


    public CustomUserPriceGroupQualifierProvider()
    {
        Set<Class<?>> types = new HashSet();
        types.add(UserPriceGroup.class);
        types.add(Locale.class);
        this.supportedTypes= Collections.unmodifiableSet(types);
    }

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    @Required
    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }

    @Override
    public Set<Class<?>> getSupportedTypes() {
        return null;
    }

    public SessionService getSessionService() {
        return sessionService;
    }

    @Required
    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }




    @Override
    public Collection<Qualifier> getAvailableQualifiers(FacetSearchConfig facetSearchConfig, IndexedType indexedType) {
        Objects.requireNonNull(facetSearchConfig, "facetSearchConfig is null");
        Objects.requireNonNull(indexedType, "indexedType is null");

        logger.info("================== getAvailableQualifiers is calling");
        List<Qualifier> qualifiers = new ArrayList();
        List<UserGroupModel> UserGroup  = facetSearchConfig.getIndexConfig().getUserGroup();
        Iterator var6=facetSearchConfig.getIndexConfig().getCurrencies().iterator();

        while(var6.hasNext()) {
            CurrencyModel currency = (CurrencyModel) var6.next();
            if (UserGroup != null) {
                UserPriceGroup userPriceGroup=null;

                for (UserGroupModel userGroupModel:UserGroup )
                {

                     userPriceGroup=userGroupModel.getUserPriceGroup();
                }
                Qualifier qualifier = new CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier(currency, userPriceGroup);
                qualifiers.add(qualifier);
                logger.info("================== getAvailableQualifiers    two parameter constructor is calling");

            }

            else
                {
                Qualifier qualifier = new CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier(currency);
                qualifiers.add(qualifier);
                    logger.info("================== getAvailableQualifiers  single parameter constructor is calling");
            }

        }
        return Collections.unmodifiableList(qualifiers);
    }





    @Override
    public boolean canApply(IndexedProperty indexedProperty) {
        return true;
    }




    @Override
    public void applyQualifier(Qualifier qualifier) {

        UserPriceGroup userPriceGroup=((CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier)qualifier).getUserPriceGroup();

       logger.info("=======================applyQualifier is calling====================");

        Objects.requireNonNull(qualifier, "qualifier is null");
        if (!(qualifier instanceof CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier)) {
            throw new IllegalArgumentException("provided qualifier is not of expected type");
        } else {
            if(userPriceGroup!=null) {
                this.commonI18NService.setCurrentCurrency(((CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier) qualifier).getCurrency());
                this.sessionService.setAttribute(UserModel.EUROPE1PRICEFACTORY_UPG, userPriceGroup);

            }

            else {
                this.commonI18NService.setCurrentCurrency(((CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier) qualifier).getCurrency());
            }
        }

    }





    @Override
    public Qualifier getCurrentQualifier() {
        CurrencyModel currency = this.commonI18NService.getCurrentCurrency();
        return currency == null ? null :  new CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier(currency);
    }







    /*=====================================================================================================*/

    /*-------------------------------------CustomQualifier-------------------------------------------------*/


    protected static class CustomUserPriceGroupQualifier implements Qualifier {

        Logger logger=Logger.getLogger(CustomUserPriceGroupQualifier.class);

        private final CurrencyModel currency;

        private   UserPriceGroup userPriceGroup;


        public UserPriceGroup getUserPriceGroup() {
            return userPriceGroup;
        }

        public CustomUserPriceGroupQualifier(CurrencyModel currency) {
            Objects.requireNonNull(currency, "currency is null");
            this.currency = currency;
        }




        public CustomUserPriceGroupQualifier(CurrencyModel currency ,UserPriceGroup userPriceGroup ) {
            Objects.requireNonNull(userPriceGroup, "currency is null");


            this.currency = currency;
            this.userPriceGroup=userPriceGroup;
        }





        public CurrencyModel getCurrency() {
            return this.currency;
        }

        public <U> U getValueForType(Class<U> type) {
            Objects.requireNonNull(type, "type is null");
            if (Objects.equals(type, CurrencyModel.class)) {
                return (U) this.currency;
            } else {
                throw new IllegalArgumentException("type not supported");
            }
        }



        public String toFieldQualifier() {
            if(userPriceGroup!=null)
                return this.currency.getIsocode()+"_"+userPriceGroup.getCode();
            else
                return this.currency.getIsocode();
        }


        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj != null && this.getClass() == obj.getClass()) {
                CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier that = (CustomUserPriceGroupQualifierProvider.CustomUserPriceGroupQualifier)obj;
                return (new EqualsBuilder()).append(this.currency, that.currency).isEquals();
            } else {
                return false;
            }
        }


        public int hashCode() {
            return this.currency.hashCode();
        }
    }

}
