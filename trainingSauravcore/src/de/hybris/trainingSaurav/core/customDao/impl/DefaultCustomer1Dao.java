package de.hybris.trainingSaurav.core.customDao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.trainingSaurav.core.customDao.Customer1Dao;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DefaultCustomer1Dao implements Customer1Dao {


    FlexibleSearchService flexibleSearchService;

    @Override
    public List<Customer1Model> getListOfCustomer() {
        Date now=new Date();
       /* String query="SELECT{"+ Customer1Model.PK+"} FROM {"+Customer1Model._TYPECODE+"} WHERE {"+Customer1Model.CREATIONTIME+"}";*/

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        Date date = new Date();
        String todate = dateFormat.format(date);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        Date todate1 = cal.getTime();
        String fromdate = dateFormat.format(todate1);

        System.out.println("===================================Last 7 date"+fromdate);

        StringBuilder sb=new StringBuilder();

        sb.append("SELECT {").append(Customer1Model.PK);
        sb.append("}FROM{").append(Customer1Model._TYPECODE).append("}");
        sb.append("WHERE{").append(Customer1Model.CREATIONTIME);
        sb.append("}<=?fromdate");
         FlexibleSearchQuery fquery=new FlexibleSearchQuery(sb);

         SearchResult<Customer1Model> searchResult=getFlexibleSearchService().search(fquery);

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
