package novelsworld;

import java.sql.*;

/**
 *
 * @author SMART-it
 */
public class DataBase {
   
    
    public static Connection conDb(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/novel", "root", "");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}


//    public void login(){
//        
//        String sql = "SELECT *FROM admin WHERE username = ? and password = ?"; 
//        conn = DataBase.conDb();
//        System.out.println("elagamy");
//        try{
//            Alert alert;
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, username.getText());
//            ps.setString(2, password.getText());
//            
//            re = ps.executeQuery();
//            System.out.println("aya");
//            
//            if(username.getText().isEmpty() || password.getText().isEmpty()){
//                alert = new Alert(AlertType.ERROR);
//                alert.setTitle("Error Message !");
//                alert.setHeaderText(null);
//                alert.setContentText("Please fill all blank fields");
//                alert.showAndWait();
//            }else{
//                if(re.next()){
//                    // IF CORRECT USERNAME AND PASSWORD
//                    
//                    alert = new Alert(AlertType.INFORMATION);
//                    alert.setTitle("Information Message");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Successfully Login :)");
//                    alert.showAndWait();
//                    loginbtn.getScene().getWindow().hide();
//                    Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
//
//                    Scene scene = new Scene(root);
//                    Stage stage = new Stage();
//                    stage.setScene(scene);
//                    stage.show();
//                   
//                    
//                    
//                    
//                }else{ // IF WRONG USERNAME OR PASSWORD
//                    alert = new Alert(AlertType.ERROR);
//                    alert.setTitle("Error Message !");
//                    alert.setHeaderText(null);
//                    alert.setContentText("Wrong Username || Password :(");
//                    alert.showAndWait();
//                }
//            }
//            
//        }catch(Exception e){e.printStackTrace();}
//    }
