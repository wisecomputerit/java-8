import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ShowImage extends JPanel {
  Image img; // �N��v��������

  public ShowImage(Image i) {
    img = i;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    AffineTransform at = new AffineTransform();
    Dimension d = getSize();
    double sc = Math.min(d.width/(double)img.getWidth(null),
                         d.height/(double)img.getHeight(null));
    at.scale(sc,sc);
    g2.drawImage(img, at, this);
  }
}

public class ImageApplet extends JApplet {
  public void init () {
    // �q���������o�v���ɦW�Ѽ�
    Image i= getImage(getDocumentBase(), getParameter("fname"));

    // �إ� Panel ����, �å[�J Content Pane ��
    ShowImage p = new ShowImage(i);
    getContentPane().add(p);
  }
}
