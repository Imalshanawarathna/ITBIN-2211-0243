

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientController {
    private Patient model;
    private PatientView view;

    public PatientController(Patient model, PatientView view) {
        this.model = model;
        this.view = view;

        // Add action listeners to the buttons
        view.getInsertButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertPatient();
            }
        });
        view.getEditButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editPatient();
            }
        });
        view.getDeleteButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deletePatient();
            }
        });
    }

    private void insertPatient() {
        // Logic for inserting a patient
        int id = Integer.parseInt(view.getIdField().getText());
        String name = view.getNameField().getText();
        String disease = view.getDiseaseField().getText();
        model = new Patient(id, name, disease);
        System.out.println("Patient Inserted: " + model.getName());
    }

    private void editPatient() {
        // Logic for editing a patient
        model.setId(Integer.parseInt(view.getIdField().getText()));
        model.setName(view.getNameField().getText());
        model.setDisease(view.getDiseaseField().getText());
        System.out.println("Patient Edited: " + model.getName());
    }

    private void deletePatient() {
        // Logic for deleting a patient
        model = null;
        System.out.println("Patient Deleted");
    }
}
