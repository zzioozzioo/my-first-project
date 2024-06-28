import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        HashMap<String, Integer> map= new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.getOrDefault(player, 0) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) { // 완주하지 못한 경우
                answer = entry.getKey();
            }
        }
        return answer;

    }
}