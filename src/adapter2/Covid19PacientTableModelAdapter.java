package adapter2;

import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }
	  @Override
	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }
	  @Override
	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }
	  @Override
	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }
	  @Override
	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  Iterator<Symptom> i = pacient.getSymptoms().iterator();
	        Symptom s = null;
	        int current = 0;
	        
	        while (i.hasNext() && current <= row) {
	            s = i.next();
	            current++;
	        }
	        
	        if (s != null) {
	            if (col == 0) return s.getName();
	            if (col == 1) return pacient.getWeight(s);
	        }
	        return null;
        }
	}
