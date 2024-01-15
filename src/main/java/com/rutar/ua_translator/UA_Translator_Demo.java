package com.rutar.ua_translator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

///////////////////////////////////////////////////////////////////////////////
/**
 * Демонстація використання бібліотеки UA_Translator
 * @author RutarAndriy
 * 13.01.2024
 */

public class UA_Translator_Demo {

// ............................................................................

/** Відступи по краях кнопок */
private static final int INSET = 5;

///////////////////////////////////////////////////////////////////////////////
/**
 * Початковий метод програми
 * @param args параметри запуску програми
 */

public static void main (String[] args) {

JDialog dialog = new JDialog();

dialog.setSize(300, 200);
dialog.setResizable(false);
dialog.setTitle("UA Translator Demo");

dialog.setLayout(new GridLayout(2, 1, INSET, INSET));
JPanel pane = (JPanel) dialog.getContentPane();
pane.setBorder(BorderFactory.createEmptyBorder(INSET, INSET, INSET, INSET));

JButton locale_default = new JButton("Стандартна локалізація");
JButton locale_ua      = new JButton("Українська локалізація");

locale_default.setActionCommand("default");
locale_ua     .setActionCommand("ua");

locale_default.addActionListener(listener);
locale_ua     .addActionListener(listener);

dialog.add(locale_default);
dialog.add(locale_ua);

dialog.setLocationRelativeTo(null);
dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
dialog.setVisible(true);

}

///////////////////////////////////////////////////////////////////////////////
/** Прослуховувач команд */

private static final ActionListener listener = (ActionEvent ae) -> {

    String comand = ae.getActionCommand();

    if (comand.equals("ua")) { UA_Translator.init();  }
    else                     { UA_Translator.reset(); }

    JFileChooser chooser = new JFileChooser();
    chooser.showDialog(null, null);

};

///////////////////////////////////////////////////////////////////////////////

}