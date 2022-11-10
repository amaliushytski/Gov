package com.tc.state.main;

import com.tc.state.bean.City;
import com.tc.state.bean.Country;
import com.tc.state.bean.District;
import com.tc.state.bean.Region;
import com.tc.state.view.View;

public class Main {

	public static void main(String[] args) {

		Country c2 = new Country("Poland", "Warsaw");
		Country c3 = new Country("Germany", "Berlin");

		City ct1 = new City("Minsk", 1996553);
		City ct2 = new City("Miadzel", 6871);
		City ct3 = new City("Soligorsk", 101400);
		City ct4 = new City("Vitebsk", 1103833);
		City ct5 = new City("Postavy", 33010);
		City ct6 = new City("Polock", 100848);
		City ct7 = new City("Minsk", 1996553);
		City ct8 = new City("Miadzel", 6871);
		City ct9 = new City("Soligorsk", 101400);
		City ct10 = new City("Minsk", 1996553);
		City ct11 = new City("Miadzel", 6871);
		City ct12 = new City("Soligorsk", 101400);
		City ct13 = new City("Minsk", 1996553);
		City ct14 = new City("Miadzel", 6871);
		City ct15 = new City("Soligorsk", 101400);

		District minskiyDistricts = new District();
		District vitebskyDistricts = new District();
		District mogilevskyDistricts = new District();
		District brestskyDistricts = new District();
		District grodnenskyDistricts = new District();
		District gomelskyDistricts = new District();

		minskiyDistricts.addCity(ct1);
		minskiyDistricts.addCity(ct2);
		minskiyDistricts.addCity(ct3);
		vitebskyDistricts.addCity(ct4);
		vitebskyDistricts.addCity(ct5);
		vitebskyDistricts.addCity(ct6);
		mogilevskyDistricts.addCity(ct7);
		mogilevskyDistricts.addCity(ct8);
		mogilevskyDistricts.addCity(ct9);
		brestskyDistricts.addCity(ct7);
		brestskyDistricts.addCity(ct8);
		brestskyDistricts.addCity(ct9);
		grodnenskyDistricts.addCity(ct7);
		grodnenskyDistricts.addCity(ct8);
		grodnenskyDistricts.addCity(ct9);
		gomelskyDistricts.addCity(ct7);
		gomelskyDistricts.addCity(ct8);
		gomelskyDistricts.addCity(ct9);

		District minskiy = new District("Minskiy", minskiyDistricts.getCities());
		District vitebsky = new District("Vitebsky", vitebskyDistricts.getCities());
		District mogilevsky = new District("Mogilevsky", mogilevskyDistricts.getCities());
		District brestsky = new District("Brestsky", brestskyDistricts.getCities());
		District grodnensky = new District("Grodnensky", grodnenskyDistricts.getCities());
		District gomelsky = new District("Gomelsky", gomelskyDistricts.getCities());

		Region minskRegion = new Region();
		Region vitebskRegion = new Region();
		Region mogilevRegion = new Region();
		Region gomelRegion = new Region();
		Region grodnoRegion = new Region();
		Region brestRegion = new Region();

		Region minskiyRegion = new Region("Minskaya", 39854, "Minsk", minskRegion.getDistricts());
		Region vitebskyRegion = new Region("Vitebskaya", 39854, "Vitebsk", vitebskRegion.getDistricts());
		Region mogilevskyRegion = new Region("Mogilevskaya", 39854, "Mogilev", mogilevRegion.getDistricts());
		Region gomelskyRegion = new Region("Gomelskaya", 39854, "Gomel", gomelRegion.getDistricts());
		Region grodnenskyRegion = new Region("Grodnenskaya", 39854, "Grodno", grodnoRegion.getDistricts());
		Region brestskyRegion = new Region("Brestskaya", 39854, "Brest", brestRegion.getDistricts());

		minskiyRegion.addDistrict(minskiy);
		vitebskyRegion.addDistrict(vitebsky);
		mogilevskyRegion.addDistrict(mogilevsky);
		gomelskyRegion.addDistrict(minskiy);
		grodnenskyRegion.addDistrict(vitebsky);
		brestskyRegion.addDistrict(mogilevsky);

		Country c1 = new Country("Belarus", "Minsk");

		Country belarus = new Country(c1.getRegions(), c1.getDistricts(), c1.getCities());

		belarus.addRegion(minskiyRegion);
		belarus.addRegion(vitebskyRegion);
		belarus.addRegion(mogilevskyRegion);
		belarus.addRegion(gomelskyRegion);
		belarus.addRegion(grodnenskyRegion);
		belarus.addRegion(brestskyRegion);

		View display = new View();

		System.out.println("Столица:");
		display.print(c1.getCapital());

		System.out.println();
		System.out.println("Количество областей:");
		display.print(belarus.countRegions());

		display.print(belarus.getRegions(), belarus.getDistricts(), belarus.getCities());

		System.out.println("Областные города:");
		display.print(belarus.getRegions());

		System.out.println("Площадь:");
		display.printSquare(belarus.getRegions());
	}

}
