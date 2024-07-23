import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == 2)arrayList.add(i);
        }
        if(arrayList.isEmpty()) return  new int []{-1};
        int start = arrayList.get(0);
        int end = arrayList.get(arrayList.size() - 1);
        int []answer = new int[end-start + 1];
        for(int i = start ; i <= end ;i ++  ){
            answer[i-start] = arr[i];
        }
        return  answer;
    }
}