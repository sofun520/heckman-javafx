package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static final String defaultURL = "http://116.196.84.250:8090/console/#/";

    @FXML
    private WebView webview;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = webview.getEngine();
        engine.load(defaultURL);
    }
}
