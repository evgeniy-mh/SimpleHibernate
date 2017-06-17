/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest;

import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.ContractEmployee;
import com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy.RegularEmployee;

/**
 *
 * @author evgeniy
 */
public class main {
    public static void main(String[] args) {
        RegularEmployee re=new RegularEmployee(5, "Lol", 12.1, 5);
        System.out.println(re);
        
        ContractEmployee ce=new ContractEmployee(7, "jack", 67.4, "15");
        System.out.println(ce);
    }
}
