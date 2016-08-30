/**
 * Implement grading system.
 */
public class GPA {
    private  float sumCredit;
    private  float sumGrade;

    public void addGrade(int credit, float grade) {
        this.sumGrade += credit*grade;
        this.sumCredit += credit;
    }


    public float get() {
        /* Your code here */
        if(sumCredit > 0){
            return sumGrade/sumCredit;
        }else{
            return (float) (sumGrade/1.00);
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
