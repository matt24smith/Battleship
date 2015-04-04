public class ShipColor{
   
  //public static ShipSorter shipSorter = new ShipSorter();
 
   public ShipColor(){}
   
   public void colorShip(String shipsLocation[][]){
      GUI gui = ShipSorter.getGUI();
     
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
                  gui.color(gui.jButtonA1);//change colour
                  A1=true;}
               else if (!(shipsLocation[i][j].equals("A1"))&&A1==false){
                  gui.antiColor(gui.jButtonA1);}
                 
               if(shipsLocation[i][j].equals("A2")){
                  gui.color(gui.jButtonA2);
                  A2=true;}
               else if (!(shipsLocation[i][j].equals("A2"))&&A2==false){
                  gui.antiColor(gui.jButtonA2);}
                 
               if(shipsLocation[i][j].equals("A3")){
                  gui.color(gui.jButtonA3);
                  A3=true;}
               else if (!(shipsLocation[i][j].equals("A3"))&&A3==false){
                  gui.antiColor(gui.jButtonA3);}
                 
               if(shipsLocation[i][j].equals("A4")){
                  gui.color(gui.jButtonA4);
                  A4=true;}
               else if (!(shipsLocation[i][j].equals("A4"))&&A4==false){
                  gui.antiColor(gui.jButtonA4);}
                 
               if(shipsLocation[i][j].equals("A5")){
                  gui.color(gui.jButtonA5);
                  A5=true;}
               else if (!(shipsLocation[i][j].equals("A5"))&&A5==false){
                  gui.antiColor(gui.jButtonA5);}
                 
               if(shipsLocation[i][j].equals("A6")){
                  gui.color(gui.jButtonA6);
                  A6=true;}
               else if (!(shipsLocation[i][j].equals("A6"))&&A6==false){
                  gui.antiColor(gui.jButtonA6);}
                 
               if(shipsLocation[i][j].equals("A7")){
                  gui.color(gui.jButtonA7);
                  A7=true;}
               else if (!(shipsLocation[i][j].equals("A7"))&&A7==false){
                  gui.antiColor(gui.jButtonA7);}
                 
               if(shipsLocation[i][j].equals("A8")){
                  gui.color(gui.jButtonA8);
                  A8=true;}
               else if (!(shipsLocation[i][j].equals("A8"))&&A8==false){
                  gui.antiColor(gui.jButtonA8);}
                 
               if(shipsLocation[i][j].equals("B1")){
                  gui.color(gui.jButtonB1);
                  B1=true;}
               else if (!(shipsLocation[i][j].equals("B1"))&&B1==false){
                  gui.antiColor(gui.jButtonB1);}
               
               if(shipsLocation[i][j].equals("B2")){
                   gui.color(gui.jButtonB2);
                   B2=true;}
                else if (!(shipsLocation[i][j].equals("B2"))&&B2==false){
                   gui.antiColor(gui.jButtonB2);}
               
               if(shipsLocation[i][j].equals("B3")){
                   gui.color(gui.jButtonB3);
                   B3=true;}
                else if (!(shipsLocation[i][j].equals("B3"))&&B3==false){
                   gui.antiColor(gui.jButtonB3);}
               
               if(shipsLocation[i][j].equals("B4")){
                   gui.color(gui.jButtonB4);
                   B4=true;}
                else if (!(shipsLocation[i][j].equals("B4"))&&B4==false){
                   gui.antiColor(gui.jButtonB4);}
               
               if(shipsLocation[i][j].equals("B5")){
                   gui.color(gui.jButtonB5);
                   B5=true;}
                else if (!(shipsLocation[i][j].equals("B5"))&&B5==false){
                   gui.antiColor(gui.jButtonB5);}
               
               if(shipsLocation[i][j].equals("B6")){
                   gui.color(gui.jButtonB6);
                   B6=true;}
                else if (!(shipsLocation[i][j].equals("B6"))&&B6==false){
                   gui.antiColor(gui.jButtonB6);}
               
               if(shipsLocation[i][j].equals("B7")){
                   gui.color(gui.jButtonB7);
                   B7=true;}
                else if (!(shipsLocation[i][j].equals("B7"))&&B7==false){
                   gui.antiColor(gui.jButtonB7);}
               
               if(shipsLocation[i][j].equals("B8")){
                   gui.color(gui.jButtonB8);
                   B8=true;}
                else if (!(shipsLocation[i][j].equals("B8"))&&B8==false){
                   gui.antiColor(gui.jButtonB8);}
               
               if(shipsLocation[i][j].equals("C1")){
                   gui.color(gui.jButtonC1);
                   C1=true;}
                else if (!(shipsLocation[i][j].equals("C1"))&&C1==false){
                   gui.antiColor(gui.jButtonC1);}
               
               if(shipsLocation[i][j].equals("C2")){
                   gui.color(gui.jButtonC2);
                   C2=true;}
                else if (!(shipsLocation[i][j].equals("C2"))&&C2==false){
                   gui.antiColor(gui.jButtonC2);}
               
               if(shipsLocation[i][j].equals("C3")){
                   gui.color(gui.jButtonC3);
                   C3=true;}
                else if (!(shipsLocation[i][j].equals("C3"))&&C3==false){
                   gui.antiColor(gui.jButtonC3);}
               
               if(shipsLocation[i][j].equals("C4")){
                   gui.color(gui.jButtonC4);
                   C4=true;}
                else if (!(shipsLocation[i][j].equals("C4"))&&C4==false){
                   gui.antiColor(gui.jButtonC4);}
               
               if(shipsLocation[i][j].equals("C5")){
                   gui.color(gui.jButtonC5);
                   C5=true;}
                else if (!(shipsLocation[i][j].equals("C5"))&&C5==false){
                   gui.antiColor(gui.jButtonC5);}
               
               if(shipsLocation[i][j].equals("C6")){
                   gui.color(gui.jButtonC6);
                   C6=true;}
                else if (!(shipsLocation[i][j].equals("C6"))&&C6==false){
                   gui.antiColor(gui.jButtonC6);}
               
               if(shipsLocation[i][j].equals("C7")){
                   gui.color(gui.jButtonC7);
                   C7=true;}
                else if (!(shipsLocation[i][j].equals("C7"))&&C7==false){
                   gui.antiColor(gui.jButtonC7);}
               
               if(shipsLocation[i][j].equals("C8")){
                   gui.color(gui.jButtonC8);
                   C8=true;}
                else if (!(shipsLocation[i][j].equals("C8"))&&C8==false){
                   gui.antiColor(gui.jButtonC8);}
               
               if(shipsLocation[i][j].equals("D1")){
                   gui.color(gui.jButtonD1);
                   D1=true;}
                else if (!(shipsLocation[i][j].equals("D1"))&&D1==false){
                   gui.antiColor(gui.jButtonD1);}
               
               if(shipsLocation[i][j].equals("D2")){
                   gui.color(gui.jButtonD2);
                   D2=true;}
                else if (!(shipsLocation[i][j].equals("D2"))&&D2==false){
                   gui.antiColor(gui.jButtonD2);}
               
               if(shipsLocation[i][j].equals("D3")){
                   gui.color(gui.jButtonD3);
                   D3=true;}
                else if (!(shipsLocation[i][j].equals("D3"))&&D3==false){
                   gui.antiColor(gui.jButtonD3);}  
               
               if(shipsLocation[i][j].equals("D4")){
                    gui.color(gui.jButtonD4);
                    D4=true;}
               else if (!(shipsLocation[i][j].equals("D4"))&&D4==false){
                    gui.antiColor(gui.jButtonD4);}
               
               if(shipsLocation[i][j].equals("D5")){
                   gui.color(gui.jButtonD5);
                   D5=true;}
                else if (!(shipsLocation[i][j].equals("D5"))&&D5==false){
                   gui.antiColor(gui.jButtonD5);}
               
               if(shipsLocation[i][j].equals("D6")){
                   gui.color(gui.jButtonD6);
                   D6=true;}
                else if (!(shipsLocation[i][j].equals("D6"))&&D6==false){
                   gui.antiColor(gui.jButtonD6);}
               
               if(shipsLocation[i][j].equals("D7")){
                   gui.color(gui.jButtonD7);
                   D7=true;}
                else if (!(shipsLocation[i][j].equals("D7"))&&D7==false){
                   gui.antiColor(gui.jButtonD7);}
               
               if(shipsLocation[i][j].equals("D8")){
                   gui.color(gui.jButtonD8);
                   D8=true;}
                else if (!(shipsLocation[i][j].equals("D8"))&&D8==false){
                   gui.antiColor(gui.jButtonD8);}
               
               if(shipsLocation[i][j].equals("E1")){
                   gui.color(gui.jButtonE1);
                   E1=true;}
                else if (!(shipsLocation[i][j].equals("E1"))&&E1==false){
                   gui.antiColor(gui.jButtonE1);}
               
               if(shipsLocation[i][j].equals("E2")){
                   gui.color(gui.jButtonE2);
                   E2=true;}
                else if (!(shipsLocation[i][j].equals("E2"))&&E2==false){
                   gui.antiColor(gui.jButtonE2);}
               
               if(shipsLocation[i][j].equals("E3")){
                   gui.color(gui.jButtonE3);
                   E3=true;}
                else if (!(shipsLocation[i][j].equals("E3"))&&E3==false){
                   gui.antiColor(gui.jButtonE3);}
               
               if(shipsLocation[i][j].equals("E4")){
                   gui.color(gui.jButtonE4);
                   E4=true;}
                else if (!(shipsLocation[i][j].equals("E4"))&&E4==false){
                   gui.antiColor(gui.jButtonE4);}
               
               if(shipsLocation[i][j].equals("E5")){
                   gui.color(gui.jButtonE5);
                   E5=true;}
                else if (!(shipsLocation[i][j].equals("E5"))&&E5==false){
                   gui.antiColor(gui.jButtonE5);}
               
               if(shipsLocation[i][j].equals("E6")){
                   gui.color(gui.jButtonE6);
                   E6=true;}
                else if (!(shipsLocation[i][j].equals("E6"))&&E6==false){
                   gui.antiColor(gui.jButtonE6);}
               
               if(shipsLocation[i][j].equals("E7")){
                   gui.color(gui.jButtonE7);
                   E7=true;}
                else if (!(shipsLocation[i][j].equals("E7"))&&E7==false){
                   gui.antiColor(gui.jButtonE7);}
               
               if(shipsLocation[i][j].equals("E8")){
                   gui.color(gui.jButtonE8);
                   E8=true;}
                else if (!(shipsLocation[i][j].equals("E8"))&&E8==false){
                   gui.antiColor(gui.jButtonE8);}
               
               if(shipsLocation[i][j].equals("F1")){
                   gui.color(gui.jButtonF1);
                   F1=true;}
                else if (!(shipsLocation[i][j].equals("F1"))&&F1==false){
                   gui.antiColor(gui.jButtonF1);}
               
               if(shipsLocation[i][j].equals("F2")){
                   gui.color(gui.jButtonF2);
                   F2=true;}
                else if (!(shipsLocation[i][j].equals("F2"))&&F2==false){
                   gui.antiColor(gui.jButtonF2);}
               
               if(shipsLocation[i][j].equals("F3")){
                   gui.color(gui.jButtonF3);
                   F3=true;}
                else if (!(shipsLocation[i][j].equals("F3"))&&F3==false){
                   gui.antiColor(gui.jButtonF3);}
               
               if(shipsLocation[i][j].equals("F4")){
                   gui.color(gui.jButtonF4);
                   F4=true;}
                else if (!(shipsLocation[i][j].equals("F4"))&&F4==false){
                   gui.antiColor(gui.jButtonF4);}
               
               if(shipsLocation[i][j].equals("F5")){
                   gui.color(gui.jButtonF5);
                   F5=true;}
                else if (!(shipsLocation[i][j].equals("F5"))&&F5==false){
                   gui.antiColor(gui.jButtonF5);}
               
               if(shipsLocation[i][j].equals("F6")){
                   gui.color(gui.jButtonF6);
                   F6=true;}
                else if (!(shipsLocation[i][j].equals("F6"))&&F6==false){
                   gui.antiColor(gui.jButtonF6);}
               
               if(shipsLocation[i][j].equals("F7")){
                   gui.color(gui.jButtonF7);
                   F7=true;}
                else if (!(shipsLocation[i][j].equals("F7"))&&F7==false){
                   gui.antiColor(gui.jButtonF7);}
               
               if(shipsLocation[i][j].equals("F8")){
                   gui.color(gui.jButtonF8);
                   F8=true;}
                else if (!(shipsLocation[i][j].equals("F8"))&&F8==false){
                   gui.antiColor(gui.jButtonF8);}
               
               if(shipsLocation[i][j].equals("G1")){
                   gui.color(gui.jButtonG1);
                   G1=true;}
                else if (!(shipsLocation[i][j].equals("G1"))&&G1==false){
                   gui.antiColor(gui.jButtonG1);}
               
               if(shipsLocation[i][j].equals("G2")){
                   gui.color(gui.jButtonG2);
                   G2=true;}
                else if (!(shipsLocation[i][j].equals("G2"))&&G2==false){
                   gui.antiColor(gui.jButtonG2);}
               
               if(shipsLocation[i][j].equals("G3")){
                   gui.color(gui.jButtonG3);
                   G3=true;}
                else if (!(shipsLocation[i][j].equals("G3"))&&G3==false){
                   gui.antiColor(gui.jButtonG3);}
               
               if(shipsLocation[i][j].equals("G4")){
                   gui.color(gui.jButtonG4);
                   G4=true;}
                else if (!(shipsLocation[i][j].equals("G4"))&&G4==false){
                   gui.antiColor(gui.jButtonG4);}
               
               if(shipsLocation[i][j].equals("G5")){
                   gui.color(gui.jButtonG5);
                   G5=true;}
                else if (!(shipsLocation[i][j].equals("G5"))&&G5==false){
                   gui.antiColor(gui.jButtonG5);}
               
               if(shipsLocation[i][j].equals("G6")){
                   gui.color(gui.jButtonG6);
                   G6=true;}
                else if (!(shipsLocation[i][j].equals("G6"))&&G6==false){
                   gui.antiColor(gui.jButtonG6);}
               
               if(shipsLocation[i][j].equals("G7")){
                   gui.color(gui.jButtonG7);
                   G7=true;}
                else if (!(shipsLocation[i][j].equals("G7"))&&G7==false){
                   gui.antiColor(gui.jButtonG7);}
               
               if(shipsLocation[i][j].equals("G8")){
                   gui.color(gui.jButtonG8);
                   G8=true;}
                else if (!(shipsLocation[i][j].equals("G8"))&&G8==false){
                   gui.antiColor(gui.jButtonG8);}
               
               if(shipsLocation[i][j].equals("H1")){
                   gui.color(gui.jButtonH1);
                   H1=true;}
                else if (!(shipsLocation[i][j].equals("H1"))&&H1==false){
                   gui.antiColor(gui.jButtonH1);}
               
               if(shipsLocation[i][j].equals("H2")){
                   gui.color(gui.jButtonH2);
                   H2=true;}
                else if (!(shipsLocation[i][j].equals("H2"))&&H2==false){
                   gui.antiColor(gui.jButtonH2);}
               
               if(shipsLocation[i][j].equals("H3")){
                   gui.color(gui.jButtonH3);
                   H3=true;}
                else if (!(shipsLocation[i][j].equals("H3"))&&H3==false){
                   gui.antiColor(gui.jButtonH3);}
               
               if(shipsLocation[i][j].equals("H4")){
                   gui.color(gui.jButtonH4);
                  H4=true;}
                else if (!(shipsLocation[i][j].equals("H4"))&&H4==false){
                   gui.antiColor(gui.jButtonH4);}
               
               if(shipsLocation[i][j].equals("H5")){
                   gui.color(gui.jButtonH5);
                   H5=true;}
                else if (!(shipsLocation[i][j].equals("H5"))&&H5==false){
                   gui.antiColor(gui.jButtonH5);}
               
               if(shipsLocation[i][j].equals("H6")){
                   gui.color(gui.jButtonH6);
                   H6=true;}
                else if (!(shipsLocation[i][j].equals("H6"))&&H6==false){
                   gui.antiColor(gui.jButtonH6);}
               
               if(shipsLocation[i][j].equals("H7")){
                   gui.color(gui.jButtonH7);
                   H7=true;}
                else if (!(shipsLocation[i][j].equals("H7"))&&H7==false){
                   gui.antiColor(gui.jButtonH7);}
               
               if(shipsLocation[i][j].equals("H8")){
                   gui.color(gui.jButtonH8);
                   H8=true;}
                else if (!(shipsLocation[i][j].equals("H8"))&&H8==false){
                   gui.antiColor(gui.jButtonH8);}
               
               }
            }
         }
      }
   }
