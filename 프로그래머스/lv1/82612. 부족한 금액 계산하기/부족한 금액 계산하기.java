class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long total_price = 0;
        for (int i=1; i<=count; i++) {
            total_price += price * i;
        }
        
        if (money <= total_price) {
            answer = total_price - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}