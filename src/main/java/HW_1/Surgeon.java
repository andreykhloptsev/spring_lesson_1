package HW_1;
import org.springframework.stereotype.Component;
@Component("doctor")
public class Surgeon implements Doctor{
    public void sayDoctorOffice() {
        System.out.println("Go to surgeon room");
    }
}