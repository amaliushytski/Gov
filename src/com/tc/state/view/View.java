package com.tc.state.view;

import java.util.List;

import com.tc.state.bean.City;
import com.tc.state.bean.Country;
import com.tc.state.bean.District;
import com.tc.state.bean.Region;

public class View {

	public void print(String capital) {
		System.out.print(capital);
	}

	public void print(int count) {
		System.out.print(count);
	}

	public void print(List<Region> regions) {
		for (Region cnt : regions) {
			System.out.print("\nRegion center: " + cnt.getRegionCenter());
			System.out.println();
		}
	}
	
	public void printSquare(List<Region> regions) {
		for (Region cnt : regions) {
			System.out.print("\nRegion square: " + cnt.getSquare());
			System.out.println();
		}
	}

	public void print(List<Region> regions, List<District> districts, List<City> cities) {
		for (Region cnt : regions) {
			System.out.print("\nRegion: " + cnt.getRegion() + "\nDistrict: " + cnt.getDistricts() + "\nCity: "
					+ cnt.getRegionCenter());
			System.out.println();
		}
	}

}