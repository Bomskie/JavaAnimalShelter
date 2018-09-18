import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {

    public ComboBox cbSpecies;
    public RadioButton rbFemale;
    public RadioButton rbMale;
    public TextField tbName;
    public TextField tbBadHabits;
    public Button btnAddAnimal;
    public ListView lvAnimals;
    public TextField tbReservorName;
    public Button btnReserveAnimal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbSpecies.setItems(FXCollections.observableArrayList("Cat", "Dog"));
    }

    public void AddAnimal(ActionEvent actionEvent) {
        tbReservorName.setText("");
    }
}
