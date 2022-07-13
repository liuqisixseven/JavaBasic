package javaTest.observable;

import java.util.Observable;

public interface Observer {
	void update(Observable o,Object arg);
}
