public class Main{
    public static void main(String[] args) {
    

    Student s1 = new Student("Rahul", 2);
    System.out.println(s1.getDetails());

    researchStudent s2 = new researchStudent("satya", 3, "Computer Science");
    System.out.println(s2.getDetails());

    researchStudent.PhDStudent s3 = new researchStudent.PhDStudent("hari", 1, "Software Engineering", "Automated Evaluation");

    System.out.println(s3.getDetails());
}
}





class Student{
        public String name = "";
        public int year;
        public static float AnualFeees = 10000;

       public Student(String name , int year ){
        this.name= name;
        this.year = year;

       
       }
       public String getDetails(){
        return "Name"+" "+name+"\n"+"Year"+" "+year +"\n"+"Fees"+" "+computefees();
       }  
       
       public float computefees(){
        return this.year*AnualFeees;
       }
}

class researchStudent extends Student{
    private String researchArea;
    public static float AnualFeees = 20000;


    public researchStudent(String name, int year , String researchArea) {
        super(name, year);
        this.researchArea = researchArea;

       
  
    }

    public String getDetails(){
        return super.getDetails()+"\n"+"Research Area"+" "+researchArea;
       }  
    
static class PhDStudent extends researchStudent {
private String thesisTitle;
private static final float AnnualFeees = 30000; // Corrected data type
          
public PhDStudent(String name, int year, String researchArea, String thesisTitle) {
        super(name, year, researchArea);
        this.thesisTitle = thesisTitle;
        }
    
        public String getDetails() {
            return super.getDetails() + "\n" + "Thesis Title" + " " + thesisTitle;
        }  
    }
    
           
   

    

}



