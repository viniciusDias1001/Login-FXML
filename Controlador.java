package AppFXML;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class Controlador {
    @FXML
    private TextField email;
    @FXML
    private PasswordField senha;

    public void entrar(){
        boolean emailValido = email.getText().equals("pedrorochadias1001@gmail.com");
        boolean senhaValida = senha.getText().equals("200622pmr");

        if (emailValido && senhaValida){
            Notifications.create().title("Login ( System.V )").text("Login efetuado com sucesso").position(Pos.TOP_RIGHT).showInformation();

        } else if (email.getText().isEmpty() || senha.getText().isEmpty()) {
           if (!email.getText().isEmpty() && senha.getText().equals("")){
               Notifications.create().title("Login ( System.V )").text("Senha não inserida").position(Pos.TOP_RIGHT).showError();
           } else {
               Notifications.create().title("Login ( System.V )").text("email não inserido").position(Pos.TOP_RIGHT).showError();
           }
        }
        else{
            Notifications.create().title("Login ( System.V )").text("Usuario sem permissão de acesso").showWarning();
        }

    }
}
