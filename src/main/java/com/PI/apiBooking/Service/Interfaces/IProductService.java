package com.PI.apiBooking.Service.Interfaces;

import com.PI.apiBooking.Model.DTO.ProductDto;
import com.PI.apiBooking.Model.Product;
import com.PI.apiBooking.Service.ICheckId;
import com.PI.apiBooking.Service.IService;

import java.util.Set;

public interface IProductService extends IService<ProductDto>, ICheckId<Product> {

    Integer countByCategory(Long categoryId);
    Set<ProductDto> findByCategoryId(Long categoryId);
    Set<ProductDto> findByCityId(Long cityId);
}
