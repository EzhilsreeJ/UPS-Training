public class Student {
    Student(){
        System.out.println("Constructor Overloading");
    }
    Student(String name){
        System.out.println("Name: "+name);
    }
    Student(String name,String Dept){
        System.out.println("Name: "+name+" Dept: "+Dept);
    }
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2=new Student("Ezhil");
        Student s3= new Student("Ezhil","AIDS");
    }

    
}