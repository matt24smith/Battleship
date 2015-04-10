import java.util.Random;
import java.util.*;

public class AIPlayer {

	public static String[][] ships = new String[3][4];
   public static int[] shipLocation = new int[2];
   public static String[] atkLocation = new String[2];
   public static int[] attackLocation = new int[2];
   public static boolean[][] alreadyAttacked = new boolean[8][8];
   public static boolean A1,A2,A3,A4,A5,A6,A7,A8,B1,B2,B3,B4,B5,B6,B7,B8,C1,C2,C3,C4,C5,C6,C7,C8,D1,D2,D3,D4,D5,D6,D7,D8,E1,E2,E3,E4,E5,E6,E7,E8,F1,F2,F3,F4,F5,F6,F7,F8,G1,G2,G3,G4,G5,G6,G7,G8,H1,H2,H3,H4,H5,H6,H7,H8;
   
   private static int shipsCreated = 0;

	public AIPlayer(){}
   
   public AIPlayer(boolean bool){
      A1 = bool;A2 = bool;A3 = bool;A4 = bool;A5 = bool;A6 = bool;A7 = bool;A8 = bool;
      B1 = bool;B2 = bool;B3 = bool;B4 = bool;B5 = bool;B6 = bool;B7 = bool;B8 = bool;
      C1 = bool;C2 = bool;C3 = bool;C4 = bool;C5 = bool;C6 = bool;C7 = bool;C8 = bool;
      D1 = bool;D2 = bool;D3 = bool;D4 = bool;D5 = bool;D6 = bool;D7 = bool;D8 = bool;
      E1 = bool;E2 = bool;E3 = bool;E4 = bool;E5 = bool;E6 = bool;E7 = bool;E8 = bool;
      F1 = bool;F2 = bool;F3 = bool;F4 = bool;F5 = bool;F6 = bool;F7 = bool;F8 = bool;
      G1 = bool;G2 = bool;G3 = bool;G4 = bool;G5 = bool;G6 = bool;G7 = bool;G8 = bool;
      H1 = bool;H2 = bool;H3 = bool;H4 = bool;H5 = bool;H6 = bool;H7 = bool;H8 = bool;}
   
   public static String[][] createShips(){
   
      if(shipsCreated==0){
      int x = 0;
      int y = 0;
      int r = 1;
      
      Random random = new Random();
      
      for(int i=0;i<3;i++){//Determine coords for boats + place boats
         r = random.nextInt(2)+1;//Rotated 1-Vert 2-Horz
         
         if(i==0){//Aircraft
            if(r==1){
               x = random.nextInt((8-1)+1)+1;//Letter coord
               y = random.nextInt((5-1)+1)+1;}//Number coord
         
            else if(r==2){
               x = random.nextInt((5-1)+1)+1;//Letter coord
               y = random.nextInt((8-1)+1)+1;}//Number coord
         }
         
         else if(i==1){//Destroyer
            if(r==1){
               x = random.nextInt((8-1)+1)+1;//Letter coord
               y = random.nextInt((6-1)+1)+1;}//Number coord
         
            else if(r==2){
               x = random.nextInt((6-1)+1)+1;//Letter coord
               y = random.nextInt((8-1)+1)+1;}//Number coord
         }
         
         else if(i==2){//Submarine
            if(r==1){
               x = random.nextInt((8-1)+1)+1;//Letter coord
               y = random.nextInt((7-1)+1)+1;}//Number coord
         
            else if(r==2){
               x = random.nextInt((7-1)+1)+1;//Letter coord
               y = random.nextInt((8-1)+1)+1;}//Number coord
         }
            
            if(x==1){
               shipLocation[0]=1;}
            else if (x==2){
               shipLocation[0]=2;}
            else if (x==3){
               shipLocation[0]=3;}
            else if (x==4){
               shipLocation[0]=4;}
            else if (x==5){
               shipLocation[0]=5;}
            else if (x==6){
               shipLocation[0]=6;}
            else if (x==7){
               shipLocation[0]=7;}
            else if (x==8){
               shipLocation[0]=8;}
               
            if(y==1){
               shipLocation[1]=1;}
            else if(y==2){
               shipLocation[1]=2;}
            else if(y==3){
               shipLocation[1]=3;}
            else if(y==4){
               shipLocation[1]=4;}
            else if(y==5){
               shipLocation[1]=5;}
            else if(y==6){
               shipLocation[1]=6;}
            else if(y==7){
               shipLocation[1]=7;}
            else if(y==8){
               shipLocation[1]=8;}  
               
            if(i==0){
               if(r==1){
                  ships[0][0]= convertArray(shipLocation);
                  shipLocation[1]++;
                  ships[0][1]= convertArray(shipLocation);
                  shipLocation[1]++;
                  ships[0][2]= convertArray(shipLocation);
                  shipLocation[1]++;
                  ships[0][3]= convertArray(shipLocation);}
                  
               else if(r==2){
                  ships[0][0]= convertArray(shipLocation);
                  shipLocation[0]++;
                  ships[0][1]= convertArray(shipLocation);
                  shipLocation[0]++;
                  ships[0][2]= convertArray(shipLocation);
                  shipLocation[0]++;
                  ships[0][3]= convertArray(shipLocation);}
               }
               
            if(i==1){
               if(r==1){
                  if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                     ships[1][0]= convertArray(shipLocation);
                     shipLocation[1]++;
                     if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                        ships[1][1]= convertArray(shipLocation);
                        shipLocation[1]++;
                        if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                        ships[1][2]= convertArray(shipLocation);}
                        else{
                           ships[1][0]=null;
                           ships[1][1]=null;
                           i--;}
                        }
                     else{
                        ships[1][0]=null;
                        i--;}
                     }   
                  else{
                     i--;}
                  }
               else if(r==2){
                  if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                     ships[1][0]= convertArray(shipLocation);
                     shipLocation[0]++;
                     if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                        ships[1][1]= convertArray(shipLocation);
                        shipLocation[0]++;
                        if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation)))){
                        ships[1][2]= convertArray(shipLocation);}
                        else{
                           ships[1][0]=null;
                           ships[1][1]=null;
                           i--;}
                        }
                     else{
                        ships[1][0]=null;
                        i--;}
                     }  
                  else{
                     i--;}
               }
            }
               
            if(i==2){
               if(r==1){
                  if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation))||ships[1][0].equals(convertArray(shipLocation))||ships[1][1].equals(convertArray(shipLocation))||ships[1][2].equals(convertArray(shipLocation)))){
                     ships[2][0]= convertArray(shipLocation);
                     shipLocation[1]++;
                     if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation))||ships[1][0].equals(convertArray(shipLocation))||ships[1][1].equals(convertArray(shipLocation))||ships[1][2].equals(convertArray(shipLocation)))){
                        ships[2][1]= convertArray(shipLocation);
                        }
                     else{
                        ships[2][0]=null;
                        i--;}
                     }     
                  else{
                     i--;}
               }  
               if(r==2){
                  if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation))||ships[1][0].equals(convertArray(shipLocation))||ships[1][1].equals(convertArray(shipLocation))||ships[1][2].equals(convertArray(shipLocation)))){
                     ships[2][0]= convertArray(shipLocation);
                     shipLocation[0]++;
                     if(!(ships[0][0].equals(convertArray(shipLocation))||ships[0][1].equals(convertArray(shipLocation))||ships[0][2].equals(convertArray(shipLocation))||ships[0][3].equals(convertArray(shipLocation))||ships[1][0].equals(convertArray(shipLocation))||ships[1][1].equals(convertArray(shipLocation))||ships[1][2].equals(convertArray(shipLocation)))){
                        ships[2][1]= convertArray(shipLocation);
                        }
                     else{
                        ships[2][0]=null;
                        i--;}
                     }     
                  else{
                     i--;}
               }
            }
         }

      OpponentColor OC = new OpponentColor();
      OC.colorShip(ships);
      shipsCreated = 1;
      return ships;
      }
      else{
         return ships;}
	}

	public static String getShips(int i, int j) {
		return ships[i][j];
	}
   
   public static boolean attackPlayerShip(){
      Random random = new Random();
      int i=0;
      while(i==0){
      
      if(Game.playerTurn == false){
      int aX = random.nextInt((8-1)+1)+1;
      int aY = random.nextInt((8-1)+1)+1;
      
      attackLocation[0]=aX;
      attackLocation[1]=aY;
               
            String location = convertArray(attackLocation);
            String[][] playerShips = ShipSorter.getShips();
            GameGUI gameGUI = ShipSorter.getGameGUI();
            System.out.println(location);
            //---------------------------------------------------------
            if(location.equals("A1")){
               if(A1==true){
                  i=0;}
               else if(A1==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A1")&&A1==false){
                        gameGUI.colorHit(gameGUI.jButtonA1);
                        gameGUI.text("PLAYER SHIP HIT");
                        A1 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{

                        gameGUI.colorMiss(gameGUI.jButtonA1);}
                     }}}
                  A1 = true;
                  i=1;
                  }
               }
            //---------------------------------------------------------   
            else if(location.equals("A2")){
               if(A2==true){
                  i=0;}
               else if(A2==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A2")&&A2==false){
                        gameGUI.colorHit(gameGUI.jButtonA2);
                        gameGUI.text("PLAYER SHIP HIT");
                        A2 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{

                        gameGUI.colorMiss(gameGUI.jButtonA2);}
                     }}}
                  A2 = true;
                  i=1;
                  }
               }
             
             else if(location.equals("A3")){
               if(A3==true){
                  i=0;}
               else if(A3==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A3")&&A3==false){
                        gameGUI.colorHit(gameGUI.jButtonA3);
                        gameGUI.text("PLAYER SHIP HIT");
                        A3 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{

                        gameGUI.colorMiss(gameGUI.jButtonA3);}
                     }}}
                  A3 = true;
                  i=1;
                  }
               }
               
               else if(location.equals("A4")){
               if(A4==true){
                  i=0;}
               else if(A4==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A4")&&A4==false){
                        gameGUI.colorHit(gameGUI.jButtonA4);
                        gameGUI.text("PLAYER SHIP HIT");
                        A4 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{

                        gameGUI.colorMiss(gameGUI.jButtonA4);}
                     }}}
                  A4 = true;
                  i=1;
                  }
               }
               
               else if(location.equals("A5")){
               if(A5==true){
                  i=0;}
               else if(A5==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A5")&&A5==false){
                        gameGUI.colorHit(gameGUI.jButtonA5);
                        gameGUI.text("PLAYER SHIP HIT");
                        A5 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{

                        gameGUI.colorMiss(gameGUI.jButtonA5);}
                     }}}
                  A5 = true;
                  i=1;
                  }
               }
               
               else if(location.equals("A6")){
               if(A6==true){
                  i=0;}
               else if(A6==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A6")&&A6==false){
                        gameGUI.colorHit(gameGUI.jButtonA6);
                        gameGUI.text("PLAYER SHIP HIT");
                        A6 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{
                        gameGUI.colorMiss(gameGUI.jButtonA6);}
                     }}}
                  A6 = true;
                  i=1;
                  }
               }
               
               else if(location.equals("A7")){
               if(A7==true){
                  i=0;}
               else if(A7==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A7")&&A7==false){
                        gameGUI.colorHit(gameGUI.jButtonA7);
                        gameGUI.text("PLAYER SHIP HIT");
                        A7 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{
                        gameGUI.colorMiss(gameGUI.jButtonA7);}
                     }}}
                  A7 = true;
                  i=1;
                  }
               }
               
               else if(location.equals("A8")){
               if(A8==true){
                  i=0;}
               else if(A8==false){
                  for(int k=0;k<3;k++){for(int m=0;m<4;m++){if(playerShips[k][m]!=null){
                     if(playerShips[k][m].equals("A8")&&A8==false){
                        gameGUI.colorHit(gameGUI.jButtonA8);
                        gameGUI.text("PLAYER SHIP HIT");
                        A8 = true;
                        Game.playerTurn = false;
                        return false;}
                     else{
                        gameGUI.colorMiss(gameGUI.jButtonA8);}
                     }}}
                  A8 = true;
                  i=1;
                  }
               }
            }
         }
      return true;
      }
    //--------------------------------------------------------  
   
   public static String convertArray(int[] intShip){
      String location = "";
      if(intShip[0]==1){
         location="A";}
      else if(intShip[0]==2){
         location="B";}
      else if(intShip[0]==3){
         location="C";}
      else if(intShip[0]==4){
         location="D";}
      else if(intShip[0]==5){
         location="E";}
      else if(intShip[0]==6){
         location="F";}
      else if(intShip[0]==7){
         location="G";}
      else if(intShip[0]==8){
         location="H";}
         
      if(intShip[1]==1){
         location=location+"1";}
      else if(intShip[1]==2){
         location=location+"2";}
      else if(intShip[1]==3){
         location=location+"3";}
      else if(intShip[1]==4){
         location=location+"4";}
      else if(intShip[1]==5){
         location=location+"5";}
      else if(intShip[1]==6){
         location=location+"6";}
      else if(intShip[1]==7){
         location=location+"7";}
      else if(intShip[1]==8){
         location=location+"8";}
         
      return location;}
}
