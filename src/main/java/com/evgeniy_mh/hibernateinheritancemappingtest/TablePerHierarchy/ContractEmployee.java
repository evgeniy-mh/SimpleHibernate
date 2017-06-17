/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerHierarchy;

/**
 *
 * @author evgeniy
 */
public class ContractEmployee extends Employee{
    private double pay_per_hour;
    private String contract_period;
    
    public ContractEmployee(int id,String name, double pay_per_hour, String contract_period){
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
