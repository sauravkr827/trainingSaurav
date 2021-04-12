package de.hybris.trainingSaurav.facades.customFacade.impl;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.converter.ProductConverter;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.trainingSaurav.core.customService.impl.DefaultManufacturerDetailsService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;
import de.hybris.trainingSaurav.facades.customFacade.ManufacturerDetailsFacade;
import de.hybris.trainingSaurav.facades.product.data.ManufacturerDetailsData;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DefaultManufacturerDetailsFacade extends DefaultProductFacade implements ManufacturerDetailsFacade {

    Logger logger=Logger.getLogger(DefaultManufacturerDetailsFacade.class);
    DefaultManufacturerDetailsService manufacturerDetailsService;
    Converter<ManufacturerDetailsModel,ManufacturerDetailsData> manufacturerDetailsDataConverter;

    @Override
    public ManufacturerDetailsData getManufacturerDetailsById(int id) {

        ManufacturerDetailsModel detailsModel=getManufacturerDetailsService().getManufacturerDetailsById(id);

        ManufacturerDetailsData detailsData=getManufacturerDetailsDataConverter().convert(detailsModel);

        return detailsData;
    }

    @Override
    public List<ManufacturerDetailsData> getListOfManufacturerData() {


        List<ManufacturerDetailsModel> manufacturerDetailsModels=getManufacturerDetailsService().getListOfManufacturerData();
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModels);
        return manufacturerDetailsData;
    }

    @Override
    public List<ManufacturerDetailsData> paginationEX(int currentPage) {
        List<ManufacturerDetailsModel> manufacturerDetailsModels=getManufacturerDetailsService().paginationEX(currentPage);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModels);
        return manufacturerDetailsData;
    }

    @Override
    public List<ManufacturerDetailsData> paginationAPi(int currentPage) {
        List<ManufacturerDetailsModel> manufacturerDetailsModels=getManufacturerDetailsService().paginationAPi(currentPage);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModels);
        return manufacturerDetailsData;
    }

    @Override
    public List<ManufacturerDetailsData> paginationApiSort(int currentPage) {
        List<ManufacturerDetailsModel> manufacturerDetailsModels=getManufacturerDetailsService().paginationApiSort(currentPage);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModels);
        return manufacturerDetailsData;
    }

    @Override
    public List<ManufacturerDetailsData> paginationOrderByDesc(int currentPage) {
        List<ManufacturerDetailsModel> manufacturerDetailsModels=getManufacturerDetailsService().paginationOrderByDesc(currentPage);
        List<ManufacturerDetailsData> manufacturerDetailsData=getManufacturerDetailsDataConverter().convertAll(manufacturerDetailsModels);
        return manufacturerDetailsData;
    }

    @Override
    public List<ProductData> getProductData(int noOfProduct) {

        List<ProductModel> modelList=getManufacturerDetailsService().getProductData(noOfProduct);

        List<ProductData> productDataList = new ArrayList<>();
        final List<ProductOption> options = new ArrayList(Arrays.asList( ProductOption.URL, ProductOption.PRICE,ProductOption.IMAGES,ProductOption.DESCRIPTION,ProductOption.BASIC));
        for(ProductModel productModel:modelList){

            productDataList.add( getProductForCodeAndOptions(productModel.getCode(),options));

        }

        return productDataList;
    }

    @Override
    public ProductData getProductForCodeAndOptions(String code, Collection collection) {
        return super.getProductForCodeAndOptions(code, collection);
    }

    public DefaultManufacturerDetailsService getManufacturerDetailsService() {
        return manufacturerDetailsService;
    }

    public void setManufacturerDetailsService(DefaultManufacturerDetailsService manufacturerDetailsService) {
        this.manufacturerDetailsService = manufacturerDetailsService;
    }

    public Converter<ManufacturerDetailsModel, ManufacturerDetailsData> getManufacturerDetailsDataConverter() {
        return manufacturerDetailsDataConverter;
    }

    public void setManufacturerDetailsDataConverter(Converter<ManufacturerDetailsModel, ManufacturerDetailsData> manufacturerDetailsDataConverter) {
        this.manufacturerDetailsDataConverter = manufacturerDetailsDataConverter;
    }


}
