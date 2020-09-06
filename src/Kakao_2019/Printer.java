//https://programmers.co.kr/learn/courses/30/lessons/42587

package Kakao_2019;

import java.util.ArrayList;
import java.util.Collections;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int index = 0;
        boolean maxchanged = false;
        ArrayList<Integer> tmp = new ArrayList<>();

        for(int i : priorities){
            tmp.add(i);
        }

        Collections.sort(tmp);
        Collections.reverse(tmp);

        int max = tmp.get(0);

        while(true){
            if(priorities[index]==max){
                answer++;
                maxchanged = true;
                priorities[index] = -1;
            }else{
                if(index == priorities.length-1)
                    index = 0;
                else
                    index++;
            }

            if(priorities[location]==-1){
                break;
            }

            if(maxchanged){
                tmp.remove(0);
                max = tmp.get(0);
                maxchanged = false;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2,1,3,2}; //[1, 1, 9, 1, 1, 1]
        int location = 2; //0
        solution(priorities,location);
    }
}
