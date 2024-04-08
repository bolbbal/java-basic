package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movies1 = new MovieReview();
        movies1.title = "인셉션";
        movies1.review = "인생은 무한 루프";

        MovieReview movies2 = new MovieReview();
        movies2.title = "어바웃 타임";
        movies2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + movies1.title + ", 리뷰: " + movies1.review);
        System.out.println("영화 제목: " + movies2.title + ", 리뷰: " + movies2.review);

    }
}
/*
문제 설명
당신은 영화 리뷰 정보를 관리하려고 한다. 먼저, 영화 리뷰 정보를 담을 수 있는 MovieReview 클래스를 만들어보자.
요구 사항1. MovieReview 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
영화 제목 ( title )
리뷰 내용 ( review )
2. MovieReviewMain 클래스 안에 main() 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하자.
 */