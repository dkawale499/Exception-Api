package com.sts.exception;


import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sts.binding.ExInfo;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ProductNotFoundException.class)
		public ResponseEntity<ExInfo>handlePNFE(ProductNotFoundException pe){
		
		
		ExInfo info = new ExInfo();
		info.setExCode("SBI0002");
		info.setExmsg(pe.getMessage());
		info.setExdate(LocalDate.now());
		
return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
		
} 
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo>handleException(Exception e){
	
	
	ExInfo info = new ExInfo();
	info.setExCode("SBI001");
	info.setExmsg(e.getMessage());
	info.setExdate(LocalDate.now());
	
return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	
} 
	
}
	