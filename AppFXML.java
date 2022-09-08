package AppFXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML  extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String arquivoCSS = getClass().getResource("/AppFXML/login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/AppFXML/login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        stage.setResizable(false);
        Scene cena = new Scene(raiz,450,500);
        cena.getStylesheets().add(arquivoCSS);
        stage.setScene(cena);
        stage.setTitle("Tela de Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
