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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author juanv
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn3;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;

    private int zahl = 0;
    @FXML
    private ImageView ImTic;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {
        if (event.getSource() == btn1) {
            if (btn1.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn1.setText("X");
                    btn1.setStyle("-fx-background-color: #00FF7F; ");
                    zahl++;
                } else {
                    btn1.setText("O");
                    btn1.setStyle("-fx-background-color: #FF0000; ");
                    zahl++;

                }
            }

            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);

                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn2) {
            if (btn2.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn2.setText("X");
                    btn2.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn2.setText("O");
                    btn2.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn3) {
            if (btn3.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn3.setText("X");
                    btn3.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn3.setText("O");
                    btn3.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }

            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn4) {
            if (btn4.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn4.setText("X");
                    btn4.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn4.setText("O");
                    btn4.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }

            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn5) {
            if (btn5.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn5.setText("X");
                    btn5.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn5.setText("O");
                    btn5.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn6) {
            if (btn6.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn6.setText("X");
                    btn6.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn6.setText("O");
                    btn6.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn7) {
            if (btn7.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn7.setText("X");
                    btn7.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn7.setText("O");
                    btn7.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn8) {
            if (btn8.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn8.setText("X");
                    btn8.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn8.setText("O");
                    btn8.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        } else if (event.getSource() == btn9) {
            if (btn9.getText().equals("")) {
                if (zahl % 2 == 0) {
                    btn9.setText("X");
                    btn9.setStyle("-fx-background-color: #00FF7F; ");

                    zahl++;
                } else {
                    btn9.setText("O");
                    btn9.setStyle("-fx-background-color: #FF0000; ");

                    zahl++;
                }
            }
            if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")
                    || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

                Stage stageWin = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
                Scene scene = new Scene(root);
                stageWin.setScene(scene);
                stageWin.show();

            }

            if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")
                    || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                Stage stageWinO = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("WinO.fxml"));
                Scene scene = new Scene(root);
                stageWinO.setScene(scene);
                stageWinO.show();

            }
            if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals("")) {
                Stage stageUnentschieden = new Stage();

                Parent root = FXMLLoader.load(getClass().getResource("UntentschiedenLayout.fxml"));
                Scene scene = new Scene(root);
                stageUnentschieden.setScene(scene);
                stageUnentschieden.show();
            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
