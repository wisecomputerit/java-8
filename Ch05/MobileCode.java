import java.io.*;

public class MobileCode {

  public static void main(String[] argv) throws IOException {

    System.out.print("�п�J�z����ʹq�ܫe�|�X�G");

    BufferedReader br = new 
        BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int code = Integer.parseInt(str);

    if ((code == 910) || (code == 911) || (code == 912) ||
        (code == 919) || (code == 921) || (code == 928) ||
        (code == 932) || (code == 933) || (code == 934) ||
        (code == 937) || (code == 963) || (code == 972) ||
        (code == 975) || (code == 978) || (code == 988) )
      System.out.println("���عq�H");
    else if ((code == 914) || (code == 918) ||
        (code == 920) || (code == 922) || (code == 923) ||
        (code == 924) || (code == 929) || (code == 935) ||
        (code == 939) || (code == 952) || (code == 953) ||
        (code == 956) || (code == 958) || (code == 961) ||
        (code == 970) || (code == 979) || (code == 983) ||
        (code == 987) )
      System.out.println("�x�W�j���j");
    else if ((code == 913) || (code == 915) ||
        (code == 916) || (code == 917) || (code == 925) ||
        (code == 926) || (code == 927) || (code == 930) ||
        (code == 936) || (code == 938) || (code == 954) ||
        (code == 955) || (code == 976) || (code == 981) ||
        (code == 984) || (code == 989) )
      System.out.println("���ǹq�H");
    else if ((code == 973) || (code == 986) )
      System.out.println("���_�q�H");
    else if ((code == 977) || (code == 980) ||
        (code == 982) || (code == 985) )
      System.out.println("�Ȥӹq�H");
    else if ((code == 966) || (code == 968) )
      System.out.println("�j���q�H");
    else if ((code == 931) || (code == 960) )
      System.out.println("�x�W�j���j�άO���ǹq�H");
    else if (code == 971)
      System.out.println("�x�W�j���j�άO���_�q�H");
    else
      System.out.println("��p, �L�k�P�w�z���t�ΡC");
  }
}