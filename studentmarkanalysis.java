
import java.util.Scanner;
public class studentmarkanalysis {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of student :");
        int n= sc.nextInt();
        
        double total = 0; 
        double highest = 0;
        double lowest = 100;
        int passed = 0;
        int failed = 0;
        
        for ( int i = 1; i<= n; i++){
            System.out.println(" Enter marks for student " + i +":");
            double marks = sc.nextDouble();

            total += marks;

            if (marks > highest) {
                highest = marks;
            }
            if (marks< lowest ){
                lowest = marks;
            }
            if (marks >= 40){
                passed++;
            }else {
                failed++;
            }
        
        }
        double average = total / n;
        System.out.println("studend marks analysis:");
        System.out.println("Average Marks:"+ average);
        System.out.println("Highest Marks:"+highest);
        System.out.println("lowest Marks:"+lowest);
        System.out.println("passed students:"+passed);
        System.out.println("Failed Students:"+ failed);
        sc.close();
  }

}