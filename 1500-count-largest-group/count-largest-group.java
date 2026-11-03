class Solution {
    public int countLargestGroup(int n) {

        int[] count = new int[37];

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            count[sum]++;
        }

        int max = 0;
        int result = 0;

        for (int i = 1; i < count.length; i++) {

            if (count[i] > max) {
                max = count[i];
                result = 1;
            }
            else if (count[i] == max) {
                result++;
            }
        }

        return result;
    }
}