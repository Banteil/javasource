package optional;

import java.util.Optional;

public class OptionalEx1 {
    public static void main(String[] args) {
        // Optional<String> optVal = Optional.of("abc");
        Optional<String> optVal = Optional.of("");
        System.out.println(optVal.isPresent() ? optVal.get() : "Null");
        System.out.println(optVal.orElse(""));
        System.out.println(optVal.orElseGet(String::new));
        System.out.println(optVal.orElseThrow()); // NoSuchElementException
        System.out.println(optVal.orElseThrow(NullPointerException::new));
    }
}
