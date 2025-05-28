package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class main_calass extends JFrame {
    main_calass(){
        super("Main Class");
        setExtendedState(JFrame.MAXIMIZED_BOTH);


        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("icon/ebs.png"));
        Image image2= image1.getImage().getScaledInstance(1330,830,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image4=new JLabel(image3);
        add(image4);

        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu=new JMenu("Menu");
        menu.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(menu);

        JMenuItem item=new JMenuItem("New Custumer");
        item.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon Cimage1=new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
        Image Cimage2=Cimage1.getImage().getScaledInstance(17,17,Image.SCALE_DEFAULT);
        item.setIcon(new ImageIcon(Cimage2));
        menu.add(item);

        JMenuItem item1=new JMenuItem("Custumer Detail");
        item1.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon Cimagea=new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
        Image Cimageb=Cimagea.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        item1.setIcon(new ImageIcon(Cimageb));
        menu.add(item1);

        JMenuItem item2=new JMenuItem("depositivedetail");
        item2.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon dimage1=new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
        Image  dimage2=dimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        item2.setIcon(new ImageIcon(dimage2));
        menu.add(item2);

        JMenuItem item3=new JMenuItem("calculate.bill");
        item3.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon dimagea=new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image  dimageb=dimagea.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        item3.setIcon(new ImageIcon(dimageb));
        menu.add(item3);

        JMenu Information=new JMenu("Information");
        Information.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(Information);

        JMenuItem info=new JMenuItem("Update Information");
        info.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon infoimage1=new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
        Image infoimage2=infoimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        info.setIcon(new ImageIcon(infoimage2));
        Information.add(info);


        JMenuItem viewinfo=new JMenuItem("View Information");
        viewinfo.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon Vimage1=new ImageIcon(ClassLoader.getSystemResource("icon/viewInfo.png"));
        Image vimage2=Vimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(vimage2));
        Information.add(viewinfo);

        JMenu  user=new JMenu("User");
        user.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(user);

        JMenuItem paybill=new JMenuItem("Pay Bill");
        paybill.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon pimage1=new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
        Image pimage2=pimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(pimage2));
        user.add(paybill);

        JMenuItem billdetail=new JMenuItem("Bill detail");
        billdetail.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon detailimage1=new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image detailimage2=detailimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        billdetail.setIcon(new ImageIcon(detailimage2));
        user.add(billdetail);

        JMenu  bill=new JMenu("Bill");
        bill.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(bill);

        JMenuItem generatebill=new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon gimage1=new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
        Image gimage2=gimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        generatebill.setIcon(new ImageIcon(gimage2));
        bill.add(generatebill);

        JMenu  utility=new JMenu("Utility");
        utility.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(utility);

        JMenuItem noteped=new JMenuItem("Noteped");
        noteped.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon nimage1=new ImageIcon(ClassLoader.getSystemResource("icon/notepad.png"));
        Image nimage2=nimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        noteped.setIcon(new ImageIcon(nimage2));
        utility.add(noteped);

        JMenuItem calculator=new JMenuItem("Calculator");
        calculator.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon calimage1=new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
        Image calimage2=calimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calimage2));
        utility.add(calculator);

        JMenu  exit=new JMenu("Exit");
        exit.setFont(new Font("Algerian",Font.BOLD,23));
        menuBar.add(exit);

        JMenuItem exit1=new JMenuItem("Exit");
        exit1.setFont(new Font("Algerian",Font.BOLD,17));
        ImageIcon exitimage1=new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
        Image exitimage2=exitimage1.getImage().getScaledInstance(12,12,Image.SCALE_DEFAULT);
        exit1.setIcon(new ImageIcon(exitimage2));
        exit.add(exit1);

        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[]args){

        new main_calass();
    }
}
