package problem7;
import student.Person ;
public class Carpenter extends Person{
    public Carpenter(String name){
         super(name,"","","");
    }
    public void display(){
        System.out.println("I am "+getFirstName()+" the Carpenter");

    }
}
