package com.rutar.ua_translator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// ............................................................................
/// Демонстація основних можливостей бібліотеки
/// @author Rutar_Andriy
/// 31.01.2026

public class UATranslatorDemo extends JFrame {

private final JFileChooser chooser = new JFileChooser();
private final JColorChooser color = new JColorChooser();

// ============================================================================
/// Конструктор за замовчуванням

public UATranslatorDemo() { 

    //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    initComponents();

}

// ============================================================================
/// Головний метод програми
/// @param args масив параметрів запуску програми

public static void main (String args[]) {

    UATranslator.init();
    //FlatDarkLaf.setup();
    
    // Правила оформлення проектів описані тут:
    // https://github.com/RutarAndriy/My_Coding_Rules

    EventQueue.invokeLater(() -> {
        new UATranslatorDemo().setVisible(true);
    });
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
        btn_file_chooser.setActionCommand("open");
        btn_file_chooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_file_chooser);

        btn_color_chooser.setText("JColorChooser");
        btn_color_chooser.setActionCommand("save");
        btn_color_chooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_color_chooser);

        btn_option_pane.setText("JOptionPane");
        btn_option_pane.setActionCommand("color");
        btn_option_pane.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonPressed(evt);
            }
        });
        pnl_top.add(btn_option_pane);

        pnl_bottom.setLayout(new GridLayout(1, 0, 5, 0));

        bg_locale.add(tbtn_ua);
        tbtn_ua.setText("Українська локалізація");
        pnl_bottom.add(tbtn_ua);

        bg_locale.add(tbtn_default);
        tbtn_default.setText("Стандартна локалізація");
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
            case "open" -> { chooser.showOpenDialog(this); }
            case "save" -> { chooser.showSaveDialog(this); }
            case "color" -> { JColorChooser.showDialog(this, null, Color.yellow); }
            case "message" -> { JOptionPane.showConfirmDialog(this, "Hello", "", JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE); }
        }
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
