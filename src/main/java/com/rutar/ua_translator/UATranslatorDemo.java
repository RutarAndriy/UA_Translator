package com.rutar.ua_translator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// ............................................................................
/// Демонстація основних можливостей бібліотеки
/// @author Rutar_Andriy
/// 31.01.2026

public class UATranslatorDemo extends JFrame {

// ============================================================================
/// Конструктор за замовчуванням

public UATranslatorDemo() { initComponents(); }

// ============================================================================
/// Головний метод програми
/// @param args масив параметрів запуску програми

public static void main (String args[]) {

    // Правила оформлення проектів описані тут:
    // https://github.com/RutarAndriy/My_Coding_Rules

    EventQueue.invokeLater(() -> {
        new UATranslatorDemo().setVisible(true);
    });
}

// ============================================================================
/// Перевірка поля введення тексту

private int checkInput() {

    String input = fld_input.getText().replaceAll(" ", "");

    if (input.isBlank())     { return 1; }
    if (input.endsWith(",")) { return 2; }

    String[] split = input.split(",");

    for (String value : split) {
        try { double D = Double.parseDouble(value);
              int    I = Integer.parseInt(value);
              if (D - I > 0)            { return 2; } }
        catch (NumberFormatException e) { return 2; }
    }

    return 0;

}

// ============================================================================
/// Отримання масиву чисел із поля введення

private int[] getNumbers() {
    
    String input = fld_input.getText().replaceAll(" ", "");
    String[] split = input.split(",");
    int[] numbers = new int[split.length];

    for (int z = 0; z < split.length; z++) {
        numbers[z] = Integer.parseInt(split[z]);
    }

    return numbers;

}

// ============================================================================
/// Генерування випадкових чисел

private void generateRandomNumbers() {
            
    int random;
    String input;

    fld_input.setText(null);
    int count = (int)(Math.random() * 7) + 5;

    for (int z = 0; z < count; z++) {
        random = (int)(Math.random() * 40) - 10;
        input = fld_input.getText();
        fld_input.setText(input + (input.isEmpty() ? "" : ", ") + random);
    }
}

// ============================================================================
/// Відображення результату розрахунків

private void showResultMessage (int resultCode) {

    String text;
    String message;
    Number result;

    Color background = fld_input.getBackground();
    fld_input.setBackground(new Color(0xff66));

    String numbers = fld_input.getText().replaceAll(" ", "")
                                        .replaceAll(",", ", ");

    fld_input.setText(numbers);

    switch (resultCode) {
        case 0 ->
            { text = "Сума чисел\n(%s)\nдорівнює %d";
              result = UATranslator.sum(getNumbers()); }
        case 1 ->
            { text = "Добуток чисел\n(%s)\nдорівнює %d";
              result = UATranslator.product(getNumbers()); }
        case 2 ->
            { text = "Середнє арифметичне значення чисел\n(%s)\nдорівнює %.3f";
              result = UATranslator.arithmeticMean(getNumbers()); }
        default ->
            { text = "Середнє квадратичне значення чисел\n(%s)\nдорівнює %.3f";
              result = UATranslator.quadraticMean(getNumbers()); }
    }

    message = String.format(text, numbers, result);
    JOptionPane.showMessageDialog(fld_input, message,
                                 "Рузультат", JOptionPane.PLAIN_MESSAGE);

    fld_input.setBackground(background);

}

// ============================================================================
/// Відображення повідомлення про помилку

private void showErrorMessage (int errorCode) {

    Color background = fld_input.getBackground();
    fld_input.setBackground(new Color(0xff6666));

    String message = null;

    switch (errorCode) {
        case 1 -> message = "Поле введення не\nмістить жодних даних";
        case 2 -> message = "Помилка вводу.\nДопускаються тільки цілі числа";
    }

    JOptionPane.showMessageDialog(fld_input, message,
                                 "Помилка", JOptionPane.ERROR_MESSAGE);

    fld_input.setBackground(background);

}

// ============================================================================
/// Цей метод викликається з конструктора для ініціалізації форми.
/// УВАГА: НЕ змінюйте цей код. Вміст цього методу завжди 
/// перезапишеться редактором форм

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_hint = new JLabel();
        fld_input = new JTextField();
        btn_random = new JButton();
        sep_one = new JSeparator();
        pnl_buttons = new JPanel();
        btn_sum = new JButton();
        btn_product = new JButton();
        btn_aMean = new JButton();
        btn_qMean = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("UATranslator Demo");
        setResizable(false);

        lbl_hint.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_hint.setText("Введіть числа, розділяючи їх комою");

        fld_input.setHorizontalAlignment(JTextField.CENTER);

        btn_random.setText("<html><body align=\"center\">Згенерувати<br/>випадкові числа</body></html>");
        btn_random.setToolTipText("<html><body align=\"center\">Згенерувати випадкову кількість<br/>випадкових чисел</body></html>");
        btn_random.setActionCommand("btn_random");
        btn_random.setMargin(new Insets(2, 2, 2, 2));
        btn_random.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonClick(evt);
            }
        });

        pnl_buttons.setLayout(new GridLayout(1, 0, 2, 0));

        btn_sum.setText("Сума");
        btn_sum.setToolTipText("Розрахувати суму введених чисел");
        btn_sum.setActionCommand("btn_sum");
        btn_sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonClick(evt);
            }
        });
        pnl_buttons.add(btn_sum);

        btn_product.setText("Добуток");
        btn_product.setToolTipText("Розрахувати добуток введених чисел");
        btn_product.setActionCommand("btn_product");
        btn_product.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonClick(evt);
            }
        });
        pnl_buttons.add(btn_product);

        btn_aMean.setText("x̅");
        btn_aMean.setToolTipText("Розрахувати середнє арифметичне значення");
        btn_aMean.setActionCommand("btn_aMean");
        btn_aMean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonClick(evt);
            }
        });
        pnl_buttons.add(btn_aMean);

        btn_qMean.setText("x(rms)");
        btn_qMean.setToolTipText("Розрахувати середнє квадратичне значення");
        btn_qMean.setActionCommand("btn_qMean");
        btn_qMean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                onButtonClick(evt);
            }
        });
        pnl_buttons.add(btn_qMean);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sep_one, GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_hint, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                            .addComponent(fld_input, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(btn_random, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_buttons, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_hint)
                        .addGap(5, 5, 5)
                        .addComponent(fld_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_random, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sep_one, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnl_buttons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// ============================================================================
/// Прослуховування натискання кнопок

    private void onButtonClick(ActionEvent evt) {//GEN-FIRST:event_onButtonClick

    String command = ((JButton)evt.getSource()).getActionCommand();
    
    if (command.equals("btn_random")) { generateRandomNumbers();
                                        return; }
    
    int checkInput = checkInput();
    if (checkInput > 0) { showErrorMessage(checkInput);
                          return; }
    
    switch (command) {
        case "btn_sum"     -> showResultMessage(0);
        case "btn_product" -> showResultMessage(1);
        case "btn_aMean"   -> showResultMessage(2);
        case "btn_qMean"   -> showResultMessage(3);
    }
    }//GEN-LAST:event_onButtonClick

// ============================================================================
/// Список усіх об'явлених змінних

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btn_aMean;
    private JButton btn_product;
    private JButton btn_qMean;
    private JButton btn_random;
    private JButton btn_sum;
    private JTextField fld_input;
    private JLabel lbl_hint;
    private JPanel pnl_buttons;
    private JSeparator sep_one;
    // End of variables declaration//GEN-END:variables

// Кінець класу UATranslatorDemo ==============================================

}
