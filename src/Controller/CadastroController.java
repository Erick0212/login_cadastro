/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import static cadastro2.Utilitarios.verificaSenha;
import cadastro2.classes.Cliente;
import static cadastro2.classes.Funcoes.criaCliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author Erick Nagoski
 */
public class CadastroController implements Initializable {
    
    @FXML
    private PasswordField txtSenha;

    @FXML
    private PasswordField txtConfirma;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtCpf;

    @FXML
    private Button btnConfirma;

    @FXML
    private CheckBox cbTermos;
    @FXML
    private Button bntCancelar;
    
    @FXML
    private void btnConfirmaAction(ActionEvent event) {
        
        if(cbTermos.isSelected()){
            String confirma = txtConfirma.getText();
            long cpf = Long.parseLong(txtCpf.getText());
            String email = txtEmail.getText();
            String nome = txtNome.getText();
            String senha = txtSenha.getText();
            String telefone = txtTelefone.getText();

            Cliente c  = criaCliente(senha,confirma,nome,telefone,email,cpf);
            System.out.println(c.toString());
        }else{
            Alert termos = new Alert(Alert.AlertType.INFORMATION,"Aceite os termos de uso para prosseguir.");
            termos.setTitle("Algo de errado não está certo!");
            termos.setHeaderText("Os termos de uso da plataforma não foram aceitos!");
            termos.show();
            
        }
    }
    
    @FXML
    private void btnCancelarAction(ActionEvent event){
        ((Stage)txtSenha.getScene().getWindow()).hide();
    }
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
