package com.arief.fx.config;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Arief on 8/18/2017.
 */
public abstract class AbstractNodeConfigClass implements FxController{

    protected ApplicationContext context;



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }


    public Node initNodeForView(String fxml){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/layout/"+fxml));
        loader.setController(context.getBean(getClass()));
        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
