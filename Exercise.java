// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;
    
    public Employee(String x, double n){
        this.name = x;
        this.salary = n;
        
    }
    
    public String getName(){
        return name;
        
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary;

    }
    
}


// TODO: Create a class Manager that:
// - Extends Employee

class Manager extends Employee{
    private String department;
    
    public Manager(String x , double n, String dep){
        super(x,n);
        this.department=dep;
        
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() +  ", Department: " + department;  
    }
    
    
    
}


public class Exercise{
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        
        Manager obj= new Manager("Bob", 80000.0, "IT");
        Employee obj1= new Employee("Alice",50000.0);
        // TODO: Print their details using getDetails()
        
        System.out.println(obj.getDetails());
        System.out.println(obj1.getDetails());
        
        
        
    }
}
