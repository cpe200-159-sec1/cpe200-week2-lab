/**
 * Implement grading system.
 */

public class GPA {

    public float TotalCreditxGrade = 0, SumCredit = 0, ResultGPA = 0;


    public void addGrade(int credit, float grade) {

       TotalCreditxGrade += credit*grade;
       SumCredit += credit;

    }


    public float get() {
        ResultGPA = TotalCreditxGrade/SumCredit;
        if(ResultGPA<=0.0||ResultGPA<=4.0){
            return ResultGPA;
        }
        return 0;

    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
