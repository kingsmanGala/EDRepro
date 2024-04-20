/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sema11;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author HOME
 */
public class Sema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                NewCustomizer customizer = new NewCustomizer();
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(customizer);
                frame.pack();
                frame.setVisible(true);
                //comentario
            }
        });
    }

  
}
