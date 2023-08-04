package com.example.parcial1progra2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;

import java.time.LocalTime;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private ProgressBar funfun;
    @FXML
    private CheckBox checks;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private TreeView<String> nolose;
    @FXML
    private TableView<Person> tablac;
    @FXML
    private TableColumn<Person,String> per;
    @FXML
    private TableColumn<Person,String> mot;
    @FXML
    private Slider barrita;
    @FXML
    private RadioButton boton1;
    @FXML
    private RadioButton boton2;
    @FXML
    private TextArea cuadro;
    @FXML
    private Button salidd;
    @FXML
    private MenuItem salirr;
    @FXML
    private MenuItem nuevv;
    @FXML
    private MenuItem abb;
    @FXML
    private MenuItem gua;

    @FXML
    public void Nuevo(ActionEvent actionEvent) {
            label2.visibleProperty();
    }

    @FXML
    public void Abrir() {

        label3.visibleProperty();
    }

    @FXML
    public void Guardar() {

        label4.visibleProperty();
    }

    @FXML
    public void Salir() {

        label5.visibleProperty();
    }

    @FXML
    public void initi() {
        // Crea un grupo para los RadioButtons para que solo uno pueda estar seleccionado a la vez.
        ToggleGroup toggleGroup = new ToggleGroup();
        boton1.setToggleGroup(toggleGroup);
        boton2.setToggleGroup(toggleGroup);
    }



    @FXML
    public void initialize() {
        TreeItem<String> rootItem = new TreeItem<>("Roles"); // Crea el nodo raíz.
        nolose.setRoot(rootItem); // Establece el nodo raíz del TreeView.

        // Agrega elementos al TreeView
        TreeItem<String> item1 = new TreeItem<>("Jefe");
        TreeItem<String> item2 = new TreeItem<>("Gerente");
        TreeItem<String> item3 = new TreeItem<>("Limpieza");
        TreeItem<String> item4 = new TreeItem<>("Secretario");
        TreeItem<String> item5 = new TreeItem<>("Recepcionista");
        rootItem.getChildren().addAll(item1, item2, item3,item4,item5);

    }

    public void intializa0(ActionEvent actionEvent) {
        checks.setSelected(true); // Establece el CheckBox como seleccionado por defecto.
        checks.setOnAction(e -> onCheckBoxSelected()); // Configura un evento para manejar la selección.
    }

    private void onCheckBoxSelected() {
        boolean selected = checks.isSelected();
        if (checks.isSelected()){
            cuadro.setText("");
        }
    }
    @FXML
    public void info() {
        // Configura las columnas del TableView para que muestren los datos de la clase Person.
        mot.setCellValueFactory(new PropertyValueFactory<>("mot"));
        per.setCellValueFactory(new PropertyValueFactory<>("per"));

        // Agrega datos a la tabla (esto es solo un ejemplo, en una aplicación real, los datos vendrían de alguna fuente externa).
        tablac.getItems().add(new Person("Libro","Q. 10"));
        tablac.getItems().add(new Person("lapiz", "Q. 5"));
        tablac.getItems().add(new Person("Lapicero", "Q. 5"));
        tablac.getItems().add(new Person("Regla", "Q. 8"));
        tablac.getItems().add(new Person("Borrador", "Q. 5"));
        tablac.getItems().add(new Person("Pegamento grande", "Q. 20"));
    }

    public void alerta(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmar");
        alert.setHeaderText(null);
        alert.setContentText("¿Estás seguro de que quieres salir de la aplicación?");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);

        // Si el usuario hace clic en "Aceptar", cierra la aplicación.
        if (result == ButtonType.OK) {
            System.exit(0);
        }
    }

    // Define una clase modelo para representar los datos de la tabla.
    public static class Person {
        private String mot;
        private String per;

        public Person(String mot, String per) {
            this.mot = mot;
            this.per = per;
        }

        public String getPer() {
            return per;
        }

        public String getMot() {
            return mot;
        }
    }


}
