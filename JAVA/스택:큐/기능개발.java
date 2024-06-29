import java.util.*;

import javax.lang.model.type.IntersectionType;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>(); // 배포 가능할 때까지 걸리는 기간이 저장된 큐
        for(int i=0; i<progresses.length; i++) {
            int day = (int)Math.ceil((double)(100 - progresses[i]) / (double)(speeds[i]));
            q.add(day);
        }

        int last = q.poll(); // 방금 전 배포된 작업의 남은 일수
        int count = 1;

        while(!q.isEmpty()) {
            if(last >= q.element()){
                count+=1;
                q.poll();
            } else { // 이제 다음 턴으로 넘어가야 함
                list.add(count);
                count = 1;
                last = q.poll();
            }
        }
        list.add(count);

        return list;
    }
}