/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package novelsworld;

import java.sql.*;
//import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.net.URL;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author SMART-it
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Button close;

    @FXML
    private Button loginbtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet re;
            
public void login() {
    String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
    conn = DataBase.conDb();
    
    if (conn == null) {
        // If the connection fails, alert the user
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Failed to connect to the database.");
        alert.showAndWait();
        return; // Exit the method
    }
    
    try {
        ps = conn.prepareStatement(sql);
        ps.setString(1, username.getText());
        ps.setString(2, password.getText());
        re = ps.executeQuery();
        Alert alert;
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all blank fields");
            alert.showAndWait();
        } else {
            if (re.next()) {
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Logged in!");
                alert.showAndWait();
                
                loginbtn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } else {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong username or password");
                alert.showAndWait();
            }
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

    
    public void close(){
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
