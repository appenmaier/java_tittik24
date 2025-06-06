package edu.jappuccini.demos.io2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InputController {

   @FXML
   private TextField textField;

   @FXML
   public void inputToOutput(ActionEvent event) throws InternalException {
      System.out.println("Hilfe, ich werde unterdrückt");
      System.out.println(event.getSource());
      String text = textField.getText();
      System.out.println(text);

      Model model = Model.getInstance();

      try {
         model.setText(text);

         Node node = (Node) event.getSource();
         Scene oldScene = node.getScene();
         Stage primaryStage = (Stage) oldScene.getWindow();

         Parent root = FXMLLoader.load(getClass().getResource("OutputView.fxml"));
         Scene newScene = new Scene(root);
         primaryStage.setScene(newScene);
         primaryStage.show();
      } catch (InvalidInputException e) {
         e.printStackTrace();
         Alert alert = new Alert(AlertType.ERROR, e.getMessage());
         alert.show();
      } catch (IOException e) {
         throw new InternalException();
      }
   }

}
