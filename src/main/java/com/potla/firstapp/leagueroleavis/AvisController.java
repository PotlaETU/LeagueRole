package com.potla.firstapp.leagueroleavis;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class AvisController {

    @FXML
    private ChoiceBox<Role> choice;

    @FXML
    private Button enter;

    @FXML
    private Button restart;

    @FXML
    private ImageView image;

    @FXML
    private Label text;

    @FXML
    void onEnter(ActionEvent event) {
        choice.setDisable(true);
        switch (choice.getValue().getCode()){
            case "top"-> {Image ornn = new Image(Objects.requireNonNull(getClass().getResourceAsStream("ornn_portrait.jpg")));
                image.setImage(ornn);
                text.setText("Toi t'es le giga chad de la team, tu solo lane toute la game, t'es le sigma originel");}
            case "jgl"->{
                Image leesin = new Image(Objects.requireNonNull(getClass().getResourceAsStream("leesin.jpg")));
                image.setImage(leesin);}
            case "mid"->{
                Image midlane = new Image(Objects.requireNonNull(getClass().getResourceAsStream("fakeradcmid.jpg")));
                image.setImage(midlane);
                text.setText("Et oui, on veut tous ressembler au GOAT mais c'est pas en jouant des adc mid que tu vas lui ressembler...");}
            case "adc"->{
                Image adc = new Image(Objects.requireNonNull(getClass().getResourceAsStream("adc.jpeg")));
                image.setImage(adc);
                text.setText("Rôle de pleurnichard qui insulte Riot quand ils ne peuvent pas os... Mais en vrai jgl diff pas vrai ?");}

            case "sup" ->{
                Image sup = new Image(Objects.requireNonNull(getClass().getResourceAsStream("lux.jpg")));
                image.setImage(sup);
                text.setText("Toi t'aimes les skins utlimes heinnnn... Essaye de ne pas ks l'adc ça serait cool...");}

        };
        }
    @FXML
    void onRestart(ActionEvent event){
        choice.setDisable(false);
    }


    @FXML
    void initialize(){
        choice.getItems().add(new Role("top","TopLane"));
        choice.getItems().add(new Role("jgl","Jungle"));
        choice.getItems().add(new Role("mid","MidLane"));
        choice.getItems().add(new Role("adc","Attack Damage Carry"));
        choice.getItems().add(new Role("sup","Support"));
    }

}
