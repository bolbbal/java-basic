package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movies1 = new MovieReview();
        movies1.title = "인셉션";
        movies1.review = "인생은 무한 루프";

        MovieReview movies2 = new MovieReview();
        movies2.title = "어바웃 타임";
        movies2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[]{movies1, movies2};

        for (MovieReview r : movieReviews) {
            System.out.println("영화 제목: " + r.title + " 리뷰: " + r.review);
        }

    }
}
/*
문제 설명
기존 문제에 배열을 도입하고, 영화 리뷰를 배열에 관리하자.
리뷰를 출력할 때 배열과 for 문을 사용해서 System.out.println 을 한번만 사용하자
 */