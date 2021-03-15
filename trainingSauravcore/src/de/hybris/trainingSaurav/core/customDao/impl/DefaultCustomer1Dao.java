package de.hybris.trainingSaurav.core.customDao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingSaurav.core.customDao.Customer1Dao;
import de.hybris.trainingSaurav.core.job.Customer1RemovalJob;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class DefaultCustomer1Dao implements Customer1Dao {


    FlexibleSearchService flexibleSearchService;

    private final static Logger LOG = Logger.getLogger(DefaultCustomer1Dao.class);

    @Override
    public List<Customer1Model> getListOfCustomer() {

       /* String query="SELECT{"+ Customer1Model.PK+"} FROM {"+Customer1Model._TYPECODE+"} WHERE {"+Customer1Model.CREATIONTIME+"}";*/
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -10);
        Date todate1 = cal.getTime();
        String fromdate = dateFormat.format(todate1);

        StringBuilder sb=new StringBuilder();

        sb.append("SELECT {").append(Customer1Model.PK);
        sb.append("} FROM {").append(Customer1Model._TYPECODE).append("}");
        sb.append(" WHERE {").append(Customer1Model.CUSTOMERCREATED);
        sb.append("} >= ?fromdate");
        //sb.append(fromdate);
         FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);
         fquery.addQueryParameter("fromdate",fromdate);

         SearchResult<Customer1Model> searchResult=getFlexibleSearchService().search(fquery);
        validateParameterNotNull(searchResult, "No list of customer founded");

        System.out.println("============================DefaultCustomer1Dao "+searchResult);
        return searchResult.getResult();
    }

    @Override
    public List<Customer1Model> getOldCustomerData(Date OldDate) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String oldDate = dateFormat.format(OldDate);

        StringBuilder sb=new StringBuilder();

        sb.append("SELECT {").append(Customer1Model.PK);
        sb.append("} FROM {").append(Customer1Model._TYPECODE).append("}");
        sb.append(" WHERE {").append(Customer1Model.CUSTOMERCREATED);
        sb.append("} <= ?oldDate");
        //sb.append(fromdate);
        FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);
        fquery.addQueryParameter("oldDate",oldDate);

        SearchResult<Customer1Model> searchResult=getFlexibleSearchService().search(fquery);
        validateParameterNotNull(searchResult, "No list of customer founded");

        System.out.println("============================DefaultCustomer1Dao "+searchResult);
        return searchResult.getResult();
    }



    /*--------------------------Existing Customer------------------------------*/

    @Override
    public List<CustomerModel> getOldRegCustomers(String preDate)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("SELECT {").append(CustomerModel.PK);
        sb.append("} FROM {").append(CustomerModel._TYPECODE).append("}");
        sb.append(" WHERE {").append(CustomerModel.CREATIONTIME);
        sb.append("} >= ?preDate");

        FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);
        fquery.addQueryParameter("preDate",preDate);

        SearchResult<CustomerModel> searchResult=getFlexibleSearchService().search(fquery);
        validateParameterNotNull(searchResult, "No list of customer founded");


        LOG.info("No Of New Registered Customer==========="+searchResult.getCount());

        return searchResult.getResult();

    }

    @Override
    public List<CustomerModel> getListOfCustomerFromExisting()

    {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -10);
        Date todate1 = cal.getTime();
        String fromdate = dateFormat.format(todate1);

        StringBuilder sb=new StringBuilder();

        sb.append("SELECT {").append(CustomerModel.PK);
        sb.append("} FROM {").append(CustomerModel._TYPECODE).append("}");
        sb.append(" WHERE {").append(CustomerModel.CREATIONTIME);
        sb.append("} >= ?fromdate");
        //sb.append(fromdate);
        FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);
        fquery.addQueryParameter("fromdate",fromdate);

        SearchResult<CustomerModel> searchResult=getFlexibleSearchService().search(fquery);
        validateParameterNotNull(searchResult, "No list of customer founded");

        System.out.println("============================DefaultCustomer1Dao "+searchResult);
        return searchResult.getResult();
    }


    @Override
    public Customer1Model getCreationDate(int customerId) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("SELECT {").append(Customer1Model.PK);
        stringBuilder.append("} FROM {").append(Customer1Model._TYPECODE);
        stringBuilder.append("} WHERE {").append(Customer1Model.CUSTOMERID);
        stringBuilder.append("}=?customerId");
        FlexibleSearchQuery fQuery=new FlexibleSearchQuery(stringBuilder);

        fQuery.addQueryParameter("customerId",customerId);

        SearchResult<Customer1Model> searchResult=getFlexibleSearchService().search(fQuery);
        return searchResult.getResult().get(0);
    }




    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
