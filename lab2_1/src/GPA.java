/**
 * Implement grading system.
 */
public class GPA {

    public float GPA = 0;
    public float creditAndGrade = 0;
    public float sumCredit = 0 ;


    public void addGrade(int credit, float grade) {
        /* Your code here */
        sumCredit+=credit ;
        creditAndGrade += (credit*grade) ;
    }


    public float get() {
        /* Your code here */
        GPA = creditAndGrade/sumCredit ;

        if (GPA==0.0 || GPA<=4.0)
        {

            return GPA;
        }
        return 0.0f;
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
