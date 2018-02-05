package musta.belmo.designpatterns.builder;

import java.util.Date;

public class Student {
    private String id;

    private String name;

    private String address;

    private Date birthDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public StringBuilder builder() {
        return new StringBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public static class StudentBuilder {

        Student student;

        public StudentBuilder() {
            student = new Student();

        }

        public Student build() {
            return student;
        }

        public StudentBuilder name(String name) {
            student.setName(name);
            return this;
        }

        public StudentBuilder address(String address) {
            student.setAddress(address);
            return this;
        }

        public StudentBuilder dateOfBirth(Date dateOfBirth) {
            student.setBirthDate(dateOfBirth);
            return this;
        }


        public StudentBuilder id(String id) {
            student.setId(id);
            return this;
        }
    }
}
