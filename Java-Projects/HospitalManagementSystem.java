import java.util.*;

//  Custom Exception
class InvalidPatientException extends Exception {
    public InvalidPatientException(String message) {
        super(message);
    }
}

//  Abstract Class
abstract class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

//  Patient Class
class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        super(id, name, age);
        this.disease = disease;
    }

    public int getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public void displayDetails() {
        System.out.println("Patient ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Disease: " + disease);
    }
}

//  Doctor Class
class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, int age, String specialization) {
        super(id, name, age);
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDetails() {
        System.out.println("Doctor ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Specialization: " + specialization);
    }
}

//  Interface
interface Billable {
    double calculateBill();
}

//  Billing Class
class Billing implements Billable {
    public double calculateBill() {
        return 500.0; // fixed consultation fee
    }
}

//  Appointment Class
class Appointment {
    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void display() {
        System.out.println("Appointment: Patient " + patient.name +
                " → Doctor " + doctor.name);
    }
}

//  Thread (Bonus)
class AppointmentThread extends Thread {
    public void run() {
        System.out.println("Processing appointment...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

//  Main Class
public class HospitalManagementSystem {

    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    //  Add Patient
    static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease (e.g., heart, bone, brain): ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    //  View Patients
    static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        for (Patient p : patients) {
            p.displayDetails();
        }
    }

    //  Add Doctor
    static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Specialization (e.g., heart, bone, brain): ");
        String specialization = sc.nextLine();

        doctors.add(new Doctor(id, name, age, specialization));
        System.out.println("Doctor added successfully!");
    }

    //  View Doctors
    static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }
        for (Doctor d : doctors) {
            d.displayDetails();
        }
    }

    //  Book Appointment (Improved)
    static void bookAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Add patients and doctors first!");
            return;
        }

        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();

        Patient selectedPatient = null;

        for (Patient p : patients) {
            if (p.getId() == pid) {
                selectedPatient = p;
                break;
            }
        }

        if (selectedPatient == null) {
            System.out.println("Patient not found!");
            return;
        }

        String disease = selectedPatient.getDisease();

        ArrayList<Doctor> matchedDoctors = new ArrayList<>(doctors);

        for (Doctor d : doctors) {
            if (d.getSpecialization().toLowerCase().contains(disease.toLowerCase())) {
                matchedDoctors.add(d);
            }
        }

        if (matchedDoctors.isEmpty()) {
            System.out.println("No doctor available for this disease.");
            return;
        }

        System.out.println("\nAvailable Doctors:");
        for (int i = 0; i < matchedDoctors.size(); i++) {
            System.out.print((i + 1) + ". ");
            matchedDoctors.get(i).displayDetails();
        }

        System.out.print("Select Doctor: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > matchedDoctors.size()) {
            System.out.println("Invalid choice!");
            return;
        }

        Doctor selectedDoctor = matchedDoctors.get(choice - 1);

        Appointment ap = new Appointment(selectedPatient, selectedDoctor);
        appointments.add(ap);

        AppointmentThread t = new AppointmentThread();
        t.start();

        System.out.println("Appointment booked successfully!");
    }

    //  View Appointments
    static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment a : appointments) {
            a.display();
        }
    }

    //  Generate Bill
    static void generateBill() {
        Billing b = new Billing();
        System.out.println("Total Bill: ₹" + b.calculateBill());
    }

    //  Main Menu
    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Generate Bill");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    addDoctor();
                    break;
                case 4:
                    viewDoctors();
                    break;
                case 5:
                    bookAppointment();
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 7:
                    generateBill();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);
    }
}