package com.arief.fx.Controllers;

import com.arief.fx.config.AbstractNodeConfigClass;
import com.arief.fx.config.FxController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arief on 8/18/2017.
 */
@Component
public class MainController extends AbstractNodeConfigClass{


    @FXML
    private BorderPane borderMain;

    public void setCenter(Node newNode){
        borderMain.setCenter(newNode);
    }


    @Autowired
    private MenuController menu;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCenter(menu.initNodeForView("c0.fxml"));
    }


}
