package com.tc.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {

	private String title;
	private int population;


	public City(String title, int population) {
		super();
		this.title = title;
		this.population = population;
	}

	public City() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		return Objects.hash(population, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return population == other.population && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "City [title=" + title + ", population=" + population + "]";
	}

}
