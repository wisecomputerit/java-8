class Parent { // �����O
   Parent() {  // �غc��k
     System.out.println("��������O���غc��k");
   }
}

class Child extends Parent { // �l���O
  Child() { // �غc��k
    // super(); // �ϥ� super �I�s�����O���غc��k
    System.out.println("����l���O���غc��k");
  }
}

public class Default {
  public static void main(String[] argv) {
    Child c = new Child(); // ���ͤl���O������
  }
}
