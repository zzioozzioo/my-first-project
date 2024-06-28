import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        
        int max = nums.length / 2; // 폰켓몬 최대로 선택 가능한 수

        // 중복 제거하기 위한 set
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num:nums) { // numsSet 해시에 nums의 요소 추가
            numsSet.add(num);
        }

        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }

    }
}