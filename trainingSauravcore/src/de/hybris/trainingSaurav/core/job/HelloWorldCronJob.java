package de.hybris.trainingSaurav.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.trainingSaurav.core.model.HelloWorldJobModel;

public class HelloWorldCronJob extends AbstractJobPerformable<HelloWorldJobModel> {

    @Override
    public PerformResult perform(HelloWorldJobModel helloWorldJobModel) {
   try {
       String firstName = helloWorldJobModel.getFirstName();

       // Display Hello firstName
       System.out.println("----------------------------------Hello " + firstName);

       return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
   }

   catch(Exception e) {

       // In case of exception return result: ERROR and status: ABORTED
       return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);

   }
    }

}
