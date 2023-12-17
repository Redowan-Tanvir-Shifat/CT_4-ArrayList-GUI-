import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jFrame = new JFrame();
    JTextField textField_1 = new JTextField();
    JTextField textField_2 = new JTextField();
    JButton button_1 = new JButton();
    JButton button_2 = new JButton();
    JButton button_3 = new JButton();
    JButton button_4 = new JButton();
    JButton button_add = new JButton();
    JButton button_sub = new JButton();
    JButton button_equal = new JButton();

    public Calculator() {
        jFrame.setLocation(1000, 200);
        jFrame.setSize(300, 400);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Calculator");

        textField_1.setBounds(40, 20, 200, 50);
        jFrame.add(textField_1);

        button_1.setBounds(40, 80, 50, 30);
        button_1.setText("1");
        jFrame.add(button_1);

        button_2.setBounds(190, 80, 50, 30);
        button_2.setText("2");
        jFrame.add(button_2);

        button_3.setBounds(40, 120, 50, 30);
        button_3.setText("3");
        jFrame.add(button_3);

        button_4.setBounds(190, 120, 50, 30);
        button_4.setText("4");
        jFrame.add(button_4);

        button_add.setBounds(40, 160, 50, 30);
        button_add.setText("+");
        jFrame.add(button_add);

        button_sub.setBounds(190, 160, 50, 30);
        button_sub.setText("-");
        jFrame.add(button_sub);

        button_equal.setBounds(115, 200, 50, 30);
        button_equal.setText("=");
        jFrame.add(button_equal);

        textField_2.setBounds(40, 260, 200, 50);
        jFrame.add(textField_2);

        textField_1.addActionListener(this);
        textField_2.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_add.addActionListener(this);
        button_sub.addActionListener(this);
        button_equal.addActionListener(this);
    }

    String str = "";
    int res = 0;

    public void calculation() {
        String[] ch = str.split("[+-]");
        int v1 = Integer.parseInt(ch[0]);
        int v2 = Integer.parseInt(ch[1]);

        if (ch.length == 2) {

            if (str.contains("+")) {
                res = v1 + v2;
            }else if (str.contains("-")) {
                res = v1 - v2;
            }
        }else {
            System.out.println("Wrong Input");
        }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_equal) {
            calculation();
            textField_2.setText(String.valueOf(res));
        }
        else {
            str += ((JButton)e.getSource()).getText();
            textField_1.setText(str);

        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
