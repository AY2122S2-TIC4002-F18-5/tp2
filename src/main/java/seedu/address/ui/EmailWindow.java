package seedu.address.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EmailWindow {
    final static Button sendBtn = new Button(" Send Email ");
    final static Label notification = new Label();
    final static TextField subject = new TextField("");
    final static TextArea text = new TextArea();
    static Stage window = new Stage();

    public static String emailWindow(String fromEmailAddress, String toEmailAddress) {

        window.setTitle("Email Form Window");
        Scene scene = new Scene(new Group(), 473, 305);

        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5));

        // ---------- Create From Email Address Label ---------- //
        Label fromLabel = new Label("From: ");
        Label fromAddress = new Label(fromEmailAddress);
        // ---------- Create To Email Address Label ---------- //
        Label toLabel = new Label("To: ");
        Label toAddress = new Label(toEmailAddress);
        // ---------- Create Subject Label ---------- //
        Label subjectLabel = new Label("Subject:  ");
        // ---------- Set TextArea Size ---------- //
        text.setPrefHeight(200);
        text.setPrefWidth(500);
        // ---------- Set Subject Size ---------- //
        subject.setPrefWidth(400);
        // ---------- Set Button Alignment ---------- //
        sendBtn.setAlignment(Pos.CENTER);

        grid.add(fromLabel, 0, 0);
        grid.add(fromAddress, 1,0);
        grid.add(toLabel,0,1);
        grid.add(toAddress,1,1);
        grid.add(subjectLabel, 0, 2);
        grid.add(subject, 1,2, 3,1);
        grid.add(text,0,3,4,1);
        grid.add(sendBtn, 2,4);

        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        window.setScene(scene);
        window.show();

        return "Email Sent";
    }

}
