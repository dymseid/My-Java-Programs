import java.util.*;
public class place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int v = sc.nextInt();
        System.out.println("Enter Number 2:");
        int w = sc.nextInt();
        if (v>0 && w>0){
        int sum = v+w;
        int sub = v-w;
        int mul = v*w;
        float div = v/w;
        System.out.print("The Sum is ");
        System.out.println(sum);
        System.out.print("The Sub is ");
        System.out.println(sub);
        System.out.print("The Mul is ");
        System.out.println(mul);
        System.out.print("The Div is ");
        System.out.println(div);
        }
        else 
        System.out.println("Invalid Input");
    System.out.println("Thank you");
    }
    
}