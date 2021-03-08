package de.hybris.trainingSaurav.facades.customFacade.impl;

import de.hybris.trainingSaurav.core.customService.impl.DefaultCustomer1Service;
import de.hybris.trainingSaurav.core.model.Customer1Model;
import de.hybris.trainingSaurav.facades.customFacade.Customer1Facade;
import de.hybris.trainingSaurav.facades.product.data.Customer1Data;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.Date;
import java.util.List;

public class DefaultCustomer1Facade implements Customer1Facade
{
    DefaultCustomer1Service defaultCustomer1Service;
    Converter<Customer1Model,Customer1Data> customer1DataConverter;

    @Override
    public List<Customer1Data> getListOfCustomer() {

        List<Customer1Model> customer1Models=defaultCustomer1Service.getListOfCustomer();

        List<Customer1Data> customer1Data=getCustomer1DataConverter().convertAll(customer1Models);
        return customer1Data;
    }

    @Override
    public Date getCreationDate() {
        return null;
    }

    public DefaultCustomer1Service getDefaultCustomer1Service() {
        return defaultCustomer1Service;
    }

    public void setDefaultCustomer1Service(DefaultCustomer1Service defaultCustomer1Service) {
        this.defaultCustomer1Service = defaultCustomer1Service;
    }

    public Converter<Customer1Model, Customer1Data> getCustomer1DataConverter() {
        return customer1DataConverter;
    }

    public void setCustomer1DataConverter(Converter<Customer1Model, Customer1Data> customer1DataConverter) {
        this.customer1DataConverter = customer1DataConverter;
    }
}
