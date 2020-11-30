package com.oop;

import com.oop.lab9.UnluckyException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main9 {
    static String HandleDivision(JTextField a, JTextField b) throws ArithmeticException, NullPointerException, NumberFormatException, UnluckyException {
        double divisor = Double.parseDouble(a.getText());
        double divisable = Double.parseDouble(b.getText());

        if (divisable == 0) throw new ArithmeticException("Division by zero is illegal");
        if (divisable == 13) throw new UnluckyException();

        double res = divisor / divisable;
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        JFrame f=new JFrame("Lab 9");

        JButton b=new JButton("Calculate");
        b.setBounds(20,60,100, 40);

        JTextField first = new JTextField();
        first.setBounds(20, 20, 100, 30);

        JTextField second = new JTextField();
        second.setBounds(160, 20, 100, 30);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null, HandleDivision(first, second));

                }
                catch (NullPointerException exception){
                    JOptionPane.showMessageDialog(null, "Please introduce required fields");
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null, "Introduced data cannot be parsed into a number");
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage());
                }
            }
        });

        f.add(first);
        f.add(second);
        f.add(b);
        f.setSize(300,150);
        f.setLayout(null);
        f.setVisible(true);
    }
}
