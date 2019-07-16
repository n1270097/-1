import java.util.ArrayList;

abstract class Subject {
	public ArrayList<Observer> observers;

	Subject() {
		observers = new ArrayList<Observer>();
	}

	public void attach(Observer o) {
		Observer.add(o);
	}

	public void detach(Observer o) {
		Observer.remove(o);
	}

	public void tsuuchi() {
		for (Observer observer: observers) {
			observer.update(this);
		}
	}
}