import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter first no :");
        int a = sc.nextInt();
        System.out.print("enter second no :");
        int b = sc.nextInt();

        System.out.println("which calculation (a,s,m,d)");
        String task = sc.next();
        sc.close();
        
        if (task.equals("a")) {
            int addition = calcaddition(a, b);
            System.out.println("answer is:"+ addition);
        } 
        else if (task.equals("s")) {
            int subtraction = calcsubtract(a, b);
        System.out.println("anser is : "+ subtraction);
        }
         else if (task.equals("m")) {
            int multiplication = calcmultiply(a,b);
        System.out.println("answer is:"+multiplication);
        } 
        else if (task.equals("d")) {
            int division = calcdivide(a,b);
        System.out.print("answer is :"+ division);
        }
    }
    public static int calcaddition(int a ,int b){
        int add = a+b;
        return add;

    }
    public static int calcsubtract(int a ,int b){
        int subtract = a-b;
        return subtract;

    }
    public static int calcmultiply(int a ,int b){
        int multiply = a*b;
        return multiply;

    }
    public static int calcdivide(int a ,int b){
        int devide = a/b;
        return devide;

    }
}
