import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class GUI extends JFrame {   // завд:обчислити величину роботи з переміщення тіла на відстань, виконаною силою прикладеною у напрямку переміщення
                                      //н
    public JTextField F;
    public JTextField S;
    public JTextField Angle;
    public JTextField Result;
    public JPanel contentPane;

    public GUI(){  //к
        setTitle("Фізика. Обчислення роботи(A)");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(4,5,5,5));
        contentPane.setLayout(new GridLayout(4, 2, 5, 5));

        setContentPane(contentPane);

        JLabel textF = new JLabel("Сила(F):");
        textF.setForeground(Color.RED);
        F = new JTextField();
        F.setHorizontalAlignment(JTextField.CENTER);

        JLabel textS = new JLabel("Відстань(S):");
        textS.setForeground(Color.BLUE);
        S = new JTextField();
        S.setHorizontalAlignment(JTextField.CENTER);

        JLabel textAngle = new JLabel("Кут(cos(a)):");
        textAngle.setForeground(Color.MAGENTA);
        Angle = new JTextField();
        Angle.setHorizontalAlignment(JTextField.CENTER);

        Result = new JTextField();
        Result.setHorizontalAlignment(JTextField.CENTER);
        Result.setEditable(false);

        JButton result_button = new JButton("Обчислити (A)");
        result_button.setForeground(Color.ORANGE);

        textF.setBounds(40, 30, 80, 20);
        textS.setBounds(40, 60, 80,20);
        textAngle.setBounds(40, 90, 80, 20);
        result_button.setBounds(40, 120, 80, 20);

        Result.setForeground(Color.BLACK);

        contentPane.add(textF);
        contentPane.add(F);

        contentPane.add(textS);
        contentPane.add(S);

        contentPane.add(textAngle);
        contentPane.add(Angle);

        contentPane.add(result_button);
        contentPane.add(Result);

        result_button.addActionListener(new ActionListener() {      //attribute
                                            public void actionPerformed(ActionEvent e) {
                                                double f = Double.parseDouble(F.getText());
                                                double s = Double.parseDouble(S.getText());
                                                double angle = Double.parseDouble(Angle.getText());

                                                double result = f * s * Math.cos(angle);
                                                Result.setText(Double.toString(result) + " Дж");
                                            }

        });
        setVisible(true);
    }
}
