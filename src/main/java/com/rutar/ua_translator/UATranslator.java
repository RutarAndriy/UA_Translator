package com.rutar.ua_translator;

import java.io.*;
import java.util.*;
import javax.swing.*;

// ............................................................................
/// Додавання українського перекладу для основних swing-компонентів
/// @author Rutar_Andriy
/// 31.01.2026

public class UATranslator {

// Стандартні значення за замовчуванням
private static final HashMap<Object, Object> default_values = new HashMap<>();

// ============================================================================
/// Ініціалізація мовного пакету

public static void init() {

    // Зчитуємо властивості з файлу ua.properties
    Properties properties = new Properties();
    try (InputStream is = UATranslator.class
                         .getResourceAsStream("others/ua.properties"))
        { properties.load(is); }
    catch (Exception _) { }
    
    // Отримуємо системні значення та задаємо нові
    properties.forEach((key, value) -> {
        default_values.put(key, UIManager.get(key));
        UIManager.put(key, value);
    });
}

// ============================================================================
/// Скидання мовного пакету

public static void reset() {

    // Відновлюємо значення за замовчуванням
    default_values.forEach((key, value) -> { 
        UIManager.put(key, value);
    });
}

// Кінець класу UATranslator ==================================================

}