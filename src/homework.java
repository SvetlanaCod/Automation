    public class homework {
    public static void main (String[] args) {
        //1
    String a="January";
    String b="February";
    String c="March";
    String d="April";
    String e="May";
    String f="June";
    String g="July";
    String h="August";
    String i="September";
    String j="October";
    String k="November";
    String l="December";
    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l);
        //2
    System.out.println(k.toUpperCase());
        //3
    System.out.println("The month length is "+k.length()+" characters");
        //4
    System.out.println(k.length());
    System.out.println(j.length());
        //5
    boolean comp=k.length()==j.length();
    System.out.println(comp);

        //6
    String cookie="November";
    System.out.println(cookie.substring(0,3));
        //7
    String txt="November";
    String txt1="October";
    System.out.println(txt==txt1);
        //8
    String name="OLGA123";
    String name2="Olga123";
    System.out.println(name.equalsIgnoreCase(name2));
        //9
    String username="Yor username is Anna";
    String Alex=username.replace("Anna","Alex");
    System.out.println(username);
    System.out.println(Alex);
       //10
    int po1=250;
    int po2=500;
    int total=(po1+po2);
    System.out.println(total);
    System.out.println(po2>po1);



    }}
