package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s1", 7, 10), 3);
		p.addSymptom(new Symptom("s2", 8, 10), 4);
		p.addSymptom(new Symptom("s3", 6, 10), 5);
		p.addSymptom(new Symptom("s4", 6, 10), 5);
		p.addSymptom(new Symptom("s5", 5, 10), 5);
		invertedIteratorAdapter adapter = new invertedIteratorAdapter(p);
		
		Iterator<Object> itByName = Sorting.sortedIterator(adapter, new SymptomNameComparator());
        while (itByName.hasNext()) {
            Symptom s = (Symptom) itByName.next();
            System.out.println(s.getName() + " -> Severity Index: " + s.getSeverityIndex());
        }
        
        Iterator<Object> itByIndex = Sorting.sortedIterator(adapter, new IndexSymptomComparator());
        while (itByIndex.hasNext()) {
            Symptom s = (Symptom) itByIndex.next();
            System.out.println(s.getName() + " -> Severity Index: " + s.getSeverityIndex());
        }
		
	}

}
