package asuHeartHealthJavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ASUHEARTHEALTHJAVAFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, 800, 600, Color.AQUAMARINE);
            primaryStage.setTitle("Welcome to Heart Health Imaging System");

            // Title
            Text titleText = new Text("Welcome to Heart Health Imaging System");
            titleText.setFont(Font.font("Verdana", 20));

            // Buttons
            Button intakeButton = new Button("Patient Intake Form");
            intakeButton.setOnAction(e -> showIntakeForm(primaryStage));

            Button ctScanButton = new Button("CT Scan Technician View");
            ctScanButton.setOnAction(e -> System.out.println("Opening CT Scan Technician View..."));

            Button patientButton = new Button("Patient View");
            patientButton.setOnAction(e -> showPatientView("John Doe", primaryStage));


            // Button VBox
            VBox buttonBox = new VBox(20, intakeButton, ctScanButton, patientButton);
            buttonBox.setPadding(new Insets(50, 0, 0, 300)); // Padding to center buttons

            // Add title and buttons to root
            root.setTop(titleText);
            root.setCenter(buttonBox);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showIntakeForm(Stage primaryStage) {
        GridPane formPane = new GridPane();
        formPane.setHgap(10);
        formPane.setVgap(10);
        formPane.setPadding(new Insets(20));

        // Form fields
        formPane.add(new Label("First Name:"), 0, 0);
        TextField firstNameField = new TextField();
        formPane.add(firstNameField, 1, 0);

        formPane.add(new Label("Last Name:"), 0, 1);
        TextField lastNameField = new TextField();
        formPane.add(lastNameField, 1, 1);

        formPane.add(new Label("Email:"), 0, 2);
        TextField emailField = new TextField();
        formPane.add(emailField, 1, 2);

        formPane.add(new Label("Phone Number:"), 0, 3);
        TextField phoneField = new TextField();
        formPane.add(phoneField, 1, 3);

        formPane.add(new Label("Health History:"), 0, 4);
        TextField healthHistoryField = new TextField();
        formPane.add(healthHistoryField, 1, 4);

        formPane.add(new Label("Insurance ID:"), 0, 5);
        TextField insuranceIdField = new TextField();
        formPane.add(insuranceIdField, 1, 5);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            // Handle form submission
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();
            String healthHistory = healthHistoryField.getText();
            String insuranceId = insuranceIdField.getText();

            // Do something with the form data, e.g., save to database
            System.out.println("Form submitted:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phone);
            System.out.println("Health History: " + healthHistory);
            System.out.println("Insurance ID: " + insuranceId);
        });

        formPane.add(submitButton, 1, 6);

        Scene intakeScene = new Scene(formPane, 600, 400);
        primaryStage.setScene(intakeScene);
        primaryStage.setTitle("Patient Intake Form");
    }

    private void showPatientView(String patientName, Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 600, Color.LIGHTGRAY);
        primaryStage.setTitle("Hello " + patientName);

        // Title
        Text titleText = new Text("Hello " + patientName);
        titleText.setFont(Font.font("Verdana", 40));

        // Display CT scan data (example)
        Text ctScanData = new Text("CT Scan Data for " + patientName + ":\n\n"
                + "Total Agatston CAC Score: ...\n"
                + "LM Score: ...\n"
                + "LAD Score: ...\n"
                + "LCX Score: ...\n"
                + "RCA Score: ...\n"
                + "PDA Score: ...");
        ctScanData.setFont(Font.font("Verdana", 20));

        VBox contentBox = new VBox(20);
        contentBox.getChildren().addAll(titleText, ctScanData);
        contentBox.setPadding(new Insets(50, 0, 0, 50));

        root.setCenter(contentBox);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
