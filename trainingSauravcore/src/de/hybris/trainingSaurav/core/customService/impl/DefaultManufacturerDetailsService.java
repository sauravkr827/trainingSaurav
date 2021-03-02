package de.hybris.trainingSaurav.core.customService.impl;

import de.hybris.trainingSaurav.core.customDao.impl.DefaultManufacturerDetaillsDao;
import de.hybris.trainingSaurav.core.customService.ManufacturerDetailsService;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;

import java.util.List;

public class DefaultManufacturerDetailsService implements ManufacturerDetailsService {


    DefaultManufacturerDetaillsDao manufacturerDetaillsDao;

    @Override
    public ManufacturerDetailsModel getManufacturerDetailsById(int id)
    {
        return getManufacturerDetaillsDao().getManufacturerDetailsById(id);
    }

    @Override
    public List<ManufacturerDetailsModel> getListOfManufacturerData() {
        return getManufacturerDetaillsDao().getListOfManufacturerData();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationEX(int currentPage) {
        return getManufacturerDetaillsDao().paginationEX(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationAPi(int currentPage) {
        return getManufacturerDetaillsDao().paginationAPi(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationApiSort(int currentPage) {
        return getManufacturerDetaillsDao().paginationApiSort(currentPage);
    }

    @Override
    public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage) {
        return getManufacturerDetaillsDao().paginationOrderByDesc(currentPage);
    }




    public DefaultManufacturerDetaillsDao getManufacturerDetaillsDao() {
        return manufacturerDetaillsDao;
    }

    public void setManufacturerDetaillsDao(DefaultManufacturerDetaillsDao manufacturerDetaillsDao) {
        this.manufacturerDetaillsDao = manufacturerDetaillsDao;
    }
}
