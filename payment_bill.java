package electricity.billing.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payment_bill extends JFrame implements ActionListener {
    String meter;
    JButton back;
    payment_bill(String meter){
        this.meter=meter;
        JEditorPane editorPane=new JEditorPane();
        editorPane.setEditable(false);

        try {
            editorPane.setPage("https://paytm.com/online-payments");
            editorPane.setBounds(300,150,800,600);
        }catch (Exception E){
            E.printStackTrace();
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Errorr! Errorr!  Errorr!  Errorr!  Errorr!  Errorr! </html>");
        }

        JScrollPane pane = new JScrollPane(editorPane);
        add(pane);

        back = new JButton("Back");
        back.setBounds(640,20,80,30);
        back.addActionListener(this);
        editorPane.add(back);

        setSize(800,600);
        setLocation(400,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new pay_bill("meter");

    }

    public static void main(String[] args) {
        new payment_bill("");
    }
}
