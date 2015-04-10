public class OpponentColor{
 
   public OpponentColor(){}
   
   public void colorShip(String shipsLocation[][]){
      SetupGUI gui = ShipSorter.getGUI();
      GameGUI gameGUI = ShipSorter.getGameGUI();
     
      boolean A1,A2,A3,A4,A5,A6,A7,A8,B1,B2,B3,B4,B5,B6,B7,B8,C1,C2,C3,C4,C5,C6,C7,C8,D1,D2,D3,D4,D5,D6,D7,D8,E1,E2,E3,E4,E5,E6,E7,E8,F1,F2,F3,F4,F5,F6,F7,F8,G1,G2,G3,G4,G5,G6,G7,G8,H1,H2,H3,H4,H5,H6,H7,H8;
      A1 = false;
      A2 = false;
      A3 = false;
      A4 = false;
      A5 = false;
      A6 = false;
      A7 = false;
      A8 = false;
      B1 = false;
      B2 = false;
      B3 = false;
      B4 = false;
      B5 = false;
      B6 = false;
      B7 = false;
      B8 = false;
      C1 = false;
      C2 = false;
      C3 = false;
      C4 = false;
      C5 = false;
      C6 = false;
      C7 = false;
      C8 = false;
      D1 = false;
      D2 = false;
      D3 = false;
      D4 = false;
      D5 = false;
      D6 = false;
      D7 = false;
      D8 = false;
      E1 = false;
      E2 = false;
      E3 = false;
      E4 = false;
      E5 = false;
      E6 = false;
      E7 = false;
      E8 = false;
      F1 = false;
      F2 = false;
      F3 = false;
      F4 = false;
      F5 = false;
      F6 = false;
      F7 = false;
      F8 = false;
      G1 = false;
      G2 = false;
      G3 = false;
      G4 = false;
      G5 = false;
      G6 = false;
      G7 = false;
      G8 = false;
      H1 = false;
      H2 = false;
      H3 = false;
      H4 = false;
      H5 = false;
      H6 = false;
      H7 = false;
      H8 = false;
     
      for(int i=0; i<3; i++){
         for(int j=0; j<4; j++){
            if(shipsLocation[i][j]!=null){
           
               if(shipsLocation[i][j].equals("A1")){
                  //gui.color(gui.OjButtonA1);//change colour of button on setupGUI
                  gameGUI.color(gameGUI.OjButtonA1);//change color of button on GameGUI
                  A1=true;}//set A1 to true so it can't be recolored
               else if (!(shipsLocation[i][j].equals("A1"))&&A1==false){
                  //gui.antiColor(gui.OjButtonA1);//reverse colour of button on setupGUI
                  gameGUI.antiColor(gameGUI.OjButtonA1);}//reverse color of button on GameGUI
                 
               if(shipsLocation[i][j].equals("A2")){
                  //gui.color(gui.OjButtonA2);
                  gameGUI.color(gameGUI.OjButtonA2);
                  A2=true;}
               else if (!(shipsLocation[i][j].equals("A2"))&&A2==false){
                  //gui.antiColor(gui.OjButtonA2);
                  gameGUI.antiColor(gameGUI.OjButtonA2);}
                 
               if(shipsLocation[i][j].equals("A3")){
                  //gui.color(gui.OjButtonA3);
                  gameGUI.color(gameGUI.OjButtonA3);
                  A3=true;}
               else if (!(shipsLocation[i][j].equals("A3"))&&A3==false){
                  //gui.antiColor(gui.OjButtonA3);
                  gameGUI.antiColor(gameGUI.OjButtonA3);}
                 
               if(shipsLocation[i][j].equals("A4")){
                  //gui.color(gui.OjButtonA4);
                  gameGUI.color(gameGUI.OjButtonA4);
                  A4=true;}
               else if (!(shipsLocation[i][j].equals("A4"))&&A4==false){
                  //gui.antiColor(gui.OjButtonA4);
                  gameGUI.antiColor(gameGUI.OjButtonA4);}
                 
               if(shipsLocation[i][j].equals("A5")){
                  //gui.color(gui.OjButtonA5);
                  gameGUI.color(gameGUI.OjButtonA5);
                  A5=true;}
               else if (!(shipsLocation[i][j].equals("A5"))&&A5==false){
                  //gui.antiColor(gui.OjButtonA5);
                  gameGUI.antiColor(gameGUI.OjButtonA5);}
                 
               if(shipsLocation[i][j].equals("A6")){
                  //gui.color(gui.OjButtonA6);
                  gameGUI.color(gameGUI.OjButtonA6);
                  A6=true;}
               else if (!(shipsLocation[i][j].equals("A6"))&&A6==false){
                  //gui.antiColor(gui.OjButtonA6);
                  gameGUI.antiColor(gameGUI.OjButtonA6);}
                 
               if(shipsLocation[i][j].equals("A7")){
                  //gui.color(gui.OjButtonA7);
                  gameGUI.color(gameGUI.OjButtonA7);
                  A7=true;}
               else if (!(shipsLocation[i][j].equals("A7"))&&A7==false){
                  //gui.antiColor(gui.OjButtonA7);
                  gameGUI.antiColor(gameGUI.OjButtonA7);}
                 
               if(shipsLocation[i][j].equals("A8")){
                  //gui.color(gui.OjButtonA8);
                  gameGUI.color(gameGUI.OjButtonA8);
                  A8=true;}
               else if (!(shipsLocation[i][j].equals("A8"))&&A8==false){
                  //gui.antiColor(gui.OjButtonA8);
                  gameGUI.antiColor(gameGUI.OjButtonA8);}
                 
               if(shipsLocation[i][j].equals("B1")){
                  //gui.color(gui.OjButtonB1);
                  gameGUI.color(gameGUI.OjButtonB1);
                  B1=true;}
               else if (!(shipsLocation[i][j].equals("B1"))&&B1==false){
                  //gui.antiColor(gui.OjButtonB1);
                  gameGUI.antiColor(gameGUI.OjButtonB1);}
                 
               if(shipsLocation[i][j].equals("B2")){
                  //gui.color(gui.OjButtonB2);
                  gameGUI.color(gameGUI.OjButtonB2);
                  B2=true;}
               else if (!(shipsLocation[i][j].equals("B2"))&&B2==false){
                  //gui.antiColor(gui.OjButtonB2);
                  gameGUI.antiColor(gameGUI.OjButtonB2);}
                 
               if(shipsLocation[i][j].equals("B3")){
                  //gui.color(gui.OjButtonB3);
                  gameGUI.color(gameGUI.OjButtonB3);
                  B3=true;}
               else if (!(shipsLocation[i][j].equals("B3"))&&B3==false){
                  //gui.antiColor(gui.OjButtonB3);
                  gameGUI.antiColor(gameGUI.OjButtonB3);}
                 
               if(shipsLocation[i][j].equals("B4")){
                  //gui.color(gui.OjButtonB4);
                  gameGUI.color(gameGUI.OjButtonB4);
                  B4=true;}
               else if (!(shipsLocation[i][j].equals("B4"))&&B4==false){
                  //gui.antiColor(gui.OjButtonB4);
                  gameGUI.antiColor(gameGUI.OjButtonB4);}
                 
               if(shipsLocation[i][j].equals("B5")){
                  //gui.color(gui.OjButtonB5);
                  gameGUI.color(gameGUI.OjButtonB5);
                  B5=true;}
               else if (!(shipsLocation[i][j].equals("B5"))&&B5==false){
                  //gui.antiColor(gui.OjButtonB5);
                  gameGUI.antiColor(gameGUI.OjButtonB5);}
                 
               if(shipsLocation[i][j].equals("B6")){
                  //gui.color(gui.OjButtonB6);
                  gameGUI.color(gameGUI.OjButtonB6);
                  B6=true;}
               else if (!(shipsLocation[i][j].equals("B6"))&&B6==false){
                  //gui.antiColor(gui.OjButtonB6);
                  gameGUI.antiColor(gameGUI.OjButtonB6);}
                 
               if(shipsLocation[i][j].equals("B7")){
                  //gui.color(gui.OjButtonB7);
                  gameGUI.color(gameGUI.OjButtonB7);
                  B7=true;}
               else if (!(shipsLocation[i][j].equals("B7"))&&B7==false){
                  //gui.antiColor(gui.OjButtonB7);
                  gameGUI.antiColor(gameGUI.OjButtonB7);}
                 
               if(shipsLocation[i][j].equals("B8")){
                  //gui.color(gui.OjButtonB8);
                  gameGUI.color(gameGUI.OjButtonB8);
                  B8=true;}
               else if (!(shipsLocation[i][j].equals("B8"))&&B8==false){
                  //gui.antiColor(gui.OjButtonB8);
                  gameGUI.antiColor(gameGUI.OjButtonB8);}
                                 
               if(shipsLocation[i][j].equals("C1")){
                  //gui.color(gui.OjButtonC1);
                  gameGUI.color(gameGUI.OjButtonC1);
                  C1=true;}
               else if (!(shipsLocation[i][j].equals("C1"))&&C1==false){
                  //gui.antiColor(gui.OjButtonC1);
                  gameGUI.antiColor(gameGUI.OjButtonC1);}
                 
               if(shipsLocation[i][j].equals("C2")){
                  //gui.color(gui.OjButtonC2);
                  gameGUI.color(gameGUI.OjButtonC2);
                  C2=true;}
               else if (!(shipsLocation[i][j].equals("C2"))&&C2==false){
                  //gui.antiColor(gui.OjButtonC2);
                  gameGUI.antiColor(gameGUI.OjButtonC2);}
                 
               if(shipsLocation[i][j].equals("C3")){
                  //gui.color(gui.OjButtonC3);
                  gameGUI.color(gameGUI.OjButtonC3);
                  C3=true;}
               else if (!(shipsLocation[i][j].equals("C3"))&&C3==false){
                  //gui.antiColor(gui.OjButtonC3);
                  gameGUI.antiColor(gameGUI.OjButtonC3);}
                 
               if(shipsLocation[i][j].equals("C4")){
                  //gui.color(gui.OjButtonC4);
                  gameGUI.color(gameGUI.OjButtonC4);
                  C4=true;}
               else if (!(shipsLocation[i][j].equals("C4"))&&C4==false){
                  //gui.antiColor(gui.OjButtonC4);
                  gameGUI.antiColor(gameGUI.OjButtonC4);}
                 
               if(shipsLocation[i][j].equals("C5")){
                  //gui.color(gui.OjButtonC5);
                  gameGUI.color(gameGUI.OjButtonC5);
                  C5=true;}
               else if (!(shipsLocation[i][j].equals("C5"))&&C5==false){
                  //gui.antiColor(gui.OjButtonC5);
                  gameGUI.antiColor(gameGUI.OjButtonC5);}
                 
               if(shipsLocation[i][j].equals("C6")){
                  //gui.color(gui.OjButtonC6);
                  gameGUI.color(gameGUI.OjButtonC6);
                  C6=true;}
               else if (!(shipsLocation[i][j].equals("C6"))&&C6==false){
                  //gui.antiColor(gui.OjButtonC6);
                  gameGUI.antiColor(gameGUI.OjButtonC6);}
                 
               if(shipsLocation[i][j].equals("C7")){
                  //gui.color(gui.OjButtonC7);
                  gameGUI.color(gameGUI.OjButtonC7);
                  C7=true;}
               else if (!(shipsLocation[i][j].equals("C7"))&&C7==false){
                  //gui.antiColor(gui.OjButtonC7);
                  gameGUI.antiColor(gameGUI.OjButtonC7);}
                 
               if(shipsLocation[i][j].equals("C8")){
                  //gui.color(gui.OjButtonC8);
                  gameGUI.color(gameGUI.OjButtonC8);
                  C8=true;}
               else if (!(shipsLocation[i][j].equals("C8"))&&C8==false){
                  //gui.antiColor(gui.OjButtonC8);
                  gameGUI.antiColor(gameGUI.OjButtonC8);}
               
               if(shipsLocation[i][j].equals("D1")){
                  //gui.color(gui.OjButtonD1);
                  gameGUI.color(gameGUI.OjButtonD1);
                  D1=true;}
               else if (!(shipsLocation[i][j].equals("D1"))&&D1==false){
                  //gui.antiColor(gui.OjButtonD1);
                  gameGUI.antiColor(gameGUI.OjButtonD1);}
                 
               if(shipsLocation[i][j].equals("D2")){
                  //gui.color(gui.OjButtonD2);
                  gameGUI.color(gameGUI.OjButtonD2);
                  D2=true;}
               else if (!(shipsLocation[i][j].equals("D2"))&&D2==false){
                  //gui.antiColor(gui.OjButtonD2);
                  gameGUI.antiColor(gameGUI.OjButtonD2);}
                 
               if(shipsLocation[i][j].equals("D3")){
                  //gui.color(gui.OjButtonD3);
                  gameGUI.color(gameGUI.OjButtonD3);
                  D3=true;}
               else if (!(shipsLocation[i][j].equals("D3"))&&D3==false){
                  //gui.antiColor(gui.OjButtonD3);
                  gameGUI.antiColor(gameGUI.OjButtonD3);}
                 
               if(shipsLocation[i][j].equals("D4")){
                  //gui.color(gui.OjButtonD4);
                  gameGUI.color(gameGUI.OjButtonD4);
                  D4=true;}
               else if (!(shipsLocation[i][j].equals("D4"))&&D4==false){
                  //gui.antiColor(gui.OjButtonD4);
                  gameGUI.antiColor(gameGUI.OjButtonD4);}
                 
               if(shipsLocation[i][j].equals("D5")){
                  //gui.color(gui.OjButtonD5);
                  gameGUI.color(gameGUI.OjButtonD5);
                  D5=true;}
               else if (!(shipsLocation[i][j].equals("D5"))&&D5==false){
                  //gui.antiColor(gui.OjButtonD5);
                  gameGUI.antiColor(gameGUI.OjButtonD5);}
                 
               if(shipsLocation[i][j].equals("D6")){
                  //gui.color(gui.OjButtonD6);
                  gameGUI.color(gameGUI.OjButtonD6);
                  D6=true;}
               else if (!(shipsLocation[i][j].equals("D6"))&&D6==false){
                  //gui.antiColor(gui.OjButtonD6);
                  gameGUI.antiColor(gameGUI.OjButtonD6);}
                 
               if(shipsLocation[i][j].equals("D7")){
                  //gui.color(gui.OjButtonD7);
                  gameGUI.color(gameGUI.OjButtonD7);
                  D7=true;}
               else if (!(shipsLocation[i][j].equals("D7"))&&D7==false){
                  //gui.antiColor(gui.OjButtonD7);
                  gameGUI.antiColor(gameGUI.OjButtonD7);}
                 
               if(shipsLocation[i][j].equals("D8")){
                  //gui.color(gui.OjButtonD8);
                  gameGUI.color(gameGUI.OjButtonD8);
                  D8=true;}
               else if (!(shipsLocation[i][j].equals("D8"))&&D8==false){
                  //gui.antiColor(gui.OjButtonD8);
                  gameGUI.antiColor(gameGUI.OjButtonD8);}
               
               if(shipsLocation[i][j].equals("E1")){
                  //gui.color(gui.OjButtonE1);
                  gameGUI.color(gameGUI.OjButtonE1);
                  E1=true;}
               else if (!(shipsLocation[i][j].equals("E1"))&&E1==false){
                  //gui.antiColor(gui.OjButtonE1);
                  gameGUI.antiColor(gameGUI.OjButtonE1);}
                 
               if(shipsLocation[i][j].equals("E2")){
                  //gui.color(gui.OjButtonE2);
                  gameGUI.color(gameGUI.OjButtonE2);
                  E2=true;}
               else if (!(shipsLocation[i][j].equals("E2"))&&E2==false){
                  //gui.antiColor(gui.OjButtonE2);
                  gameGUI.antiColor(gameGUI.OjButtonE2);}
                 
               if(shipsLocation[i][j].equals("E3")){
                  //gui.color(gui.OjButtonE3);
                  gameGUI.color(gameGUI.OjButtonE3);
                  E3=true;}
               else if (!(shipsLocation[i][j].equals("E3"))&&E3==false){
                  //gui.antiColor(gui.OjButtonE3);
                  gameGUI.antiColor(gameGUI.OjButtonE3);}
                 
               if(shipsLocation[i][j].equals("E4")){
                  //gui.color(gui.OjButtonE4);
                  gameGUI.color(gameGUI.OjButtonE4);
                  E4=true;}
               else if (!(shipsLocation[i][j].equals("E4"))&&E4==false){
                  //gui.antiColor(gui.OjButtonE4);
                  gameGUI.antiColor(gameGUI.OjButtonE4);}
                 
               if(shipsLocation[i][j].equals("E5")){
                  //gui.color(gui.OjButtonE5);
                  gameGUI.color(gameGUI.OjButtonE5);
                  E5=true;}
               else if (!(shipsLocation[i][j].equals("E5"))&&E5==false){
                  //gui.antiColor(gui.OjButtonE5);
                  gameGUI.antiColor(gameGUI.OjButtonE5);}
                 
               if(shipsLocation[i][j].equals("E6")){
                  //gui.color(gui.OjButtonE6);
                  gameGUI.color(gameGUI.OjButtonE6);
                  E6=true;}
               else if (!(shipsLocation[i][j].equals("E6"))&&E6==false){
                  //gui.antiColor(gui.OjButtonE6);
                  gameGUI.antiColor(gameGUI.OjButtonE6);}
                 
               if(shipsLocation[i][j].equals("E7")){
                  //gui.color(gui.OjButtonE7);
                  gameGUI.color(gameGUI.OjButtonE7);
                  E7=true;}
               else if (!(shipsLocation[i][j].equals("E7"))&&E7==false){
                  //gui.antiColor(gui.OjButtonE7);
                  gameGUI.antiColor(gameGUI.OjButtonE7);}
                 
               if(shipsLocation[i][j].equals("E8")){
                  //gui.color(gui.OjButtonE8);
                  gameGUI.color(gameGUI.OjButtonE8);
                  E8=true;}
               else if (!(shipsLocation[i][j].equals("E8"))&&E8==false){
                  //gui.antiColor(gui.OjButtonE8);
                  gameGUI.antiColor(gameGUI.OjButtonE8);}
                                 
               if(shipsLocation[i][j].equals("F1")){
                  //gui.color(gui.OjButtonF1);
                  gameGUI.color(gameGUI.OjButtonF1);
                  F1=true;}
               else if (!(shipsLocation[i][j].equals("F1"))&&F1==false){
                  //gui.antiColor(gui.OjButtonF1);
                  gameGUI.antiColor(gameGUI.OjButtonF1);}
                 
               if(shipsLocation[i][j].equals("F2")){
                  //gui.color(gui.OjButtonF2);
                  gameGUI.color(gameGUI.OjButtonF2);
                  F2=true;}
               else if (!(shipsLocation[i][j].equals("F2"))&&F2==false){
                  //gui.antiColor(gui.OjButtonF2);
                  gameGUI.antiColor(gameGUI.OjButtonF2);}
                 
               if(shipsLocation[i][j].equals("F3")){
                  //gui.color(gui.OjButtonF3);
                  gameGUI.color(gameGUI.OjButtonF3);
                  F3=true;}
               else if (!(shipsLocation[i][j].equals("F3"))&&F3==false){
                  //gui.antiColor(gui.OjButtonF3);
                  gameGUI.antiColor(gameGUI.OjButtonF3);}
                 
               if(shipsLocation[i][j].equals("F4")){
                  //gui.color(gui.OjButtonF4);
                  gameGUI.color(gameGUI.OjButtonF4);
                  F4=true;}
               else if (!(shipsLocation[i][j].equals("F4"))&&F4==false){
                  //gui.antiColor(gui.OjButtonF4);
                  gameGUI.antiColor(gameGUI.OjButtonF4);}
                 
               if(shipsLocation[i][j].equals("F5")){
                  //gui.color(gui.OjButtonF5);
                  gameGUI.color(gameGUI.OjButtonF5);
                  F5=true;}
               else if (!(shipsLocation[i][j].equals("F5"))&&F5==false){
                  //gui.antiColor(gui.OjButtonF5);
                  gameGUI.antiColor(gameGUI.OjButtonF5);}
                 
               if(shipsLocation[i][j].equals("F6")){
                  //gui.color(gui.OjButtonF6);
                  gameGUI.color(gameGUI.OjButtonF6);
                  F6=true;}
               else if (!(shipsLocation[i][j].equals("F6"))&&F6==false){
                  //gui.antiColor(gui.OjButtonF6);
                  gameGUI.antiColor(gameGUI.OjButtonF6);}
                 
               if(shipsLocation[i][j].equals("F7")){
                  //gui.color(gui.OjButtonF7);
                  gameGUI.color(gameGUI.OjButtonF7);
                  F7=true;}
               else if (!(shipsLocation[i][j].equals("F7"))&&F7==false){
                  //gui.antiColor(gui.OjButtonF7);
                  gameGUI.antiColor(gameGUI.OjButtonF7);}
                 
               if(shipsLocation[i][j].equals("F8")){
                  //gui.color(gui.OjButtonF8);
                  gameGUI.color(gameGUI.OjButtonF8);
                  F8=true;}
               else if (!(shipsLocation[i][j].equals("F8"))&&F8==false){
                  //gui.antiColor(gui.OjButtonF8);
                  gameGUI.antiColor(gameGUI.OjButtonF8);}
               
               if(shipsLocation[i][j].equals("G1")){
                  //gui.color(gui.OjButtonG1);
                  gameGUI.color(gameGUI.OjButtonG1);
                  G1=true;}
               else if (!(shipsLocation[i][j].equals("G1"))&&G1==false){
                  //gui.antiColor(gui.OjButtonG1);
                  gameGUI.antiColor(gameGUI.OjButtonG1);}
                 
               if(shipsLocation[i][j].equals("G2")){
                  //gui.color(gui.OjButtonG2);
                  gameGUI.color(gameGUI.OjButtonG2);
                  G2=true;}
               else if (!(shipsLocation[i][j].equals("G2"))&&G2==false){
                  //gui.antiColor(gui.OjButtonG2);
                  gameGUI.antiColor(gameGUI.OjButtonG2);}
                 
               if(shipsLocation[i][j].equals("G3")){
                  //gui.color(gui.OjButtonG3);
                  gameGUI.color(gameGUI.OjButtonG3);
                  G3=true;}
               else if (!(shipsLocation[i][j].equals("G3"))&&G3==false){
                  //gui.antiColor(gui.OjButtonG3);
                  gameGUI.antiColor(gameGUI.OjButtonG3);}
                 
               if(shipsLocation[i][j].equals("G4")){
                  //gui.color(gui.OjButtonG4);
                  gameGUI.color(gameGUI.OjButtonG4);
                  G4=true;}
               else if (!(shipsLocation[i][j].equals("G4"))&&G4==false){
                  //gui.antiColor(gui.OjButtonG4);
                  gameGUI.antiColor(gameGUI.OjButtonG4);}
                 
               if(shipsLocation[i][j].equals("G5")){
                  //gui.color(gui.OjButtonG5);
                  gameGUI.color(gameGUI.OjButtonG5);
                  G5=true;}
               else if (!(shipsLocation[i][j].equals("G5"))&&G5==false){
                  //gui.antiColor(gui.OjButtonG5);
                  gameGUI.antiColor(gameGUI.OjButtonG5);}
                 
               if(shipsLocation[i][j].equals("G6")){
                  //gui.color(gui.OjButtonG6);
                  gameGUI.color(gameGUI.OjButtonG6);
                  G6=true;}
               else if (!(shipsLocation[i][j].equals("G6"))&&G6==false){
                  //gui.antiColor(gui.OjButtonG6);
                  gameGUI.antiColor(gameGUI.OjButtonG6);}
                 
               if(shipsLocation[i][j].equals("G7")){
                  //gui.color(gui.OjButtonG7);
                  gameGUI.color(gameGUI.OjButtonG7);
                  G7=true;}
               else if (!(shipsLocation[i][j].equals("G7"))&&G7==false){
                  //gui.antiColor(gui.OjButtonG7);
                  gameGUI.antiColor(gameGUI.OjButtonG7);}
                 
               if(shipsLocation[i][j].equals("G8")){
                  //gui.color(gui.OjButtonG8);
                  gameGUI.color(gameGUI.OjButtonG8);
                  G8=true;}
               else if (!(shipsLocation[i][j].equals("G8"))&&G8==false){
                  //gui.antiColor(gui.OjButtonG8);
                  gameGUI.antiColor(gameGUI.OjButtonG8);}
               
               if(shipsLocation[i][j].equals("H1")){
                  //gui.color(gui.OjButtonH1);
                  gameGUI.color(gameGUI.OjButtonH1);
                  H1=true;}
               else if (!(shipsLocation[i][j].equals("H1"))&&H1==false){
                  //gui.antiColor(gui.OjButtonH1);
                  gameGUI.antiColor(gameGUI.OjButtonH1);}
                 
               if(shipsLocation[i][j].equals("H2")){
                  //gui.color(gui.OjButtonH2);
                  gameGUI.color(gameGUI.OjButtonH2);
                  H2=true;}
               else if (!(shipsLocation[i][j].equals("H2"))&&H2==false){
                  //gui.antiColor(gui.OjButtonH2);
                  gameGUI.antiColor(gameGUI.OjButtonH2);}
                 
               if(shipsLocation[i][j].equals("H3")){
                  //gui.color(gui.OjButtonH3);
                  gameGUI.color(gameGUI.OjButtonH3);
                  H3=true;}
               else if (!(shipsLocation[i][j].equals("H3"))&&H3==false){
                  //gui.antiColor(gui.OjButtonH3);
                  gameGUI.antiColor(gameGUI.OjButtonH3);}
                 
               if(shipsLocation[i][j].equals("H4")){
                  //gui.color(gui.OjButtonH4);
                  gameGUI.color(gameGUI.OjButtonH4);
                  H4=true;}
               else if (!(shipsLocation[i][j].equals("H4"))&&H4==false){
                  //gui.antiColor(gui.OjButtonH4);
                  gameGUI.antiColor(gameGUI.OjButtonH4);}
                 
               if(shipsLocation[i][j].equals("H5")){
                  //gui.color(gui.OjButtonH5);
                  gameGUI.color(gameGUI.OjButtonH5);
                  H5=true;}
               else if (!(shipsLocation[i][j].equals("H5"))&&H5==false){
                  //gui.antiColor(gui.OjButtonH5);
                  gameGUI.antiColor(gameGUI.OjButtonH5);}
                 
               if(shipsLocation[i][j].equals("H6")){
                  //gui.color(gui.OjButtonH6);
                  gameGUI.color(gameGUI.OjButtonH6);
                  H6=true;}
               else if (!(shipsLocation[i][j].equals("H6"))&&H6==false){
                  //gui.antiColor(gui.OjButtonH6);
                  gameGUI.antiColor(gameGUI.OjButtonH6);}
                 
               if(shipsLocation[i][j].equals("H7")){
                  //gui.color(gui.OjButtonH7);
                  gameGUI.color(gameGUI.OjButtonH7);
                  H7=true;}
               else if (!(shipsLocation[i][j].equals("H7"))&&H7==false){
                  //gui.antiColor(gui.OjButtonH7);
                  gameGUI.antiColor(gameGUI.OjButtonH7);}
                 
               if(shipsLocation[i][j].equals("H8")){
                  //gui.color(gui.OjButtonH8);
                  gameGUI.color(gameGUI.OjButtonH8);
                  H8=true;}
               else if (!(shipsLocation[i][j].equals("H8"))&&H8==false){
                  //gui.antiColor(gui.OjButtonH8);
                  gameGUI.antiColor(gameGUI.OjButtonH8);}
               
               }
            }
         }
      }
   }
