import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private String dept;
    private int year;
    private LocalDateTime addedTime;
    public Student(int id,String name,String dept,int year){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.year=year;
        this.addedTime=LocalDateTime.now();
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public int getYear(){
        return year;
    }
    public LocalDateTime getAddedTime() {
        return addedTime;
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