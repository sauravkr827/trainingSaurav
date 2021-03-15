package de.hybris.trainingSaurav.core.job;

import com.sap.db.jdbc.Transaction;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelRemovalException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.trainingSaurav.core.customDao.impl.DefaultCustomer1Dao;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.core.model.Customer1RemovalCronJobModel;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Customer1RemovalJob extends AbstractJobPerformable<Customer1RemovalCronJobModel> {


    public static final String SITE_UID = "electronics";
    private DefaultCustomer1Dao customer1Dao;
    private ModelService modelService;




    public DefaultCustomer1Dao getCustomer1Dao() {
        return customer1Dao;
    }

    public void setCustomer1Dao(DefaultCustomer1Dao customer1Dao) {
        this.customer1Dao = customer1Dao;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    private final static Logger LOG = Logger.getLogger(Customer1RemovalJob.class);

    @Override
    public PerformResult perform(Customer1RemovalCronJobModel customer1RemovalCronJobModel) {

        final int noOfDaysOldToRemove = customer1RemovalCronJobModel.getXDaysOld();


        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOldToRemove);
        final Date oldDate = cal.getTime();


        final List<Customer1Model> customer1ModelListToBeDeleted = new ArrayList<>();
        final List<Customer1Model> customer1ModelList = customer1Dao.getOldCustomerData(oldDate);

        System.out.println("Customer1=========== older than specified days size:" + customer1ModelList.size());
        for (final Customer1Model customer1Model : customer1ModelList) {
            if (customer1Model != null) {
                customer1ModelListToBeDeleted.add(customer1Model);
                LOG.info("===================TObeDeleting"+customer1Model);
            }
        }

        if(!CollectionUtils.isEmpty(customer1ModelListToBeDeleted)) {

            getModelService().removeAll(customer1ModelListToBeDeleted);

        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

    }

}

