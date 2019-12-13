import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem16165 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Map<String, List<String>> girlGroup = new HashMap<>();
            while(n-- > 0){
                String groupName = br.readLine();
                int member = Integer.parseInt(br.readLine());
                List<String> members = new ArrayList<>();
                while(member-- > 0){
                    members.add(br.readLine());
                }
                Collections.sort(members, Comparator.naturalOrder());
                girlGroup.put(groupName, members);
            }
            while(m-- > 0){
                String name = br.readLine();
                int problemNum = Integer.parseInt(br.readLine());
                if (problemNum == 0){
                    List<String> strings = girlGroup.get(name);
                    strings.forEach(System.out::println);
                } else{
                    Iterator<String> iterator = girlGroup.keySet().iterator();
                    while(iterator.hasNext()){
                        String teamName = iterator.next();
                        List<String> strings = girlGroup.get(teamName);
                        boolean b = strings.stream().anyMatch(x -> x.equalsIgnoreCase(name));
                        if (b) {
                            System.out.println(teamName);
                            break;
                        }
                    }
                }
            }
        }
    }
}
