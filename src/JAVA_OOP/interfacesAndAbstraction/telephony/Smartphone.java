package JAVA_OOP.interfacesAndAbstraction.telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            boolean containsDigit = false;
            for (char s : url.toCharArray()) {
                if (Character.isDigit(s)) {
                    sb.append("Invalid URL!");
                    containsDigit = true;
                    break;
                }
            }
            if (!containsDigit) {
                sb.append(String.format("Browsing: %s!%n", url));
            }
        }
        return sb.toString().trim();
    }


    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            sb.append(String.format("Calling... %s%n", number));
        }
        return sb.toString().trim();
    }
}
