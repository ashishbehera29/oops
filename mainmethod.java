
public class mainmethod {
    public static void main(String[] args) {

        citizen c1 = new citizen("ashish", "male", 23);
        students s1 = new students("ram", "male", 16, 25, 83, "ssvm");
        employee e1 = new employee("rani", "female", 32, 2254, 100000000);
        government g1 = new government();
        g1.adharcard(e1);
        g1.adharcard(c1);
        g1.adharcard(s1);
        g1.awardscholarshop(s1);
        g1.taxpayment(e1);


        // demo1 d1 = (demo1) new demo2();
        // demo2 d2 = (demo2) new demo1();
       
        // whatsapp2k14 w1= new whatsapp2k14();
        // w1.msg();

        // whatsapp2k15 w2 = new whatsapp2k15();
        //  w2.msg();

        //  whatsapp2k16 w3 = new whatsapp2k16();
        //  w3.msg();
    }
}
