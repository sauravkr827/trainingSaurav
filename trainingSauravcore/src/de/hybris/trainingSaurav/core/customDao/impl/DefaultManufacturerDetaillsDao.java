package de.hybris.trainingSaurav.core.customDao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.servicelayer.data.SearchPageData;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchParameter;
import de.hybris.platform.servicelayer.search.paginated.PaginatedFlexibleSearchService;
import de.hybris.platform.servicelayer.search.paginated.constants.SearchConstants;
import de.hybris.platform.servicelayer.search.paginated.util.PaginatedSearchUtils;
import de.hybris.trainingSaurav.core.customDao.ManufacturerDetailsDao;
import de.hybris.trainingSaurav.core.model.ManufacturerDetailsModel;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultManufacturerDetaillsDao implements ManufacturerDetailsDao {


    FlexibleSearchService flexibleSearchService;
    PaginatedFlexibleSearchService paginatedFlexibleSearchService;
    ModelService modelService;

    @Override
    public ManufacturerDetailsModel getManufacturerDetailsById(int id)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("SELECT {").append(ManufacturerDetailsModel.PK);
        stringBuilder.append("} FROM {").append(ManufacturerDetailsModel._TYPECODE);
        stringBuilder.append("} WHERE {").append(ManufacturerDetailsModel.ID);
        stringBuilder.append("}=?id");
        FlexibleSearchQuery fQuery=new FlexibleSearchQuery(stringBuilder);

        fQuery.addQueryParameter("id",id);

        SearchResult<ManufacturerDetailsModel> searchResult=getFlexibleSearchService().search(fQuery);
        return searchResult.getResult().get(0);
    }


    @Override
    public List<ManufacturerDetailsModel> getListOfManufacturerData()
    {
        String query="SELECT{"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";

          SearchResult<ManufacturerDetailsModel> searchResult=getFlexibleSearchService().search(query);

        return searchResult.getResult();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationEX(int currentPage)
    {
        int range=10;
        int start=currentPage;
        start=start*range;

        String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM{"+ManufacturerDetailsModel._TYPECODE+"}";
        FlexibleSearchQuery fQuery=new FlexibleSearchQuery(query);

        fQuery.setCount(range);
        fQuery.setNeedTotal(true);
            fQuery.setStart(start);
            SearchResult<ManufacturerDetailsModel> searchResult = getFlexibleSearchService().search(fQuery);
            return searchResult.getResult();

    }

    @Override
    public List<ManufacturerDetailsModel> paginationAPi(int currentPage) {

        int pageSize=5;
      String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";
       FlexibleSearchQuery flexibleSearchQuery=new FlexibleSearchQuery(query);



        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(flexibleSearchQuery);

        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(ManufacturerDetailsModel.ID, SearchConstants.DESCENDING);

        parameter.setSortCodeToQueryAlias(hashMap);

        SearchPageData searchPageData= PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,true);
        parameter.setSearchPageData(searchPageData);

        SearchPageData searchPageData1=getPaginatedFlexibleSearchService().search(parameter);

        return searchPageData1.getResults();


    }

    @Override
    public List<ManufacturerDetailsModel> paginationApiSort(int currentPage)
    {
        int pageSize=5;
        String query="SELECT {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"}";
        FlexibleSearchQuery flexibleSearchQuery=new FlexibleSearchQuery(query);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(flexibleSearchQuery);

        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(ManufacturerDetailsModel.ID, SearchConstants.DESCENDING);

        parameter.setSortCodeToQueryAlias(hashMap);

        SearchPageData searchPageData= PaginatedSearchUtils.createSearchPageDataWithPaginationAndSorting(pageSize,currentPage,true,hashMap);
        parameter.setSearchPageData(searchPageData);

        SearchPageData searchPageData1=getPaginatedFlexibleSearchService().search(parameter);

        return searchPageData1.getResults();
    }

    @Override
    public List<ManufacturerDetailsModel> paginationOrderByDesc(int currentPage)
    {
        int pageSize=5;
        boolean needTotal=true;
        String query="SELECT  {"+ManufacturerDetailsModel.PK+"} FROM {"+ManufacturerDetailsModel._TYPECODE+"} ORDER BY {"+ManufacturerDetailsModel.ID+"} DESC";
        FlexibleSearchQuery flexibleSearchQuery =new FlexibleSearchQuery(query);

        PaginatedFlexibleSearchParameter parameter=new PaginatedFlexibleSearchParameter();
        parameter.setFlexibleSearchQuery(flexibleSearchQuery);

        SearchPageData searchPageData=  PaginatedSearchUtils.createSearchPageDataWithPagination(pageSize,currentPage,needTotal);
        parameter.setSearchPageData(searchPageData);


        SearchPageData<ManufacturerDetailsModel>searchPageData1=getPaginatedFlexibleSearchService().search(parameter);
        return searchPageData1.getResults();
    }


    /*Product Data*/
    @Override
    public List<ProductModel> getProductData(int noOfProduct) {


        String query="SELECT{"+ProductModel.PK+"} FROM {"+ProductModel._TYPECODE+"}";

        final FlexibleSearchQuery fquery = new FlexibleSearchQuery(query);

        fquery.setCount(noOfProduct);

        SearchResult<ProductModel> searchResult=getFlexibleSearchService().search(fquery);

        return searchResult.getResult();
    }







    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public PaginatedFlexibleSearchService getPaginatedFlexibleSearchService() {
        return paginatedFlexibleSearchService;
    }

    public void setPaginatedFlexibleSearchService(PaginatedFlexibleSearchService paginatedFlexibleSearchService) {
        this.paginatedFlexibleSearchService = paginatedFlexibleSearchService;
    }
}
