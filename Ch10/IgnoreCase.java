public class IgnoreCase {
        
  public static void main(String[] argv) {
    String a = "This is a TEST String";
    String b = "This is a test string";

    System.out.println("���j�p�g��, a �P b �ۦP? " + a.equals(b));
    System.out.println("�����j�p�g, a �P b �ۦP? "
                       + a.equalsIgnoreCase(b));
  }
}
