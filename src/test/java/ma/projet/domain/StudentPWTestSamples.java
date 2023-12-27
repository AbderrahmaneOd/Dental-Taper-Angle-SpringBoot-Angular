package ma.projet.domain;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class StudentPWTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static StudentPW getStudentPWSample1() {
        return new StudentPW().id(1L);
    }

    public static StudentPW getStudentPWSample2() {
        return new StudentPW().id(2L);
    }

    public static StudentPW getStudentPWRandomSampleGenerator() {
        return new StudentPW().id(longCount.incrementAndGet());
    }
}
