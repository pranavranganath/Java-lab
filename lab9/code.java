import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    private JLabel err;
    private JLabel alab;
    private JLabel blab;
    private JLabel anslab;

    SwingDemo() {
        // create jframe container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(275, 200);
        jfrm.setLayout(new FlowLayout());
        // to terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // text label
        JLabel jlab = new JLabel("Enter the dividend and divisor:");

        // add text field for both numbers
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);

        // calc button
        JButton button = new JButton("Calculate");

        // labels
        err = new JLabel();
        alab = new JLabel();
        blab = new JLabel();
        anslab = new JLabel();

        // add in order :)
        jfrm.add(err);  // to display error message
        jfrm.add(jlab);
        jfrm.add(ajtf);
        jfrm.add(bjtf);
        jfrm.add(button);
        jfrm.add(alab);
        jfrm.add(blab);
        jfrm.add(anslab);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());
                    if (b == 0) {
                        throw new ArithmeticException(); // throw exception if divisor is zero
                    }
                    int ans = a / b;

                    alab.setText("\nDividend = " + a);
                    blab.setText("\nDivisor = " + b);
                    anslab.setText("\nResult = " + ans);
                    err.setText(""); // Clear any previous error messages
                } catch (NumberFormatException e) {
                    clearLabels();
                    err.setText("Enter Only Integers!");
                } catch (ArithmeticException e) {
                    clearLabels();
                    err.setText("Divisor should be non-zero!");
                }
            }
        });

        // display frame
        jfrm.setVisible(true);
    }

    private void clearLabels() {
        alab.setText("");
        blab.setText("");
        anslab.setText("");
    }

    public static void main(String args[]) {
        // create frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
