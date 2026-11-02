package adapter;

import java.util.ArrayList;

import domain.Covid19Pacient;
import domain.Symptom;

public class invertedIteratorAdapter implements InvertedIterator{
	private ArrayList<Symptom> symptoms;
	private int i =0;
	public invertedIteratorAdapter(Covid19Pacient pacient){
		this.symptoms= new ArrayList<>(pacient.getSymptoms());
		i=symptoms.size()-1;
	}
	@Override
	public Object previous() {
		if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }

        int j = i;
        i--;

        return symptoms.get(j);
	}
	@Override
	public boolean hasPrevious() {
		return i>=0;
	}
	@Override
	public void goLast() {
		i=symptoms.size()-1;
	}
}
