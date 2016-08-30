/**
 * Implement grading system.
 */
public class GPA {
    public float tg=0,tc=0,gpa;
    public void addGrade(int credit, float grade) {
        tg+=credit*grade;
        tc+=credit;
    }


    public float get() {
        if(tc!=0){gpa=tg/tc;
        return gpa;
        }else return 0.0f;
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
