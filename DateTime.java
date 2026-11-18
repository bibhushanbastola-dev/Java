import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date and Time");

        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 24));

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a");

        Timer timer = new Timer(1000, event -> {
            label.setText(LocalDateTime.now().format(formatter));
        });

        timer.start();

        frame.add(label);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
