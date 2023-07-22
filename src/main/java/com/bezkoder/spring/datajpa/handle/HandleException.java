//package com.bezkoder.spring.datajpa.handle;
//
//import com.bezkoder.spring.datajpa.dto.ResponseDto;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//
//@RestControllerAdvice
//public class HandleException {
//
//    @ExceptionHandler(BindException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)  // Nếu validate fail thì trả về 400
//    public ResponseEntity<Object> handleBindException(BindException e) {
//        // Trả về message của lỗi đầu tiên
//        String errorMessage = "Request không hợp lệ";
//        if (e.getBindingResult().hasErrors())
//            e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
//        ResponseDto<String> resDto = new ResponseDto<>(
//                HttpStatus.BAD_REQUEST.toString(),
//                HttpStatus.BAD_REQUEST.value(),
//                errorMessage
//        );
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resDto);
//    }
//}
