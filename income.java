// Comprehension: Income tax

 

// Create a program for calculating the income tax to be paid by an individual earning less than 1 crore. Use conditional statements only.

 

// Use the following rules: 

// Income range	General (non-seniors)	Senior citizens (>= 60 & < 80)	Very senior citizens (>= 80)
// Up to 2,50,000	Nil	Nil	Nil
// Rs. 2,50,001 to Rs. 3,00,000	10%	Nil	Nil
// Rs. 3,00,001 to Rs. 5,00,000	10%	10%	Nil
// Rs. 5,00,001 to Rs. 10,00,000	20%	20%	20%
// Above Rs. 10,00,000	30%	30%	30%
 

// Additional information:

//  The basic exemption limit for individuals (i.e. below 60 years of age) is Rs. 2.50 lakhs.
// The basic exemption limit for senior citizens (60 years to 80 years) is Rs. 3.00 lakhs.

// The basic exemption limit for very senior citizens (80 years and above) is Rs. 5.00 lakhs.

// No extra cess is to be levied.

// Take the income and age as inputs and return the income tax. 

// For example, if the income of an individual is 6 lacs and their age is < 60, then the income tax to be paid is calculated by the following set of rules: 

 

// Income range                                                                   	Tax rate        	
//          Taxable                               income                

// Tax to be paid     
// Income up to Rs. 2,50,000	Nil	-	Nil
// Income from Rs. 2,50,000 – Rs. 5,00,000	10%	0.10 * (500000- 250000)	 25,000
// Income from Rs. 5,00,000 – Rs. 10,00,000	20%	
// 0.2 * (600000 - 500000)

//  20,000
// Income over Rs. 10,00,000	-	-	    0
// Tax	 	 	 45,000
 

import java.util.Scanner;

class Source {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();
        
        double minimumAllowedIncome; 
        
        if ((age > 60) && (age <= 80)) {
            minimumAllowedIncome = 300000;
        } else if (age > 80) {
            minimumAllowedIncome = 500000;
        } else {
            minimumAllowedIncome = 250000;
        }
        double tax = 0.0;
        if (income > minimumAllowedIncome && income <= 500000.00) {
            tax = 0.1 * (income - minimumAllowedIncome);
        } else if (income > 500000.00 && income <= 1000000.00) {
            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (income - 500000);
        } else if (income > 1000000.00) {
            tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
        }
        System.out.print(tax);
        scan.close();
    }
 {
    
}
}