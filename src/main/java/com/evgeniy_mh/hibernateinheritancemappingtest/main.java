/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest;

import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.EmployeeManager;

/**
 *
 * @author evgeniy
 */
public class main {
    
    public static void testTablePerInheritance(){
    
    };
    
    public static void main(String[] args) {
        
        EmployeeManager man=new EmployeeManager();
        man.addEmployee();
    }
}
