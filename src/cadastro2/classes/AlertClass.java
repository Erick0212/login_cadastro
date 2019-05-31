/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro2.classes;

import javafx.scene.control.Alert;

/**
 *
 * @author tecnica
 */
public class AlertClass {
    public static final String ALERT_TITLE = "Algo de errado não está certo!";
    
    public static void AlertEmail(){
        Alert a = new Alert(Alert.AlertType.ERROR, "Informe seu email novamente");
                a.setTitle(ALERT_TITLE);
                a.setHeaderText("Email inválido");
                a.show();
    }

    public static void AlertCPF() {
        Alert a = new Alert(Alert.AlertType.ERROR, "Informe seu CPF/CNPJ novamente");
                a.setTitle(ALERT_TITLE);
                a.setHeaderText("CPF/CNPJ inválido, confira se tem os 11 digitos");
                a.show();
    }
    
    public static void AlertSenha(){
        Alert a = new Alert(Alert.AlertType.ERROR,"" );
                a.setTitle("Por favor digite as senhas novamente.");
                a.setContentText(ALERT_TITLE);
                a.setHeaderText("As senhas não coincidem ou estão em branco!");
                a.show();
    }

    public static void AlertPersonType() {
        Alert a = new Alert(Alert.AlertType.ERROR,"Dois tipos de usuários selecionado");
        a.setTitle("Algo de errado não esta certo!");
        a.setContentText("Selecione somente um tipo de usuário!");
        a.show();    
    }

    public static void AlertDadosInvalidos() {
        Alert a = new  Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Entrada de dados inválida!");
        a.setTitle("Verifique os dados fornecidos.");
        a.show();    }

    public static void AlertTermos() {
        Alert termos = new Alert(Alert.AlertType.INFORMATION,"Aceite os termos de uso para prosseguir.");
        termos.setTitle("Algo de errado não está certo!");
        termos.setHeaderText("Os termos de uso da plataforma não foram aceitos!");
        termos.show();    }
}
