class Test {
  public String toString() {
    return "�o�O�@�Ӵ��ժ���";
  }
}

public class Conversion {       
        
  public static void main(String[] argv) {
    Test t = new Test();
    String a = "�o�O�@�Ӵ��զr��";
    String b = a + t;

    System.out.println("a�G" + a);
    System.out.println("b�G" + b);
  }
}
