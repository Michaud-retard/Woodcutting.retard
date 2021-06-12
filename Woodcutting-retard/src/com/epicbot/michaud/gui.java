package com.epicbot.michaud;

import javax.swing.*;
import java.util.EventListener;

public class gui implements EventListener {

    JFrame frame = new JFrame();
    JLabel treeLabel = new JLabel("Tree:");
    String[] treeType = {"","Normal tree", "Oak", "Willow", "Maple", "Yew"};
    JComboBox<String> comboBox = new JComboBox<>(treeType);
    JButton startButton = new JButton("Start");

    gui() {

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(310, 110);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(treeLabel);
        frame.add(comboBox);
        frame.add(startButton);

        treeLabel.setBounds(20, 20, 30,30);
        comboBox.setBounds(60, 20, 150, 30);
        startButton.setBounds(220, 20, 60, 30);
        startButton.setFocusable(false);
        startButton.addActionListener(e -> frame.dispose());

    }
}
