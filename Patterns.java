// SOLID RECTANGLE
import java.util.*;
public class Patterns {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length :");
    int n = sc.nextInt();
    System.out.println("Enter Width :");
    int m = sc.nextInt();
    int i;
    int j;
        for (i = 1; i<=n; i++){
            for(j = 1; j<m; j++){
                System.out.print("*");
            }System.out.println("*");
        }
    }
}

// HOLLOW RECTANGLE
//  import java.util.*;
//  public class Patterns {
//     public static void main(String args []){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Length");
//     int n = sc.nextInt();
//     System.out.println("Enter Width");
//     int m = sc.nextInt();
//     int i;
//     int j;


//     }
//  }