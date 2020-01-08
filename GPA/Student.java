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

    public Student(String name, int gradeLevel, String mathScore,
                    String engScore, String csScore){
        setName(name);
        setGradeLevel(gradeLevel);
        
        setMathScore(mathScore);
        setEngScore(engScore);
        setCsScore(csScore);

    }


    // functions - abilities 
    
    // getters and setters 

    public String getName()  {
        return this.name;
    }

    public String getMathScore() {
        return this.mathScore;
    }

    public String getCsScore() {
        return this.csScore;
    }

    public String getEngScore(){
        return this.engScore;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) { 
        if (gradeLevel >= 9 && gradeLevel <=12){
            this.gradeLevel = gradeLevel;
        }

    }
    //calculate gpa 
    public double calculateGPA()  {
        return 0.0;
    }

    // public double calculateGPA()  {
    //     this.mathScore
    // }





    private double gradeValue(String grade) { 
        if (grade.equals("A")) return 4.0;
        if (grade.equals("B")) return 3.0;
        if (grade.eqyals("C")) return 2.0;
        if (grade.equals("D")) return 1.0;
        return 0.0;
    }
    // public String summarizeGPA(){
    //     student.getName() + "'s gpa is " + student.calculateGPA() + "in grade " + student.getGradeLevel());
    // }
 
    public String toString() {
        return summarizeGPA();
    }
}
