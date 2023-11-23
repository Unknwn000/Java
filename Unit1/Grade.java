import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum marks: ");
        int max_marks = sc.nextInt();
        int total = 0;

        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int[] sub_mark = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the marks of Subject-" + (i+1));
            sub_mark[i] = sc.nextInt();
            total = total + sub_mark[i];
        }
        if(total > (max_marks*6))
        {
            System.out.println("Total marks cannot be more than " + max_marks);
        }
        else
        {
            int Percentage = (total*100/(max_marks*6));
            System.out.println("Percentage = " + Percentage + "%");
        }
        sc.close();
    }
}
