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
    
        Employee e=new Employee();
        e.setName("haridas");
        e.setDesignation("ui/ux");
        e.setCompany("tcs");
        e.setSalary(45990.0);
        System.out.println(es.insertEmployee(e));
        
    }
}
