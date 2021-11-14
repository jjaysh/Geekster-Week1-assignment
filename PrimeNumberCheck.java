import java.util.Scanner;

public class PrimeNumberCheck{
    public static void main(String[] args){
        int count = 0;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = ab.nextInt();
    for(int i=1;i<=n;i++){
            if(n%i==0){
             count = count + 1;
            }
           }
    if(count == 2){
            System.out.println("Number is Prime");
        }
    else{
            System.out.println("Number is Not Prime");
    }
   }  
  }
