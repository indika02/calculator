package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
    Float data = 0f;
    int Operation = -1;
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnclr;

    @FXML
    private Button btndiv;

    @FXML
    private Button btnequal;

    @FXML
    private Button btnmul;

    @FXML
    private Button btnsub;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn0) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == btn1) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == btn2) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == btn3) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == btn4) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == btn5) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == btn6) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == btn7) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == btn8) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == btn9) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == btnclr) {
            display.setText("");
        } else if (event.getSource() == btnadd) {
            data = Float.parseFloat(display.getText());
            Operation = 1;//addition
            display.setText("");

        } else if (event.getSource() == btnsub) {
            data = Float.parseFloat(display.getText());
            Operation = 2;//substation
            display.setText("");

        } else if (event.getSource() == btnmul) {
            data = Float.parseFloat(display.getText());
            Operation = 3;//multiplication
            display.setText("");
        } else if (event.getSource() == btndiv) {
            data = Float.parseFloat(display.getText());
            Operation = 4;//division
            display.setText("");
        } else if (event.getSource() == btnequal) {
            Float secondOperand = Float.parseFloat(display.getText());
            switch (Operation) {
                case 1:
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        display.setText("Error");
                        display.setText(String.valueOf(ans));
                        break;
                    }
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}