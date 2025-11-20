import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.*;

public class GUI extends JFrame {

    private JLabel title;
    private JTextField guessInput;
    private JButton enterGuess;



    public GUI() {
        setLayout(new FlowLayout());
        title = new JLabel("WORDLE");
        title.setFont(new Font("Arial", Font.BOLD, 50));
        add(title);

        guessInput = new JTextField(20);
        add(guessInput);

        enterGuess = new JButton("Enter Guess");
        add(enterGuess);
    }


    public static void main(String[] args) {
        GUI window = new GUI();

        window.setTitle("Wordle");
        window.setSize(700, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

}
