package by.galov.worklog.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import by.galov.worklog.data.Employee;
import by.galov.worklog.data.Job;
import by.galov.worklog.data.Log;

public class LogIO {
    private ArrayList<Log> logs = new ArrayList<Log>();
    
    private File file = new File("c:/1/1.txt");
  
    public void addLog(Log lg){
        logs.add(lg);
    }
    public void addLog(Log lg,ArrayList<Log> logs){
        logs.add(lg);
    }
    public void logFile(){
        try {
            PrintWriter out = new PrintWriter(file);
            for(Log lg:logs){
                out.println(lg);
            }
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Log> importLog(File file){
        ArrayList<Log> logs1 = new ArrayList<Log>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;
            String [] args;
            
            while((s = in.readLine()) != null){
                args = s.split(" ");
                String str = null;
                StringBuilder sb = new StringBuilder();
                for(int i = 5; i< args.length;i++)
                str = sb.append(args[i]+" ").toString();
                Log lg = new Log(new Employee(args[3],args[4]),
                        new Job(str),
                        Integer.parseInt(args[0]),Integer.parseInt(args[1]),
                        Integer.parseInt(args[2]));
                addLog(lg, logs1);
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    return logs1;     
    }
}
