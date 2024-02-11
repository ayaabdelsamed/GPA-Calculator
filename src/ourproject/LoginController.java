package ourproject;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class LoginController implements Initializable {
    @FXML
    private TextField txtid;
    
    @FXML
    private Button btnhome;

    @FXML
    private Button btnlog;

    @FXML
    private PasswordField txtpass;
    @FXML
    private HBox hb;
    
    private Stage stage;
    private Scene scene;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnhome.setOnAction((event) -> {
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
     btnlog.setOnAction((event) -> {
            Parent root = null;        
            try {
                root = FXMLLoader.load(getClass().getResource("gpaCalc.fxml"));
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