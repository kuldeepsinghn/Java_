import java.util.Scanner;

public class percentage_calculate {
    public static void main(String[] args){
        System.out.println("Taking marks from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your English obtained marks");
        int e= sc.nextInt();
        System.out.println("Enter your English total marks");
        int E= sc.nextInt();
        System.out.println("Enter your Hindi  obtained marks");
        int h= sc.nextInt();
        System.out.println("Enter your Hindi total marks");
        int H= sc.nextInt();
        System.out.println("Enter your physics obtained marks");
        int p= sc.nextInt();
        System.out.println("Enter your physics total marks");
        int P= sc.nextInt();
        System.out.println("Enter your maths obtained marks");
        int m= sc.nextInt();
        System.out.println("Enter your maths total marks");
        int M= sc.nextInt();
        System.out.println("Enter you chemistry obtained marks");
        int c= sc.nextInt();
        System.out.println("Enter you chemistry total marks");
        int C= sc.nextInt();
        int obtained_marks= e+h+p+m+c;
        int total_marks= E+H+P+M+C;
        System.out.println("Obtained marks in exams " +obtained_marks);
        System.out.println("Total marks in exams " +total_marks);
        int percentage_calculate = ((obtained_marks * 100)% total_marks);
        System.out.println(percentage_calculate);



    }
}