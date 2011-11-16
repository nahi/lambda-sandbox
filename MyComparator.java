import java.util.*;

public class MyComparator {
    public static void main(String[] args) {
	Comparator<String> reverse = (a, b) -> -1; // reverse sort
	String[] list = { "a", "b", "c" };
	Arrays.sort(list, reverse);
    }
}
