package musta.belmo.designpatterns.builder;

import java.util.Date;

/**
 * A class representing an abstraction of 'Student';
 */
public class Student {
    /**
     * the id of the student.
     */
    private String id;
    /**
     * the name of the student.
     */
    private String name;
    /**
     * the address of the student.
     */
    private String address;
    /**
     * the birth date of the student.
     */
    private Date birthDate;

    /**
     * getter of the id.
     *
     * @return String.
     */
    public String getId() {
        return id;
    }

    /**
     * sets the id of the current student.
     *
     * @param id the new id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * gets the name of the current student.
     *
     * @return String.
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name of the current student.
     *
     * @param name the new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the address.
     *
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /**
     * sets the address
     *
     * @param address the new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * gets the birth date
     *
     * @return Date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * sets the birth date
     *
     * @param birthDate the new birth date.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * the toString method.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    /**
     * the equals method.
     *
     * @param o the student to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return id.equals(student.id);
    }

    /**
     * the hashcode method.
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * a static class serving as the builder of the student instance.
     */
    public static class StudentBuilder {
        /**
         * the student to build.
         */
        Student student;

        /**
         * default constructor.
         */
        public StudentBuilder() {
            student = new Student();

        }

        /**
         * the build method.
         *
         * @return Student.
         */
        public Student build() {
            return student;
        }

        /**
         * sets the name of the Student.
         *
         * @param name the name of the student.
         * @return StudentBuilder.
         */
        public StudentBuilder name(String name) {
            student.setName(name);
            return this;
        }

        /**
         * sets the address of the Student.
         *
         * @param address the address of the Student.
         * @return StudentBuilder.
         */
        public StudentBuilder address(String address) {
            student.setAddress(address);
            return this;
        }

        /**
         * sets the date of birth of the student.
         *
         * @param dateOfBirth the date of birth.
         * @return StudentBuilder.
         */
        public StudentBuilder dateOfBirth(Date dateOfBirth) {
            student.setBirthDate(dateOfBirth);
            return this;
        }

        /**
         * sets the id of the student.
         *
         * @param id the id of the students
         * @return StudentBuilder.
         */
        public StudentBuilder id(String id) {
            student.setId(id);
            return this;
        }
    }
}
