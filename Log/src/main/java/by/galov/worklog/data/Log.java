package by.galov.worklog.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Log {
    private Employee currentEmployee;
    private Job currentJob;
    private Calendar cal;
    public Log(Employee e, Job j, int year, int month, int day){
        this.currentEmployee = e;
        this.currentJob = j;
        this.cal = new Calendar() {
            
            /**
             * 
             */
            private static final long serialVersionUID = -8164946738181896744L;

            @Override
            public void roll(int field, boolean up) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public int getMinimum(int field) {
                // TODO Auto-generated method stub
                return 0;
            }
            
            @Override
            public int getMaximum(int field) {
                // TODO Auto-generated method stub
                return 0;
            }
            
            @Override
            public int getLeastMaximum(int field) {
                // TODO Auto-generated method stub
                return 0;
            }
            
            @Override
            public int getGreatestMinimum(int field) {
                // TODO Auto-generated method stub
                return 0;
            }
            
            @Override
            protected void computeTime() {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            protected void computeFields() {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void add(int field, int amount) {
                // TODO Auto-generated method stub
                
            }
           
        };
        cal = new GregorianCalendar(year, month-1, day);
       
    }
    public String toString(){
        String s;
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
        s = sb.append(sdf.format(cal.getTime()) + " " + currentEmployee + 
                " " + currentJob).toString();
        return s;
    }
}
