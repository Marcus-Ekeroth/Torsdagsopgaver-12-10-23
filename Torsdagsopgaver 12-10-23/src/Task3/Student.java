package Task3;

import java.util.ArrayList;

public class Student extends Person {

    String name;

    //3.3
    ArrayList<String> passedCourses = new ArrayList<>();

    ArrayList<String> currentCourses = new ArrayList<>();
    //3.2
    Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
    }

    //3.4
    @Override
    public boolean addCourse(String course){
        if(passedCourses.contains(course)){
            return false;
        }
        return true;
    }
}
