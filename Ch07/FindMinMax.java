public class FindMinMax {

  public static void main(String[] argv) {
    int[] temp = {18,21,20,22,22,19,17,20,19}; // �ū�
    int min = temp[0]; // ���N�̧C�ū׳]�����@�Ӥ���
    int max = temp[0]; // ���N�̰��ū׳]�����@�Ӥ���

    for(int i : temp) { // �@�@����C�Ӥ�����
      if(i < min){
        min = i; // ��s�̧C�ū�
      }
      if(i > max) {
        max = i; // ��s�̰��ū�
      }
    }

    System.out.println("�̧C���ū׬O�G" + min + "��");
    System.out.println("�̰����ū׬O�G" + max + "��");
  }
}
