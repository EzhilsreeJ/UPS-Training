package StudentManagementSystem;
public class Student {
    private int id;
    private String name;
    private String dept;
    private int year;

    public Student(int id,String name,String dept,int year){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.year=year;
    }
    public int getId(int id){
        return id;
    }
    public String getName(String name){
        return name;
    }
    public String getDept(String dept){
        return dept;
    }
    public int getYear(int year){
        return year;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setYear(int year){
        this.year=year;
    }    
    
}