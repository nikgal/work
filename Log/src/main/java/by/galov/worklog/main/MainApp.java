package by.galov.worklog.main;

import java.io.File;
import java.util.ArrayList;

import by.galov.worklog.data.*;
import by.galov.worklog.io.*;

public class MainApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Log> logg = new ArrayList<Log>();
        Employee e = new Employee("Nick", "Galov");
        Job j = new Job("hammer a nail");
        Log lg = new Log(e,j,2016,11,26);
        LogIO lio = new LogIO();
        for(int i=0;i<10;i++){
            lio.addLog(lg);
        }
        lio.logFile();
        
        logg = lio.importLog(new File("c:/1/1.txt"));
        
        for (Log l:logg){
            System.out.println(l);
        }
    }

}
