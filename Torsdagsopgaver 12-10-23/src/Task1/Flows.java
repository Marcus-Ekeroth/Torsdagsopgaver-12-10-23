package Task1;

public class Flows {


    boolean a = false;
    boolean b = true;

    // 1.1
   public void methodA(){
    // 1.2 & 1.4

     if(!a){
         System.out.println("j");
     }
     if(a){

         if(b){
             System.out.println("");
         }
         System.out.println("e");
         System.out.println("r");
         System.out.println("");
     }
     a = false;
    }

    public void methodB(){

        if(b){
            System.out.println("a");
        }
        if(!a){
            System.out.println("v");
            a = true;
        }


    }

    public void methodC(){
        if(b == true && a == false){
            System.out.println("s");
            methodA();
            System.out.println("o");
            b = false;
            a = true;
        }




    }

    public void methodD(){

        System.out.println("v");
        System.out.println("t");
    }




}
