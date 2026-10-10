package Instructor;
import java.util.Locale;

public class Subject {
    private String code ;
    private String title;
    private Instructor instructor;

    public Subject(String code,String title){
        this.code = code ;
        this.title = title ;
        this.instructor = null ;
    }
    public Subject(String code,String title,Instructor i){
        this.code = code ;
        this.title = title ;
        this.instructor = i ;
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        String[] words = title.split(" ");
        String result = "";
        for(String word:words){
            result += word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        }
        return result.trim();
    }
    public boolean isIntroCourse(){
        if(this.title.toLowerCase().contains("intro")) return true ;
        if (normalizedCode().startsWith("INTRO-")) return true ;
        return false ;
    }

    // getters and setters
    public String getCode(){return this.code;}
    public String getTitle(){return this.title;}
    public Instructor getInstructor(){return instructor;}
    public void setInstructor(Instructor i){this.instructor=i;}
    // Syllabus line
    public String syllabusLine(Instructor instructor){
        String prof = (instructor==null)?"TBA":instructor.displayName();
        return normalizedCode()+" - "+properTitle()+"(Instructor : "+prof+")";
    }
}
