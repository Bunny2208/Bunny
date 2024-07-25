import java.util.*;
public class calc {
    public static void main(String[] args) {
        
        while (true) {
            Scanner ssc = new Scanner(System.in);
        System.out.println("which calculation(a,s,m,d)");
        String task = ssc.nextLine();

        if (task.equals('a')) {
            addition();
        } else if (task.equals('s')) {
            subtraction();
        } else if (task.equals('m')) {
            multiplication();
        } else if (task.equals('d')) {
            division();
        }
        }
        
    }
    public static int addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int no1 = sc.nextInt();
        System.out.println("enter no2 :");
        int no2= sc.nextInt();
        int sum = no1 +no2 ;
        System.out.println("Answer is " + sum);
        return sum;
    }
    public static int subtraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int no1 = sc.nextInt();
        System.out.println("enter no2 :");
        int no2= sc.nextInt();
        int sum = no1 - no2 ;
        System.out.println("Answer is " + sum);
        return sum;
    }
    public static int multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int no1 = sc.nextInt();
        System.out.println("enter no2 :");
        int no2= sc.nextInt();
        int sum = no1 * no2 ;
        System.out.println("Answer is " + sum);
        return sum;
    }
    public static int division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no1");
        int no1 = sc.nextInt();
        System.out.println("enter no2 :");
        int no2= sc.nextInt();
        int sum = no1 / no2 ;
        System.out.println("Answer is " + sum);
        return sum;
    }
}

