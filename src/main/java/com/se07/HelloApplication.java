package com.se07;

import com.vu.LoginWindowFactory;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LoginWindowFactory a = new LoginWindowFactory();
        a.openWindow();
    }

    public static void main(String[] args) {
        launch();
    }
}