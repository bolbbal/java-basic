package oop1;

public class MusicPlayer {
    int volme = 0;
    boolean isOn = false;
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volme++;
        System.out.println("음악 플레이어 볼륨 : " + volme);
    }
    void volumeDown() {
        volme--;
        System.out.println("음악 플레이어 볼륨 : " + volme);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volme);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
