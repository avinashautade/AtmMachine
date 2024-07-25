import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class AtmMachine {

    Float Balnce=0.0F;
    Integer pin=5674;

    public void checkpin(){

        System.out.println("plz enter ur pin");

        Scanner sc = new Scanner(System.in);

        int enterdpin= sc.nextInt();

        if(enterdpin==pin)
        {
            menu();
        }
        else {
            System.out.println("enterd valid pin");
            checkpin();
        }

    }

    public void  menu()
    {

        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposite Money ");
        System.out.println("4. Exite");


        Scanner sc = new Scanner(System.in);

        int opt = sc.nextInt();


        if(opt==1){
            ChakeBalnce();

        } else if (opt==2) {

            withdrawMoney();

        } else if (opt==3) {
            depositeMoney();

        }
        else if (opt==4)
        {

          return;

        }
        else
        {
            System.out.println("enter valid opation:");
            menu();
        }



    }

    public void ChakeBalnce(){
        System.out.println("your balnce"+Balnce);
        menu();

    }

     public  void  withdrawMoney(){

        System.out.println("plz enter your withdraw Amount:");

        Scanner sc = new Scanner(System.in);

        float amount= sc.nextInt();

        if(amount> Balnce){

            System.out.println("balnce is low .. ur current balnce is"+Balnce);

        }
        else {
            Balnce= amount-Balnce;
            System.out.println("successfully withdraw money from ur account");
            System.out.println("now ur current balnce is"+Balnce);
        }

        menu();

     }

     public  void depositeMoney(){

        System.out.println("plz enter deposite amount");
        Scanner sc = new Scanner(System.in);
        float depoAmount= sc.nextInt();

        if(depoAmount >=0){
            Balnce=depoAmount+Balnce;
            System.out.println("Congratualtion money is deposited in ur account");
        }
        else {
            System.out.println("plz enter valid depoAmount");
        }

        menu();

     }



}
