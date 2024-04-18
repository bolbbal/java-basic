package poly.ex.pay1;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOption1 = scanner.nextLine();
            if (payOption1.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount1 = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption1, amount1);
        }



    }
}
/*
기존 결제 시스템이 사용자 입력을 받도록 수정하세요
 */