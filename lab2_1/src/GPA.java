/**
 * Implement grading system.
 */
public class GPA {

    private float gpaSum;
    private int credits;
    private boolean isFirst=true;
    GPA(){
        gpaSum=0;
        credits=1;
    }
    public void addGrade(int credit, float grade) {
        gpaSum+=credit*grade;
        if(isFirst){
            credits+=credit-1;
            isFirst=false;
        }
        else credits+=credit;
    }


    public float get() {

        return gpaSum/credits;
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
