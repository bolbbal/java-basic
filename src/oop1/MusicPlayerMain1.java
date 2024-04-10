package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volme = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volme++;
        System.out.println("음악 플레이어 볼륨 : " + volme);
        //볼륭 증가
        volme++;
        System.out.println("음악 플레이어 볼륨 : " + volme);

        //볼륨 감소
        volme--;
        System.out.println("음악 플레이어 볼륨 : " + volme);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volme);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
