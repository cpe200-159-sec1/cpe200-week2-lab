/**
 * Implement grading system.
 */
public class GPA {
    private int accCredit = 0;
    private float accGrade = 0;
    public void addGrade(int credit, float grade) {
        accCredit += credit;
        accGrade += credit*grade;
    }


    public float get() {
        if(accCredit == 0)
            return 0.0f;
        return accGrade/accCredit;
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
