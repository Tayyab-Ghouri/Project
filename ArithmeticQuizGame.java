import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticQuizGame extends Thread implements ActionListener {

    JFrame f;
    JButton aboutButton, playGameButton;

    ArithmeticQuizGame(){
        run();
    }

    public static void main(String[] args) {

        new ArithmeticQuizGame();
    }

    @Override
    public void run() {
        f = new JFrame("Arithmetic Quiz Game");
        f.setLayout(null);
        f.getContentPane().setBackground(Color.CYAN);

        aboutButton = new JButton("About",new ImageIcon("About.jpg"));
        aboutButton.setFont(new Font("Ariel",Font.BOLD,20));
        aboutButton.setFocusable(false);
        aboutButton.setBackground(Color.white);

        playGameButton = new JButton("Play",new ImageIcon("Play.jpg"));
        playGameButton.setFont(new Font("Ariel",Font.BOLD,20));
        playGameButton.setFocusable(false);
        playGameButton.setBackground(Color.white);



        aboutButton.setBounds(50, 80, 100, 100);
        playGameButton.setBounds(230, 80, 100, 100);


        aboutButton.addActionListener(this);
        playGameButton.addActionListener(this);

        aboutButton.setBackground(Color.WHITE);
        f.add(aboutButton);
        f.add(playGameButton);
        f.setSize(400, 300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        f.setVisible(false);

        if (e.getSource() == aboutButton) {

            new Introduction();
        }
        if (e.getSource() == playGameButton){

            new SelectModeAndDigits();
        }
    }
}