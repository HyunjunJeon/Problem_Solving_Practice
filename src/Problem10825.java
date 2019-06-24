import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10825 {
    private static class Student{
        int korean;
        int english;
        int math;
        String name;
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = null;
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            Student[] s = new Student[t];

            for(int i = 0; i < t; i++){
                st = new StringTokenizer(br.readLine());
                Student std = new Student();
                std.name = st.nextToken();
                std.korean = Integer.parseInt(st.nextToken());
                std.english = Integer.parseInt(st.nextToken());
                std.math = Integer.parseInt(st.nextToken());
                s[i] = std;
            }

            Arrays.sort(s, (o, v) -> {
                if(o.korean < v.korean){
                    return 1;
                }else if(o.korean == v.korean){
                    if(o.english < v.english) {
                        return -1;
                    }else if(o.english == v.english){
                        if(o.math < v.math){
                            return 1;
                        }else if(o.math == v.math){
                            return (o.name).compareTo(v.name);
                        }
                    }
                }
                return 0;
            });

            for(Student ss: s){
                bw.write(ss.name+"\n");
            }
            bw.flush();
        }
    }
}
