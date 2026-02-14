import java.util.*;
public class Ksmall {
  public static int small(int arr[],int k)
  {
    Arrays.sort(arr);
    int smallint=arr[k-1];
    return smallint;
}
  public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
     for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
}
    int k=sc.nextInt();
    System.out.println(small(arr,k));
  }
} 