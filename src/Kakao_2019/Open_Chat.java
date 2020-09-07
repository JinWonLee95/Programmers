//https://programmers.co.kr/learn/courses/30/lessons/42888

package Kakao_2019;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Open_Chat {
    public static String[] solution(String[] record) {
        String[] answer;
        int size = 0;
        Map<String, String> names = new HashMap<>();
        Queue<String[]> order = new LinkedList<>();

        for (String i: record){
            String[] actions = i.split(" ");
            String id = actions[1];

            if(!actions[0].equals("Leave")) {
                names.put(id, actions[2]);
            }

            switch (actions[0]){
                case "Change":
                    names.put(id, actions[2]);
                    break;

                case "Enter":
                    String[] tmp = {id, "E"};
                    order.offer(tmp);
                    size++;
                    break;

                case "Leave":
                    String[] tmp2 = {id, "L"};
                    order.offer(tmp2);
                    size++;
                    break;

            }
        }

        answer = new String[size];
        for(int i=0; i<size; i++){
            String[] tmp = order.poll();
            String message = "";
            String nameTmp = names.get(tmp[0]);

            switch (tmp[1]){
                case "E":
                    message = "\""+nameTmp+"님이 들어왔습니다.\"";
                    break;
                case "L":
                    message = "\""+nameTmp+"님이 나갔습니다.\"";
                    break;
            }
            answer[i] = message;
        }

        for (String i : answer)
        System.out.println(i);
        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(record);
    }
}
