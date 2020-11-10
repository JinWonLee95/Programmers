//https://programmers.co.kr/learn/courses/30/lessons/43165
package BFSDFS;

public class Target {

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = DFS(numbers, target, 0,0);
        return answer;
    }

    public int DFS(int[] numbers, int target, int index, int num) {
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return DFS(numbers, target, index + 1, num + numbers[index])
                    + DFS(numbers, target, index + 1, num - numbers[index]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        System.out.println(new Target().solution(numbers, target));
    }
}
