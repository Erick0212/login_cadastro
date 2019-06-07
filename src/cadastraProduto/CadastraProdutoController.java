/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastraProduto;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author 05200245
 */
public class CadastraProdutoController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     */
    
    @FXML
    private TextField txtCaminhoImg;

    @FXML
    private TextField txtGarantia;

    @FXML
    private TextField txtValidade;

    @FXML
    private TextField txtNome;

    @FXML
    private ImageView imgView;

    @FXML
    private TextField txtValor;
    
    @FXML
    private Button btnSelecionar;
    
    @FXML
    void btnSelecionarAction(ActionEvent event) {
        
        FileChooser fileChooser = new FileChooser();
        
        fileChooser.setTitle("imagem");
        fileChooser.setInitialDirectory(new File("C:\\Users\\05200245\\Desktop"));
        //fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPG", "jpg"));
        //fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG", "png"));
        //fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("JPEG","jpeg"));
        String caminho = fileChooser.showOpenDialog(imgView.getScene().getWindow()).getAbsolutePath();
        System.out.println(caminho);
        
//        InputStream stream = getClass().getResourceAsStream(caminho);
//        Image image = ImageIO.read(stream);
          Image image = new Image(new File(caminho).toURI().toString());
      
        imgView.setImage(image);
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    
}
