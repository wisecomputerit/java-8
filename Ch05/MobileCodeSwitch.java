import java.io.*;

public class MobileCodeSwitch {

  public static void main(String[] argv) throws IOException {

    System.out.print("�п�J�z����ʹq�ܫe�|�X�G");

    BufferedReader br = new 
        BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int code = Integer.parseInt(str);

    switch (code) {
      case 910:  case 911:  case 912:  case 919:
      case 921:  case 928:  case 932:  case 933:
      case 934:  case 937:  case 963:  case 972:
      case 975:  case 978:  case 988:
        System.out.println("���عq�H");
        break;
      case 914:  case 918:  case 920:  case 922:
      case 923:  case 924:  case 929:  case 935:
      case 939:  case 952:  case 953:  case 956:
      case 958:  case 961:  case 970:  case 979:
      case 983:  case 987:
        System.out.println("�x�W�j���j");
        break;
      case 913:  case 915:  case 916:  case 917:
      case 925:  case 926:  case 927:  case 930:
      case 936:  case 938:  case 954:  case 955:
      case 976:  case 981:  case 984:  case 989:
        System.out.println("���ǹq�H");
        break;
      case 973:  case 986:
        System.out.println("���_�q�H");
        break;
      case 977:  case 980:  case 982:  case 985:
        System.out.println("�Ȥӹq�H");
        break;
      case 966:  case 968:
        System.out.println("�j���q�H");
        break;
      case 931:  case 960:
        System.out.println("�x�W�j���j�άO���ǹq�H");
        break;
      case 971:
        System.out.println("�x�W�j���j�άO���_�q�H");
        break;
      default:
        System.out.println("��p, �L�k�P�w�z���t�ΡC");
    }
  }
}