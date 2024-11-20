// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String type = "General Practitioner"; // 该类的特定实例变量，用于区分全科医生

    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用基类的默认构造函数
    }

    // 初始化所有实例变量的构造函数
    public GeneralPractitioner(int id, String name, String description) {
        super(id, name, description);  // 调用基类的构造函数
    }

    // 打印全科医生的详细信息
    @Override
    public void printDetails() {
        super.printDetails();  // 调用基类的打印方法
        System.out.println("Type: " + this.type);
    }
}
