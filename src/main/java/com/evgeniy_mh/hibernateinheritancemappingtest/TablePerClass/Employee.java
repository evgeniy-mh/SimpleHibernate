/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerClass;
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
import javax.persistence.TableGenerator;
/**
 *
 * @author evgeniy
 */

@Entity
@Table(name = "tpcEmployee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {

    @Id
    @TableGenerator(
            name = "SHAPE_GEN",
            table = "ID_Generator",
            pkColumnName = "name",
            valueColumnName = "sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SHAPE_GEN")
    
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
