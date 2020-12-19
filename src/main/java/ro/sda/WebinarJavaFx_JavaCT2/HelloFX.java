package ro.sda.WebinarJavaFx_JavaCT2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    public static void main (String[] args) {
        launch();
    }

    @Override
    public void init () throws Exception {
        System.out.println ("Initializare aplicatie");
    }

    @Override
    public void start (Stage primaryStage) throws Exception {
//        helloJavaFx (primaryStage);
//        douaColoane (primaryStage);
//        listViewExample (primaryStage);
//        propertyBinding (primaryStage);
//        sliderContainerSpacing (primaryStage);

        Parent root = FXMLLoader.load(getClass().getResource("/interface.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void sliderContainerSpacing (Stage primaryStage) {
        Slider slider = new Slider();
        Label label = new Label("Hello!");
        VBox container = new VBox();
        container.getChildren().add(slider);
        container.getChildren().add(label);
        container.getChildren().add(new CheckBox ("Click me!"));
        container.spacingProperty ().bind (slider.valueProperty ());

        Scene scene = new Scene(container, 300,150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void propertyBinding (Stage primaryStage) {
        TextField textField = new TextField();
        Label label = new Label();
        textField.textProperty().bindBidirectional(label.textProperty());

        VBox root = new VBox();
        root.getChildren().add(textField);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 250, 167);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void listViewExample (Stage primaryStage) {
        ListView<String> listView = new ListView<>();
        listView.getItems ().add("Elem1");
        listView.getItems ().add("Elem2");
        listView.getItems ().add("Elem3");
        listView.getItems ().add("Elem4");
        listView.getItems ().add("Elem5");
        Scene scene = new Scene (listView, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void douaColoane (Stage primaryStage) {
        VBox col1 = new VBox();
        col1.getChildren().add(new Label ("Element 1, 1"));
        col1.getChildren().add(new TextField ("Element 1, 2"));
        col1.setSpacing (5);

        VBox col2 = new VBox();
        col2.getChildren().add(new TextField("Element 2, 1"));
        col2.getChildren().add(new Label ("Element 2, 2"));
        col2.setSpacing(5);
        col2.getChildren().add(new CheckBox ("Element"));

        HBox root = new HBox ();
        root.getChildren().add(col1);
        root.getChildren().add(col2);
        root.setSpacing (10);

        Scene scene = new Scene(root, 250, 175);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void helloJavaFx (Stage primaryStage) {
        VBox vbox = new VBox();
        Label label = new Label("Hello World");
        vbox.getChildren().add(label);
        Scene scene = new Scene(vbox, 250, 200);
        primaryStage.setScene(scene);
//        primaryStage.setWidth (250);
//        primaryStage.setHeight (200);
        primaryStage.show ();
    }

    @Override
    public void stop () throws Exception {
        System.out.println ("acum fac curat inainte sa ma inchid");
    }
}
