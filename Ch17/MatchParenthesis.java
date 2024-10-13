import java.util.*;

public class MatchParenthesis {

  public static void main(String args[]) {
    System.out.println("�п�J�@�q�⦡�ε{��");
    System.out.print("->");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    LinkedList<Character> match = new LinkedList<>();
    try {
      for (int i=0;i<str.length();i++) { // �ΰj��Ū�C�Ӧr��
        if (str.charAt(i)=='(')          // �Y�O���A��
          match.addFirst(new Character('(')); // �[�J���X����
        else if (str.charAt(i)==')')     // �Y�O�k�A��
          match.removeFirst();           // �������X���� 1 �ӥ��A��
      }

      if(match.isEmpty())
        System.out.print("���k�A���ƶq�۲�");
      else
        System.out.print("���k�A���ƶq����, �k�A���Ӥ�");

    } catch (NoSuchElementException e) {
        System.out.print("���k�A���ƶq����, ���A���Ӥ�");
    }
  }
}
