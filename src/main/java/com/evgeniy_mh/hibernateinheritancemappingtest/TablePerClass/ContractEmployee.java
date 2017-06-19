/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author evgeniy
 */

@Entity
@Table(name = "tpcContractEmployee")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "id")),
    @AttributeOverride(name = "name", column = @Column(name = "name"))
})

public class ContractEmployee extends Employee{
    
    @Column(name = "pay_per_hour")
    private double pay_per_hour;
    @Column(name = "contract_duration")
    private String contract_period;
    
    public ContractEmployee(){}
    
    public ContractEmployee(String name, double pay_per_hour, String contract_period){
        super(name);
        this.pay_per_hour=pay_per_hour;
        this.contract_period=contract_period;
    }
    
    protected ContractEmployee(int id,String name, double pay_per_hour, String contract_period){
        super(id,name);
        this.pay_per_hour=pay_per_hour;
        this.contract_period=contract_period;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %f %s", getId(), getName(), getPay_per_hour(), getContract_period());
    }

    public double getPay_per_hour() {
        return pay_per_hour;
    }

    public void setPay_per_hour(double pay_per_hour) {
        this.pay_per_hour = pay_per_hour;
    }

    public String getContract_period() {
        return contract_period;
    }

    public void setContract_period(String contract_period) {
        this.contract_period = contract_period;
    }
}
