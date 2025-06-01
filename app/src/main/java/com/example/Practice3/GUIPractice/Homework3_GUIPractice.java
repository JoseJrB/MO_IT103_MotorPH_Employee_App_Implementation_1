/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Practice3.GUIPractice;

/**
 *
 * @author jrbusadre
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  

public class Homework3_GUIPractice extends JFrame {
    private JTextField txtEmpNo;
    private JButton btnSearch;
    private JTextArea resultArea;

    public Homework3_GUIPractice() {
        setTitle("MotorPH Payroll System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel lblEmpNo = new JLabel("Enter Employee Number:");
        txtEmpNo = new JTextField(10);
        btnSearch = new JButton("Search");

        inputPanel.add(lblEmpNo);
        inputPanel.add(txtEmpNo);
        inputPanel.add(btnSearch);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });

        setLocationRelativeTo(null); // Center on screen
    }

    private void searchEmployee() {
        String empNo = txtEmpNo.getText().trim();
        if (empNo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee number is required!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Simulate a result (replace with real logic later)
            String result = "Employee " + empNo + " payroll info loaded (simulated).";
            resultArea.setText(result);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Processing Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Homework3_GUIPractice().setVisible(true));
    }
}
