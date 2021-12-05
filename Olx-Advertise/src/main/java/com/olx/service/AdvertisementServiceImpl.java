package com.olx.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.dto.Advertise;

@Service
public class AdvertisementServiceImpl implements AdvertisementService{

	@Autowired
	MasterDataDelegate masterDataDelegate;
	
	@Override
	public List<Advertise> searchAdvertisesByFilterCriteria(int categoryId, String searchText, int postedBy,
			String dateCondition, LocalDate onDate) {
		// call MasterData service getAllCategories()
		List<Map> categoriesList=masterDataDelegate.getAllCategories();
		return new ArrayList<Advertise>();
	}

	@Override
	public Advertise createNewAdvertise(Advertise addver, String authToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise updateAddById(int addId, String authToken, Advertise newAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Advertise> getAllAdvertise(String authToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise getAdvertiseById(int addId, String authToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAdvertise(int addId, String authToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdvertiseAnyUser(int addId, String authToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Advertise> getAdvertiseByFilter(int categoryId, String searchText, int postedBy, String dateCondition,
			LocalDate onDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
