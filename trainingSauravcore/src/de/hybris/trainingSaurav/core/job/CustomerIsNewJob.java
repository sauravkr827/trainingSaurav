package de.hybris.trainingSaurav.core.job;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobHistoryModel;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.cronjob.impl.DefaultCronJobHistoryService;
import de.hybris.trainingSaurav.core.customService.impl.DefaultCustomer1Service;
import de.hybris.trainingSaurav.core.model.CustomerIsNewCronJobModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class CustomerIsNewJob extends AbstractJobPerformable<CustomerIsNewCronJobModel> {


    private DefaultCustomer1Service defaultCustomer1Service;

    @Autowired
    DefaultCronJobHistoryService defaultCronJobHistoryService;

    private final static Logger LOG = Logger.getLogger(CustomerIsNewJob.class);


    @Override
    public PerformResult perform(CustomerIsNewCronJobModel customerIsNewCronJobModel)
    {
        int noOfDaysToConsider=customerIsNewCronJobModel.getNoOfDaysToConsider();
        if(noOfDaysToConsider!=0) {

            List<CronJobHistoryModel> cronJobHistoryModels=customerIsNewCronJobModel.getCronJobHistoryEntries();

            Date endTimeOfPreviousCronJob= cronJobHistoryModels.get(0).getEndTime();

            if (endTimeOfPreviousCronJob==null)
            {
                final List<CustomerModel> customerModelList = defaultCustomer1Service.getOldRegCustomers(noOfDaysToConsider);
                LOG.info("First Cron job triggered ============= Number Of New Users:" + customerModelList.size());

            }

            else {



                final CronJobHistoryModel expected = customerIsNewCronJobModel.getCronJobHistoryEntries().get(0);
                List<CustomerModel> customerModels = defaultCustomer1Service.checkHistoryOfCronJob(expected.getEndTime());

                LOG.info("latest Cron Job triggered record" + customerModels.toString() + "====Size of record====" + customerModels.size());

            }

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


    public DefaultCronJobHistoryService getDefaultCronJobHistoryService() {
        return defaultCronJobHistoryService;
    }

    public void setDefaultCronJobHistoryService(DefaultCronJobHistoryService defaultCronJobHistoryService) {
        this.defaultCronJobHistoryService = defaultCronJobHistoryService;
    }
}
