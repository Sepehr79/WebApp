/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.dao;

import com.webapp.beans.User;
import com.webapp.config.ORMConfig;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Sepehr79
 */
public class UserDAO {
    
    private UserDAO(){
        
    }
    
    public static void addUser(User user){
        Session session = ORMConfig.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }finally{
            session.close();
        }
    }
    
    public static User getUserByEmail(String eamil){
        Session session = ORMConfig.getSessionFactory().openSession();
        try{
            User user = (User) session.get(User.class, eamil);
            return user;
        }
        finally{
            session.close();
        }
    }
    
    public static User deleteUserByEmail(String email){
        
        User user = getUserByEmail(email);
        Session session = ORMConfig.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
            return user;
        }finally{
            session.close();
        }
    }
    
    public static List<User> getAllUsers(){
        Session session = ORMConfig.getSessionFactory().openSession();
        try{
            List<User> list = session.createQuery("from User").list();
            return list;
        }finally{
            session.close();
        }
    }
    
    public static void updateUserByEmail(String email, String name, String lastName, Integer age){
        User user = getUserByEmail(email);
        Session session = ORMConfig.getSessionFactory().openSession();
        try{
            if(name != null)
                user.setName(name);
            if(lastName != null)
                user.setLastName(lastName);
            if(age != null)
                user.setAge(age);
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
            
        }finally{
            session.close();
        }
    }
    
    public static boolean isDuplicateEmail(String email){
        List<User> users = getAllUsers();
        for(User user: users)
            if(user.getEmail().equals(email))
                return true;
        return false;
    }
    
    
}
