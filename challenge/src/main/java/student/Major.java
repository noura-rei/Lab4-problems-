package student;

public class Major {
    private static int nextId = 1;
    private static final int MAX_STUDENTS = 50 ;

    private int id;
    private String code;
    private String name;
    private Student[] students = new Student[MAX_STUDENTS];
    private int studentCount;

    // non-args constructor
    public Major(){
        this("","");
    }
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code ;
        this.name = name ;
    }

    // Method to add a student
    public boolean addStudent(Student s) {
        if(s==null) return false;
        if(studentCount>=MAX_STUDENTS) {
            System.out.println("Major is full");
            return false;
        }
        if(findStudentByCNE(s.getCne())!=null){
            System.out.println("Student already enrolled :"+s.getCne());
            return false ;
        }
        students[studentCount++] = s;
        return true ;

    }
    // find student by cne
    public Student findStudentByCNE(String cne){
        if(cne==null) return null;
        for(int i =0;i<studentCount;i++){
            if(students[i].getCne().equalsIgnoreCase(cne)){
                return students[i] ;
            }
        }
        return null ;
    }
    // Number of enrolled students :
    public int getStudentCount(){
        return studentCount ;
    }

    // Remove students
    public boolean removeStudent(String cne){
        Student s = findStudentByCNE(cne);
        if(s==null) return false ;

        int index = 0 ;
        while(students[index]!=s) index++ ;
        for(int j = index;j<studentCount-1;j++){
            students[j]= students[j+1];
        }
        students[--studentCount] = null ;
        s.setMajor(null);
        return true ;

    }
    // method to compute the percentage of occupied capacity
    public double getOccupancyRate(){
        return (double)(studentCount*100)/MAX_STUDENTS;
    }

    // method of getting student's list
    public String getStudentListAsString(){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<studentCount;i++){
            result.append(students[i]).append("\n") ;
        }
        return result.toString() ;
    }
    // Getters
    public int getId(){
        return this.id ;
    }
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code ;
    }
    // Setters
    public void setName(String name){
        this.name = name ;
    }
    public void setCode(String code){
        this.code = code ;
    }

    // to string method
    @Override
    public String toString(){
        return "Major id : "+id+" ,name:"+name+" ,code : "+code;
    }
    // Display all students in the major
    public void displayStudents() {
        System.out.println(getStudentListAsString()) ;
    }
}

