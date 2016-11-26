package by.galov.worklog.data;

public class Employee {
    private String name;
    private String surname;
    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String toString(){
        String s;
        StringBuilder sb = new StringBuilder();
        s = sb.append(name + " " + surname).toString();
        return s;
    }
}
