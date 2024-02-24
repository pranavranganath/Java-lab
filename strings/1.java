class MakeString {

    public static void main(String args[]) {
    
    char c[] = {'J', 'a', 'v', 'a'};
    byte ascii[] = {65, 66, 67, 68, 69, 70 };;
    
    String s1 = new String(c);
    String s = new String(c, 2, 1);
    String s2 = new String(s1);
    String s3 = new String(ascii);
    String s4 = new String(ascii, 2, 3);
    System.out.println(s1);
    System.out.println(s);
    System.out.println(s2); 
    System.out.println(s3);
    System.out.println(s4);
} }
