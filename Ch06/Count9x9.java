public class Count9x9 {

  public static void main(String args[]) {

    // �ŧi�E�E���k�� (x*y) �ܼ� x �� y
    int x, y;

    // �q x=1 �}�l���檺 for �j��
    for (x=1;x<=9;x++) {
      // �q y=1 �}�l���檺 for �j��
      for (y=1;y<=9;y++)
        System.out.print( x + "*" + y + "=" + x*y + "\t");
      System.out.println();
    }
  }
}
