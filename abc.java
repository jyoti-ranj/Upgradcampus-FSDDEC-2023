public class abc {
    public class jan_28 {
        public static void main(String args[]){
            User person1=new User("Ramesh",20,"Kathmandu","9841000000","ramesh@gmail.com");
            person1.print();
    
        }
    }
    
    class User{
        String name;
        int age;
        String address;
        String phone;
        String email;
    
        User(String name, int age,String address , String phone, String email){
            this.name=name;
            this.age=age;
            this.address=address;
            this.phone=phone;
            this.email=email;
        }
    
        void print(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Address: "+address);
            System.out.println("Phone: "+phone);
            System.out.println("Email: "+email);
        }
    }
    
    
}
