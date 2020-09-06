//https://programmers.co.kr/learn/courses/30/lessons/64061?language=java

package Kakao_2019;

import java.util.Stack;

public class Doll {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> st = new Stack<>();

        for(int move : moves) {
            int section = move - 1;

            for(int i=0; i<board.length; i++){
                int doll = board[i][section];

                if(doll ==0)
                    continue;
                else{
                    board[i][section] = 0;
                    if(!st.empty() && st.peek() == doll){
                        answer += 2;
                        st.pop();
                    }else{
                        st.add(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] tmp1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] tmp2 = {1,5,3,5,1,2,1,4};

        solution(tmp1, tmp2);
    }
}
