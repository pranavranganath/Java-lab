public class strings11 {
    public static void main(String[] args) {
        String arr[] = {
             "van", "Watch", "ball", "cat", "xmas", "yatch", "zee",
            "apple", "ice", "jug", "kite", "lift", "man", "net", "orange","dog" ,"ent","free","gun","hen","parrot","queen","ring","star","tree","umbrella"
            };
            for(int j = 0; j < arr.length; j++) {

                for(int i = j + 1; i < arr.length; i++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                
                String t = arr[j];
                
                arr[j] = arr[i]; arr[i] = t;
                
                }
                
                } System.out.println(arr[j]); } }
    }

