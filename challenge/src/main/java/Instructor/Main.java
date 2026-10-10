package Instructor;

public class Main {
    //
    public static void main(String[] args){
        //Instructors :
        Instructor Hadach = new Instructor("zaid","hadach","0625314578","zaidhadach@gmail.com","10");
        Instructor MRTK = new Instructor("youness","Mourtaki","064521758","mrtk@gmail.com","1230");
        Instructor Limni = new Instructor("Laila","Limni","986531445","lailaLimni@gmail.com","32");
        // Subjects :
        Subject math = new Subject("MA-120","Maths",Hadach);
        Subject Algebre = new Subject("AL-230","Algebre",MRTK);
        Subject pc = new Subject("PC-754","Physique",Limni);
        System.out.println(Hadach.displayName()) ;
        System.out.println(MRTK.toCard()) ;
        System.out.println(Limni.summaryLine());
        System.out.println(math.isIntroCourse());
        System.out.println(math.syllabusLine(Hadach));



    }

}
