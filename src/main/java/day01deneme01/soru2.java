package day01deneme01;

public class soru2 {
    public static void main(String[] args) {

        int[][] x = {{2, 1}, {5, 7, 6}};

        System.out.println(m(x));
    }

    public static int m(int[][] m) {

        int result = m[0][1];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                if (result < m[i][j]) {

                    result = m[i][j];

                }

            }

        }

        return result;

    }


}


