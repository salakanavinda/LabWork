package LAB;

import java.util.Scanner;

public class Frog{

private int hoops;
private int time;

public void sethoops(int hoops){
this.hoops=hoops;
}
public void settime(int time){
this.time=time;
}
public String toString(){
return "No of Hoops :"+this.hoops+"/n"+"Time to Jumps :"+this.time;
}
}

public class FrogJump{

public static String CalculateJumpsAndTime(int distance){
 Frog frog = new Frog();
 int hoops=0;
 int time=0;

 while(distance>0){
    if(distance<5){
       hoops++;
       distance--;
      } 
    if(distance>=5){
       hoop++;
       time=time+2;
       distance=distance-5;
       if(distance>=3){
          hoops++;
          time=time+2;
          distance=distance-3;
       }
       if(distance>=2){
          hoops++;
          time=time+5;
          distance=distance-2;
        }
     }
 }
 frog.sethoops(hoops);
 frog.settime(time);
 
 return frog.toString();
}

public static void main(String[] args){

Scanner userIn = new Scanner();
int distance = uersIn.nextInt();
System.out.println(CalculateJumpsAndTime(distance));
}
}