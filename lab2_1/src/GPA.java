

public class GPA {

    float sum1=0,sum2=0;
    public void addGrade(int credit, float grade) {
        sum1 += grade*credit;
        sum2 += credit;
    }


    public float get() {
        if(sum2==0){
            return 0;
        }
        return sum1/sum2;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
