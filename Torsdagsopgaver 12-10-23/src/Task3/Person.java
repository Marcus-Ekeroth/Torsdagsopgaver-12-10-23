package Task3;

public class Person {

    //3.1
    private String name;

    Person(String name){
        this.name = name;
    }

    public void setName(String newName){

        name = newName;

    }

    public String getName(){

        return name;
    }

    public boolean addCourse(String course){

        return true;
    }
}
