package com.vu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerTreasurerWindowFactory {
    @FXML
    Button buttonOutTreasurer;

    public void onButtonOutTreasurer(){
        TreasurerWindowFactory treasurerWindowFactory = new TreasurerWindowFactory();

    }
}
