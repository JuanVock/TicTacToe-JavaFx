/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.java.fx.TicTacToeJavaFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juanv
 */
public class FXMLStartController implements Initializable {

    @FXML
    private Button btnStart;

    /**
     * Initializes the controller class.
     */
    @Override
    public   void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonPressed(ActionEvent event) throws IOException {
        if (event.getSource() == btnStart) {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Scene scene = new Scene(root);

            stage.setScene(scene);
            Stage thisStage = (Stage) btnStart.getScene().getWindow();
            thisStage.close();
            stage.show();
        }
    }

}
