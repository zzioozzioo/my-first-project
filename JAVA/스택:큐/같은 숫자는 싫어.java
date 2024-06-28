import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Queue<Integer>q = new LinkedList<>();

        int last = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != last) {
                q.add(arr[i]);
            }
            last = arr[i];
        }

        answer = new int[q.size()];

        int index = 0;
        while(!q.isEmpty()) {
            answer[index++] = q.poll();
        }
        
        return answer;
    }
}


// import java.util.*;

// public class Solution {
//     public Queue<Integer> solution(int []arr) {

//         Queue<Integer>q = new LinkedList<>();

//         int last = -1;
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] != last) {
//                 q.add(arr[i]);
//             }
//             last = arr[i];
//         }

//         return q;
//     }
// }