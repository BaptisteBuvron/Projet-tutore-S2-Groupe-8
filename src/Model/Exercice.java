package Model;

import Model.Ressource.Ressource;

import java.io.Serializable;

public class Exercice implements Serializable {


    private String name;
    private String consigne;
    private Ressource ressource;
    private String caractereOcculation;
    private int nbMotsDecouverts;
    private int sensibiliteCase;
    private String aide;





    //Ascesseur
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    public String getConsigne() {
        return consigne;
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }

    public String getCaractereOcculation() {
        return caractereOcculation;
    }

    public void setCaractereOcculation(String caractereOcculation) {
        this.caractereOcculation = caractereOcculation;
    }

    public int getNbMotsDecouverts() {
        return nbMotsDecouverts;
    }

    public void setNbMotsDecouverts(int nbMotsDecouverts) {
        this.nbMotsDecouverts = nbMotsDecouverts;
    }

    public int getSensibiliteCase() {
        return sensibiliteCase;
    }

    public void setSensibiliteCase(int sensibiliteCase) {
        this.sensibiliteCase = sensibiliteCase;
    }

    public void setAide(String aide) {
        this.aide = aide;
    }

    public String getAide() {
        return aide;
    }
}
