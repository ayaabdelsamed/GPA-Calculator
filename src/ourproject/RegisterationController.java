package ourproject;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class RegisterationController implements Initializable {
    private Stage stage;
    private Scene scene;
     @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

    @FXML
    private Button btnregister;

    @FXML
    private Button btnhomee;
     @Override
    public void initialize(URL url, ResourceBundle rb) {
         btnhomee.setOnAction((event) -> {
            Parent root = null;        
            try {
                root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        scene = new Scene(root);       
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
        });
         btnregister.setOnAction((event) -> {
            Parent root = null;        
            try {
                root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        scene = new Scene(root);       
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
        });
    }   
}
