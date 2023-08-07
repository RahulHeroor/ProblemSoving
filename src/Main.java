import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the test cases");
        int t=obj.nextInt();
        for (int i=0; i<t; i++){
            int n=obj.nextInt();
            System.out.println(-n);
        }
    }

}