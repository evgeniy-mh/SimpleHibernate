/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author evgeniy
 */

@Entity
@DiscriminatorValue("regular employee")

public class RegularEmployee extends Employee{
    
    @Column(name = "salary")
    private double salary;
    @Column(name = "bonus")
    private int bonus;
    
    public RegularEmployee(){}
    
    public RegularEmployee(String name, double salary, int bonus){
        super(name);
        this.salary=salary;
        this.bonus=bonus;
    }
    
    protected RegularEmployee(int id,String name, double salary, int bonus){
        super(id,name);
        this.salary=salary;
        this.bonus=bonus;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %f %d", getId(), getName(), getSalary(), getBonus());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
