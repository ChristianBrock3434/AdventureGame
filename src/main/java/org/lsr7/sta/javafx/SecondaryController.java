package org.lsr7.sta.javafx;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}