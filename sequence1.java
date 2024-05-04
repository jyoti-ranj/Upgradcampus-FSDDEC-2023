import java.util.Scanner;
public class sequence1 {

    public int fibonacci(int n){
        if(n<2){
            return n;
        }else{
            return (fibonacci(n-1)+ fibonacci(n-2))%10;
        }
    }
   public static void main(String[] args) {
    System.out.println("Enter the Number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sequence1 sequence = new sequence1();
    int answer = sequence.fibonacci(n);
    System.out.println(answer);
   } 
}
