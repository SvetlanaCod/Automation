public class LoopClass {
    public static void main (String[] args) {

    for (int i=0; i<5; i++) {
    System.out.println("Value of i: " + i);
    }

    for(int a=1;a<=10;a++){
    System.out.println(a);
    }
    for(int b=1;b<=10;b=b+2) {
        System.out.println(b);
    }

    //Create loop for orders number 1 to 20
    for (int c = 1; c <= 20; c++) {
    System.out.println("Odd number is" + " " +c);
    }


     //Create loop for only opening even orders up to
    for(int d=0;d<=10;d=d+2){
    System.out.println("order number is" +" "+d);
    }

    //loop for array
    //Create any numbers array
    int[]numbers=new int[4];
    numbers[0]=5;
    numbers[1]=3;
    numbers[2]=9;
    numbers[3]=-10;

    //for each loop
    for(int allnumbers: numbers) {
    System.out.println(allnumbers);
    }


    //Text array
    String[]countries =new String[5];
    countries[0]="Russia";
    countries[1]="Canada";
    countries[2]="France";
    countries[3]="Greece";
    countries[4]="Turkey";
    System.out.println(countries[0]+" "+countries[1]+" "+countries[2]+" "+countries[3]+" "+countries[4]);
    //loop
    for(String countries5: countries) {
    System.out.println(countries5);
    }
    System.out.println(countries.length);


        //Home Work
        String[]profession =new String[4];
        profession[0]="QA";
        profession[1]="Teacher";
        profession[2]="Contractor";
        profession[3]="Automation QA";
        System.out.println(profession[0]+" "+profession[1]+" "+profession[2]+" "+profession[3]);

        String[]salary =new String[4];
        salary[0]="50-90";
        salary[1]="40-70";
        salary[2]="65-85";
        salary[3]="90-120";
        System.out.println(salary[0]+" "+salary[1]+" "+salary[2]+" "+salary[3]);
        System.out.println(profession[3]+" salary "+salary[3]);

        for(String allprofessions:profession){
            System.out.println(allprofessions);
        }
        for(String allsalary:salary){
            System.out.println(allsalary);
        }

        String cookie ="username is Natasha";
        String username ="Natasha";
        if (username.equalsIgnoreCase(cookie.substring(12,19))){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }
        //IF statement with arrays
        String[]paymentmethod =new String[6];
        paymentmethod[0]="cash";
        paymentmethod[1]="credit card";
        paymentmethod[2]="cheque";
        paymentmethod[3]="debit card";
        paymentmethod[4]="gift card";
        paymentmethod[5]="pay pall";
        System.out.println(paymentmethod.length);
        for(String allpaymentmethod:paymentmethod){
            System.out.println(allpaymentmethod);
        }
        if (paymentmethod[0]=="cash"){
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }





    }}










