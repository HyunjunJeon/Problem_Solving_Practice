public class Problem6679 {
    public static int sumNum(String num){
        int result = 0;
        char[] arr = num.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a'){
                result += 10;
            }else if(arr[i] == 'b'){
                result += 11;
            }else if(arr[i] == 'c'){
                result += 12;
            }else if(arr[i] == 'd'){
                result += 13;
            }else if(arr[i] == 'e'){
                result += 14;
            }else if(arr[i] == 'f'){
                result += 15;
            }else{
                result += arr[i]-'0';
            }
        }
        return result;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1000; i < 10000; i++){
            int a = sumNum(Integer.toString(i));
            int b = sumNum(Integer.toString(i, 12));
            int c = sumNum(Integer.toString(i, 16));
            if(a == b && b == c){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb.toString());
    }
}
