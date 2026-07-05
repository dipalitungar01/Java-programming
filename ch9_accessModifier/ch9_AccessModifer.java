package ch9_accessModifier;


class MyEmployee{
   private int id;
     private String name;

     public String getName(){
         return name;
     }
     public void setName(String n){
         name = n;
      }

    public void setId(int i){
       id = i;
    }
    public int getId() {
       return id;
    }
}


public class ch9_AccessModifer {
    public static void main(String[] args) {
      MyEmployee dipali = new MyEmployee();
//       dipali.id = 35;
//       dipali.name = "dipalitungar";  ---> Throws an error due to private access modifier
      dipali.setName("dipalitungar");
        System.out.println(dipali.getName());
        dipali.setId(254);
        System.out.println(dipali.getId());
    }
}
