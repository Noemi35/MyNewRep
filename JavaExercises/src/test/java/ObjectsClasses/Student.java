package ObjectsClasses;

public class Student {

    int sid;
    String sname;
    int grade;
    String department;


    void display(){
        System.out.println(sid+" "+sname+" "+grade+" "+department);
    }

    void setUp(int id, String name, int g, String dep) {
        sid = id;
        sname = name;
        grade = g;
        department = dep;
    }
        //constructor never return value, same name as class

        Student (int id, String name, int g, String dep) {
            sid=id;
            sname=name;
            grade=g;
            department=dep;
    }
}
