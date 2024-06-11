
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorController {
    private Doctor model;
    private DoctorView view;

    public DoctorController(Doctor model, DoctorView view) {
        this.model = model;
        this.view = view;

        // Add action listeners to the buttons
        view.getInsertButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertDoctor();
            }
        });
        view.getEditButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editDoctor();
            }
        });
        view.getDeleteButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteDoctor();
            }
        });
    }

    private void insertDoctor() {
        // Logic for inserting a doctor
        int id = Integer.parseInt(view.getIdField().getText());
        String name = view.getNameField().getText();
        String specialization = view.getSpecializationField().getText();
        model = new Doctor(id, name, specialization);
        System.out.println("Doctor Inserted: " + model.getName());
    }

    private void editDoctor() {
        // Logic for editing a doctor
        model.setId(Integer.parseInt(view.getIdField().getText()));
        model.setName(view.getNameField().getText());
        model.setSpecialization(view.getSpecializationField().getText());
        System.out.println("Doctor Edited: " + model.getName());
    }

    private void deleteDoctor() {
        // Logic for deleting a doctor
        model = null;
        System.out.println("Doctor Deleted");
    }
}
