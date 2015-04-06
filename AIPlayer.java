public class AIPlayer{

   public String[][] ships = new String[3][4];

   public AIPlayer(){}
      
   public String getShips(int i, int j){
      ships[0][0]="A1";
      ships[0][1]="B1";
      ships[0][2]="C1";
      ships[0][3]="D1";
      ships[1][0]="A2";
      ships[1][1]="A3";
      ships[1][2]="A4";
      ships[2][0]="A5";
      ships[2][1]="B5";
      return ships[i][j];}

}
