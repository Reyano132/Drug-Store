/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class Connect {
    private Connection con=null;
    public Connection getConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:drugstore.db");
            //sSystem.out.println("Connected");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }

    public PreparedStatement prepareStatement(String update_medicines_set_med_namequantityexpi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
