package javaTest.observable;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {
	private String name;
	public HousePriceObserver(String name) {
		this.name=name;
	}
	public void update(Observable obj,Object arg) {
		if(arg instanceof Float) {
			System.out.print(this.name+"观察到价格更改为：");
			System.out.println(((Float)arg).floatValue());
		}
	}
}
