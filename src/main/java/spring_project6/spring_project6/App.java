package spring_project6.spring_project6;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cofig.MyConfiguration;
import com.model.Employee;
import com.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
        ApplicationContext context=new AnnotationConfigApplicationContext
        		(MyConfiguration.class);
        EmployeeService es=context.getBean(EmployeeService.class);
        
        Random r=new Random();
        
        String[] names = {
    		    "Aarav", "Amit", "Anil", "Arjun", "Ashok",
    		    "Bhavesh", "Bharat", "Chetan", "Deepak", "Dinesh",
    		    "Ganesh", "Gaurav", "Harish", "Hemant", "Irfan",
    		    "Jatin", "Karan", "Kishore", "Krishna", "Lokesh",
    		    "Mahesh", "Manoj", "Mayur", "Mukesh", "Nagesh",
    		    "Narendra", "Nikhil", "Pankaj", "Prakash", "Rahul",
    		    "Rajesh", "Ramesh", "Ravi", "Rohit", "Sachin",
    		    "Sagar", "Sandeep", "Sanjay", "Santosh", "Shivam",
    		    "Shubham", "Siddharth", "Sunil", "Suraj", "Swapnil",
    		    "Tanmay", "Uday", "Vaibhav", "Vikas", "Vijay",
    		    "Vinay", "Vishal", "Yash", "Abhishek", "Aditya",
    		    "Ajay", "Akash", "Akhil", "Anoop", "Ankit",
    		    "Ankur", "Apoorva", "Aryan", "Atul", "Avinash",
    		    "Chandrakant", "Darshan", "Dhruv", "Girish", "Hardik",
    		    "Jay", "Jeevan", "Kunal", "Milan", "Mohit",
    		    "Nitin", "Omkar", "Parth", "Piyush", "Rajat",
    		    "Rohini", "Sameer", "Shailesh", "Tejas", "Yogesh"
    		};
        String[] designations = {"Developer", "Tester", "UI/UX", "Backend", "Support"};
        String[] companies = {"TCS", "Infosys", "Wipro", "Capgemini", "Accenture"};

        Employee e=new Employee();
        e.setName("haridas");
        e.setDesignation("ui/ux");
        e.setCompany("tcs");
        e.setSalary(45990.0);
        System.out.println(es.insertEmployee(e));
        
    }
}
