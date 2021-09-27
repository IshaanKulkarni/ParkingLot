import java.util.*;
import java.sql.Timestamp;
public class parkinglot{
    public static void main(String[] args){
        Bike B=new Bike();
        ElectricCar EC=new ElectricCar();
        Heavy H=new Heavy();
        Car C=new Car();
        ElectricBike EB=new ElectricBike();
        Arrays.fill(C.Spotsfilled,false);
        Arrays.fill(C.HandicappedSpotsfilled,false);
        Arrays.fill(B.Spotsfilled,false);
        Arrays.fill(B.HandicappedSpotsfilled,false);
        Arrays.fill(EC.Spotsfilled,false);
        Arrays.fill(EC.HandicappedSpotsfilled,false);
        Arrays.fill(H.Spotsfilled,false);
        Arrays.fill(H.HandicappedSpotsfilled,false);
        Arrays.fill(EB.Spotsfilled,false);
        Arrays.fill(EB.HandicappedSpotsfilled,false);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the type of vehicle");
        String s=sc.nextLine();
        while(!s.equals("ExitTheProcess")){
            if(s.equals("Bike")){
                System.out.println("Welcome to the Parking Lot!");
                System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
                int handicapped=sc.nextInt();
                System.out.println("Please select an option from the below menu:");
                System.out.println("1-Park a vehicle");
                System.out.println("2-Remove your vehicle");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    if(handicapped==1){
                      System.out.println("Please Enter your Vehicle Number");
                      String VehicleNumber=sc.nextLine();
                      int j=B.HandicappedPark(VehicleNumber);
                      if(j==-1){
                          System.out.println("Slots are Full");
                      }
                      else{
                          System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                          System.out.println("Please remember the spot number for all future references. The same has been printed on your token!");
                      }
                      System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                        int j=B.Park(VehicleNumber);
                        if(j==-1){
                            System.out.println("Slots are Full");
                        }
                        else{
                            System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                else{
                    if(handicapped==1){
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=B.HandicappedRemove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         
                         long HandicappedCaluclate=B.HandicappedCaluclate(k);
                        B.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                            }

                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=B.Remove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                        long Caluclate=B.Caluclate(k);
                        B.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(Caluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(Caluclate));
                            }
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                }
                
            }
            else if(s.equals("ElectricCar")){
                System.out.println("Welcome to the Parking Lot!");
                System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
                int handicapped=sc.nextInt();
                System.out.println("Please select an option from the below menu:");
                System.out.println("1-Park a vehicle");
                System.out.println("2-Remove your vehicle");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    if(handicapped==1){
                      System.out.println("Please Enter your Vehicle Number");
                      String VehicleNumber=sc.nextLine();
                      int j=EC.HandicappedPark(VehicleNumber);
                      if(j==-1){
                          System.out.println("Slots are Full");
                      }
                      else{
                          System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                          System.out.println("Please remember your slot number for all future references. Same has been printed on your token!");
                      }
                      System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                        int j=EC.Park(VehicleNumber);
                        if(j==-1){
                            System.out.println("Slots are Full");
                        }
                        else{
                            System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                }
                else{
                    if(handicapped==1){
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=EC.HandicappedRemove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         System.out.println("Please enter the time for charging");
                         int time=sc.nextInt();
                         long HandicappedChargingFare= EC.HandicappedChargingFare(k, time);
                         long HandicappedCaluclate=EC.HandicappedCaluclate(k);
                        EC.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(HandicappedCaluclate+HandicappedChargingFare));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(HandicappedCaluclate+HandicappedChargingFare));
                            }

                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=EC.Remove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         System.out.println("Please enter the time for charging");
                        int time=sc.nextInt();
                         long ChargingFare= EC.ChargingFare(k, time);
                        long Caluclate=EC.Caluclate(k);
                        EC.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(Caluclate+ChargingFare));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(Caluclate+ChargingFare));
                            }
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                
            }

            else if(s.equals("Heavy Vehicle")){
                System.out.println("Welcome to the Parking Lot!");
                System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
                int handicapped=sc.nextInt();
                System.out.println("Please select an option from the below menu:");
                System.out.println("1-Park a vehicle");
                System.out.println("2-Remove your vehicle");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    if(handicapped==1){
                      System.out.println("Please Enter your Vehicle Number");
                      String VehicleNumber=sc.nextLine();
                      int j=H.HandicappedPark(VehicleNumber);
                      if(j==-1){
                          System.out.println("Slots are Full");
                      }
                      else{
                          System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                          System.out.println("Please remember your soly number for all future references. Same is printed on your token!");
                      }
                      System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                        int j=H.Park(VehicleNumber);
                        if(j==-1){
                            System.out.println("Slots are Full");
                        }
                        else{
                            System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                else{
                    if(handicapped==1){
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=H.HandicappedRemove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         
                         long HandicappedCaluclate=H.HandicappedCaluclate(k);
                        H.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                            }

                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=H.Remove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                        long Caluclate=H.Caluclate(k);
                        H.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(Caluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(Caluclate));
                            }
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                }
                
            }

            else if(s.equals("Car")){
                System.out.println("Welcome to the Parking Lot!");
                System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
                int handicapped=sc.nextInt();
                System.out.println("Please select an option from the below menu:");
                System.out.println("1-Park a vehicle");
                System.out.println("2-Remove your vehicle");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    if(handicapped==1){
                      System.out.println("Please Enter your Vehicle Number");
                      String VehicleNumber=sc.nextLine();
                      int j=C.HandicappedPark(VehicleNumber);
                      if(j==-1){
                          System.out.println("Slots are Full");
                      }
                      else{
                          System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                          System.out.println("Please rememebr the spot number for all future references. The same has been printed on your token!");
                      }
                      System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                        int j=C.Park(VehicleNumber);
                        if(j==-1){
                            System.out.println("Slots are Full");
                        }
                        else{
                            System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                else{
                    if(handicapped==1){
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=C.HandicappedRemove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         
                         long HandicappedCaluclate=C.HandicappedCaluclate(k);
                        C.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(HandicappedCaluclate));
                            }

                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=C.Remove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                        long Caluclate=C.Caluclate(k);
                        C.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(Caluclate));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(Caluclate));
                            }
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                
            }

            else if(s.equals("ElectricBike")){
                System.out.println("Welcome to the Parking Lot!");
                System.out.println("Do you need a handicapped spot?(1-YES/2-NO)");
                int handicapped=sc.nextInt();
                System.out.println("Please select an option from the below menu:");
                System.out.println("1-Park a vehicle");
                System.out.println("2-Remove your vehicle");
                int a=sc.nextInt();
                sc.nextLine();
                if(a==1){
                    if(handicapped==1){
                      System.out.println("Please Enter your Vehicle Number");
                      String VehicleNumber=sc.nextLine();
                      int j=EB.HandicappedPark(VehicleNumber);
                      if(j==-1){
                          System.out.println("Slots are Full");
                      }
                      else{
                          System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                          System.out.println("Please remember your slot number for all future references. Same has been printed on your token!");
                      }
                      System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                        int j=EB.Park(VehicleNumber);
                        if(j==-1){
                            System.out.println("Slots are Full");
                        }
                        else{
                            System.out.println("Your vehicle is successfully parked at:"+(j+1)+"th spot");
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                }
                else{
                    if(handicapped==1){
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=EB.HandicappedRemove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         System.out.println("Please enter the time for charging");
                         int time=sc.nextInt();
                         long HandicappedChargingFare= EB.HandicappedChargingFare(k, time);
                         long HandicappedCaluclate=EB.HandicappedCaluclate(k);
                        EB.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(HandicappedCaluclate+HandicappedChargingFare));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(HandicappedCaluclate+HandicappedChargingFare));
                            }

                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    else{
                        System.out.println("Please Enter your Vehicle Number");
                        String VehicleNumber=sc.nextLine();
                         int k=EB.Remove(VehicleNumber);
                         if(k==-1){
                             System.out.println("There is no vehicle with that number");
                             System.out.println("Please Enter type of Vehicle");
                             s=sc.nextLine();
                             continue;
                         }
                         System.out.println("Please enter the time for charging");
                        int time=sc.nextInt();
                         long ChargingFare= EB.ChargingFare(k, time);
                        long Caluclate=EB.Caluclate(k);
                        EB.Pay();
                        int l=sc.nextInt();
                        if(l==1||l==2){
                            System.out.println("Amount to be paid:"+(Caluclate+ChargingFare));
                        }
                        else{
                            System.out.println("Please enter a valid paying method");
                             int m=sc.nextInt();
                            if(m==1||m==2){
                                System.out.println("Amount to be paid:"+(Caluclate+ChargingFare));
                            }
                        }
                        System.out.println("Please enter the type of vehicle");
                    }
                    
                }
                
            }
           
            s=sc.nextLine();
        }


    }
}
interface Floor{
    public int Park(String s);
    public int HandicappedPark(String s);
    public int Remove(String s);
    public int HandicappedRemove(String s);
    public void Pay();
    public long Caluclate(int i);
    public long HandicappedCaluclate(int i);
}

class Bike implements Floor{
    Timestamp time =new Timestamp(0);
    static int spots=100;
    static int handicappedspots=20;
    public Boolean Spotsfilled[]=new Boolean[spots];
    public Boolean HandicappedSpotsfilled[]=new Boolean[handicappedspots];
    public static String VehicleNumber[]=new String[spots];
    public static String HandicappedVehicleNumber[]=new String[handicappedspots];
    public Timestamp EnteringTime[]=new Timestamp[spots];
    public Timestamp LeavingTime[]=new Timestamp[spots];
    public Timestamp HandicappedEnteringTime[] =new Timestamp[handicappedspots];
    public Timestamp HandicappedLeavingTime[]=new Timestamp[handicappedspots];
    public int Park(String s){
        for(int i=0;i<spots;i++){
            if(!Spotsfilled[i]){
                  Spotsfilled[i]=true;
                  VehicleNumber[i]=s;
                  EnteringTime[i]=new Timestamp(System.currentTimeMillis());
                  return i;
            }

        }
        return -1;
    }
    public int HandicappedPark(String s){
        for(int i=0;i<handicappedspots;i++){
            if(!HandicappedSpotsfilled[i]){
                HandicappedSpotsfilled[i]=true;
                HandicappedVehicleNumber[i]=s;
                HandicappedEnteringTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
            
        }
        return -1;
    }
    public int Remove(String s){
        for(int i=0;i<spots;i++){
            if(s.equals(VehicleNumber[i])){
                Spotsfilled[i]=false;
                LeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    public int HandicappedRemove(String s){
        for(int i=0;i<handicappedspots;i++){
            if(s.equals(HandicappedVehicleNumber[i])){
                HandicappedSpotsfilled[i]=false;
                HandicappedLeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    
    public long Caluclate(int i){
        System.out.println("Bike entered the parking lot at:" +EnteringTime[i]);
        System.out.println("Bike left the parking lot at:" +LeavingTime[i]);
         long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=10;
        }
        if(timespan==2){
            cost=17;
        }
        if(timespan>2){
            cost=17+5*(timespan-2);
        }

        return cost;
    }
    public long HandicappedCaluclate(int i){
        System.out.println("Bike entered the parking lot at:" +HandicappedEnteringTime[i]);
        System.out.println("Bike left the parking lot at:" +HandicappedLeavingTime[i]);
          long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=10;
        }
        if(timespan==2){
            cost=17;
        }
        if(timespan>2){
            cost=17+5*(timespan-2);
        }

        return cost;
    }
    public void Pay(){
        System.out.println("Please chose an option to pay!");
        System.out.println("Credit/Debit card-1");
        System.out.println("Cash-2");
    }
    
}

class ElectricCar implements Floor
{
    Timestamp time =new Timestamp(0);
    static int spots=50;
    static int handicappedspots=10;
    public Boolean Spotsfilled[]=new Boolean[spots];
    public Boolean HandicappedSpotsfilled[]=new Boolean[handicappedspots];
    public static String VehicleNumber[]=new String[spots];
    public static String HandicappedVehicleNumber[]=new String[handicappedspots];
    public Timestamp EnteringTime[]=new Timestamp[spots];
    public Timestamp LeavingTime[]=new Timestamp[spots];
    public Timestamp HandicappedEnteringTime[] =new Timestamp[handicappedspots];
    public Timestamp HandicappedLeavingTime[]=new Timestamp[handicappedspots];
    public int Park(String s){
        for(int i=0;i<spots;i++){
            if(!Spotsfilled[i]){
                  Spotsfilled[i]=true;
                  VehicleNumber[i]=s;
                  EnteringTime[i]=new Timestamp(System.currentTimeMillis());
                  return i;
            }

        }
        return -1;
    }
    public int HandicappedPark(String s){
        for(int i=0;i<handicappedspots;i++){
            if(!HandicappedSpotsfilled[i]){
                HandicappedSpotsfilled[i]=true;
                HandicappedVehicleNumber[i]=s;
                HandicappedEnteringTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
            
        }
        return -1;
    }
    public int Remove(String s){
        for(int i=0;i<spots;i++){
            if(s.equals(VehicleNumber[i])){
                Spotsfilled[i]=false;
                LeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    public int HandicappedRemove(String s){
        for(int i=0;i<handicappedspots;i++){
            if(s.equals(HandicappedVehicleNumber[i])){
                HandicappedSpotsfilled[i]=false;
                HandicappedLeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    public void Pay(){
        System.out.println("Please select an option to pay!");
        System.out.println("Credit/Debit card-1");
        System.out.println("Cash-2");

    }
    public long Caluclate(int i){
        System.out.println("Electric Car entered the parking lot at:" +EnteringTime[i]);
        System.out.println("Electric Car left the parking lot at:" +LeavingTime[i]);
         long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=15;
        }
        if(timespan==2){
            cost=25;
        }
        if(timespan>2){
            cost=25+5*(timespan-2);
        }

        return cost;
    }
    public long HandicappedCaluclate(int i){
        System.out.println("Electric Car entered the parking lot at:" +HandicappedEnteringTime[i]);
        System.out.println("Electric Car left the parking lot at:" +HandicappedLeavingTime[i]);
          long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=12;
        }
        if(timespan==2){
            cost=20;
        }
        if(timespan>2){
            cost=20+4*(timespan-2);
        }

        return cost;
    }
    public long HandicappedChargingFare(int i,int time){
        long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
        if(time>timespan){
            return timespan*10;
        }
            return time*10;
    }
    public long ChargingFare(int i,int time){
        long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
        if(time>timespan){
            return timespan*10;
        }
            return time*10;
    }
}

    class Heavy implements Floor{
        Timestamp time =new Timestamp(0);
        static int spots=100;
        static int handicappedspots=20;
        public Boolean Spotsfilled[]=new Boolean[spots];
        public Boolean HandicappedSpotsfilled[]=new Boolean[handicappedspots];
        public static String VehicleNumber[]=new String[spots];
        public static String HandicappedVehicleNumber[]=new String[handicappedspots];
        public Timestamp EnteringTime[]=new Timestamp[spots];
        public Timestamp LeavingTime[]=new Timestamp[spots];
        public Timestamp HandicappedEnteringTime[] =new Timestamp[handicappedspots];
        public Timestamp HandicappedLeavingTime[]=new Timestamp[handicappedspots];
        public int Park(String s){
            for(int i=0;i<spots;i++){
                if(!Spotsfilled[i]){
                      Spotsfilled[i]=true;
                      VehicleNumber[i]=s;
                      EnteringTime[i]=new Timestamp(System.currentTimeMillis());
                      return i;
                }
    
            }
            return -1;
        }
        public int HandicappedPark(String s){
            for(int i=0;i<handicappedspots;i++){
                if(!HandicappedSpotsfilled[i]){
                    HandicappedSpotsfilled[i]=true;
                    HandicappedVehicleNumber[i]=s;
                    HandicappedEnteringTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
                
            }
            return -1;
        }
        public int Remove(String s){
            for(int i=0;i<spots;i++){
                if(s.equals(VehicleNumber[i])){
                    Spotsfilled[i]=false;
                    LeavingTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
            }
            return -1;
        }
        public int HandicappedRemove(String s){
            for(int i=0;i<handicappedspots;i++){
                if(s.equals(HandicappedVehicleNumber[i])){
                    HandicappedSpotsfilled[i]=false;
                    HandicappedLeavingTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
            }
            return -1;
        }
        
        public long Caluclate(int i){
            System.out.println("Heavy_Vehicle entered the parking lot at:" +EnteringTime[i]);
            System.out.println("Heavy_Vehicle left the parking lot at:" +LeavingTime[i]);
             long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
            long cost=0;
            if(timespan==1){
                cost=10;
            }
            if(timespan==2){
                cost=17;
            }
            if(timespan>2){
                cost=17+5*(timespan-2);
            }
    
            return cost;
        }
        public long HandicappedCaluclate(int i){
            System.out.println("Heavy Vehicle entered the parking lot at:" +HandicappedEnteringTime[i]);
            System.out.println("Heavy Vehicle left the parking lot at:" +HandicappedLeavingTime[i]);
              long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
            long cost=0;
            if(timespan==1){
                cost=10;
            }
            if(timespan==2){
                cost=17;
            }
            if(timespan>2){
                cost=17+5*(timespan-2);
            }
    
            return cost;
        }
        public void Pay(){
            System.out.println("Please chose an option to pay!");
            System.out.println("Credit/Debit card-1");
            System.out.println("Cash-2");
        }
        
    }


    class Car implements Floor{
        Timestamp time =new Timestamp(0);
        static int spots=100;
        static int handicappedspots=20;
        public Boolean Spotsfilled[]=new Boolean[spots];
        public Boolean HandicappedSpotsfilled[]=new Boolean[handicappedspots];
        public static String VehicleNumber[]=new String[spots];
        public static String HandicappedVehicleNumber[]=new String[handicappedspots];
        public Timestamp EnteringTime[]=new Timestamp[spots];
        public Timestamp LeavingTime[]=new Timestamp[spots];
        public Timestamp HandicappedEnteringTime[] =new Timestamp[handicappedspots];
        public Timestamp HandicappedLeavingTime[]=new Timestamp[handicappedspots];
        public int Park(String s){
            for(int i=0;i<spots;i++){
                if(!Spotsfilled[i]){
                      Spotsfilled[i]=true;
                      VehicleNumber[i]=s;
                      EnteringTime[i]=new Timestamp(System.currentTimeMillis());
                      return i;
                }
    
            }
            return -1;
        }
        public int HandicappedPark(String s){
            for(int i=0;i<handicappedspots;i++){
                if(!HandicappedSpotsfilled[i]){
                    HandicappedSpotsfilled[i]=true;
                    HandicappedVehicleNumber[i]=s;
                    HandicappedEnteringTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
                
            }
            return -1;
        }
        public int Remove(String s){
            for(int i=0;i<spots;i++){
                if(s.equals(VehicleNumber[i])){
                    Spotsfilled[i]=false;
                    LeavingTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
            }
            return -1;
        }
        public int HandicappedRemove(String s){
            for(int i=0;i<handicappedspots;i++){
                if(s.equals(HandicappedVehicleNumber[i])){
                    HandicappedSpotsfilled[i]=false;
                    HandicappedLeavingTime[i]=new Timestamp(System.currentTimeMillis());
                    return i;
                }
            }
            return -1;
        }
        
        public long Caluclate(int i){
            System.out.println("Car entered the parking lot at:" +EnteringTime[i]);
            System.out.println("Car left the parking lot at:" +LeavingTime[i]);
             long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
            long cost=0;
            if(timespan==1){
                cost=10;
            }
            if(timespan==2){
                cost=17;
            }
            if(timespan>2){
                cost=17+5*(timespan-2);
            }
    
            return cost;
        }
        public long HandicappedCaluclate(int i){
            System.out.println("Car entered the parking lot at:" +HandicappedEnteringTime[i]);
            System.out.println("Car left the parking lot at:" +HandicappedLeavingTime[i]);
              long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
            long cost=0;
            if(timespan==1){
                cost=10;
            }
            if(timespan==2){
                cost=17;
            }
            if(timespan>2){
                cost=17+5*(timespan-2);
            }
    
            return cost;
        }
        public void Pay(){
            System.out.println("Please chose an option to pay!");
            System.out.println("Credit/Debit card-1");
            System.out.println("Cash-2");
        }
        
    }

    class ElectricBike implements Floor
{
    Timestamp time =new Timestamp(0);
    static int spots=50;
    static int handicappedspots=10;
    public Boolean Spotsfilled[]=new Boolean[spots];
    public Boolean HandicappedSpotsfilled[]=new Boolean[handicappedspots];
    public static String VehicleNumber[]=new String[spots];
    public static String HandicappedVehicleNumber[]=new String[handicappedspots];
    public Timestamp EnteringTime[]=new Timestamp[spots];
    public Timestamp LeavingTime[]=new Timestamp[spots];
    public Timestamp HandicappedEnteringTime[] =new Timestamp[handicappedspots];
    public Timestamp HandicappedLeavingTime[]=new Timestamp[handicappedspots];
    public int Park(String s){
        for(int i=0;i<spots;i++){
            if(!Spotsfilled[i]){
                  Spotsfilled[i]=true;
                  VehicleNumber[i]=s;
                  EnteringTime[i]=new Timestamp(System.currentTimeMillis());
                  return i;
            }

        }
        return -1;
    }
    public int HandicappedPark(String s){
        for(int i=0;i<handicappedspots;i++){
            if(!HandicappedSpotsfilled[i]){
                HandicappedSpotsfilled[i]=true;
                HandicappedVehicleNumber[i]=s;
                HandicappedEnteringTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
            
        }
        return -1;
    }
    public int Remove(String s){
        for(int i=0;i<spots;i++){
            if(s.equals(VehicleNumber[i])){
                Spotsfilled[i]=false;
                LeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    public int HandicappedRemove(String s){
        for(int i=0;i<handicappedspots;i++){
            if(s.equals(HandicappedVehicleNumber[i])){
                HandicappedSpotsfilled[i]=false;
                HandicappedLeavingTime[i]=new Timestamp(System.currentTimeMillis());
                return i;
            }
        }
        return -1;
    }
    public void Pay(){
        System.out.println("Please select an option to pay!");
        System.out.println("Credit/Debit card-1");
        System.out.println("Cash-2");

    }
    public long Caluclate(int i){
        System.out.println("Electric Bike entered the parking lot at:" +EnteringTime[i]);
        System.out.println("Electric Bike left the parking lot at:" +LeavingTime[i]);
         long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=15;
        }
        if(timespan==2){
            cost=25;
        }
        if(timespan>2){
            cost=25+5*(timespan-2);
        }

        return cost;
    }
    public long HandicappedCaluclate(int i){
        System.out.println("Electric Bike entered the parking lot at:" +HandicappedEnteringTime[i]);
        System.out.println("Electric Bike left the parking lot at:" +HandicappedLeavingTime[i]);
          long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
        long cost=0;
        if(timespan==1){
            cost=12;
        }
        if(timespan==2){
            cost=20;
        }
        if(timespan>2){
            cost=20+4*(timespan-2);
        }

        return cost;
    }
    public long HandicappedChargingFare(int i,int time){
        long timespan=(HandicappedLeavingTime[i].getTime()-HandicappedEnteringTime[i].getTime())/1000;
        if(time>timespan){
            return timespan*10;
        }
            return time*10;
    }
    public long ChargingFare(int i,int time){
        long timespan=(LeavingTime[i].getTime()-EnteringTime[i].getTime())/1000;
        if(time>timespan){
            return timespan*10;
        }
            return time*10;
    }
}
