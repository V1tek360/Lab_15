package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab_15 extends JFrame {
    private TextField txt;
    private JButton but1;
    private JButton but2;
    private JButton but3;

    public Lab_15(){
        setBounds(400,400,150,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        txt=new TextField("0");
        add(txt);
        but1=new JButton("+1");
        but2=new JButton("-1");
        but1.addActionListener(this::actionPerformed);
        but2.addActionListener(this::actionPerformed);
        add(but1);
        add(but2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getActionCommand().equals("+1")){
            String aStr= txt.getText();
            int b=Integer.parseInt(aStr);
            b=b+1;
            if (b<4) {
                txt.setText(Integer.toString(b));
            }
        }
        else if(a.getActionCommand().equals("-1")){
            String aStr= txt.getText();
            int b=Integer.parseInt(aStr);
            b=b-1;
            if (b>-6) {
                txt.setText(Integer.toString(b));
            }
        }
    }
    public static void main(String [] args){
        new Lab_15();
    }
}
