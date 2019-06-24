import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10814 {
    private static class Person {
        private int age;
        private String name;
        private int join;
    }

    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = null;
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            Person[] p = new Person[t];

            for(int i = 0; i < t; i++){
                st = new StringTokenizer(br.readLine());
                Person per = new Person();
                per.age = Integer.parseInt(st.nextToken());
                per.name = st.nextToken();
                per.join = i;
                p[i] = per;
            }

            Arrays.sort(p, (o, v) -> {
                if(o.age < v.age){
                    return -1;
                }else if(o.age == v.age && o.join < v.join){
                    return -1;
                }else if(o.age > v.age){
                    return 1;
                }else{
                    return 0;
                }
            });

            for(Person s : p){
                bw.write(s.age + " " + s.name + "\n");
            }
            bw.flush();
        }
    }
}
