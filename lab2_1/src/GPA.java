/**
 * Implement grading system.
 */

public class GPA {
    private int credit; private float score;
    public void addGrade(int c, float g) {
        score += c*g;
        credit+=c;
    }


    public float get() {
        if (credit == 0) {
            return 0.0f;
        } else {
            return score / credit;
        }
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
