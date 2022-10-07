package JAVA_ADVANCED.Stacks_Queues;

import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(";");
        Map <String, Integer> robots = new LinkedHashMap<>();
        int[] time = Arrays
         .stream(scanner.nextLine().split(":"))
         .mapToInt(e -> Integer.parseInt(e)).toArray();

        ArrayDeque <String> productQueue = new ArrayDeque<>();
        ArrayDeque <String> robotsQueue = new ArrayDeque<>();

        for (String s : input) {
            String robotName = s.split("-")[0];
            int processTime = Integer.parseInt(s.split("-")[1]);
            robots.put(robotName, processTime);
        }
        for (String s : robots.keySet()) {
            robotsQueue.offer(s);
        }
        int sec = time[2];
        int min = time[1];
        int hour = time[0];

        String nextInput = scanner.nextLine();
        while (!nextInput.equals("End")) {
            String product = nextInput;

            sec++;
            if (sec > 59) {
                sec = 0;
                min++;
                if (min > 59) {
                    min = 0;
                    hour++;
                }
            }
                        int diff = time [2] - robots.get(robotsQueue.peek());
                    if (sec > diff) {
                        System.out.printf("%s - %s [%d:%d:%d]%n", robotsQueue.peek(), product, hour, min, sec);
                    }

                robotsQueue.offer(robotsQueue.poll());



            nextInput = scanner.nextLine();
        }


    }
}
