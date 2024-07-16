class Solution {
    static ArrayList<Integer> factorial(int N) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 2; i <= N; i++) {
            int carry = 0;

            for (int j = 0; j < result.size(); j++) {
                int val = result.get(j) * i + carry;
                result.set(j, val % 10);
                carry = val / 10;
            }

            while (carry > 0) {
                result.add(carry % 10);
                carry /= 10;
            }
        }

        Collections.reverse(result);
        return result;
    }
}