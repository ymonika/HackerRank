package examples.model;

public class Student implements Comparable<Student> {

    private String name;
    private String id;
    private String dept;
    private double attendance;

    public Student(String name, String id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.attendance = 40.00;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public double getAttendance() {
        return attendance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return " Student {" +
                " name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dept='" + dept + '\'' +
                ", attendance='" + attendance + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       return this.getId().compareTo(o.getId());
    }
}
