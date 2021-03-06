/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
/**
 *
 * @author evgeniy
 */

@Entity
@Table(name = "tph")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    
    public Employee(){};
    
    public Employee(String name){
        this.name=name;
    }
    
    protected Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s", getId(), getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
