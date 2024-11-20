import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // 第3部分 - 使用类和对象
        System.out.println("-------------------------------------------------------");
        // 创建全科医生的对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Liu", "General practitioners");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Sun", "General practitioners");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Wang", "General practitioners");

        // 创建专科医生的对象
        Specialist specialist1 = new Specialist(4, "Dr. Zhang", "Cardiologist", "Heart Surgery");
        Specialist specialist2 = new Specialist(5, "Dr. Li", "Dermatologist", "Skin Care");
        Specialist specialist3 = new Specialist(6, "Dr. Zhao", "Brain Science", "Neurology");


        // 打印医生详情
        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();
        specialist1.printDetails();
        System.out.println();
        specialist2.printDetails();
        System.out.println();
        specialist3.printDetails();

        System.out.println("-------------------------------------------------------");

        // 第5部分 - 预约的集合
        // 创建一个预约集合
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 使用createAppointment方法创建并添加预约
        createAppointment(appointmentList, "Liu Changwen", "1234567890", "08:00", gp1);
        createAppointment(appointmentList, "Sun Ningkun", "0987654321", "10:00", specialist1);
        createAppointment(appointmentList, "Yang Fengrui", "1122334455", "14:30", gp2);
        createAppointment(appointmentList, null, "546741956189", "", gp3);
        createAppointment(appointmentList, null, "546741956189", "",null);

        // 打印现有的预约
        printExistingAppointments(appointmentList);
        System.out.println("------------------------------");

        // 取消预约（通过手机号码找到并移除）
        System.out.println("Cancelling appointment for phone: 1234567890");
        cancelBooking(appointmentList, "1234567890");

        // 再次打印现有的预约
        printExistingAppointments(appointmentList);
    }

    // Part 5 - Collection of appointments

    // 创建预约并添加到集合
    public static void createAppointment(ArrayList<Appointment> appointmentList, String patientName, 
                                         String patientPhone, String appointmentTime, HealthProfessional healthProfessional) {
        // 确保所有信息完整
        if (patientName == null || patientPhone == null || appointmentTime == null || healthProfessional == null) {
            System.out.println("Error: Incomplete information. Appointment cannot be created.");
            System.out.println("------------------------------");
            return;
        }
        // 创建预约对象并添加到集合
        Appointment newAppointment = new Appointment(patientName, patientPhone, appointmentTime, healthProfessional);
        appointmentList.add(newAppointment);
        System.out.println("Appointment created for " + patientName + " with " + healthProfessional.getName() + " at " + appointmentTime);
    }

    // 打印现有的所有预约
    public static void printExistingAppointments(ArrayList<Appointment> appointmentList) {
        System.out.println("Existing Appointments:");
        System.out.println("------------------------------");
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment appointment : appointmentList) {
                appointment.printAppointmentDetails();
                System.out.println("------");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // 取消预约
    public static void cancelBooking(ArrayList<Appointment> appointmentList, String patientPhone) {
        boolean found = false;
        for (Appointment appointment : appointmentList) {
            if (appointment.getPatientPhone().equals(patientPhone)) {
                appointmentList.remove(appointment);
                System.out.println("Appointment for phone " + patientPhone + " has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: No appointment found with phone number " + patientPhone);
        }
        System.out.println("------------------------------");
    }
}
