package problem6;

public class Circle extends Forme{
    private double radius ;
    public Circle(double radius){
        this.radius = radius ;
    }
    public double getRadius(){return radius;}
    public void setRadius(double rad ){
        this.radius = rad ;
    }
    @Override
    public double getArea(){return Math.round(radius*radius*Math.PI*100.0)/100.0;}
    @Override
    public String toString(){
        return "Circle (radius "+this.radius+")";
    }
}
