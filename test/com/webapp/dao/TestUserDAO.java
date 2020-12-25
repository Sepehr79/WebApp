/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.dao;

import com.webapp.beans.User;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sepehr79
 */
public class TestUserDAO {
    
//    @Test
    public void testAddUser(){
        User user = new User("sepehr", "mollaei", 21, "sepehrmsm1379@gmail.com", "1234");
        UserDAO.addUser(user);
    }
    
    @Test
    public void testGetUser(){
        User user = UserDAO.getUserByEmail("sepehrmsm1379@gmail.com");
        System.out.println(user);
        Assert.assertEquals("sepehr", user.getName());
        
        User user1 = UserDAO.getUserByEmail("this email notused");
        Assert.assertNull(user1);
    }
    
//    @Test
    public void testGetAllUsers(){
        List<User> users = UserDAO.getAllUsers();
        Assert.assertEquals("sepehr", users.get(0).getName());
    }
    
//    @Test
    public void testUpdateUser(){
        UserDAO.updateUserByEmail("sepehrmsm1379@gmail.com", null, null, 26);
        Assert.assertEquals(26, UserDAO.getUserByEmail("sepehrmsm1379@gmail.com").getAge());
    }
    
}
