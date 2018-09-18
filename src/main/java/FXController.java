import Animals.Animal;
import Animals.Gender;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {

    @FXML
    private ComboBox cbSpecies;
    public RadioButton rbFemale;
    @FXML
    private RadioButton rbMale;
    @FXML
    private TextField tbName;
    public TextField tbBadHabits;
    public Button btnAddAnimal;
    @FXML
    private ListView lvAnimals;
    public TextField tbReservorName;
    @FXML
    private Button btnReserveAnimal;

    //private List<Animal> animals = new ArrayList<Animal>();
    private final Reservation reservation = new Reservation();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbSpecies.setItems(FXCollections.observableArrayList("Cat", "Dog"));
        cbSpecies.setValue("Cat");
    }

    public void AddAnimal(ActionEvent actionEvent) {
        Gender gender = rbMale.selectedProperty().getValue() ? Gender.male : Gender.female;

        if (cbSpecies.getSelectionModel().getSelectedItem() == "Cat"){
           reservation.NewCat(tbName.getText(), gender);
        }
        else{
            reservation.NewDog(tbName.getText(), gender);
        }
        UpdateList();
    }

    public void ReserveAnimal(ActionEvent actionEvent) {
        int index = lvAnimals.getSelectionModel().getSelectedIndex();
        Animal animal = reservation.GetAnimals().get(index);
        animal.Reserve(tbName.getText());
        UpdateList();
    }

    private void UpdateList(){
        ObservableList details = FXCollections.observableArrayList();
        for (Animal animal: reservation.GetAnimals()) {
            details.add(animal.toString());
        }
        lvAnimals.setItems(details);
    }
}
