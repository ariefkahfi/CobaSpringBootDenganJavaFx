package com.arief.fx.Controllers;

import com.arief.fx.config.AbstractNodeConfigClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arief on 8/18/2017.
 */
@Component
public class MenuController extends AbstractNodeConfigClass{

    @Autowired
    private MainController main;


    @Autowired
    private FirstController first;


    @Autowired
    private SecondController second;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    @FXML
    public void satu(ActionEvent ev){
        main.setCenter(first.initNodeForView("c1.fxml"));
    }

    @FXML
    public void dua(ActionEvent ev){
        main.setCenter(second.initNodeForView("c2.fxml"));
    }

}
