package de.hybris.trainingSaurav.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.trainingSaurav.core.customService.impl.DefaultCustomer1Service;
import de.hybris.trainingSaurav.core.model.CustomerIsNewCronJobModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class CustomerIsNewJob extends AbstractJobPerformable<CustomerIsNewCronJobModel> {


    private DefaultCustomer1Service defaultCustomer1Service;

    private final static Logger LOG = Logger.getLogger(CustomerIsNewJob.class);


    @Override
    public PerformResult perform(CustomerIsNewCronJobModel customerIsNewCronJobModel)
    {
        int noOfDaysToConsider=customerIsNewCronJobModel.getNoOfDaysToConsider();
        if(noOfDaysToConsider!=0)
        {
            final List<CustomerModel> customerModelList = defaultCustomer1Service.getOldRegCustomers(noOfDaysToConsider);
            LOG.info("Customer=========== Number Of New Users:" + customerModelList.size());
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

    }



    public DefaultCustomer1Service getDefaultCustomer1Service() {
        return defaultCustomer1Service;
    }

    @Required
    public void setDefaultCustomer1Service(DefaultCustomer1Service defaultCustomer1Service) {
        this.defaultCustomer1Service = defaultCustomer1Service;
    }
}
