public class Datahiding {
      public class  employee {
        private int id;
        private String name;
        private double salary;
    
        public int getid(){
            return id;
        }
        public String getname(){
            return name;
        }
        public double getsalary(){
            return salary;
        }
        public void setid(int id){
             this.id=id;
        }
        public void setname(String name){
             this.name=name;
        }
        public void setsalary(double salary){
            this.salary=salary;
        }
        
      }
      public static void main(String[] args) {
        employee e1 = new Datahiding().new employee();
        e1.setid(1500);
        e1.setname("ashish");
        e1.setsalary(25000);

        System.out.println(e1.getid());
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
      }
    
}