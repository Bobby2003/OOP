// Appointment.java
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTime; // 例如 "08:00", "10:00"
    private HealthProfessional doctor; // 被预约的医生

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown Patient";
        this.patientPhone = "Unknown Phone";
        this.preferredTime = "Unknown Time";
        this.doctor = null; // 默认没有指定医生
    }

    // 初始化所有实例变量的构造函数
    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.doctor = doctor;
    }

    // 打印预约的详细信息
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + patientPhone);
        System.out.println("Preferred Time: " + preferredTime);
        doctor.printDetails();
    }

    // Getter 和 Setter 方法
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
