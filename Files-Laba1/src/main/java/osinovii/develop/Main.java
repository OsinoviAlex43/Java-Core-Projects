package osinovii.develop;

import osinovii.develop.ui.MenuHandler;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new MenuHandler().run();
        } catch (IOException e) {
            System.err.println("Fatal error: " + e.getMessage());
        }
    }
}