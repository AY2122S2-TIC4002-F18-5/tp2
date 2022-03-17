package seedu.address;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SingletonLogin {
    private static SingletonLogin instance;
    public final Stage loginStage;

    private SingletonLogin() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Scene scene;

        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        loginStage = new Stage();
        loginStage.setTitle("Login Screen");
        loginStage.getIcons().add(new Image("/ImagesLogin/team.png"));
        loginStage.setScene(scene);
        loginStage.setResizable(false);
    }

    public static SingletonLogin getInstance() {

        if (instance == null) {
            instance = new SingletonLogin();
        }

        return instance;
    }
}
