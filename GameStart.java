public class GameStart {

	public GameStart() {
	}

	public void attackOpponent(String location) {
		GameGUI gameGUI = ShipSorter.getGameGUI();
		AIPlayer AI = new AIPlayer();

		int attempt = 0;
		boolean A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D5, D6, D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7, F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8;
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

		if (Game.playerTurn == true) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					if (AI.getShips(i, j) != null) {

						if (location.equals("A1")) {
							if (AI.getShips(i, j).equals("A1")) {
								gameGUI.colorHit(gameGUI.OjButtonA1);
								Game.score++;
								System.out.println(Game.score);
								gameGUI.text("HIT");
								Game.playerTurn = true;
								A1 = true;
							} else if (!((AI.getShips(i, j).equals("A1")))
									&& A1 == false) {
								gameGUI.colorMiss(gameGUI.OjButtonA1);
								if (attempt == 0) {
									Game.playerTurn = false;
									gameGUI.text("MISS");
									attempt++;
								}
							}
						}

					}
				}
			}
		} else if (Game.playerTurn == false) {
			gameGUI.text("ERROR - NOT YOUR TURN");
		}
	}

}
