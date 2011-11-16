import java.util.*;

public class Fib {

    interface F {
       int call(int x);
    }

    interface C {
       Object apply(Object a) throws Throwable;
    }

    public static void main(String[] args) {
        F fib = (x) -> (x < 2) ? x : fib.call(x - 1) + fib.call(x - 2); // fibonacci
        int r = fib.call(10);
    }
}
