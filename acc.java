import java.util.Scanner;


// Let’s say that the 1st of January of a given non-leap year is a Monday. Write a program that takes the day number and returns what day it is.

 

// (Hint: The first day is a Monday, the second is a Tuesday, the third is a Wednesday, and so on. Then, the eighth day will be a Monday again, the ninth will be a Tuesday, and the tenth will be a Wednesday. So (day number) %7 could help you frame the logic here.

// Day of the week
// What day will it be on day number 156?


// Tuesday

// ✓ Correct
// Feedback:
// 156%7 = 2. Since the first day (1st of January) is a Monday, and 1%7 =1, the answer has to be Monday + 1 = Tuesday.


// Wednesday


// Thursday


// Friday

// ✕ Incorrect
// Feedback:
// 156%7 = 2. Check what day 1 (1%7) will be or day 8 (8%7) will be; this should help you visualise.

public class acc {
    public static void main(String args[]) {
        int X,Y,res;
       try (Scanner input = new Scanner(System.in)) {
        X=input.nextInt();
           Y=input.nextInt();
    }
       res= X+Y;
       if(res>30){
           System.out.println("The person is telling the truth");
       }
       else{
            System.out.println("The person is lying");
       }
        
        }
 
    }
 
    

