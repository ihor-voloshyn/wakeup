import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp {

    public static void main(String[] args) {
        Frame frame = new Frame("Application");

        frame.add(new Label("Hello!"));
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null); // Centers the window
        frame.setBackground(Color.red);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose(); // Releases native screen resources
            }
        });

        frame.setVisible(true);
    }
}