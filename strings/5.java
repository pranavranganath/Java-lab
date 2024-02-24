public class strings5 {
    public static void main(String[] args) {
        byte ascii[];
        String s="Hello";
        ascii=s.getBytes();
        System.out.println(ascii[0]);
        char c[];
        c=s.toCharArray();
        System.out.println(c[0]);

    }
    
}
