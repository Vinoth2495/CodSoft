import java.util.*;

public class SimpleGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int num = sc.nextInt();
        
        int[] scores = new int[num];
        float total = 0;
        
        System.out.println("Enter marks:");
        for (int i = 0; i < num; i++) {
            System.out.print("Sub " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            total += scores[i];
        }
        
        float avg = total / num;
        System.out.println("Total: " + (int)total + "/" + (num * 100));
        System.out.println("Average: " + avg + "%");
        
        if (avg > 90) System.out.println("Grade: O");
        else if (avg > 80) System.out.println("Grade: A+");
        else if (avg > 75) System.out.println("Grade: A");
        else if (avg > 70) System.out.println("Grade: B+");
        else if (avg > 60) System.out.println("Grade: B");
        else if (avg >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: F");
    }
}