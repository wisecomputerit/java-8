public class PartOf9x9 {
  public static void main(String args[]) {
    // �ŧi�E�E���k�� (x*y) �ܼ� x �� y
    int x, y, p = 0;

    // �q x=1 �}�l���檺 for �j��
    outloop:for (x=1;x<=9;x++) {  // �[�W���ҦW��
      // �q y=1 �}�l���檺 for �j��
      for (y=1;y<=9;y++) {
        p = x*y;                  // �p�� x*y �����n
        if (p > 25) {             // �Y���n�j�� 25
          System.out.print("\n"); // ����
          continue outloop;       // ����o�@���� outloop �j��
        }
        System.out.print( x + "*" + y + "=" + p + "\t");
      }
      System.out.println();
    }
  }
}
