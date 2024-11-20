// Specialist.java
public class Specialist extends HealthProfessional {
    private String specialty; // 专科医生的专长

    // 默认构造函数
    public Specialist() {
        super();  // 调用基类的默认构造函数
        this.specialty = "Unknown Specialty";
    }

    // 初始化所有实例变量的构造函数
    public Specialist(int id, String name, String description, String specialty) {
        super(id, name, description);  // 调用基类的构造函数
        this.specialty = specialty;
    }

    // 打印专科医生的详细信息
    @Override
    public void printDetails() {
        super.printDetails();  // 调用基类的打印方法
        System.out.println("Specialty: " + this.specialty);
    }
}
