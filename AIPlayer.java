public class AIPlayer {

	public String[][] ships = new String[3][4];

	public AIPlayer() {
		ships[0][0] = "A1";
		ships[0][1] = "B1";
		ships[0][2] = "C1";
		ships[0][3] = "D1";
		ships[1][0] = "B7";
		ships[1][1] = "C7";
		ships[1][2] = "D7";
		ships[2][0] = "A5";
		ships[2][1] = "A6";
	}

	public String getShips(int i, int j) {
		return ships[i][j];
	}

}
