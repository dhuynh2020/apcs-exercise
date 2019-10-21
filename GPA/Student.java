public class Student{
   
    // data
    private String name;
    private int gradeLevel;

    private String mathScore;
    private String engScore;
    private String csScore;

    // constructor
    public Student(String name, int gradeLevel) {
        this.name = name; 
        this.gradeLevel = gradeLevel;

       this.mathScore ="F";
       this.engScore ="F";
       this.csScore ="F";

    }


    // functions - abilities 
    
    // getters and setters 

    public String getName()  {
        return this.name;
    }

    public String getGradeLevel() {
        return this.gradeLevel;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeleve) { 
        if (gradeLevel >= 9 && gradeLeve <=12){
            this.gradeLevel= gradeLevel;
        }

    }
    // calculate gpa 
    public double calculateGPA()  {
        return 0.0;
    }
}
