package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;

public class Country {

	private String country;
	private String capital;
	private List<Region> regions = new ArrayList<Region>();
	private List<District> districts = new ArrayList<District>();
	private List<City> cities = new ArrayList<City>();

	public Country(List<Region> regions, List<District> districts, List<City> cities) {
		super();
		this.regions = regions;
		this.districts = districts;
		this.cities = cities;
	}

	public Country(String country, String capital) {
		super();
		this.country = country;
		this.capital = capital;
	}

	public Country() {
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	public int countRegions() {
		return regions.size();
	}
}
