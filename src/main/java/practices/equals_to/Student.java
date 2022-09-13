package practices.equals_to;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

class Student {
    private String name;
    private int rollNo;
//    private long time = System.currentTimeMillis();
    private boolean graduate;
    private char rating;
    private double salary;
    private float aggregate;

    public void setRating(char rating) {
        this.rating = rating;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAggregate(float aggregate) {
        this.aggregate = aggregate;
    }


    public Student() {

    }

    @Override
    public boolean equals(Object obj) { // Must Be Implemented By The User Himself/Herself!
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return toString().equals(other.toString());
    }

    public Student(String name, int rollNo, long time, boolean graduate, char rating, double salary, float aggregate) {
        this.name = name;
        this.rollNo = rollNo;
//        this.time = time;
        this.graduate = graduate;
        this.rating = rating;
        this.salary = salary;
        this.aggregate = aggregate;
    }

    public Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
//        this.time = s1.time;
        this.graduate = s1.graduate;
        this.rating = s1.rating;
        this.salary = s1.salary;
        this.aggregate = s1.aggregate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
//                ", time=" + time +
                ", graduate=" + graduate +
                ", rating=" + rating +
                ", salary=" + salary +
                ", aggregate=" + aggregate +
                '}';
    }
}

/*
    Question: If Student Class Is non-public And Teacher class is public, But the filename as Student.java
    Compile Error: Class 'Teacher' is public, should be declared in a file named 'Teacher.java
 */
