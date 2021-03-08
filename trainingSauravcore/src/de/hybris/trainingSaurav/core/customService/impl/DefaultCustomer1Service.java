package de.hybris.trainingSaurav.core.customService.impl;

import de.hybris.trainingSaurav.core.customDao.impl.DefaultCustomer1Dao;
import de.hybris.trainingSaurav.core.customService.Customer1Service;
import de.hybris.trainingSaurav.core.model.Customer1Model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultCustomer1Service implements Customer1Service {

     DefaultCustomer1Dao defaultCustomer1Dao;

    @Override
    public List<Customer1Model> getListOfCustomer() {

        return defaultCustomer1Dao.getListOfCustomer();
    }

    @Override
    public Date getCreationDate() {
        return null;
    }

    public DefaultCustomer1Dao getDefaultCustomer1Dao() {
        return defaultCustomer1Dao;
    }

    @Override
    public void checkOldAndNew(Customer1Model customer1Model) {


        Date modelCreationTime = customer1Model.getCustomerCreated();

        Calendar calendar = Calendar.getInstance();

        Date todayDate = calendar.getTime();

        long diff = (todayDate.getTime()) - (modelCreationTime.getTime());

        long diff_In_Days = (diff / (1000 * 60 * 60 * 24)) % 365;
        if (diff_In_Days < 10) {
            customer1Model.setNewCustomer(true);
        }
        else {
            customer1Model.setNewCustomer(false);
        }


    }

    public void setDefaultCustomer1Dao(DefaultCustomer1Dao defaultCustomer1Dao) {
        this.defaultCustomer1Dao = defaultCustomer1Dao;
    }
}
