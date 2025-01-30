import java.awt.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PreventSleep {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Kiev")).toLocalDateTime());

        try {
            Robot robot = new Robot();
            int delay = 30000;
            while (true) {
            //while (LocalDateTime.now().isBefore(LocalDateTime.parse("2024-12-19T08:17:36.170488200"))) {
                robot.mouseMove(500, 500);
                Thread.sleep(delay * 5);
                robot.mouseMove(600, 600);
                Thread.sleep(delay * 5);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH!");
    }

    static interface Transformer {
        Integer transform(Integer origin);
    }
}
