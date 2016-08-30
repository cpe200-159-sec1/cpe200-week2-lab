/**
 * Implement grading system.
 */
public class GPA {
    private int sumc=0;
    private float sumg =0.0f;
    public void addGrade(int credit, float grade) {
        sumc+=credit;
        sumg+=credit*grade;
    }


    public float get() {
        /* Your code here */
        if(sumc==0) return 0.0f;
        return sumg/sumc;
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
