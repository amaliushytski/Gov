package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

	private String district;

	private List<City> cities = new ArrayList<City>();

	public District(String district, List<City> cities) {
		super();
		this.district = district;
		this.cities = cities;
	}

	public District() {
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void addCity(City city) {
		cities.add(city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cities, district);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(cities, other.cities) && Objects.equals(district, other.district);
	}

	@Override
	public String toString() {
		return "District [district=" + district + ", cities=" + cities + "]";
	}

}
