package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(){
        this("","","","");
    }
    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    // getters
    public String getFirstName(){return firstName ;}
    public String getSecondName(){return secondName;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}
    public int getId(){return id;}

    // setters
    public void setFirstName(String firstname){this.firstName = firstname;}
    public void setSecondName(String secondName){this.secondName = secondName;}
    public void setPhone(String phone){this.phone = phone;}
    public void setEmail(String email){this.email = email;}

    // toString method
    @Override
    public String toString(){
        return "Person : "+firstName+" "+secondName+",with the id :"+id+",has a phone :"+phone+",and an Email :"+email;
    }

    // display method
    public  void display(){};
}

