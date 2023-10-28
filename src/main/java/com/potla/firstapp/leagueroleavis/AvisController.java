package com.potla.firstapp.leagueroleavis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

public class AvisController {

    @FXML
    private ChoiceBox<Role> choice;

    @FXML
    private ImageView image;

    @FXML
    private Label text;

    private Map<String, String> rolesimages = new HashMap<>();

    private String[] nomsFichiers = {"fakeradcmid.jpg", "ornn_portrait.jpg", "leesin.jpg", "adc.jpeg", "lux.jpg"};

    private String[] place = {"mid","top","jgl", "adc", "sup"};

    @FXML
    void onEnter(ActionEvent event) {
        choice.setDisable(true);
        switch (choice.getValue().getCode()){
            case "top"-> {
                Image ornn = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rolesimages.get("top"))));
                image.setImage(ornn);
                text.setText("Toi t'es le giga chad de la team, tu solo lane toute la game, t'es le sigma originel");}
            case "jgl"-> {
                Image leesin = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rolesimages.get("jgl"))));
                image.setImage(leesin);
                text.setText("Et oui, tu portes sur tes épaules tout le malheur de la faille... T'as du courage");}
            case "mid"->{
                Image midlane = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rolesimages.get("mid"))));
                image.setImage(midlane);
                text.setText("Et oui, on veut tous ressembler au GOAT. Alors Showmaker, Faker ou Chovy ? (KC Saken)");}
            case "adc"->{
                Image adc = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rolesimages.get("adc"))));
                image.setImage(adc);
                text.setText("Rôle de pleurnichard qui insulte Riot quand ils ne peuvent pas os... Mais en vrai jgl diff pas vrai ?");}

            case "sup" ->{
                Image sup = new Image(Objects.requireNonNull(getClass().getResourceAsStream(rolesimages.get("sup"))));
                image.setImage(sup);
                text.setText("Toi t'aimes les skins utlimes heinnnn... Essaye de ne pas ks l'adc ça serait cool...");}

            default -> throw new IllegalStateException("Unexpected value: " + choice.getValue().getCode());
        }}
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
        for(int i=0;i<place.length;i++){
            rolesimages.put(place[i],nomsFichiers[i]);
        }
    }

}
