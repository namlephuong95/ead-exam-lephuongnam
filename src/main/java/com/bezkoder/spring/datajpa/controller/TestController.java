//package com.bezkoder.spring.datajpa.controller;
//
//import com.bezkoder.spring.datajpa.dto.TestDto;
//import com.bezkoder.spring.datajpa.model.Test;
//import com.bezkoder.spring.datajpa.model.Tutorial;
//import com.bezkoder.spring.datajpa.service.TestService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "http://localhost:8080")
//@RestController
//@RequestMapping("/api")
//public class TestController {
//    final TestService testService;
//
//    public TestController(TestService testService) {
//        this.testService = testService;
//    }
//
//    @PostMapping("/tutorials")
//    public ResponseEntity<TestDto> createTutorial(@RequestBody TestDto testDto) {
//        try {
//            TestDto _testDto = testService.insertTest(testDto);
//            return new ResponseEntity<>(_testDto, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//}
