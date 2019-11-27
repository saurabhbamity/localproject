package com.test.springcore.autowire.prototyperefinsingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonRefPrototypeMain {

    public static void main(String[] args) {
        
        // Example also demonstrate the look up method use
        
        //Traditional way

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Employee employee1 = (Employee) context.getBean("employee");
        Employee employee2 = (Employee) context.getBean("employee");
        
        System.out.println("e1 hsh"+employee1.hashCode());
        System.out.println("e2 hsh"+employee2.hashCode());
        
        System.out.println("e1 Dept hsh"+employee1.getDepartment().hashCode());
        System.out.println("e2 Dept hsh"+employee2.getDepartment().hashCode());
        //same hash code printed, it mean the this is acting like singleton, prototype is of no use here.
        
        System.out.println(employee1.getFullName());
        System.out.println(employee1.getDepartment().getName());
        
        
        //after use of look up method in employeeBean , department will be different
        
        EmployeeBeanSingleton employee3 = (EmployeeBeanSingleton) context.getBean("employeeBean");
        EmployeeBeanSingleton employee4 = (EmployeeBeanSingleton) context.getBean("employeeBean");
        
        System.out.println("e3 hsh"+employee3.hashCode());
        System.out.println("e4 hsh"+employee4.hashCode());
        
        System.out.println("e3 Dept hsh"+employee3.createDepartmentBeanPrototype().hashCode());
        System.out.println("e4 Dept hsh"+employee4.createDepartmentBeanPrototype().hashCode());
      
        //diff hash code printed,which was expected.
    }

}

