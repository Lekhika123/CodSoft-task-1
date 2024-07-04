import java.util.*;

public class GradeCalculator {
    public static void gradeCalculator(){
        Scanner sc = new Scanner(System.in);

        //Taking input of marks
        System.out.println("Enter Marks of all subjects");
        System.out.print("Maths:");
        int math = sc.nextInt();
        System.out.print("SST:");
        int sst = sc.nextInt();
        System.out.print("Science:");
        int science = sc.nextInt();
        System.out.print("Hindi:");
        int hindi = sc.nextInt();
        System.out.print("Computer");
        int comp = sc.nextInt();

        //Calculating Percentage
        float percentage = (math + sst + science + hindi + comp)/5;

        //Printing marks and percentage
        System.out.println("Marks:" + "\nMath:"+math+"\nSst:"+sst+"\nScience:"+science+"\nHindi:"+hindi+"\nComputer");
        System.out.println("Average percentage :" + percentage);
        
        //Printing Grade
        if(percentage>80){
            System.out.println("Grade : A");
        }
        else if(percentage>60){
            System.out.println("Grade : B");
        }
        else if (percentage>40){
             System.out.println("Grade : C");
        }
        else{
            System.out.println("Fail");
        }
        


    }
    public static void main(String[] args) {
        gradeCalculator();
    }
}
