/**
 * Implement grading system.
 */
public class GPA {
    private int sumCredit=0;
    private float sumWeight=0;
    public void addGrade(int credit, float grade) {
        sumCredit += credit;
        sumWeight += credit*grade;
    }


    public float get() {
        return sumWeight/(sumCredit==0?1:sumCredit);
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
