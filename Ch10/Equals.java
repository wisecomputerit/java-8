public class Equals {
        
  public static void main(String[] argv) {
    String a = "�o�O�@�Ӵ��զr��";
    String b = "�o�O�@�Ӵ��զr��";
    String c = new String("�o�O�@�Ӵ��զr��");

    System.out.println("a �P b �ۦP? " + a.equals(b));
    System.out.println("b �P c �ۦP? " + b.equals(c));
    System.out.println("a �P c �ۦP? " + a.equals(c));
  }
}
