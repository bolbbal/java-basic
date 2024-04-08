package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
        int[][] studentInpo = {
                {15, 90},
                {16, 80}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("이름:" + studentName[i] + " 나이:" + studentInpo[i][j] + " 성적:" + studentInpo[i][j+1]);
            }

        }
    }
}
