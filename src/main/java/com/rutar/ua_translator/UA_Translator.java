package com.rutar.ua_translator;

import javax.swing.UIManager;

///////////////////////////////////////////////////////////////////////////////
/**
 * Бібліотека для українізації Swing-компонентів
 * @author RutarAndriy
 * 13.01.2024
 */

public class UA_Translator {

// ............................................................................

/** Масив ключів та значень мовного пакету */
private static final Object[][] ua_locale = {
    
    { "FileChooser.openButtonText",          "Вибрати"       },
    { "FileChooser.openButtonToolTipText",   "Вибрати файл"  },
    { "FileChooser.cancelButtonText",        "Відміна"       },
    { "FileChooser.cancelButtonToolTipText", "Закрити вікно" },

    { "FileChooser.openDialogTitleText",  "Вибір файлу" },
    { "FileChooser.lookInLabelText",      "Шукати в:"   },
    { "FileChooser.fileNameLabelText",    "Ім'я файлу:" },
    { "FileChooser.filesOfTypeLabelText", "Тип файлів:" },
    
    { "FileChooser.upFolderAccessibleName", "Перейти на рівень вверх" },
    { "FileChooser.upFolderToolTipText",    "Перейти на рівень вверх" },  

    { "FileChooser.homeFolderToolTipText",    "Домашня директорія" },
    { "FileChooser.homeFolderAccessibleName", "Домашня директорія" },
    
    { "FileChooser.listViewButtonToolTipText",    "Список" },
    { "FileChooser.listViewButtonAccessibleName", "Список" },
    
    { "FileChooser.detailsViewButtonToolTipText",    "Детальний список" },
    { "FileChooser.detailsViewButtonAccessibleName", "Детальний список" },
    
    { "FileChooser.fileNameHeaderText", "Ім'я"     },
    { "FileChooser.fileSizeHeaderText", "Розмір"   },
    { "FileChooser.fileTypeHeaderText", "Тип"      },
    { "FileChooser.fileDateHeaderText", "Дата"     },
    { "FileChooser.fileAttrHeaderText", "Атрибути" },
    
    { "FileChooser.readOnly", Boolean.TRUE },

};

///////////////////////////////////////////////////////////////////////////////
/**
 * Ініціалізація мовного пакету
 */

public static void init() {

    for (Object[] parameter : ua_locale) {
        UIManager.put(parameter[0], parameter[1]);
    }

}

///////////////////////////////////////////////////////////////////////////////
/**
 * Скидання мовного пакету
 */

public static void reset() {

    for (Object[] parameter : ua_locale) {
        UIManager.put(parameter[0], null);
    }

}

///////////////////////////////////////////////////////////////////////////////

}