import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestSwing extends JFrame {
    public TestSwing() {
        super("Test Swing");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };

        addWindowListener(l);

        //img
        ImageIcon img = new ImageIcon("./assets/catInfo.gif");
        ImageIcon surprise = new ImageIcon("./assets/CatShook.jpg");

        //button
        JButton bouton = new JButton("Mon bouton", img);
        bouton.setPressedIcon(surprise);

        JButton actionButton = new JButton("Cliquez moi pour quitter la page");
        actionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //label
        JLabel label = new JLabel("Mon étiquette");
        label.setBackground(Color.red);
        label.setOpaque(true);

        //menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu file = new JMenu("Fichier");
        JMenu window = new JMenu("Fenêtre");
        //menu.add(menuItem);
        menuBar.add(file);
        menuBar.add(window);

        // panel
        JPanel panneau = new JPanel();
        panneau.add(bouton);
        panneau.add(label);
        panneau.add(actionButton);
        setContentPane(panneau);
        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new TestSwing();
    }

}
