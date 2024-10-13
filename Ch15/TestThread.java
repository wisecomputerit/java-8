import java.util.Date;

class TimerThread extends Thread { // 新的執行緒
  public void run() { // 新執行緒要執行的內容
    while(true) {     // 不斷顯示日期時間的迴圈
      for(int i = 0;i < 50_000_000;i++); // 等待一段時間
      Date now = new Date(); // 取得目前時間
      System.out.println("新執行緒：" + now); // 顯示時間
    }
  }
}

public class TestThread {
        
  public static void main(String[] argv) {
    TimerThread newThread = new TimerThread();
    newThread.start(); // 啟動執行緒
    while(true) {      // 不斷顯示日期時間的迴圈
      for(int i = 0;i< 50_000_000;i++); // 等待一段時間
      Date now = new Date(); // 取得目前時間
      System.out.println("舊執行緒：" + now); // 顯示時間
    }
  }
}
