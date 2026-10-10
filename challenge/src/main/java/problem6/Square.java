package problem6;

public class Square extends Forme{
    private double side ;
    Square(double side){
        this.side = side ;
    }
    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
    @Override
    public String toString(){
        return "Square (side "+this.side+")";
    }
    @Override
    public double getArea(){return Math.round(side*side*100.0)/100.0;}
}
