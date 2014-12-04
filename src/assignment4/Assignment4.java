/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Siddharth
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combined d1 = new Combined(5,30,"New Delhi");  //new delhi
        Combined d2 = new Combined(0,0,"London");   //london
        Combined d3 = new Combined(2,0,"Cairo");  //cairo
        Combined d4 = new Combined(9,0,"Tokyo");  //tokyo
        Combined d5 = new Combined(-5,0,"New York");  //new york
        Combined d6 = new Combined(8,0,"Beijing");  //beijing
        JFrame f = new JFrame();
        f.setSize(208*3+50*3,318*2+50*2);
        f.setLayout(new GridLayout(2,3,0,0));
        f.add(d1);
        f.add(d2);
        f.add(d3);
        f.add(d4);
        f.add(d5);
        f.add(d6);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
