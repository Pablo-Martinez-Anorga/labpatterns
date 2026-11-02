package adapter;

import domain.Symptom;

public class IndexSymptomComparator implements java.util.Comparator<Object>{
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom)o2;
		int index1 = (int) s1.getSeverityIndex();
		int index2 = (int)  s2.getSeverityIndex();
		return index1-index2;
	}
}
