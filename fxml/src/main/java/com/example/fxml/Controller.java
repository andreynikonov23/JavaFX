package com.example.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label labelId;
    @FXML
    private Button buttonId;



    public void click(ActionEvent actionEvent) {
        buttonId.setText("Controller");
    }


}
