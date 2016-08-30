/**
 * Implement grading system.
 */
public class GPA {
    private float sumgrade;
    private int sumcredit;
    public void addGrade(int credit, float grade)
    {
        sumgrade+=credit*grade*1.0;
        sumcredit+=credit;
    }


    public float get()
    {
        if(sumcredit==0)
        {
            return (float) 0.0;
        }
        else
        return sumgrade/sumcredit;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %.2f\n", gpa.get());
    }
}
