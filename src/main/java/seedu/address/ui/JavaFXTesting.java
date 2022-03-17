package seedu.address.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JavaFXTesting {

    public static void JavaFXTesting(String receiverEmailAddress, String sendorEmailAddress) {
        Stage window = new Stage();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        // ---------- Set Window Info ----------
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Email Window");
        window.setMinHeight(500);

        // ---------- Set Email Address labels ----------
        Label fromLabel = new Label("From: ");
        GridPane.setConstraints(fromLabel, 0, 0);
        Label receiverLabel = new Label(receiverEmailAddress);
        GridPane.setConstraints(receiverLabel, 0, 1);
        Label toLabel = new Label("To: ");
        GridPane.setConstraints(toLabel, 1,0);
        Label sendorLabel = new Label(sendorEmailAddress);
        GridPane.setConstraints(sendorLabel, 1,1);

        // ---------- Set Text Field for Email Content ----------
        TextField emailContent = new TextField();
        emailContent.setPromptText("Email Content");
        GridPane.setConstraints(emailContent, 2, 0);

        // ---------- Set Send Button ----------
        Button sendButton = new Button("Send");
        GridPane.setConstraints(sendButton, 9, 9);

        // ---------- Set Scene ----------
        Scene scene = new Scene(gridPane, 300 ,200);

        window.setScene(scene);
        window.show();
    }
}
