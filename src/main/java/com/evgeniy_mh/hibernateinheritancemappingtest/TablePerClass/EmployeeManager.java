/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evgeniy_mh.hibernateinheritancemappingtest.TablePerClass;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author evgeniy
 */
public class EmployeeManager {

    private Configuration acfg;
    private SessionFactory factory;
    
    public EmployeeManager() {
        acfg=new Configuration();
        factory=acfg.configure("hibernate.cfg.xml").buildSessionFactory();
    }
    
    public void addEmployee(Employee employee){         
        Session session= factory.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            session.persist(employee);
            tr.commit();
        }catch(HibernateException ex){
            if(tr!=null) tr.rollback();
            throw ex;
        }finally{
            session.close();
        }
    }
    
    public void listEmployees(){
        Session session= factory.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();            
            List employees = session.createQuery("from Employee").list();
            for (Iterator it = employees.iterator(); it.hasNext();) {
                Employee emp=(Employee) it.next();
                System.out.println(emp);
            }
            tr.commit();
        }catch(HibernateException ex){
            if(tr!=null) tr.rollback();
            throw ex;
        }finally{
            session.close();
        }
    }
    
    public void deleteEmployee(int employeeId){
        Session session= factory.openSession();
        Transaction tr=null;
        try{
            tr=session.beginTransaction();
            Employee emp=session.get(Employee.class, employeeId);
            if(emp!=null) session.delete(emp);
            tr.commit();
        }catch(HibernateException ex){
            if(tr!=null) tr.rollback();
            throw ex;
        }finally{
            session.close();
        }
    }
    
    public void close(){
        factory.close();
    }
}
