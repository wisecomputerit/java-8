class Child extends Object { // �S���w�q equals() ��k������
}

public class Equals {
        
  public static void main(String[] argv) {
    Child c1 = new Child(); // ����Child����
    Child c2 = new Child(); // ����Child����
    Child c3 =  c1;

    // �I�s Object.equals()
    System.out.println("c1 equals c2�G" + c1.equals(c2));
    System.out.println("c1 equals c3�G" + c1.equals(c3));
    System.out.println("c3 equals c2�G" + c3.equals(c2));
  }
}
