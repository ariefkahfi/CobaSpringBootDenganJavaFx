package com.arief.fx.Main;

import com.arief.fx.Controllers.MainController;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Arief on 8/18/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.arief.fx.config","com.arief.fx.Controllers"})
public class App extends Application {



    private static String a[] ;

    private ApplicationContext context;

    public static void main(String []x){
        a = x;
        launch(x);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                context = SpringApplication.run(App.class,a);
                return null;
            }
        };
        task.setOnSucceeded(e->{
            MainController main = context.getBean(MainController.class);
            Parent p = (Parent)main.initNodeForView("belajar2.fxml");

            primaryStage.setScene(new Scene(p));
            primaryStage.show();

        });

        task.run();
    }
}
