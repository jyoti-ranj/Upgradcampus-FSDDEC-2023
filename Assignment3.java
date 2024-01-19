import java.util.Scanner;
public class Assignment3 {

    
    public static void main(String[] args) {
     System.out.println("What Is you Age");
     Scanner sc = new Scanner(System.in);
     int age= sc.nextInt();   
    

    if(age>=18){
        System.out.println("You can Apply for Driving Licence");
    }else{
        System.out.println("You can't apply for Driving Licence");
    }
  }
} 

