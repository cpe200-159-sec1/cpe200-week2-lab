/**
 * Implement grading system.
 */
public class GPA {
    private float sum=0;
    private float cra=0;
    public void addGrade(int credit, float grade) {
        /* Your code here */
        sum+=(grade*credit);
        cra+=credit;
    }


    public float get() {
        if (cra !=0)return sum/cra;
        else return 0;
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
