package com.bezkoder.spring.datajpa.service;

import com.bezkoder.spring.datajpa.dto.TestDto;
import com.bezkoder.spring.datajpa.model.Test;
import com.bezkoder.spring.datajpa.repository.TestRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
    Logger logger = LoggerFactory.getLogger(TestService.class);
    final TestRepository testRepository;
    final ModelMapper mapper;

    public TestService(TestRepository testRepository, ModelMapper mapper) {
        this.testRepository = testRepository;
        this.mapper = mapper;
    }

    //insert
    public TestDto insertTest(TestDto testDto) {
        logger.debug("call insertTest");
        Test test = mapper.map(testDto, Test.class);
        Test iTest = testRepository.save(test);
        return mapper.map(iTest, TestDto.class);
    }

    //update
    public TestDto updateTest(TestDto testDto) {
        logger.debug("call updateTest");
        Test test = mapper.map(testDto, Test.class);

        return null;
    }
    //delete
}
