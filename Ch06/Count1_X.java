import java.io.*;

public class Count1_X {

  public static void main(String args[]) throws IOException {

    // �ŧi�֥[�� sum �έp��d�� range
    int sum = 0, range;

    System.out.println("�п�J���w�ƭȽd��G");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    range = Integer.parseInt(str);

    int i=1;           // �ŧi�j���ܼ� i
    while (i<=range) { // �Y i �p�� range, �h����j�餺���ʧ@
      sum += i;
      System.out.println((sum-i) + "+" + i + "=" +sum);
      // ���T�g�k���b���B�[�W i++; ���ԭz
    }
  }
}
