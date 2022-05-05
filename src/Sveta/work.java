    public class work {
    public static void main (String[] args) {

    //Array
    int [] numbers=new int [7];
    numbers[0]=10;
    numbers[1]=-8;
    numbers[2]=3;
    numbers[3]=67;
    numbers[4]=82;
    numbers[5]=15;
    numbers[6]=49;
    System.out.println(numbers[2]);
    System.out.println(numbers[5]);
    System.out.println(numbers.length);

    //Update the third value
    numbers[2]=99;
    System.out.println(numbers[2]);

    //Text array
    String[]months=new String[12];
    months[0]="September";
    months[1]="October";
    months[2]="November";
    months[3]="December";
    months[4]="January";
    months[5]="February";
    months[6]="March";
    months[7]="April";
    months[8]="May";
    months[9]="June";
    months[10]="July";
    months[11]="August";
    System.out.println(months[3]);
    months[2]="May";
    System.out.println(months[2]);
    System.out.println(months.length);

    //loop
    for(String months12:months){
    System.out.println(months12);
    }

    //Array with grocery list
    String[]grocery=new String[8];
    grocery[0]="Onion";
    grocery[1]="carrots";
    grocery[2]="peppers";
    grocery[3]="tomatoes";
    grocery[4]="apples";
    grocery[5]="pears";
    grocery[6]="peaches";
    grocery[7]="strawberry";

    System.out.println(grocery[0]+" "+grocery[1]+" "+grocery[2]+" "+grocery[3]);

    //loop
    for(String grocery1:grocery){
    System.out.println(grocery1);
    }

    grocery[1]="strawberry";
    System.out.println(grocery[1]);
    System.out.println(grocery.length);

    int[]temp=new int[5];
    temp[0]=10;
    temp[1]=15;
    temp[2]=25;
    temp[3]=-25;
    temp[4]=-10;
    System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
    System.out.println(temp[3]+" "+temp[4]);
    System.out.println(temp.length);

    //loop
    for(int temp5:temp){
    System.out.println(temp5);
    }







    }}
