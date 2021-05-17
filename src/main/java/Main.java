import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Patient patient = context.getBean(Patient.class);
        Doctor therapist = new Doctor();
        patient.ask(therapist);
    }
}
