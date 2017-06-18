/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest;

import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.ContractEmployee;
import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.Employee;
import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.EmployeeManager;
import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.RegularEmployee;

/**
 *
 * @author evgeniy
 */
public class main {
    
    public static void testTablePerInheritance(){
    
    };
    
    public static void main(String[] args) {
        
        EmployeeManager man=new EmployeeManager();
        
        /*man.addEmployee(new Employee("Jack"));
        man.addEmployee(new ContractEmployee("Ssaha", 58.3, "30"));
        man.addEmployee(new RegularEmployee("Vovan", 79.11, 20));*/
        man.listEmployees();
        
    }
}
