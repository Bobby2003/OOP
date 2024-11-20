import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {
        // 第3部分 - 使用类和对象
        System.out.println("-------------------------------------------------------");
        // 创建全科医生的对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Jane Smith", "Family Practice");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. John Doe", "General Health");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Emily White", "Primary Care");

        // 创建专科医生的对象
        Specialist specialist1 = new Specialist(4, "Dr. Alex Brown", "Cardiologist", "Heart Surgery");
        Specialist specialist2 = new Specialist(5, "Dr. Maria Green", "Dermatologist", "Skin Care");

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

        System.out.println("-------------------------------------------------------");

        // 第5部分 - 预约的集合
        // 创建一个预约集合
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 创建一些预约
        Appointment appointment1 = new Appointment("Alice", "1234567890", "08:00", gp1);
        Appointment appointment2 = new Appointment("Bob", "0987654321", "10:00", specialist1);
        Appointment appointment3 = new Appointment("Charlie", "1122334455", "14:30", gp2);

        // 将预约添加到集合中
        appointmentList.add(appointment1);
        appointmentList.add(appointment2);
        appointmentList.add(appointment3);

        // 打印现有的预约
        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointmentList) {
            appointment.printAppointmentDetails();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        // 取消预约（通过手机号码找到并移除）
        System.out.println("Cancelling appointment for phone: 1234567890");
        appointmentList.removeIf(appointment -> appointment.getPatientPhone().equals("1234567890"));

        // 再次打印现有的预约
        System.out.println("Updated Appointments:");
        for (Appointment appointment : appointmentList) {
            appointment.printAppointmentDetails();
            System.out.println("------");
        }
    }
}
