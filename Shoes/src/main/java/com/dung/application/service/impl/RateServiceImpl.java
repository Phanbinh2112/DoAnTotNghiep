//package com.dung.application.service.impl;
//
//import com.dung.application.entity.Product;
//import com.dung.application.entity.Rate;
//import com.dung.application.entity.User;
//import com.dung.application.exception.InternalServerException;
//import com.dung.application.model.request.CreateRateProductRequest;
//import com.dung.application.repository.ProductRepository;
//import com.dung.application.repository.RateRepository;
//import com.dung.application.service.RateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.sql.Timestamp;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class RateServiceImpl implements RateService {
//
//    @Autowired
//    private RateRepository rateRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Override
//    public Rate createRate(CreateRateProductRequest createRateProductRequest, long userId) {
//        Rate rate = new Rate();
//        rate.setRating(createRateProductRequest.getRate());
//        rate.setCreatedAt(new Timestamp(System.currentTimeMillis()));
//        Product product = new Product();
//        product.setId(createRateProductRequest.getProductId());
//        rate.setProduct(product);
//        User user = new User();
//        user.setId(userId);
//        rate.setUser(user);
//        try {
//            rateRepository.save(rate);
//        }catch (Exception e){
//            throw new InternalServerException("Có lỗi khi đánh giá");
//        }
//        return rate;
//    }
//
//}
