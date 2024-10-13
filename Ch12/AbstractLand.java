abstract class Land {     // �����O
  abstract double area(); // �p�⭱�n
}

class Circle extends Land { // ��Ϊ��g�a
  int r; // �b�|�]���G���ء^

  Circle(int  r) { // �غc��k
    this.r = r;
  }

  double area() {  // �h���w�q������
    return 2 * 3.14 * r * r;
  }
}

class Square extends Land { // ����Ϊ��g�a
  int side; // ����]���G���ء^

  Square(int side) { // �غc��k
    this.side = side;
  }

  double area() {     // �h���w�q������
    return side * side;
  }
}

class Calculator {
  double price; // �C���褽�ت�����]���^

  Calculator(double price) { // �غc��k
    this.price = price;
  }

  double calculatePrice(Land l) {
    return calculatePrice(price,l);
  }

  double calculatePrice(double price,Land l) {
    return l.area() * price; // �z�L�h�ΩI�s���T�� area() ��k
  }

  double calculateAllPrices(Land... Lands) {
          // �ϥΦh���w�q������
          return calculateAllPrices(price,Lands);
  }

  double calculateAllPrices(Object... Lands) {
    // �ϥΦh���w�q������
    int times; // ���Ʀ���
    Land l;
    double total = 0; // �p��[�`
    int i = 0;
    while(i < Lands.length) {
      times = 1;
      if(Lands[i] instanceof Land) {
        l = (Land) Lands[i++]; // ���o�Ϊ�
        if(i < Lands.length    // ���U�@�Ӥ���
          && Lands[i] instanceof Integer) // �O���
          times = (Integer) Lands[i++];   // ���o���Ʀ���
        total += times * calculatePrice(l);
      }
    }
    return total;
  }

  double calculateAllPrices(double price,
    Land... Lands) { // �h���w�q������
    double total = 0; // �p��[�`

    for(Land l : Lands) { // �@�@���X�U�Ӫ���
      total += calculatePrice(price,l); // �ӧO�p��ò֥[
    }

    return total;
  }
}

public class AbstractLand {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // �@����Ϊ��a
    Square s = new Square(5); // �@������Ϊ��a

    Calculator ca = new Calculator(3000.0); // �C���褽��3000��

    System.out.println("�`���ȡG" + // �ϥΰΦW�}�C
      ca.calculateAllPrices(s,2,c));
  }
}
