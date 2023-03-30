import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class cla extends JFrame implements ActionListener {
    private Container c;
    private JButton btn[] = new JButton[4];
    private JLabel label1, label2,label3, labelres, labelerr;
    private JTextField txt1, txt2, res;
    

    cla() {
      
    c = getContentPane();
    Color cc = new Color(112, 128, 144);
    c.setBackground(cc);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Operand 1: ");
        label2 = new JLabel("Operand 2: ");
        label3 = new JLabel("Operator: ");
        labelres = new JLabel("Result:");
        
        labelerr = new JLabel("");
        label1.setBounds(100, 75, 200, 50);
        label3.setBounds(1, 240, 200, 50);
        label2.setBounds(100, 150, 200, 50);
        labelres.setBounds(75, 350, 100, 50);
        labelerr.setBounds(50, 150, 300, 25);
        labelres.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        labelerr.setForeground(Color.blue);

        txt1 = new JTextField();
        txt2 = new JTextField();
        res = new JTextField();
        txt1.setBounds(300, 75, 300, 60);
        txt2.setBounds(300, 150, 300, 60);
        res.setBounds(200,350, 300, 60);
        res.setEditable(false);
        res.setBackground(Color.DARK_GRAY);
        res.setForeground(Color.WHITE);
        res.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        
        res.setText("0");

        c = this.getContentPane();
        c.setLayout(null);

        btn[0] = new JButton("+");
        btn[1] = new JButton("-");
        btn[2] = new JButton("x");
        btn[3] = new JButton("/");
        btn[0].setBounds(120, 250    , 70, 50);
        btn[1].setBounds(200, 250, 70, 50);
        btn[2].setBounds(300, 250, 70, 50);
        btn[3].setBounds(400, 250, 70, 50);

        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(labelres);
        c.add(labelerr);
        c.add(txt1);
        c.add(txt2);
        c.add(res);

        for (int i = 0; i < btn.length; i++) {
            c.add(btn[i]);
            btn[i].addActionListener(this);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            labelerr.setText("");
            int op1 = Integer.parseInt(txt1.getText());
            int op2 = Integer.parseInt(txt2.getText());

            if (e.getSource() == btn[0])
                res.setText(String.valueOf(op1 + op2));

            else if (e.getSource() == btn[1])
                res.setText(String.valueOf(op1 - op2));

            else if (e.getSource() == btn[2])
                res.setText(String.valueOf(op1 * op2));

            else
                res.setText(String.valueOf(op1 / op2));
        }
        catch (ArithmeticException a) {
            labelerr.setText("Invalid operation: \"divide by zero\" ");
            res.setText("ERROR");
        }
        catch (NumberFormatException b) {
            labelerr.setText("Invalid Input: \"Please input integer values/range only\" ");
            res.setText("ERROR");
        }
    }

}

public class clac2 {
    public static void main(String[] args) {
        cla frame = new cla();
        frame.setTitle("My Calculator");
    }

}