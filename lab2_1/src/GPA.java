/**
 * Implement grading system.
 */
public class GPA {
    float G,Grade,SumG;
    int C,SumC;
    public void addGrade(int credit, float grade) {
        C=credit;
        G=grade;
        SumG+=G*C;
        SumC+=C;
    }


    public float get() {
        Grade=SumG/SumC;
        if(SumC==0){
            return 0;
        }
        else {
            return Grade;
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
