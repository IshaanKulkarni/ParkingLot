import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.sql.Timestamp;

public class parkinglot{
    public static void main(String[] args){
        Bike b1=new Bike();
        Arrays.fill(b1.Spots,false);
        Arrays.fill(b1.Handicapped,false);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=10000;i++){
        System.out.println("Welcome to the Parking Lot!");
        System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
        int handicapped=sc.nextInt();
        System.out.println("Please select an option from the below menu:");
        System.out.println("1-Park a vehicle");
        System.out.println("2-Remove your vehicle");
        int a=sc.nextInt();
        if(a==2){
            if(handicapped==2){
            System.out.println("Please enter your spot/token number::");
            int token=sc.nextInt();
            if(b1.Spots[token]==true){
            b1.Remove(token);
            System.out.println("Your bill amounts to:: "+b1.Calculate(token));
            b1.Pay();
            int b=sc.nextInt();
            if(b==1||b==2){
                b1.Payed(b);
            }
            else{
                System.out.println("Please enter a valid payment method:1 or 2: ");
                int c=sc.nextInt();
                b1.Payed(c);

            }
        
        }
        else{
            System.out.println("No Vehicle parked here as of now!");
        }
    }

    if(handicapped==1){
        System.out.println("Please enter your spot/token number::");
            int token=sc.nextInt();
            if(b1.Handicapped[token]==true){
            b1.Hremove(token);
            System.out.println("Your bill amounts to:: "+b1.Calculate(token));
            b1.Pay();
            int b=sc.nextInt();
            if(b==1||b==2){
                b1.Payed(b);
            }
            else{
                System.out.println("Please enter a valid payment method:1 or 2: ");
                int c=sc.nextInt();
                b1.Payed(c);

            }
        
        }
        else{
            System.out.println("No Vehicle parked here as of now!");
        }
    }

}

        if(a==1){
            if(handicapped==2){
            System.out.println("Please Enter your vehicle type: ");
            System.out.println("1.Bike");

            int k=sc.nextInt();
            if(k==1){
                System.out.println("Please enter your bike number:");
                String s=sc.next();
                b1.Park(s);
                if(b1.Park(s)>=0){
                System.out.println("Your bike has been parked. The spot number is: "+b1.Park(s));
                System.out.println("Please remember this number for all future references. Same has been printed on the token!");
                b1.settime(b1.Park(s));
                }
                else{
                    System.out.println("Sorry Lot full!");
                }
            }
        }
    
    if(handicapped==1){
        System.out.println("Please Enter your vehicle type: ");
            System.out.println("1.Bike");

            int k=sc.nextInt();
            if(k==1){
                System.out.println("Please enter your bike number:");
                String s=sc.next();
                b1.Hpark(s);
                if(b1.Hpark(s)>=0){
                System.out.println("Your bike has been parked. The spot number is: "+b1.Hpark(s));
                System.out.println("Please remember this number for all future references. Same has been printed on the token!");
                b1.Hsettime(b1.Park(s));
                }
                else{
                    System.out.println("Sorry Lot full!");
                }
            }
    }
    }
}
}
}

interface Floor{
    public int Park(String s);
    public void settime(int i);
    public void Remove(int i);
    public long Calculate(int i);
    public void Pay();
    public void Payed(int i);
}

class Bike implements Floor{
    Timestamp ts1=Timestamp.valueOf("2021-09-01 09:01:16");
    int spots=100;
    int hspots=20;
    boolean Spots[]=new boolean[spots];
    boolean Handicapped[]=new boolean[hspots];
    long intime[]=new long [spots];
    long outtime[]=new long [spots];
    long hintime[]=new long [hspots];
    long houttime[]=new long [hspots];
    public int Park(String s){
        for(int i=0;i<spots;i++){
            if(Spots[i]==false){
                Spots[i]=true;
                return i;
            }
        }
        return -1;
    }
    public int Hpark(String s){
        for(int i=0;i<=hspots;i++){
        if(Handicapped[i]==false){
            Handicapped[i]=true;
            return i;
        }
    }
        return -1;
    }
    public void Remove(int i){
        outtime[i]=ts1.getTime();
        Spots[i]=false;
        System.out.println("Your car has been successfully unparked!");
    }
    public void Hremove(int i){
        houttime[i]=ts1.getTime();
        Handicapped[i]=false;
        System.out.println("Your car has been successfully unparked!");
    }
    public long Calculate(int i){
        long time=((outtime[i]-intime[i])/1000);
        long cost=0;
        if(time==1){
            cost=10;
        }
        if(time==2){
            cost=17;
        }
        if(time>2){
            cost=17+5*(time-2);
        }

        return cost;
    }
    public void Pay(){
        System.out.println("Please chose an option to pay!");
        System.out.println("Credit/Delit card-1");
        System.out.println("Cash-2");
    }
    public void Payed(int i){
        if(i==1||i==2){
            System.out.println("Payment done successfully!");
        }
        else{
            System.out.println("Please enter a valid paying method!");
        }
    }
    public void settime(int i){
        intime[i]=ts1.getTime();
    }
    public void Hsettime(int i){
        hintime[i]=ts1.getTime();
    }
}
