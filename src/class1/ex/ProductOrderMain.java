package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        int totalPrice = 0;

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};

        for (ProductOrder o : productOrders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
            int prices = o.price * o.quantity;

            totalPrice += prices;
        }
        System.out.println("총 결제 금액: " + totalPrice);


    }
}
/*
문제 설명
당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
요구 사항
1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
상품명 ( productName )
가격 ( price )
주문 수량 ( quantity )
2. ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그
정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
3. 출력 예시와 같도록 출력하면 된다.
 */