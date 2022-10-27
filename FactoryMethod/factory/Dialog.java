package FactoryMethod.factory;

import FactoryMethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button initButton = createButton();
        initButton.render();
    }

    public abstract Button createButton();
}
