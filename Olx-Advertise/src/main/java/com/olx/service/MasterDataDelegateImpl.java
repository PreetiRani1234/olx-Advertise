package com.olx.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class MasterDataDelegateImpl implements MasterDataDelegate{
  @Autowired
  RestTemplate restTemplate;
  @Bean 
  public RestTemplate getRestTemplate() {
	  return new RestTemplate();
  }
	@Override
	public List<Map> getAllCategories() {
		// TODO Auto-generated method stub
	List list=	this.restTemplate.getForObject("http://localhost:9001/olx/advertise/category", List.class);
	 return list;
	}

}
