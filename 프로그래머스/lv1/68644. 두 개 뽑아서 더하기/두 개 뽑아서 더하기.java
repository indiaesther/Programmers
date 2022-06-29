import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int a = numbers[i]+numbers[j];
                if (result.indexOf(a)<0) {
                    result.add(a);
                }
            }
        }
        
       
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
        
    }
}