
    import java.util.Scanner;
public class SumOfOddOrEven{
public static void main (String args[]){
int oddSum=0,evenSum=0;
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
for(int i=1;i<=n;i++){  
if(i%2==0) 
    evenSum=evenSum+i;
else
    oddSum=oddSum+i;
}
  System.out.println("Sum of odd numbers are: "+oddSum);
  System.out.println("Sum of even numbers are: "+evenSum);
  }
 }

