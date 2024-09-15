/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novelsworld;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.util.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Aya El-Agamy
 */
public class dashboardcontroller implements Initializable {
     @FXML
    private Button avl_add_btn;

    @FXML
    private TextField avl_auther;

    @FXML
    private Button avl_btn;

    @FXML
    private Button avl_clear_btn;

    @FXML
    private DatePicker avl_date;

    @FXML
    private Button avl_delete_btn;

    @FXML
    private AnchorPane avl_form;

    @FXML
    private TextField avl_id;

    @FXML
    private Button avl_import_btn;

    @FXML
    private TextField avl_price;

    @FXML
    private TextField avl_search;

    @FXML
    private TableView<?> avl_table;

    @FXML
    private TableColumn<?, ?> avl_table_auther;

    @FXML
    private TableColumn<?, ?> avl_table_date;

    @FXML
    private TableColumn<?, ?> avl_table_id;

    @FXML
    private TableColumn<?, ?> avl_table_price;

    @FXML
    private TableColumn<?, ?> avl_table_title;

    @FXML
    private TableColumn<?, ?> avl_table_type;

    @FXML
    private TextField avl_title;

    @FXML
    private TextField avl_type;

    @FXML
    private Button avl_update_btn;

    @FXML
    private Button close;

    @FXML
    private AnchorPane dash_a;

    @FXML
    private AnchorPane dash_b;

    @FXML
    private Button dash_btn;

    @FXML
    private AnchorPane dash_c;

    @FXML
    private AnchorPane dash_d;

    @FXML
    private AnchorPane dash_e;

    @FXML
    private AnchorPane dash_form;

    @FXML
    private FontAwesomeIcon logout;

    @FXML
    private AnchorPane main_form;

    @FXML
    private FontAwesomeIcon minimize;

    @FXML
    private Button shop_btn;

    @FXML
    private Label shopping_Total;

    @FXML
    private Button shopping_addbtn;

    @FXML
    private ComboBox<?> shopping_bookID;

    @FXML
    private ComboBox<?> shopping_bookTitle;

    @FXML
    private TableColumn<?, ?> shopping_col_auther;

    @FXML
    private TableColumn<?, ?> shopping_col_id;

    @FXML
    private TableColumn<?, ?> shopping_col_num;

    @FXML
    private TableColumn<?, ?> shopping_col_price;

    @FXML
    private TableColumn<?, ?> shopping_col_title;

    @FXML
    private TableColumn<?, ?> shopping_col_type;

    @FXML
    private AnchorPane shopping_form;

    @FXML
    private Label shopping_info_auther;

    @FXML
    private Label shopping_info_date;

    @FXML
    private Label shopping_info_id;

    @FXML
    private Label shopping_info_title;

    @FXML
    private Label shopping_info_type;

    @FXML
    private Button shopping_paybtn;

    @FXML
    private TableView<?> shopping_table;

    @FXML
    private Label username;
    
    public void close(){
        System.exit(0);
    }
    
    public void logout(){
        try{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");
            Optional<ButtonType> option = alert.showAndWait();
            
            if(option.get().equals(ButtonType.OK)){
                
                // HIDE YOUR DASHBOARD
                logout.getScene().getWindow().hide();
                // LINK YOUR LOGIN FORM
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                

                stage.setScene(scene);
                stage.show();
            }
            
        }catch(Exception e){e.printStackTrace();}
    }
    
    public void minimize(){
        Stage stage= (Stage)main_form.getScene().getWindow();
        stage.setIconified(true);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
