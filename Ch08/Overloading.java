class Test {

  // 1�������G�ϥμe�P��
  int rectangleArea(int width,int height) {
    return width * height;
  }

  // 2�������G�ϥήy��
  int rectangleArea(int top,int left,int bottom,int right) {
    return (right - left) * (bottom - top);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test();
    int area;

    area = a.rectangleArea(10,20);
    System.out.println("�x�έ��n�G" + area);

    area = a.rectangleArea(5,5,15,25);
    System.out.println("�x�έ��n�G" + area);
  }
}