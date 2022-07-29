package org.example.view;

import org.example.controller.Controller;

public class MainView implements View {
    @Override
    public int printInfo() {
        System.out.println("MainView");
        return Controller.MAIN_MENU_ACTION;
    }
}
