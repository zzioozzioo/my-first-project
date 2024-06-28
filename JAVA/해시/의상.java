import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) { // key: 의상 종류, value: 의상 종류 별 개수
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        Iterator<Integer> iter = map.values().iterator();

        while(iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
            // next()마다 의상 종류 바뀜
            // 각 의상 종류 별 (옷 개수 + 안 입는 경우 1가지) 선택 가능
            // 따라서 의상 종류마다 계산한 값을 answer에 곱해줌
        }


        return answer - 1;
        // 전부 안 입는 경우 1가지 제외
    }
}