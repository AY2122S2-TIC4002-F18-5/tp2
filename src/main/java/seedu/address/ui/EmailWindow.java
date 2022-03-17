package seedu.address.ui;

import javafx.stage.Stage;
import seedu.address.commons.core.LogsCenter;

import java.util.logging.Logger;

public class EmailWindow extends UiPart<Stage> {

    private static final Logger logger = LogsCenter.getLogger(HelpWindow.class);
    private static final String FXML = "EmailWindow.fxml";


    /**
     * Creates a new EmailWindow.
     *
     * @param root Stage to use as the root of the EmailWindow.
     */
    public EmailWindow(Stage root) {
        super(FXML, root);
    }

    public void show() {
        logger.fine("Showing email page.");
        getRoot().show();
        getRoot().centerOnScreen();
    }

    /**
     * Hides the email window.
     */
    public void hide() {
        getRoot().hide();
    }

    /**
     * Focuses on the email window.
     */
    public void focus() {
        getRoot().requestFocus();
    }

}
