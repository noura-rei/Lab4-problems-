package student;

public class Test {
    public static void main(String[] args) {
        // Creation of majors
        Major major1 = new Major("1","Analyse");
        Major major2 = new Major("20","Algebre");
        Major cs = new Major("23","computer science");
        // Creation of students :
        Student Noura = new Student("Noura","Rei","0629613537","emailnoura","wa539561",major1);
        Student Mohamed = new Student("Mohamed","Riahi","0754182107","mouad","wa575481",major2);
        Student Amine = new Student("Amine","CHA","0965313537","amine1234","wa632591",cs);
        Student Amal = new Student("Amal","Safi","854217632","amallll","wa632542",cs);
        Student samir = new Student("samir", "Alami", "0600000002", "samir.alami@mail.com", "23585976", cs);

        // Computer science students :
        System.out.println("The list of students enrolled in computer science major are:");
        cs.displayStudents();
        // Formatted name and major's name
        System.out.println("\nNoura's major : "+Noura.getMajor().getName());
        System.out.println("\nFormatted name : "+Noura.getFullNameFormatted());
        // Find a student by CNE :
        Student found = cs.findStudentByCNE("wa632591");
        System.out.println("\nFound by CNE : "+(found!=null?found.getFullNameFormatted():"Not found"));
        // Number of students in CS :
        System.out.println("\nNumber of students in CS : "+cs.getStudentCount());
        //Remove a student
        System.out.println("Removal of a student : "+cs.removeStudent("wa632591")) ;

        // List of students after removing :
        System.out.println("\nRemaining students are :\n"+cs.getStudentListAsString());
    }
}

