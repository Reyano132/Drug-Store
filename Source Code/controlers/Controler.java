//Controler
package com.controlers;

import com.UI.Main;
import com.dao.Connect;
import com.sun.javafx.tk.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rishi
 */
public class Controler extends javax.swing.JFrame{

    public static Main mainframe=new Main();
    public static void main(String[] arg){
       try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainframe.setVisible(true);
            }
        });
        
       
    } 
    
}
