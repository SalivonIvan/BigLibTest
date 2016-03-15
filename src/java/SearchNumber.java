

public class SearchNumber {

    private static final int LIMIT = 100;
    private int[] arrNumbers;

    public static void main(String[] args) {
        System.out.println(findMaximumNumber(10, 1, 5, 3, 8));

    }

    public int[] getArrNumbers() {
        return arrNumbers;
    }

    public void setArrNumbers(int[] arrNumbers) {
        this.arrNumbers = arrNumbers;
    }

    public static int findMaximumNumber(int limit, int... numbers) {
        int findNum = 0;
        int countOneMaxNum = 0;
        int countOneCurentNum = 0;
        String numInBinForm;
        char[] arrBinNumber;
        for (int number : numbers) {
            if (number > limit) {
                continue;
            }
            numInBinForm = Integer.toBinaryString(number);
            System.out.println(numInBinForm);
            arrBinNumber = numInBinForm.toCharArray();
            countOneCurentNum = getCountOne(arrBinNumber);
            if (countOneMaxNum == 0) {
                countOneMaxNum = countOneCurentNum;
                findNum = number;

            } else if (countOneMaxNum < countOneCurentNum) {
                countOneMaxNum = countOneCurentNum;
                findNum = number;

            }
        }

        return findNum;
    }
//    public static char[] 

    public static int getCountOne(char[] arrBinNumber) {
        int count = 0;
        for (char b : arrBinNumber) {
            if (b == '1') {
                count++;
            }
        }
        return count;
    }
}
