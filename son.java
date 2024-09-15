public class son extends father {
    String car= "BMWM2";

    void longride(){
        System.out.println("car =" + this.car);//own propety use this
        System.out.println("father car" + super.car);//super class property use super
    }
    public static void main(String[] args) {
        son s1 = new son();
        s1.longride();
        //  s1.drink(); //we cant do this because private higher visibility 
    }
}
