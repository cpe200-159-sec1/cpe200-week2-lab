/**
 * Implement grading system.
 */
public class GPA {
    private int credits=0, score=0;
    public void addGrade(int credit, float grade) {
        credits += credit;
        score += grade*credit;
    }

    public float get() {
        return (credits==0)?0:(float)score/credits;
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
