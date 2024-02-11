package ourproject;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button btnregister;

    @FXML
    private Button btnlogin;
    
    private Stage regstage;
    private Stage logstage;
    private Scene regscene;
    private Scene logscene;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnregister.setOnAction((event) -> {
            Parent regroot = null;        
            try {
                regroot = FXMLLoader.load(getClass().getResource("Registeration.fxml"));
                regstage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        regscene = new Scene(regroot);       
        regstage.setScene(regscene);
        //stage.setResizable(false);
        regstage.show();
        });
        btnlogin.setOnAction((event) -> {
            Parent logroot = null;        
            try {
                logroot = FXMLLoader.load(getClass().getResource("Login.fxml"));
                logstage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        logscene = new Scene(logroot);       
        logstage.setScene(logscene);
        //stage.setResizable(false);
        logstage.show();
        });
    }
}