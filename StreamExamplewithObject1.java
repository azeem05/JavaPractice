import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamplewithObject1 {


    public static void main(String[] args){

        Employee emp1=new Employee(111,"AA",15000);
        Employee emp2=new Employee(112,"AB",12000);
        Employee emp3=new Employee(113,"AC",5000);
        List<Employee> employees = Arrays.asList(emp1,emp2,emp3);
        employees.stream().filter(e->e.salary > 10000)
                .collect(Collectors.toMap(Employee::getEmpId, Function.identity()))
                .entrySet().stream()
                .forEach(System.out::println);
    }
}
class Employee{
    double random(){
        return Math.random();
    }
    Integer empId;
    Integer salary;
    String empName;

    Employee(Integer empId, String empName, Integer salary){
        this.empId=empId;
        this.salary=salary;
        this.empName=empName;
    }
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                ", empName='" + empName + '\'' +
                '}';
    }
}
