import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TempConverter extends JFrame 
                           implements ActionListener {
  // �ഫ���G��ܰ�
  JLabel result = new JLabel(" ",SwingConstants.CENTER);
  JTextField degree = new JTextField();  // ��J��
  JButton f2c = new JButton("�ؤ������");
  JButton c2f = new JButton("�����ؤ�");

  public TempConverter () {
    Container contentPane = getContentPane();  // ���o ContentPane ����

    // �N 5 �Ӥ���[�� BorderLayout �����Ӧ�m
    contentPane.add(new JLabel("�п�J�ū�",SwingConstants.CENTER),
                    BorderLayout.NORTH);
    contentPane.add(f2c,BorderLayout.EAST);
    contentPane.add(c2f,BorderLayout.WEST);
    contentPane.add(degree,BorderLayout.CENTER);
    contentPane.add(result,BorderLayout.SOUTH);

    // �]�w this ���󬰶�ť��
    f2c.addActionListener(this);
    c2f.addActionListener(this);

    setTitle("�ؤ�P���ūת��ഫ");
    setSize(400,120);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      // ���o��J�Ϫ��r��, ���ন�B�I��
      double value = Double.parseDouble(degree.getText());

      String msg="";     // ����ഫ���G���r��
      if(e.getSource() == f2c) // �̫��s�M�w�ഫ�覡
       msg= "�ؤ� " + value + " �׵������ " +
                      ((value-32)*5/9) +" ��";
      else
        msg= "��� " + value + " �׵���ؤ� " +
                      (value/5*9 + 32) +" ��";
      // �ñN���G�g������̤U��
      result.setText(msg);
    } catch (NumberFormatException ne) {
      degree.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
    }
  }
}

public class TempApplet extends JApplet
                        implements ActionListener {
  TempConverter tc = new TempConverter();

  public void init() {
    JButton showButton = new JButton("�ū׭p�⾹");
    getContentPane().add(showButton);
    showButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (!tc.isVisible()) 
      tc.setVisible(true);   //��ܵ���
  }
}