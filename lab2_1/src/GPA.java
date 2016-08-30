/**
 *
 * @author OVER
 */
/**
 * Implement grading system.
 */
public class GPA {
    private float[] allGrade;
    private float[] allCredit;
    private float gpaNew = 0.0f;
    private int i =0;
    public GPA(){
        allCredit = new float[10];
        allGrade = new float[10];
    }

    public void addGrade(int credit, float grade) {
        allCredit[i] = credit;
        allGrade[i] = grade*credit;
        i++;
    }


    public float get() {
        if(allCredit[0]==0){return 0.0f;}
        float sumGrade = 0.0f;
        float creditAll = 0.0f;
        for(int j=0;j<i;j++){
            creditAll = creditAll + allCredit[j];
            sumGrade = sumGrade + allGrade[j];
        }

        gpaNew = sumGrade/creditAll;
        return gpaNew+0.0f;
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

