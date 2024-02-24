
    class setCharAtDemo {

        public static void main(String args[]) {        
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
        StringBuffer sb1 = new StringBuffer("Hello");
        char arr[]=new char[5];
        sb1.getChars(0,3,arr,0) ;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int a = 42;
       StringBuffer s = sb.append(a);
       System.out.println(s);
       sb.insert(2, "like ");
       System.out.println(sb);
       sb.reverse();
       System.out.println(sb);

       

    
        
        }
    }

