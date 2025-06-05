package cn.campsg.java.experiment;

public class MainClass {
    public static boolean isRepeat(int index, Employee[] employees) {
        Employee emp = employees[index];
        for (int i = 0; i < employees.length; i++) {
            if (emp == employees[i])
                continue;
            if (emp.equals(employees[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("1001", "张一", 5000.0f, "销售部");
        employees[1] = new Employee("1002", "王二", 6000.0f, "销售部");
        employees[2] = new Employee("1001", "Alan", 15000.0f, "研发部");

        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (!isRepeat(i, employees)) {
                System.out.println(employees[i]);
                count++;
            }
        }

        System.out.println("本公司有效员工数: " + count);
    }
}
