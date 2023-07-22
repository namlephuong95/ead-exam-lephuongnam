package com.bezkoder.spring.datajpa.service;

import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.repository.ProductRepository;
import com.bezkoder.spring.datajpa.model.Sale;
import com.bezkoder.spring.datajpa.model.SaleDto;
import com.bezkoder.spring.datajpa.repository.SaleRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SaleService {
    Logger logger = LoggerFactory.getLogger(TestService.class);
    final SaleRepository saleRepository;
    final ProductRepository productRepository;
    final ModelMapper mapper;

    public SaleService(SaleRepository saleRepository, ProductRepository productRepository, ModelMapper mapper) {
        this.saleRepository = saleRepository;
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    //get all
    public List<Sale> getSales() {
        logger.debug("call getSales");
        return saleRepository.findAll();
    }

    //get for id
    public SaleDto getSale(String salesmanID) {
        logger.debug("call getSale");
        Sale sale = saleRepository.findBySalesmanIDEqualsAllIgnoreCase(salesmanID);
        List<Product> products = productRepository.findAllBySalesmanID(salesmanID);
        SaleDto saleDto = mapper.map(sale, SaleDto.class);
        saleDto.setProductList(products);
        return saleDto;
    }
}
