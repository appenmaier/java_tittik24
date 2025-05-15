package edu.jappuccini.demos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Controller {

   @FXML
   private Label label;

   @FXML
   private TextField textField;

   @FXML
   private Button button;

   @FXML
   public void inputToOutput(ActionEvent event) {
      System.out.println("Hilfe, ich werde unterdrückt");
      System.out.println(event.getSource());
      String text = textField.getText();
      label.setText(text);
   }

}
