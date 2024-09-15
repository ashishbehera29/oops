//method overloading-> class defining more than one method with same name, but diffrent parameter .(parameter type,parameter length,order of parameter)
                      //both static and non static method can be overloading.
public class overloading {
    void test(int arg){
        System.out.println("int method");
        System.out.println("arg value is" + arg);
    }
    void test(double arg){
        System.out.println("double method");
        System.out.println("arg value is" + arg);
    }
    void test(int arg1,double arg2){
        System.out.println("int double method");
        
    }
    void test(double arg2,int arg1){
        System.out.println("double int method");
        
    }
    public static void main(String[] args) {
        overloading a1 = new overloading();
        a1.test(20.3, 5);
    }

}
