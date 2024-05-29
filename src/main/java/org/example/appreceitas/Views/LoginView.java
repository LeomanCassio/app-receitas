package org.example.appreceitas.Views;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class LoginView {

    public class Main extends Application {
        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader fxmlLogin = new FXMLLoader(getClass().getResource("/org/example/appreceitas/Views/login.fxml"));
            Parent root = fxmlLogin.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Entre");
            stage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
    }
}
