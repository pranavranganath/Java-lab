class fatherage extends Exception{
   public String toString(){
    return("Father age cant be less than zero");
   }
}
class childage extends Exception{
    public String toString(){
     return("Child age cant be greater than fathers");
    }
 }
class father{
    int f_age,c_age;
    
    father(int age){
        this.f_age=age;
    }
    father(int cage,int fage)
    {
      this.c_age=cage;
      this.f_age=fage;
    }
    public void age() throws fatherage{
        System.out.println("father age is" + f_age); 
        if (f_age<0){
            throw new fatherage();
        
         }
        }

         public void great() throws childage{
            System.out.println("father age is" + f_age); 
            if (f_age<c_age){
                throw new childage();
            
             }
         
        
    }
}


class child extends father{
   
    child(int x,int y){
       super(x,y);
    }
    
    }

class lab7{
    public static void main(String[] args) {
        father f1=new father(5);
        child c1= new child(20,10);
        try{
            f1.age();
            
        }
        catch(fatherage e){
            System.out.println(e);
        }
        try{
            c1.great();
        }
        catch(childage e){
            System.out.println(e);
        }
    }
}
