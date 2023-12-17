import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;

public class sorting implements ActionListener {
    JFrame jFrame = new JFrame();
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JButton button1 = new JButton();
    JButton button2 = new JButton();


    public sorting() {
        jFrame.setBounds(100, 100, 500, 500);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textField1.setBounds(50, 50, 100, 50);
        jFrame.add(textField1);
        textField1.addActionListener(this);

        textField2.setBounds(200, 50, 100, 50);
        jFrame.add(textField2);
        textField2.addActionListener(this);

        textField3.setBounds(350, 50, 100, 50);
        jFrame.add(textField3);
        textField3.addActionListener(this);

        button1.setBounds(50, 300, 150, 50);
        jFrame.add(button1);
        button1.setText("sort by first");
        button1.addActionListener(this);

        button2.setBounds(250, 300, 150, 50);
        jFrame.add(button2);
        button2.setText("sort by second");
        button2.addActionListener(this);
    }
    ;




    public void actionPerformed(ActionEvent e) {
        ArrayList<point> al = new ArrayList<>();

        String str1 = textField1.getText();
        String str2 = textField2.getText();
        String str3 = textField3.getText();
        String [] parts1 = str1.split(",");
        int x1 = Integer.parseInt(parts1[0]);
        int y1 = Integer.parseInt(parts1[1]);
        String [] parts2 = str2.split(",");
        int x2 = Integer.parseInt(parts2[0]);
        int y2 = Integer.parseInt(parts2[1]);
        String [] parts3 = str3.split(",");
        int x3 = Integer.parseInt(parts3[0]);
        int y3 = Integer.parseInt(parts3[1]);

        point p1 = new point(x1, y1);
        point p2 = new point(x2, y2);
        point p3 = new point(x3, y3);

        al.add(p1);
        al.add(p2);
        al.add(p3);


        if (e.getSource() == button1) {
            point.cmt = 0;
           Collections.sort(al);
           int afx1 = al.get(0).a;
           int afy1 = al.get(0).b;
           String s1 = afx1 + "," + afy1;
            System.out.println(s1);
           textField1.setText(s1);
            int afx2 = al.get(1).a;
            int afy2 = al.get(1).b;
            String s2 = afx2 + "," + afy2;
            textField2.setText(s2);
            int afx3 = al.get(2).a;
            int afy3= al.get(2).b;
            String s3 = afx3 + "," + afy3;
            textField3.setText(s3);
        } else if (e.getSource() == button2) {
            point.cmt = 1;
            Collections.sort(al);
            int afx1 = al.get(0).a;
            int afy1 = al.get(0).b;
            String s1 = afx1 + "," + afy1;
            System.out.println(s1);
            textField1.setText(s1);
            int afx2 = al.get(1).a;
            int afy2 = al.get(1).b;
            String s2 = afx2 + "," + afy2;
            textField2.setText(s2);
            int afx3 = al.get(2).a;
            int afy3= al.get(2).b;
            String s3 = afx3 + "," + afy3;
            textField3.setText(s3);
        }
    }

    public static void main(String[] args) {
        new sorting();
    }

}
class point implements Comparable<point> {
    int a, b;
     static int cmt = 0;
    public point(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int compareTo(point p) {
        if (cmt == 0) {
            if (this.a > p.a) return 1;
            else if (this.a < p.a) return -1;
            return 0;
        } else if (cmt == 1) {
            if (this.b > p.b) return 1;
            else if (this.b < p.b) return  -1;
            return 0;
        }
        return 0;

    }
}



