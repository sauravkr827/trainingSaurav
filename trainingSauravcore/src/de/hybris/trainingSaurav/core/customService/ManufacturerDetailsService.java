package de.hybris.trainingSaurav.core.customService;

import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.util.List;

public interface ManufacturerDetailsService {
    public ManufacturerDetailsModel getManufacturerDetailsById(int id);
    public List<ManufacturerDetailsModel> getListOfManufacturerData();
    public List<ManufacturerDetailsModel> paginationEX(int currentPage);
    public List<ManufacturerDetailsModel> paginationAPi(int currentPage);
    public List<ManufacturerDetailsModel> paginationApiSort(int currentPage);
    public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage);


}
