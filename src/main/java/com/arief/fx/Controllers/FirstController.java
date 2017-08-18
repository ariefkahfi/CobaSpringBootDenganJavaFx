package com.arief.fx.Controllers;

import com.arief.fx.config.AbstractNodeConfigClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arief on 8/18/2017.
 */
@Component
public class FirstController  extends AbstractNodeConfigClass{



    @Autowired
    private MainController main;


    @FXML
    private GridPane grid;


    @Autowired
    private SecondController secondController;


    @Autowired
    private MenuController menu;

    @FXML
    private TextField yourName,yourPass;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    public void doBack(ActionEvent ev){
        main.setCenter(menu.initNodeForView("c0.fxml"));
    }



    @FXML
    public void doNext(ActionEvent ev){
        yourName.setText("Your Name here");
        yourPass.setText("Your Pass here");
    }

}
