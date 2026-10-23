import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> scores = new ArrayList<>();

        for (String op : operations) {
            int n = scores.size();

            if (op.equals("C")) {
                scores.remove(n - 1);
            } 
            else if (op.equals("D")) {
                scores.add(2 * scores.get(n - 1));
            } 
            else if (op.equals("+")) {
                scores.add(scores.get(n - 1) + scores.get(n - 2));
            } 
            else {
                scores.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}