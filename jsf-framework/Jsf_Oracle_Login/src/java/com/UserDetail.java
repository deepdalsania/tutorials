/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection
;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Admin
 */

@ManagedBean(name = "ud")
@SessionScoped
public class UserDetail {
    
    
     public String userName;
    public String password;
    
    
     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public static  boolean verify(String userName , String password){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:userinfo");
            String q = "select * from UserInfoData where userName=? and password=?";
            PreparedStatement preparedStatement = con.prepareStatement(q);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                
                return true;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        
        
        public String connMethod(){
            String uname = this.getUserName();
            String pw = this.getPassword();
            System.out.println(pw + uname + " ");
            if (verify(uname, pw))
                
                return "LoginSuccess";
            
            return "LoginFailed";
        }
}
