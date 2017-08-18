package com.arief.fx.Controllers;

import com.arief.fx.config.AbstractNodeConfigClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arief on 8/18/2017.
 */
@Component
public class SecondController extends AbstractNodeConfigClass {


    @FXML
    private GridPane grid2;



    @Autowired
    private MainController main;

    @Autowired
    private FirstController first;


    @Autowired
    private MenuController menu;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    @FXML
    public void keSatu(ActionEvent ev){
        main.setCenter(menu.initNodeForView("c0.fxml"));
    }


}
