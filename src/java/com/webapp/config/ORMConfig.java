/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.config;

import com.webapp.beans.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sepehr79
 */
public class ORMConfig {
    
    private static final SessionFactory sessionFactory;
    
    static{
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                //Add anotated clases class
                addAnnotatedClass(User.class).
                //--------------------------
                buildSessionFactory();
    }
    
    private ORMConfig(){
        
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
