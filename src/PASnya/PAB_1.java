/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PASnya;

/**
 *
 * @author ArifS
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ButtonHandling extends JFrame implements ActionListener {
                private JLabel lbl;
                private JButton btnSetuju;
                private JButton btnBatal;

                public ButtonHandling() {
                super("Coba Button Handling");
                lbl=new JLabel ("Status : None");
                lbl.setHorizontalAlignment (SwingConstants.CENTER);
                btnSetuju = new JButton("Setuju");
                btnBatal = new JButton("Batal");
                btnSetuju.addActionListener(this);
                btnBatal.addActionListener(this);
                setLayout(new BorderLayout());
                add(lbl, "North");
                add(btnSetuju, "West");
                add(btnBatal, "East");
                pack();
                setResizable(false);
                setLocation(100, 100);
                setDefaultCloseOperation (3);
                setVisible(true);
                }

                public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btnSetuju) {
                                lbl.setText("Status=Setuju");
                }
                if(e.getSource()==btnBatal) {
                                lbl.setText("Status=Batal");
                }
                }
}

public class PAB_1 {
                public static void main(String [] args) {
                new ButtonHandling();
                }
}