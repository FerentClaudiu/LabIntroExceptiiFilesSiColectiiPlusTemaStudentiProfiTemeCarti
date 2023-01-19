package recapInterf;

public interface DailyOperations {

    int operations(int... params);

    default void doSmth() {
        System.out.println("fac ceva");
    }

    static void ds() {
        System.out.println("ds");
    }

}
