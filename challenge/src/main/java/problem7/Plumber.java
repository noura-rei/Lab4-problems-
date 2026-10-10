package problem7;
import student.Person ;
public class Plumber extends Person{
    public Plumber(String name){
        super(name,"","","");
    }
    public void display(){
        System.out.println("I am "+getFirstName()+" the Plumber");

    }
}
