package com.gamemaster.fnstatscalculator.gui;

import com.gamemaster.fnstatscalculator.utils.References;
import com.gamemaster.fnstatscalculator.utils.ResourcesLocation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Menu {

    // Frame and Panel
    private static JFrame frame;
    private static JPanel panel;

    // Display Menu
    public static void display() {

        // Panel size
        panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);
        frame.setSize(500, 500);
        // Frame Elements
        init();
        // Display
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);

    }

    private static void init() {

        // Logo
        URL logoLocation = ResourcesLocation.getImg("logo200.png");
        ImageIcon logo = new ImageIcon(logoLocation);
        JLabel logoLabel = new JLabel("");
        logoLabel.setIcon(logo);
        logoLabel.setBounds(150, 50, 200, 200);
        panel.add(logoLabel);

        // Frame Logo
        frame.setIconImage(logo.getImage());

        // Launch Button
        URL launchButtonLocation = ResourcesLocation.getImg("launchButton.png");
        ImageIcon launchButton = new ImageIcon(launchButtonLocation);
        JButton launchButtonLabel = new JButton("");
        launchButtonLabel.setBounds(150, 250, 200, 50);
        launchButtonLabel.setIcon(launchButton);
        panel.add(launchButtonLabel);

        // Exit Button
        URL exitButtonLocation = ResourcesLocation.getImg("exitButton.png");
        ImageIcon exitButton = new ImageIcon(exitButtonLocation);
        JButton exitButtonLabel = new JButton("");
        exitButtonLabel.setBounds(150, 320, 200, 50);
        exitButtonLabel.setIcon(exitButton);
        panel.add(exitButtonLabel);

        // Background
        URL backgroundLocation = ResourcesLocation.getImg("background.png");
        ImageIcon background = new ImageIcon(backgroundLocation);
        JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setBounds(0, 0, 500, 500);
        backgroundLabel.setIcon(background);
        panel.add(backgroundLabel);

        // Action Listener
        launchButtonLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButtonLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.exit();
                System.exit(0);
            }
        });

    }

    public static void exit() {
        frame.dispose();
    }

    static {
        frame = new JFrame(References.TITLE);
    }

}
