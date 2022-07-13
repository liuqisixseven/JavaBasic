package javaTest.observable;

import java.util.Observer;

public class ObserDemo {
	public static void main(String[] args) {
		House house = new House(1000000);
		HousePriceObserver housePriceObserver1 = new HousePriceObserver("购房者A");
		HousePriceObserver housePriceObserver2 = new HousePriceObserver("购房者B");
		HousePriceObserver housePriceObserver3 = new HousePriceObserver("购房者C");
		house.addObserver((Observer) housePriceObserver1);
		house.addObserver((Observer) housePriceObserver2);
		house.addObserver((Observer) housePriceObserver3);
		System.out.println(house);
		house.setPrice(666666);
		System.out.println(house);
	}
}
