package labtuan4;

class Person{
    private String name;
    private String address;
    
    public Person(){
        this.name = "";
        this.address = "";
    }
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public void setName(String name1){
        this.name = name1;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAddress(String address1){
        this.address = address1;
    }
    
    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
        return "name = " + name + ", address = " + address;
    }
}

class Student extends Person{
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    public void setProgram(String program1){
        this.program = program1;
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setYear(int year1){
        this.year = year1;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setFee(double fee1){
        this.fee = fee1;
    }
    
    public double getFee(){
        return fee;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee;
    }
}

class Staff extends Person{
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    
    public void setSchool(String school1){
        this.school = school1;
    }
    
    public String getSchool(){
        return school;
    }
    
    public void setPay(double pay1){
        this.pay = pay1;
    }
    
    public double getPay(){
        return pay;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", school = " + school + ", pay = " + pay;
    }

}
public class Bai02 {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van Phep", "123 Le Van Sy");
        
        System.out.println(person.toString());
        
        Student student = new Student("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000.0);
        
        System.out.println(student.toString());
        
        Staff staff = new Staff("Anh Huynh", "789 Cao Thang", "Tech University", 60000.0);
        
        System.out.println(staff.toString());
    }
}
