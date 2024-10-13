class Circle {          // ��
  // �ϥ� protected �ŧi�����ܼ�
  protected double x,y; // ���
  protected double r;   // �b�|

  public void setCenter(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public String toString() {     // ��ܸ�T
    return "��ߡG(" + x + "," + y + "), �b�|�G" + r;
  }
}

class Cylinder extends Circle {
  private double h;              // ����

  Cylinder(double x,double y,double r,double h) {
    this.x = x;    // ��l���~�ӨӪ������ܼ�
    this.y = y;
    this.r = r;
    this.h = h;
  }
}

public class UsingProtected {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder(1,2,3,4);
    System.out.println(cr.toString());
  }
}
