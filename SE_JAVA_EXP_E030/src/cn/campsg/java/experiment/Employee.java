package cn.campsg.java.experiment;

public class Employee {
    private String no;
    private String name;
    private float salary;
    private String department;

    public Employee() {
    }

    public Employee(String no, String name, float salary, String department) {
        this.no = no;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((no == null) ? 0 : no.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (no == null) {
            if (other.no != null)
                return false;
        } else if (!no.equals(other.no))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("工号: ").append(no)
                .append(",姓名: ").append(name)
                .append(",部门: ").append(department)
                .append(",薪水: ").append(salary);
        return buffer.toString();
    }
}
