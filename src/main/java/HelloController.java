import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Button btnEN;
    @FXML
    private Button btnFR;
    @FXML
    private Button btnJP;
    @FXML
    private Button btnIR;

    @FXML
    private Button calculate;

    @FXML
    private Label distance, fuel, result;

    @FXML
    private TextField distanceField, fuelField;

    private ResourceBundle resourceBundle;

    private Locale locale;




    @FXML
    private void loadLanguage(String lang, String country){
        locale = new Locale(lang, country);
        resourceBundle = ResourceBundle.getBundle("message", locale);
        distance.setText(resourceBundle.getString("distance"));
        fuel.setText(resourceBundle.getString("fuel"));
        result.setText(resourceBundle.getString("result_not_calculated"));
        calculate.setText(resourceBundle.getString("calculate"));
    }

    @FXML
    public void onbtnENClick(ActionEvent actionEvent) {
        loadLanguage("en", "UK");
    }

    @FXML
    public void onbtnFRClick(ActionEvent actionEvent) {
        loadLanguage("fr", "FR");
    }

    @FXML
    public void onbtnJPClick(ActionEvent actionEvent) {
        loadLanguage("ja", "JP");
    }

    @FXML
    public void onbtnIRClick(ActionEvent actionEvent) {
        loadLanguage("fa", "IR");
    }

    @FXML
    public void calculate() {
        double fuelPrice = Double.parseDouble(fuelField.getText()) /
                           Double.parseDouble(distanceField.getText())
                           * 100;
        String fuelResult = String.format(resourceBundle.getString("result"), fuelPrice);
        result.setText(fuelResult);


    }
}
