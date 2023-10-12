package Task4;
//4.2
public class Square implements Shape{

    double length;

    Square(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
