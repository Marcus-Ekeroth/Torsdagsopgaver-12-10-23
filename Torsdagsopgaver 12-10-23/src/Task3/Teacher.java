package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher extends Person{

    String name;

    //3.3
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    Teacher(String name, ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
    }

    //3.5
    @Override
    public boolean addCourse(String course){
        if(canTeach.contains(course)){
            return true;
        }
        return false;
    }
}
