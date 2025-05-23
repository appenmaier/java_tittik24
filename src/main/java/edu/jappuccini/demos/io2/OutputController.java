package edu.jappuccini.demos.io2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Controller
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class OutputController implements Initializable {

   @FXML
   private Label label;

   @Override
   public void initialize(URL location, ResourceBundle resources) {
      Model model = Model.getInstance();
      String text = model.getText();
      label.setText(text);
   }

}
