//https://programmers.co.kr/learn/courses/30/lessons/42587

package Kakao_2019;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> pri = new LinkedList<>();

        for(int i:priorities){
            pri.offer(i);
        }

        for(int i : priorities){

        }



        return answer;
    }

    public void main(String[] args) {
        int[] priorities = {2,1,3,2}; //[1, 1, 9, 1, 1, 1]
        int location = 2; //0
        solution(priorities,location);
    }
}
