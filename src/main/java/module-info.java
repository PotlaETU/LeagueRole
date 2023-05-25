module com.potla.firstapp.leagueroleavis {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.potla.firstapp.leagueroleavis to javafx.fxml;
    exports com.potla.firstapp.leagueroleavis;
}