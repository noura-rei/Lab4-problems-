package student;

public class Student extends Person {
    private String cne;
    private Major major;

    // no-args constructor
    public Student() {
        super();
        this.cne = "";
        this.major = new Major() ;
    }
    // Constructor
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
       super(nom,prenom,telephone,email);
       this.cne = cne ;
       this.major = major;
       major.addStudent(this);
    }
    // constructor with default major
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom,prenom,telephone,email);
        this.cne = cne ;
        this.major = new Major("23","computer science");
    }


    // Getters
    String getCne(){
        return this.cne;
    }
    Major getMajor(){
        return this.major;
    }

    // Setters
    void setCne(String cne){
        this.cne = cne ;
    }
    void setMajor(Major m){
        this.major = m;
    }

    @Override
    public String toString(){
        return cne+" "+getSecondName().toUpperCase()+" "+getFirstName();
    }
    // getFull name
    public String getFullNameFormatted(){
        String first = getFirstName();
        if(!first.isEmpty()){
            first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        }
        return String.format("%s , %s",this.getSecondName().toUpperCase(),first);
    }

}

