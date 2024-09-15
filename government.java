public class  government {
    void adharcard(citizen arg){
     System.out.println("enrollment completed");
    }
    void awardscholarshop(students arg){
        if(arg.marks>85){
         System.out.println("scholarship awarded");
        }else{
         System.out.println("not eleigible for scholarship");
        }
    }
    void taxpayment(employee arg){
       if(arg.salary>100000){
         System.out.println("tax applicable");
       }else{
         System.out.println("no tax");
       }
    }
 
}
