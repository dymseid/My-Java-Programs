// FOR LOOP
// public class loops {
//     public static void main (String args[]){
//         for (int counter = 0; counter < 5; counter = counter + 1){
//             System.out.println("Rajat");
//         }
//     }
    
// }


// Numbers Print

// public class loops {
//     public static void main (String args[]){
//         for (int i = 0; i < 11; i++){
//             System.out.println(i+" ");
//         }
//     }
    
// }

//  WHILE LOOP

// public class loops {
//     public static void main (String args[]){
//         int i = 0;
//         while(i<11){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// DO WHILE LOOP

// public class loops{
//     public static void main(String args[]){
//         int i = 0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<11);
//     }
// }

import java.util.*;
public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int sum = 0;
        int  i;
        for(i = 0; i<=n; i++){
            sum = sum + i;
        }System.out.println("The Sum is");
        System.out.println(sum);
    } 
}