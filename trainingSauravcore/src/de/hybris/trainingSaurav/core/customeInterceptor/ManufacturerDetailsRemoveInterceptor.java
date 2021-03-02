package de.hybris.trainingSaurav.core.customeInterceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsAuditEntryModel;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.util.Date;


public class ManufacturerDetailsRemoveInterceptor implements RemoveInterceptor {

  /*  final Map<String, Object> params = ImmutableMap.of(InterceptorExecutionPolicy.DISABLED_INTERCEPTOR_BEANS, ImmutableSet.of("manufacturerDetailValidateInterceptor"));
//        sessionService.executeInLocalViewWithParams(params, new SessionExecutionBody()

    {
        @Override
        public void executeWithoutResult()
        {
            modelService.save(manufacturerDetailsModel);    // save successful - all validate interceptors are disabled
        }
    });
*/

    @Override
    public void onRemove(Object o, InterceptorContext ctx) throws InterceptorException {
        if (o instanceof ManufacturerDetailsModel) {
            ManufacturerDetailsModel model = (ManufacturerDetailsModel) o;

            ManufacturerDetailsAuditEntryModel auditEntryModel=ctx.getModelService().create(ManufacturerDetailsAuditEntryModel.class);

            auditEntryModel.setId(model.getId());
            auditEntryModel.setName(model.getName());
            auditEntryModel.setRmvCreationTime(new Date());

            ctx.registerElementFor(auditEntryModel,PersistenceOperation.SAVE);


        }
    }
}
/* if (o instanceof ManufacturerDetailsModel) {
            ManufacturerDetailsModel model = (ManufacturerDetailsModel) o;

            ManufacturerDetailsAuditEntryModel auditEntryModel=ctx.getModelService().create(CountryModel.class);

            auditEntryModel.setId(model.getId());
            auditEntryModel.setCountry(model.getCountry());
            auditEntryModel.setRmvCreationTime(new Date());

            ctx.registerElementFor(auditEntryModel,PersistenceOperation.DELETE);
*/