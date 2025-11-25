import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.*;

public class GUI extends JFrame {

    private JLabel title;
    private JTextField guessTextBox;
    private JButton enterGuess;

    public GUI() {
        setLayout(new BorderLayout());

        JPanel top = new JPanel(new FlowLayout());
    
        title = new JLabel("WORDLE");
        title.setFont(new Font("Arial", Font.BOLD, 50));
        top.add(title);

        guessTextBox = new JTextField(20);
        top.add(guessTextBox);

        enterGuess = new JButton("Enter Guess");
        top.add(enterGuess);
        add(top, BorderLayout.NORTH);

        Panel board = new Panel();
        add(board, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GUI window = new GUI();

        window.setTitle("Wordle");
        window.setSize(700, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

}
