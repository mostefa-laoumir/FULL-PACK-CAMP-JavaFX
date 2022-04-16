package com.company;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button btn;
    @FXML
    Label lbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {




        btn.setOnAction( (evn)->{
            String text = lbl.getText();
            String[] arrayOfString = text.split(" ");
            try{
                int count = Integer.parseInt(arrayOfString[3]);
                count++;
                lbl.setText("Click Count : "+count);

            }catch(Exception e){
                e.printStackTrace();
            }


        });



    }
}
