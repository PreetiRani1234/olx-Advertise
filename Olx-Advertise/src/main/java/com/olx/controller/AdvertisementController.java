package com.olx.controller;

import org.springframework.http.HttpHeaders;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.olx.dto.Advertise;
import com.olx.exception.InvalidAdvertiseIdException;
import com.olx.exception.InvalidAuthTokenException;
import com.olx.exception.InvalidCategoryIdException;
import com.olx.exception.InvalidDateConditionException;
import com.olx.exception.InvalidDateFormatException;
import com.olx.exception.InvalidFromDateException;
import com.olx.exception.InvalidOnDateException;
import com.olx.exception.InvalidRecordNoException;
import com.olx.exception.InvalidStartIndexException;
import com.olx.exception.InvalidStatusIdException;
import com.olx.service.AdvertisementService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("olx")
public class AdvertisementController {
	@Autowired
	AdvertisementService advertisementService;
	
	
	 ////Local Exception Handler
	@ExceptionHandler(value= {InvalidStatusIdException.class,InvalidStatusIdException.class})
	private ResponseEntity<Object> handleExceptionInternal(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidCategoryIdException.class,InvalidCategoryIdException.class})
	private ResponseEntity<Object> handleExceptionInternalCategory(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidAuthTokenException.class,InvalidAuthTokenException.class})
	private ResponseEntity<Object> handleExceptionInternalAuthToken(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidAdvertiseIdException.class,InvalidAdvertiseIdException.class})
	private ResponseEntity<Object> handleExceptionInternalAdvertiseId(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidOnDateException.class,InvalidOnDateException.class})
	private ResponseEntity<Object> handleExceptionInternalOnDate(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidFromDateException.class,InvalidFromDateException.class})
	private ResponseEntity<Object> handleExceptionInternalFromDate(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidStartIndexException.class,InvalidStartIndexException.class})
	private ResponseEntity<Object> handleExceptionInternalStartIndex(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidRecordNoException.class,InvalidRecordNoException.class})
	private ResponseEntity<Object> handleExceptionInternalRecordNo(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidDateConditionException.class,InvalidDateConditionException.class})
	private ResponseEntity<Object> handleExceptionInternalDateCondition(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidDateFormatException.class,InvalidDateFormatException.class})
	private ResponseEntity<Object> handleExceptionInternalDateFormat(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	
	
     @PostMapping(value="/advertise",consumes= {MediaType.APPLICATION_JSON_VALUE,
			 MediaType.APPLICATION_XML_VALUE},
			   produces= {MediaType.APPLICATION_JSON_VALUE, 
			   MediaType.APPLICATION_XML_VALUE})
     @ApiOperation(value="Update stocks by id")
	   public Advertise createNewAdvertise(@RequestBody Advertise addver,
			   @RequestHeader("auth")String AuthToken) {
		       return advertisementService. createNewAdvertise(addver,AuthToken);
	   }
	  ///update existing
	   @PutMapping(value="/advertise/{id}",consumes={MediaType.APPLICATION_JSON_VALUE,
			 MediaType.APPLICATION_XML_VALUE},
			   produces= {MediaType.APPLICATION_JSON_VALUE, 
			   MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="Update stocks by id")
	   public Advertise updateAddById(@PathVariable("id") int addId, @RequestHeader("auth") String AuthToken,@RequestBody Advertise newAdd) {
		  return advertisementService.updateAddById(addId,AuthToken,newAdd);
	   }
       ///getAllAdvertisement()
	   @GetMapping(value="/user/advertise",consumes= {MediaType.APPLICATION_JSON_VALUE,
			 MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="Get All Advertise")
		public Collection<Advertise> getAllAdvertise(@RequestHeader("auth") String AuthToken){
		   return advertisementService.getAllAdvertise(AuthToken);
	   }
	   ///get specific advertisement /user/advertise/{advertiseId}
	   @GetMapping(value="/user/advertise{advertiseId},",consumes={MediaType.APPLICATION_JSON_VALUE,
				 MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="Get Advertise by id")
		 public Advertise getAdvertiseById(@PathVariable("advertiseId") int addId,@RequestHeader("auth") String AuthToken) {
		   return advertisementService.getAdvertiseById(addId,AuthToken);
		   
		   }
       /////delete a specific advertisement, /user/advertise/{advertiseId}
	   @DeleteMapping(value="/user/advertise{advertiseId},",consumes={MediaType.APPLICATION_JSON_VALUE,
				 MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="Delete Advertise")
	   public boolean deleteAdvertise(@PathVariable("advertiseId") int addId,@RequestHeader("auth") String AuthToken) {
		   return advertisementService.deleteAdvertise(addId,AuthToken);
	   }
	   /////delete a specific advertisement for any user /advertise/{advertiseId}
	   @DeleteMapping(value="/advertise{advertiseId},",consumes={MediaType.APPLICATION_JSON_VALUE,
				 MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="Delete Advertise by any user")
	   public boolean deleteAdvertiseAnyUser(@PathVariable("advertiseId") int addId,@RequestHeader("auth") String AuthToken) {
		   return advertisementService.deleteAdvertiseAnyUser(addId,AuthToken);
	   }
	   ///filter the item on criteria,//advertise/search/filtercriteria
	   @GetMapping(value="/advertise/search/filtercriteria",produces= {MediaType.APPLICATION_JSON_VALUE
			   ,MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="search Advertise by filter criteria")
	    public List<Advertise>searchAdvertisesByFilterCriteria(
			   @RequestParam(name="categoryId",required=false)int categoryId,
			   @RequestParam(name="searchText",required=false)String searchText,
			   @RequestParam(name="postedBy",required=false)int postedBy,
			   @RequestParam(name="dateCondition",required=false)String dateCondition,
			   @RequestParam(name="onDate",required=false) @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate onDate){
		   return advertisementService.searchAdvertisesByFilterCriteria(categoryId, searchText, postedBy, dateCondition, onDate);
	   }
	   
	   ///filter the adds on search criteria,//advertise/search
	   @GetMapping(value="/advertise/search",produces= {MediaType.APPLICATION_JSON_VALUE
			   ,MediaType.APPLICATION_XML_VALUE})
	   @ApiOperation(value="get Advertise by filter criteria")
	    public List<Advertise>getAdvertiseByFilter(
			   @RequestParam(name="categoryId",required=false)int categoryId,
			   @RequestParam(name="searchText",required=false)String searchText,
			   @RequestParam(name="postedBy",required=false)int postedBy,
			   @RequestParam(name="dateCondition",required=false)String dateCondition,
			   @RequestParam(name="onDate",required=false) @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate onDate){
		   return advertisementService.getAdvertiseByFilter(categoryId, searchText, postedBy, dateCondition, onDate);
	   }
	   
	  
	


	

}
