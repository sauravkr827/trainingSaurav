package de.hybris.trainingSaurav.facades.customFacade;

import de.hybris.trainingSaurav.facades.product.data.ManufacturerDetailsData;

import java.util.List;

public interface ManufacturerDetailsFacade {

    public ManufacturerDetailsData getManufacturerDetailsById(int id);
    public List<ManufacturerDetailsData> getListOfManufacturerData();
    public List<ManufacturerDetailsData> paginationEX(int currentPage);
    public List<ManufacturerDetailsData> paginationAPi(int currentPage);
    public List<ManufacturerDetailsData> paginationApiSort(int currentPage);
    public List<ManufacturerDetailsData> paginationOrderByDesc(int currentPage);

}
