/**
 * Implement grading system.
 */
public class GPA {

    public float creditXgrade=0,totalCredit=0,calulate=0;


    public void addGrade(int credit, float grade) {
        /* Your code here */
        //float creditXgrade=0,totalCredit=0,calulate=0;

        totalCredit+=credit;
        creditXgrade+=(credit*grade);

    }


    public float get() {
        /* Your code here */

        calulate=(creditXgrade/totalCredit);

        if (calulate<=0.0 || calulate<=4.0) {
            return calulate;
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
