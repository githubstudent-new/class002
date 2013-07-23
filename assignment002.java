// Implement a function to repeat a string.
public class Assignment2 {

   public static void main(String args[]) {

     for(int k = 20; k >= 0; k = k - 1){
       String repeated = repeatString(" ", k);
       System.out.print(repeated); // print 20 times, then 19,18,17
       for(int x = 20; x >= k; x = x-1){
         System.out.print("#");
       }
       System.out.print("\n");
     }
   }
   public static String repeatString(String s, int n) {
     // method should describe how to take in a string s
     // and to repeat it n times
   }
}
