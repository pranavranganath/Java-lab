public class strings4 {
    public static void main(String[] args) {
        
    
    String s = "Welcome to Bmsce college";

int start = 10;// count from index 0

int end = 14;//count from 1

char buf[] = new char[end - start];

s.getChars(start, end, buf, 0);

System.out.println(buf);
}
}
