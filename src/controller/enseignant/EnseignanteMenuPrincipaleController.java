package controller.enseignant;

import Application.MainEnseignant;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class EnseignanteMenuPrincipaleController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void openExercice(ActionEvent event) {
    }

    public void createExercice(ActionEvent event) {
        MainEnseignant.stage.setScene(MainEnseignant.nomExercice);
    }
}