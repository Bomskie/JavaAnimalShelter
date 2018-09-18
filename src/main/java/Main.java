import Animals.Animal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

 List<Animal> animals = new ArrayList<>();


 /*
 public Main(){
     /*
     animals.add(new Dog("Bobby", Gender.male));

     animals.add(new Cat("Twizzle", Gender.female));

     System.out.println(animals.get(0).ToString());
     System.out.println(animals.get(1).ToString());
 }
*/
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
        primaryStage.setTitle("AnimalShelter");
        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();

    }
}
