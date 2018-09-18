import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

    //private List<Animal> animals = new ArrayList<Animal>();
    Reservation reservation = new Reservation();

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

    private void UpdateList(){
        ObservableList details = FXCollections.observableArrayList();
        for (Animal animal: reservation.GetAnimals()) {
            details.add(animal.toString());
        }
        lvAnimals.setItems(details);
    }
}
