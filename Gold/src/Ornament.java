public class Ornament {

    public void wear(Gold gold){

       if(gold!=null){
           System.out.println("wear is running in ornament");
           gold.carat();
       }
       else{
           System.out.println("Gold object is null");
       }



    }

}
