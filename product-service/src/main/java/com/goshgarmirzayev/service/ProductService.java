package com.goshgarmirzayev.service;

import com.goshgarmirzayev.entity.Product;
import com.goshgarmirzayev.reponse.ApiResponse;
import com.goshgarmirzayev.reponse.ApiResponseEnum;
import com.goshgarmirzayev.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ApiResponse getAllProducts(){
        ApiResponse apiResponse= new ApiResponse();
        try{
            Iterable<Product> prList=productRepository.findAll();
            if (prList.iterator().hasNext()){
                apiResponse.setCode(ApiResponseEnum.SUCCESS.getValue());
                apiResponse.setResponse(prList);
                apiResponse.setMessageAZ("Emeliyyat Ugurla Tamamlandi");
                apiResponse.setMessageEn("Operation Finished Successfully");
            }else{
                apiResponse.setCode(ApiResponseEnum.NO_DATA_FOUND.getValue());
                apiResponse.setMessageEn("No Data Found");
                apiResponse.setMessageAZ("Hec bir data tapilmadi");
            }
        } catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode(ApiResponseEnum.ERROR.getValue());
            return apiResponse;
        }
        return apiResponse;
    }

}
