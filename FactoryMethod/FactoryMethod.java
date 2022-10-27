package FactoryMethod;

import FactoryMethod.factory.Dialog;
import FactoryMethod.factory.HtmlDialog;
import FactoryMethod.factory.WindowsDialog;

public class FactoryMethod {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            System.out.println();
            dialog = new WindowsDialog();
        } else {
            System.out.println();
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
