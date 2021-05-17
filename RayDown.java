//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
 //go() will return true if all numbers in numArray
 //are in decreasing order [31,12,6,2,1]
 public static boolean go(int[] numArray)
 {
    Scanner s = new Scanner(System.in);
   System.out.println("Enter the size of array must be greater than 0 :");
   int n = s.nextInt();
   int arr[] = new int[n];
     
   for(int i=0;i<n;i++) {
       arr[i] = s.nextInt();
   }
     
   System.out.println(DownRunner.isDecreasing(arr));
   }
}
