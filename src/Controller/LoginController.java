/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import cadastro2.classes.AlertClass;
import cadastro2.classes.Funcoes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import login.Cadastro2;

/**
 * FXML Controller class
 *
 * @author Erick Nagoski
 */
public class LoginController implements Initializable {
    @FXML
    private Button btnEntrar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnCadastro;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private TextField txtEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void CadastroAction(ActionEvent event) throws IOException {
        //Funcoes.loadWindow(getClass().getResource("teste.fxml"), "teste scene", null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Cadastro.fxml"));
        Parent root = loader.load();        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new javafx.scene.image.Image("/Icon/Shop.png"));
        stage.setScene(scene);
        stage.show();
        //CadastroController controller = loader.getController();
        
    }

    @FXML
    void btnEntrar(ActionEvent event) {
        String email  = "";
        if(Funcoes.validarEmail(txtEmail)){
            email = txtEmail.getText();
        }else{
            AlertClass.AlertEmail();
        }   
        
        String senha = txtSenha.getText();
        
        System.out.println("Email: "+email+"\nSenha: "+ senha);
    }
    
    @FXML
    private void btnCancelarAction(ActionEvent event) {
        ((Stage)btnCancelar.getScene().getWindow()).hide();
    }
    
}
