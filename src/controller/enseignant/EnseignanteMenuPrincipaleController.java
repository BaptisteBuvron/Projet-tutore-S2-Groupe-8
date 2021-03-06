package controller.enseignant;

import Application.MainEnseignant;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import model.Exercice;

import java.net.URL;
import java.util.ResourceBundle;

public class EnseignanteMenuPrincipaleController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void createExercice(ActionEvent event) {
        MainEnseignant.exercice = new Exercice();
        MainEnseignant.stage.setScene(MainEnseignant.nomExercice);
    }

    public void corriger(){
        MainEnseignant.stage.setScene(MainEnseignant.selectionnerExercice);
    }

    public void closeApplication(){
        Platform.exit();
        System.exit(0);
    }

    public void tutoriel(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Attention !");
        alert.setHeaderText("Fonctionnalité en cours de développement.");
        alert.setContentText("Le tutoriel n'est pas encore disponible. Veuillez patienter");
        alert.showAndWait();
    }
}
