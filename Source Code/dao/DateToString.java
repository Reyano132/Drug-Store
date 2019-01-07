/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

/**
 *
 * @author user
 */
public class DateToString {
    private static String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
    
    public static String getDate(Integer day,int mon,Integer year){
        year+=1900;
        return day.toString()+" "+month[mon]+" "+year.toString();
    }
    
}
