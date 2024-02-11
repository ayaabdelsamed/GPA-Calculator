package ourproject;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class GpaCalcController implements Initializable {
    private Stage stage;
    private Scene scene;
    @FXML
    private Button btncalc;

    @FXML
    private TextField txtdeg6;

    @FXML
    private TextField txtdeg1;

    @FXML
    private TextField txtname1;

    @FXML
    private TextField txtdeg4;

    @FXML
    private TextField txtnum;

    @FXML
    private TextField txtname2;

    @FXML
    private TextField txtdeg5;

    @FXML
    private TextField txtdeg2;

    @FXML
    private TextField txtdeg3;

    @FXML
    private TextField txtname5;

    @FXML
    private TextField txtname6;

    @FXML
    private TextField txtname3;

    @FXML
    private TextField txtname4; 
       @FXML
    private TextField txtres;
    
    @FXML
    void handleCalculateButton(ActionEvent event) {
        double points =0.0;
        int deg1=Integer.parseInt(txtdeg1.getText());
        if(deg1>=90)
            points+=4;
        else if(deg1>=85&&deg1<90)
            points+=3.7;
        else if(deg1>=80&&deg1<85)
            points+=3.3;
        else if(deg1>=75&&deg1<80)
            points+=3.0;
        else if(deg1>=70&&deg1<75)
            points+=2.7;
        else if(deg1>=65&&deg1<70)
            points+=2.4;
        else if(deg1>=60&&deg1<65)
            points+=2.2;
        else if(deg1>=50&&deg1<60)
            points+=2.0;
        else
            points+=0.0;
        int deg2=Integer.parseInt(txtdeg2.getText());
        if(deg2>=90)
            points+=4;
        else if(deg2>=85&&deg2<90)
            points+=3.7;
        else if(deg2>=80&&deg2<85)
            points+=3.3;
        else if(deg2>=75&&deg2<80)
            points+=3.0;
        else if(deg2>=70&&deg2<75)
            points+=2.7;
        else if(deg2>=65&&deg2<70)
            points+=2.4;
        else if(deg2>=60&&deg2<65)
            points+=2.2;
        else if(deg2>=50&&deg2<60)
            points+=2.0;
        else
            points+=0.0;
        int deg3=Integer.parseInt(txtdeg3.getText());
        if(deg3>=90)
            points+=4;
        else if(deg3>=85&&deg3<90)
            points+=3.7;
        else if(deg3>=80&&deg3<85)
            points+=3.3;
        else if(deg3>=75&&deg3<80)
            points+=3.0;
        else if(deg3>=70&&deg3<75)
            points+=2.7;
        else if(deg3>=65&&deg3<70)
            points+=2.4;
        else if(deg3>=60&&deg3<65)
            points+=2.2;
        else if(deg3>=50&&deg3<60)
            points+=2.0;
        else
            points+=0.0;
        int deg4=Integer.parseInt(txtdeg4.getText());
        if(deg4>=90)
            points+=4;
        else if(deg4>=85&&deg4<90)
            points+=3.7;
        else if(deg4>=80&&deg4<85)
            points+=3.3;
        else if(deg4>=75&&deg4<80)
            points+=3.0;
        else if(deg4>=70&&deg4<75)
            points+=2.7;
        else if(deg4>=65&&deg4<70)
            points+=2.4;
        else if(deg4>=60&&deg4<65)
            points+=2.2;
        else if(deg4>=50&&deg4<60)
            points+=2.0;
        else
            points+=0.0;
        int deg5=Integer.parseInt(txtdeg5.getText());
        if(deg5>=90)
            points+=4;
        else if(deg5>=85&&deg5<90)
            points+=3.7;
        else if(deg5>=80&&deg5<85)
            points+=3.3;
        else if(deg5>=75&&deg5<80)
            points+=3.0;
        else if(deg5>=70&&deg5<75)
            points+=2.7;
        else if(deg5>=65&&deg5<70)
            points+=2.4;
        else if(deg5>=60&&deg5<65)
            points+=2.2;
        else if(deg5>=50&&deg5<60)
            points+=2.0;
        else
            points+=0.0;
        int deg6=Integer.parseInt(txtdeg6.getText());
        if(deg6>=90)
            points+=4;
        else if(deg6>=85&&deg6<90)
            points+=3.7;
        else if(deg6>=80&&deg6<85)
            points+=3.3;
        else if(deg6>=75&&deg6<80)
            points+=3.0;
        else if(deg6>=70&&deg6<75)
            points+=2.7;
        else if(deg6>=65&&deg6<70)
            points+=2.4;
        else if(deg6>=60&&deg6<65)
            points+=2.2;
        else if(deg6>=50&&deg6<60)
            points+=2.0;
        else
            points+=0.0;
        int totalHours=Integer.parseInt(txtnum.getText());
        float result=(float)points/totalHours;
        String formattedNumber = String.format("%.3f", result);
        if(result>=2.0f)
        {
           
            //txtres.setText(result+"");
            
            /* Parent root = null;        
            try {
                root = FXMLLoader.load(getClass().getResource("result.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        scene = new Scene(root);       
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
        }*/}
        else
           {
            Parent root = null;        
            try {
                root = FXMLLoader.load(getClass().getResource("recommendation.fxml"));
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        scene = new Scene(root);       
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}