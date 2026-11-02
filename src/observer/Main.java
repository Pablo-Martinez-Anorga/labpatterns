package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {
	public static void main(String	args[]){
		Observable	pacient=new	Covid19Pacient("aitor",	35);
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI(pacient);
		new PacientThermometerGUI(pacient);
	}
}
