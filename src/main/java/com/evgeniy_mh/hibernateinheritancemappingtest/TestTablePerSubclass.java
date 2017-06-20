/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest;
import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerSubclass.*;

/**
 *
 * @author evgeniy
 */
public class TestTablePerSubclass {
    public static void test(){
        System.out.println("-----Testing Table Per Hierarchy:");
        EmployeeManager man=new EmployeeManager(); 
        
        man.addEmployee(new Employee("Jack"));
        man.addEmployee(new ContractEmployee("Ssaha", 58.3, "30"));
        man.addEmployee(new RegularEmployee("Vovan", 79.11, 20));
        
        System.out.println("-----db:");
        man.listEmployees();
        man.deleteEmployee(3);
        System.out.println("-----deleted with id 3");
        man.listEmployees();
        System.out.println("-----End of testing.");
        man.close();
    }
}
