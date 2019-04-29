package HW_1;


public class Receptionist {
    public ClientImpl toDoctor(){
        ClientImpl client = new ClientImpl();
        Doctor doctor = new Therapist();
        client.setDoctor(doctor);
        return client;
    }
}