/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Cursor;

/**
 *
 * @author ffulgencio
 */
public class Helper{
    String[] miStringArray;
    
    public void llenarStringArray(){
        int cantidad =10;
        miStringArray =new String[10];
        for (int i = 0; i < cantidad; i++) {
            miStringArray[i] = String.valueOf(i+1);
            System.out.println(miStringArray[i]);
            
        }
    }
    
    public void ConvertirNumero(String x){
        int i;
        try {
            i = Integer.parseInt(x);
            System.out.print("EL numero "+x+" \r\n se convirtio correctamente.");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
