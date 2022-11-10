package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

	private String region;
	private double square;
	private String regionCenter;

	private List<District> districts = new ArrayList<District>();

	public Region(String region, double square, String regionCenter, List<District> districts) {
		super();
		this.region = region;
		this.square = square;
		this.regionCenter = regionCenter;
		this.districts = districts;
	}

	public Region() {
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public String getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(String regionCenter) {
		this.regionCenter = regionCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public void addDistrict(District district) {
		districts.add(district);
	}

	@Override
	public int hashCode() {
		return Objects.hash(districts, region, regionCenter, square);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(districts, other.districts) && Objects.equals(region, other.region)
				&& Objects.equals(regionCenter, other.regionCenter)
				&& Double.doubleToLongBits(square) == Double.doubleToLongBits(other.square);
	}

	@Override
	public String toString() {
		return "Region [region=" + region + ", square=" + square + ", regionCenter=" + regionCenter + ", districts="
				+ districts + "]";
	}

}
