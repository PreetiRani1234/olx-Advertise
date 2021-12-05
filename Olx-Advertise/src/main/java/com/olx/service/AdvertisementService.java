package com.olx.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import com.olx.dto.Advertise;

public interface AdvertisementService {
	
	
	public Advertise createNewAdvertise(Advertise addver, String authToken);  
	public Advertise updateAddById(int addId, String authToken, Advertise newAdd);
	public Collection<Advertise> getAllAdvertise(String authToken);
	public Advertise getAdvertiseById(int addId, String authToken);
	public boolean deleteAdvertise(int addId, String authToken);
	public boolean deleteAdvertiseAnyUser(int addId, String authToken);
		public List<Advertise>searchAdvertisesByFilterCriteria(
			   int categoryId,
			   String searchText,
			   int postedBy,
			   String dateCondition,
			   LocalDate onDate);
	public List<Advertise> getAdvertiseByFilter(int categoryId, String searchText, int postedBy, String dateCondition,
			LocalDate onDate);
	
	
	

	


	
		   

}
