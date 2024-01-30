package org.lsr7.sta.javafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}