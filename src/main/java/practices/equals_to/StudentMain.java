package practices.equals_to;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Krishna", 1, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), true, 'A', 500000.0, 10000f);
        Student s2 = new Student("Krishna", 1, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), true, 'A', 500000.0, 10000f);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));

        Student s3 = new Student(s1);

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(Objects.equals(s1, s3));

    }
}
