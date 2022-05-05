    public class Practice {
    public static void main (String[] args){
    String cookie="You username is Anna3";
    System.out.println(cookie);
    System.out.println(cookie.substring (16,21));

    String txt="QA class is the best";
    System.out.println(txt.length());
    System.out.println(txt.indexOf("best"));
    System.out.println(txt.toUpperCase());


    int age=25;
    char name='S';
    double id=87;
    boolean female=true;
    System.out.println(age+" "+name+" "+id+" "+female);


    float number=87.7f;
    System.out.println(number);


    //Booleans condition
    int x=10;
    int y=9;
    boolean z1=(x>y);
    System.out.println(z1);
    System.out.println(x<y);

    //Booleans with equal sign for comparing INT
    int x1=10;
    System.out.println(x1==10);
    boolean y1=(x1==10);
    System.out.println(y1);

    //Booleans with equal sign for comparing STRING
    String myText1="username is anna";
    String name1="Username is anna";
    System.out.println(myText1==name1);

    //EqualsIgnoreCase()
    String str1="Orange";
    String str2="orange";
    boolean str3=str1.equalsIgnoreCase(str2);
    System.out.println(str3);
    System.out.println(str1.equalsIgnoreCase(str2));
    //returns true

    //replace() method replaces occurrences
     String valu1="iPhone is the best, we love iPhone";
     System.out.println(valu1.replace('i', '$'));
     System.out.println(valu1.replaceAll("iPhone", "Android"));
     System.out.println(valu1.replaceFirst("iPhone", "Android"));

     //Exercise
     String value4="username is Anna";
     String value5="anna";
     System.out.println(value4.substring(12));
     String value6=(value4.substring(12)); //Anna
     System.out.println(value6);
     boolean value7=value5.equalsIgnoreCase(value6);
     System.out.println(value7);




    }}
