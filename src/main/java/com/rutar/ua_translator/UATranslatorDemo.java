package com.rutar.ua_translator;

import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.event.*;
import java.awt.image.*;

// ............................................................................
/// Демонстація основних можливостей бібліотеки
/// @author Rutar_Andriy
/// 31.01.2026

public class UATranslatorDemo extends JFrame {

// ============================================================================
/// Конструктор за замовчуванням

public UATranslatorDemo() { initComponents();
                            initAppIcons(); }

// ============================================================================
/// Головний метод програми
/// @param args масив параметрів запуску програми

public static void main (String args[]) {

    UATranslator.init();
    
    // Правила оформлення проектів описані тут:
    // https://github.com/RutarAndriy/My_Coding_Rules

    EventQueue.invokeLater(() -> {
        new UATranslatorDemo().setVisible(true);
    });
}

// ============================================================================
/// Встановленн іконок для головного вікна

private void initAppIcons() {

    BufferedImage icon;
    ArrayList<Image> appIcons = new ArrayList<>();

    try {
        
    for (String resource : new String[] { "icon_16.png",
                                          "icon_32.png" }) {
        resource = "icons/" + resource;
        icon = ImageIO.read(getClass().getResourceAsStream(resource));
        appIcons.add(icon); }
    
    setIconImages(appIcons);
    
    }
    
    catch (IOException _) { }
    
}

// ============================================================================
/// Цей метод викликається з конструктора для ініціалізації форми.
/// УВАГА: НЕ змінюйте цей код. Вміст цього методу завжди 
/// перезапишеться редактором форм

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_locale = new ButtonGroup();
        pnl_top = new JPanel();
        btn_file_chooser = new JButton();
        btn_color_chooser = new JButton();
        btn_option_pane = new JButton();
        pnl_bottom = new JPanel();
        tbtn_ua = new JToggleButton();
        tbtn_default = new JToggleButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("UA_Translator Demo");
        setResizable(false);

        pnl_top.setLayout(new GridLayout(1, 0, 5, 0));

        btn_file_chooser.setText("JFileChooser");
        btn_file_chooser.setActionCommand("fileChooser");
        btn_file_chooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_file_chooser);

        btn_color_chooser.setText("JColorChooser");
        btn_color_chooser.setActionCommand("colorChooser");
        btn_color_chooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_color_chooser);

        btn_option_pane.setText("JOptionPane");
        btn_option_pane.setActionCommand("optionPane");
        btn_option_pane.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_option_pane);

        pnl_bottom.setLayout(new GridLayout(1, 0, 5, 0));

        bg_locale.add(tbtn_ua);
        tbtn_ua.setSelected(true);
        tbtn_ua.setText("Українська локалізація");
        tbtn_ua.setActionCommand("localeUA");
        tbtn_ua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_bottom.add(tbtn_ua);

        bg_locale.add(tbtn_default);
        tbtn_default.setText("Стандартна локалізація");
        tbtn_default.setActionCommand("localeDefault");
        tbtn_default.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_bottom.add(tbtn_default);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_top, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_bottom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pnl_top, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnl_bottom, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onButtonPressed(ActionEvent evt) {//GEN-FIRST:event_onButtonPressed
        // TODO add your handling code here:
        switch (evt.getActionCommand()) {
            case "fileChooser"   -> new JFileChooser().showOpenDialog(this);
            case "colorChooser"  -> JColorChooser.showDialog(this, null, null);
            case "optionPane"    -> JOptionPane.showConfirmDialog(this, null);
            case "localeUA"      -> UATranslator.init();
            case "localeDefault" -> UATranslator.reset();
        }
        //System.out.println(evt.getActionCommand());
    }//GEN-LAST:event_onButtonPressed

// ============================================================================
/// Список усіх об'явлених змінних

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup bg_locale;
    private JButton btn_color_chooser;
    private JButton btn_file_chooser;
    private JButton btn_option_pane;
    private JPanel pnl_bottom;
    private JPanel pnl_top;
    private JToggleButton tbtn_default;
    private JToggleButton tbtn_ua;
    // End of variables declaration//GEN-END:variables

// Кінець класу UATranslatorDemo ==============================================

}
