package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourses1 = new ArrayList<>();
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        //3.6
        Student student1 = new Student("Marcus", passedCourses1);
        Student student2 = new Student("Jonas", passedCourses1);
        Student student3 = new Student("Frederik", passedCourses2);
        Teacher teacher1 = new Teacher("Tess",canTeach1 );
        Teacher teacher2 = new Teacher("Steffen", canTeach2);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(teacher1);
        persons.add(teacher2);
        canTeach1.add("Java 1.0");
        passedCourses1.add("Java 1.0");



        //3.7
        for(Person s: persons){
            if(!s.addCourse("Java 1.0")){
                if(s instanceof Student) {
                    System.out.println(s.getName() + " har allerede bestået dette kursus");
                }
            } if(s instanceof Teacher){
                System.out.println(s.getName() + " kan ikke undervise i dette fag");
            }
        }


    }
}
