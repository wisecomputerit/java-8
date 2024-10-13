class Point {   // �I
  private double x,y;

  public void setx(double x) {
    this.x = x;
  }

  public void sety(double y) {
    this.y = y;
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public Point(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    x = y = 0;
  }
}

class Circle {       // ��
  private Point p;   // ���
  private double r;  // �b�|

  public Point getp() {
    return p;        // �����Ǧ^��������
  }

  Circle(double x,double y,double r) {
    p = new Point(x,y);
    this.r = r;
  }

  Circle() {
    this(0,0,1);
  }

  public String toString() {  // �N�����T�ন�r�ꪺ��k
    return "��ߡG" + p.toString() + " �b�|�G" + r;
  }
}

public class SettingPrivateMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);  // ��� (3,4), �b�| 5

    Point p = c.getp();            // ���o���
    p.setx(6);                     // �ܧ��߮y��
    System.out.println(c.toString());
  }
}