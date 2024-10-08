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
                robot.mouseMove(500, 500);
                Thread.sleep(delay);
                robot.mouseMove(600, 600);
                Thread.sleep(delay);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
