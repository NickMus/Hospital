public class Patient {
    Secretary secretary = new Secretary();

    void ask(Doctor doctor) {
        System.out.println("мне нужен врач ...");
        secretary.getRoom(doctor);
    }
    static void goToDoctor() {
        System.out.println("идет к врачу");
    }
}
