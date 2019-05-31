/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import cadastro2.classes.AlertClass;
import cadastro2.classes.Cliente;
import cadastro2.classes.Empresa;
import cadastro2.classes.Funcoes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private CheckBox cbFisica;
    @FXML
    private CheckBox cbJuridica;
    @FXML
    private CheckBox cbTermos;
    @FXML
    private Button bntCancelar;
    
    @FXML
    private void btnConfirmaAction(ActionEvent event) {
        
        if(cbTermos.isSelected()){
            String confirma = "default";
            long cpf = 0;
            String email = "default";
            String nome = "default";
            String senha = "default";
            String telefone = "default";
        // valida tds os campos  
            nome = Funcoes.verificaDados(txtNome);

            if (Funcoes.verificaCPF(txtCpf)){
                cpf = Long.parseLong(txtCpf.getText());
            }else{
                AlertClass.AlertCPF();
            }

            if(Funcoes.verificaSenha(txtSenha.getText(), txtConfirma.getText())){
                System.out.println("senha certa");
                senha = txtSenha.getText();
            }else{
                AlertClass.AlertSenha();
            }

            telefone =Funcoes.verificaDados(txtTelefone);

            if(Funcoes.validarEmail(txtEmail)){
                email = txtEmail.getText();
            }else{
                AlertClass.AlertEmail();
            }    
            //cria a pessoa
            if(!nome.equals("default") || !senha.equals("default") || 
                    !telefone.equals("default") || !email.equals("default")|| cpf!=0){
                boolean verificaCheckBox = Funcoes.verificaCheckBox(cbFisica, cbJuridica); 
            
                if(cbFisica.isSelected() && verificaCheckBox){

                    cbJuridica.disarm();
                    Cliente c = Funcoes.criaCliente(nome, cpf, senha, telefone, email);
                    System.out.println(c);
                }
                if(cbJuridica.isSelected() && verificaCheckBox){
                    cbFisica.disarm();
                    Empresa e = Funcoes.criaEmpresa(nome, cpf, senha, confirma, telefone, email);
                    System.out.println(e);
              }
            }           
        }else{
            AlertClass.AlertTermos();
        }
        ((Stage)btnConfirma.getScene().getWindow()).hide();
        AlertClass.AlertCadastrado();
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
