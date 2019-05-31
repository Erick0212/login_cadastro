package cadastro2.classes;

import cadastro2.classes.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
    public static Cliente criaCliente(String nome,long cpf,String senha,String telefone,String email){ 
        Cliente c = new Cliente(nome,cpf, senha, telefone, email); 
        return c;
    }
    
    public static Empresa criaEmpresa(String nome,long cnpj,String senha,String confirma,String telefone,String email){
        String senhaConfirmada = null;
        
        if(verificaSenha(senha, confirma)){
            senhaConfirmada = senha;
        }else{
           AlertClass.AlertSenha();
        }
        Empresa e = new Empresa(nome,cnpj, senha, telefone, email);
        return e;
    }
    
    public static boolean verificaCheckBox(CheckBox cbFisica,CheckBox cbJuridica){
        if(cbFisica.isSelected() && cbJuridica.isSelected()){
              AlertClass.AlertPersonType();
               return false;
           }
        return true;
    }
    
    public static boolean verificaCPF(TextField txtCPF){
        if (txtCPF.getText().length() == 11 ){
            return true;
        }
        return false;
    }
    
    public static String verificaDados(TextField entrada){
        String txt = entrada.getText();
        if (verificaString(txt)){
            return txt;
        }else{
            AlertClass.AlertDadosInvalidos();
       }
        return "default";
    }
    
    public static boolean verificaString(String string){
        if(string.equalsIgnoreCase("")){
            return false;
        }
        return true;
    }
    
    public static long geradorDeID(Long cpf){
        GregorianCalendar calendar = new GregorianCalendar();
        int hora = calendar.get(calendar.HOUR_OF_DAY);
        if (hora<10){
            hora +=10;
        }
        int minuto = calendar.get(calendar.MINUTE);
        if(minuto<10){
            minuto +=10;
        }
        String cod = Integer.toString(hora)+Integer.toString(minuto);
     
        char[] cpfChar = cpf.toString().toCharArray();
        cod = cod+cpfChar[0]+cpfChar[2]+cpfChar[4];
         
        long codigo = Long.parseLong(cod);
        
        return codigo;
    }
    
    public static boolean verificaSenha(String senha, String confirmacao){
        if(senha.equalsIgnoreCase(confirmacao) && senha.length() >3){
            return true;
        }
        return false;
    }

    public static boolean validarEmail(TextField txtEmail) { 
        String email = txtEmail.getText();
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) { 
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true; 
            } 
        } return isEmailIdValid; 
    }
    
    
    
    
    /*public void abrirJanela(String caminho) throws IOException{
        //Funcoes.loadWindow(getClass().getResource("teste.fxml"), "teste scene", null);
        FXMLLoader loader = new FXMLLoader(getClass().getResource(caminho));
        Parent root = loader.load();        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new javafx.scene.image.Image("/Icon/Shop.png"));
        stage.setScene(scene);
        stage.show();
        //CadastroController controller = loader.getController();
    }*/
}
