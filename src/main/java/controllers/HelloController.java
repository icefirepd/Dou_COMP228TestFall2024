package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Student;
import utils.DatabaseUtils;
import java.util.List;

public class HelloController {
    @FXML
    private TextField cityTextField;
    @FXML
    private Button displayButton;
    @FXML
    private TextArea studentInfoTextArea;

    @FXML
    private void initialize() {
        displayButton.setOnAction(event -> displayStudentInfo());
    }

    private void displayStudentInfo() {
        String city = cityTextField.getText();
        try {
            List<Student> students = DatabaseUtils.cityFilter(city);
            StringBuilder result = new StringBuilder();
            for (Student student : students) {
                result.append(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", student.getStudentID(), student.getFirstName(), student.getLastName(), student.getAddress(), student.getCity(),student.getProvince(), student.getPostalCode()));
            }
            studentInfoTextArea.setText(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
            studentInfoTextArea.setText("Error: " + e.getMessage());
        }
    }
}