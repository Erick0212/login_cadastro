package cadastro2.classes;

import cadastro2.classes.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Nagoski
 */
public class Funcoes {
     public static Cliente criaCliente(String senha,String confirma,String nome,String telefone,String email,long cpf){ 
        String senhaConfirmada = null;
       
            if(verificaSenha(senha , confirma)){
                senhaConfirmada = senha ;
            }else{
                Alert a = new Alert(Alert.AlertType.ERROR, "Por favor digite as senhas novamente.");
                a.setTitle("Algo de errado não está certo!");
                a.setHeaderText("As senhas não coincidem!");
                a.show();
            }
        Cliente c = new Cliente(nome, cpf, senha, telefone, email); 
        return c;
    }
     
      public static long geradorDeCodigos(){
        long cod = -1;
        while(cod < 0){
            cod = Long.parseLong(new Random(0).toString());
            cod = cod/100;
        }
        return cod;
    }
    
    public static boolean verificaSenha(String senha, String confirmacao){
        if(senha.equalsIgnoreCase(confirmacao)){
            return true;
        }
        return false;
    }
    
    public void abrirJanela(String caminho) throws IOException{
        //Funcoes.loadWindow(getClass().getResource("teste.fxml"), "teste scene", null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource(caminho));
        Parent root = loader.load();        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new javafx.scene.image.Image("/Icon/Shop.png"));
        stage.setScene(scene);
        stage.show();
        //CadastroController controller = loader.getController();
    }
}
