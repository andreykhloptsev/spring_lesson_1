package HW_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client")
public class ClientImpl implements Client {
    @Autowired
    private Doctor doctor;


    public void goToDoctor(){
        System.out.println("Ask for doctor?");
        doctor.sayDoctorOffice();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}