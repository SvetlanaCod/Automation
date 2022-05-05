    public class IFstatement {
    public static void main (String[] args) {
    //if and else
    int x=5;
    if (x>2) {
        System.out.println("test1");
        System.out.println("test2");
    }


    int i=1;
    if (i>0){
        System.out.println("White");
    }
    else{
        System.out.println("Red");}

    String language ="Java";
    if (language!="Java"){
        System.out.println("Best Programming language");}
        else{
        System.out.println("Not Best Programming language");
    }

    int ticketsoneway=390;
    int ticketroundtrip=242;
    if(ticketsoneway>ticketroundtrip){
        System.out.println("round trip ticket is bigger");
    }
    else{
        System.out.println("round trip tickets is cheaper");
    }

    int total2=ticketsoneway*2;
    int total3=ticketroundtrip*3;
        System.out.println(total2);
        System.out.println(total3);
    if (total2<total3){
        System.out.println("total for passengers 3 is bigger");
    }
    else{
        System.out.println("test case failed");
    }













    }}
