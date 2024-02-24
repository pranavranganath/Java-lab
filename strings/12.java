public class strings12 {
    public static void main(String[] args) {
        String arr[] = {
            "1", "2", "3", "4", "5", "6", "7","8 ","9","10"
           
           };
           for(int j = 0; j < arr.length; j++) {

               for(int i = j + 1; i < arr.length; i++) {
               if(arr[i].compareTo(arr[j]) < 0) {
               
               String t = arr[j];
               
               arr[j] = arr[i]; arr[i] = t;
               
               }
               
               } System.out.println(arr[j]); }
    }
}
