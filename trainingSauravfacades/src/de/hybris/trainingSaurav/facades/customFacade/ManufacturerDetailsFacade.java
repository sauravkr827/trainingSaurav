package de.hybris.trainingSaurav.facades.customFacade;


import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.trainingSaurav.facades.product.data.ManufacturerDetailsData;

import java.util.List;

public interface ManufacturerDetailsFacade {

    public ManufacturerDetailsData getManufacturerDetailsById(int id);
    public List<ManufacturerDetailsData> getListOfManufacturerData();
    public List<ManufacturerDetailsData> paginationEX(int currentPage);
    public List<ManufacturerDetailsData> paginationAPi(int currentPage);
    public List<ManufacturerDetailsData> paginationApiSort(int currentPage);
    public List<ManufacturerDetailsData> paginationOrderByDesc(int currentPage);

    public List<ProductData>  getProductData(int noOfProduct);

}
