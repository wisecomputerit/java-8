import javax.swing.*;
import java.awt.event.*;

public class ButtonApplet extends JApplet
                          implements ActionListener {
  int act = 0;     // �ΨӰO�����s�Q���ƪ��ܼ�
  JButton mybutton = new JButton("���Ӥ�r");

  // �Ϋغc��k�ӫإߤ���B�N����[�J�����B��ܵ���
  public ButtonApplet() {
    mybutton.addActionListener(this);
    getContentPane().add(mybutton);
  }

  public void actionPerformed(ActionEvent e) {
    act++;    // �N���s���ƥ[ 1
    mybutton.setText("�o�� " + act + " �����s�ƥ�");
  }
}
