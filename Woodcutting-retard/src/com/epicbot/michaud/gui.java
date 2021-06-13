package com.epicbot.michaud;

import javax.swing.*;
import java.util.EventListener;

public class gui implements EventListener {

    JFrame frame = new JFrame();
    JLabel treeLabel = new JLabel("Tree:");
    JComboBox<comboItem> comboBox = new JComboBox<>();
    JButton startButton = new JButton("Start");
    Object item = comboBox.getSelectedItem();
    String value = ((gui.comboItem)item).getValue();

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
        comboBox.addItem(new comboItem("Visible string 1", "Value 1"));
        comboBox.addItem(new comboItem("Visible string 2", "Value 2"));
        startButton.setBounds(220, 20, 60, 30);
        startButton.setFocusable(false);
        //startButton.addActionListener(e -> frame.dispose());

        startButton.addActionListener(e -> {
            frame.dispose();
        });

    }

    class comboItem {
        private String key;
        private String value;

        public comboItem(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
