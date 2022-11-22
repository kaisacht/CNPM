package com.vu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TreasurerWindowFactory {
    public  Stage stage;
    public Stage openWindow() {
        try{
            stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(LoginWindowFactory.class.getResource("treasurer.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Image image = new Image("D:\\2022_2\\CNPM\\BTL\\src\\main\\resources\\com\\vu\\IconLogin.png");
            stage.getIcons().add(image);
            stage.setTitle("QUẢN LÝ NHÂN KHẨU");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void closeWindow(){
        stage.close();
    }
}
