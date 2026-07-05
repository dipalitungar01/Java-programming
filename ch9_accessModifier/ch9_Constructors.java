package ch9_accessModifier;

class MymainEmployee{
    private int id;
    private String name;

    public MymainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }



    public MymainEmployee(String myname, int myId){
        id = myId;
        name = myname;
    }

    public MymainEmployee(String myname){
        id = 1;
        name = myname;
    }



    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId() {
        return id;
    }
}


public class ch9_Constructors {
    public static void main(String[] args) {
//        MymainEmployee dipali = new MymainEmployee("dipalitungar", 12);
        MymainEmployee dipali = new MymainEmployee();
//        dipali.setName("dipalitungar");
//        dipali.setId(34);
        System.out.println(dipali.getId());
        System.out.println(dipali.getName());

    }
}
