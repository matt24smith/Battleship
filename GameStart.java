import javax.swing.*;

public class GameStart {

	public static boolean A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5,
			B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D5, D6,
			D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7,
			F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8;

	public GameStart() {
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
	}

	public static void attackOpponent(String location) {
		GameGUI gameGUI = ShipSorter.getGameGUI();

		int attempt = 0;

		if (Game.score != 9 && Game.AIScore != 9) {
			if (Game.playerTurn == true) {
				boolean missedHit = false;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 4; j++) {

						if (AIPlayer.getShips(i, j) != null) {

							// A1
							if (location.equals("A1")) {
								if (AIPlayer.getShips(i, j).equals("A1")
										&& A1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A1"))) && A1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA1);
									attempt++;
									if (attempt == 9 && A1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A1 = true;
									}
								} else if (A1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A2
							if (location.equals("A2")) {
								if (AIPlayer.getShips(i, j).equals("A2")
										&& A2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A2"))) && A2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA2);
									attempt++;
									if (attempt == 9 && A2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A2 = true;
									}
								} else if (A2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A3
							if (location.equals("A3")) {
								if (AIPlayer.getShips(i, j).equals("A3")
										&& A3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A3"))) && A3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA3);
									attempt++;
									if (attempt == 9 && A3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A3 = true;
									}
								} else if (A3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A4
							if (location.equals("A4")) {
								if (AIPlayer.getShips(i, j).equals("A4")
										&& A4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A4"))) && A4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA4);
									attempt++;
									if (attempt == 9 && A4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A4 = true;
									}
								} else if (A4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A5
							if (location.equals("A5")) {
								if (AIPlayer.getShips(i, j).equals("A5")
										&& A5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A5"))) && A5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA5);
									attempt++;
									if (attempt == 9 && A5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A5 = true;
									}
								} else if (A5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A6
							if (location.equals("A6")) {
								if (AIPlayer.getShips(i, j).equals("A6")
										&& A6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A6"))) && A6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA6);
									attempt++;
									if (attempt == 9 && A6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A6 = true;
									}
								} else if (A6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A7
							if (location.equals("A7")) {
								if (AIPlayer.getShips(i, j).equals("A7")
										&& A7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A7"))) && A7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA7);
									attempt++;
									if (attempt == 9 && A7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A7 = true;
									}
								} else if (A7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// A8
							if (location.equals("A8")) {
								if (AIPlayer.getShips(i, j).equals("A8")
										&& A8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonA8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									A8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("A8"))) && A8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonA8);
									attempt++;
									if (attempt == 9 && A8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										A8 = true;
									}
								} else if (A8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B1
							if (location.equals("B1")) {
								if (AIPlayer.getShips(i, j).equals("B1")
										&& B1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B1"))) && B1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB1);
									attempt++;
									if (attempt == 9 && B1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B1 = true;
									}
								} else if (B1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B2
							if (location.equals("B2")) {
								if (AIPlayer.getShips(i, j).equals("B2")
										&& B2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B2"))) && B2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB2);
									attempt++;
									if (attempt == 9 && B2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B2 = true;
									}
								} else if (B2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B3
							if (location.equals("B3")) {
								if (AIPlayer.getShips(i, j).equals("B3")
										&& B3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B3"))) && B3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB3);
									attempt++;
									if (attempt == 9 && B3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B3 = true;
									}
								} else if (B3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B4
							if (location.equals("B4")) {
								if (AIPlayer.getShips(i, j).equals("B4")
										&& B4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B4"))) && B4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB4);
									attempt++;
									if (attempt == 9 && B4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B4 = true;
									}
								} else if (B4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B5
							if (location.equals("B5")) {
								if (AIPlayer.getShips(i, j).equals("B5")
										&& B5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B5"))) && B5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB5);
									attempt++;
									if (attempt == 9 && B5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B5 = true;
									}
								} else if (B5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B6
							if (location.equals("B6")) {
								if (AIPlayer.getShips(i, j).equals("B6")
										&& B6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B6"))) && B6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB6);
									attempt++;
									if (attempt == 9 && B6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B6 = true;
									}
								} else if (B6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B7
							if (location.equals("B7")) {
								if (AIPlayer.getShips(i, j).equals("B7")
										&& B7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B7"))) && B7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB7);
									attempt++;
									if (attempt == 9 && B7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B7 = true;
									}
								} else if (B7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// B8
							if (location.equals("B8")) {
								if (AIPlayer.getShips(i, j).equals("B8")
										&& B8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonB8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									B8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("B8"))) && B8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonB8);
									attempt++;
									if (attempt == 9 && B8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										B8 = true;
									}
								} else if (B8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C1
							if (location.equals("C1")) {
								if (AIPlayer.getShips(i, j).equals("C1")
										&& C1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C1"))) && C1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC1);
									attempt++;
									if (attempt == 9 && C1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C1 = true;
									}
								} else if (C1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C2
							if (location.equals("C2")) {
								if (AIPlayer.getShips(i, j).equals("C2")
										&& C2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C2"))) && C2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC2);
									attempt++;
									if (attempt == 9 && C2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C2 = true;
									}
								} else if (C2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C3
							if (location.equals("C3")) {
								if (AIPlayer.getShips(i, j).equals("C3")
										&& C3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C3"))) && C3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC3);
									attempt++;
									if (attempt == 9 && C3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C3 = true;
									}
								} else if (C3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C4
							if (location.equals("C4")) {
								if (AIPlayer.getShips(i, j).equals("C4")
										&& C4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C4"))) && C4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC4);
									attempt++;
									if (attempt == 9 && C4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C4 = true;
									}
								} else if (C4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C5
							if (location.equals("C5")) {
								if (AIPlayer.getShips(i, j).equals("C5")
										&& C5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C5"))) && C5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC5);
									attempt++;
									if (attempt == 9 && C5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C5 = true;
									}
								} else if (C5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C6
							if (location.equals("C6")) {
								if (AIPlayer.getShips(i, j).equals("C6")
										&& C6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C6"))) && C6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC6);
									attempt++;
									if (attempt == 9 && C6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C6 = true;
									}
								} else if (C6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C7
							if (location.equals("C7")) {
								if (AIPlayer.getShips(i, j).equals("C7")
										&& C7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C7"))) && C7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC7);
									attempt++;
									if (attempt == 9 && C7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C7 = true;
									}
								} else if (C7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// C8
							if (location.equals("C8")) {
								if (AIPlayer.getShips(i, j).equals("C8")
										&& C8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonC8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									C8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("C8"))) && C8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonC8);
									attempt++;
									if (attempt == 9 && C8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										C8 = true;
									}
								} else if (C8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D1
							if (location.equals("D1")) {
								if (AIPlayer.getShips(i, j).equals("D1")
										&& D1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D1"))) && D1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD1);
									attempt++;
									if (attempt == 9 && D1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D1 = true;
									}
								} else if (D1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D2
							if (location.equals("D2")) {
								if (AIPlayer.getShips(i, j).equals("D2")
										&& D2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D2"))) && D2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD2);
									attempt++;
									if (attempt == 9 && D2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D2 = true;
									}
								} else if (D2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D3
							if (location.equals("D3")) {
								if (AIPlayer.getShips(i, j).equals("D3")
										&& D3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D3"))) && D3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD3);
									attempt++;
									if (attempt == 9 && D3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D3 = true;
									}
								} else if (D3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D4
							if (location.equals("D4")) {
								if (AIPlayer.getShips(i, j).equals("D4")
										&& D4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D4"))) && D4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD4);
									attempt++;
									if (attempt == 9 && D4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D4 = true;
									}
								} else if (D4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D5
							if (location.equals("D5")) {
								if (AIPlayer.getShips(i, j).equals("D5")
										&& D5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D5"))) && D5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD5);
									attempt++;
									if (attempt == 9 && D5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D5 = true;
									}
								} else if (D5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D6
							if (location.equals("D6")) {
								if (AIPlayer.getShips(i, j).equals("D6")
										&& D6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D6"))) && D6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD6);
									attempt++;
									if (attempt == 9 && D6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D6 = true;
									}
								} else if (D6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D7
							if (location.equals("D7")) {
								if (AIPlayer.getShips(i, j).equals("D7")
										&& D7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D7"))) && D7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD7);
									attempt++;
									if (attempt == 9 && D7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D7 = true;
									}
								} else if (D7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// D8
							if (location.equals("D8")) {
								if (AIPlayer.getShips(i, j).equals("D8")
										&& D8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonD8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									D8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("D8"))) && D8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonD8);
									attempt++;
									if (attempt == 9 && D8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										D8 = true;
									}
								} else if (D8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E1
							if (location.equals("E1")) {
								if (AIPlayer.getShips(i, j).equals("E1")
										&& E1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E1"))) && E1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE1);
									attempt++;
									if (attempt == 9 && E1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E1 = true;
									}
								} else if (E1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E2
							if (location.equals("E2")) {
								if (AIPlayer.getShips(i, j).equals("E2")
										&& E2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E2"))) && E2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE2);
									attempt++;
									if (attempt == 9 && E2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E2 = true;
									}
								} else if (E2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E3
							if (location.equals("E3")) {
								if (AIPlayer.getShips(i, j).equals("E3")
										&& E3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E3"))) && E3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE3);
									attempt++;
									if (attempt == 9 && E3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E3 = true;
									}
								} else if (E3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E4
							if (location.equals("E4")) {
								if (AIPlayer.getShips(i, j).equals("E4")
										&& E4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E4"))) && E4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE4);
									attempt++;
									if (attempt == 9 && E4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E4 = true;
									}
								} else if (E4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E5
							if (location.equals("E5")) {
								if (AIPlayer.getShips(i, j).equals("E5")
										&& E5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E5"))) && E5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE5);
									attempt++;
									if (attempt == 9 && E5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E5 = true;
									}
								} else if (E5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E6
							if (location.equals("E6")) {
								if (AIPlayer.getShips(i, j).equals("E6")
										&& E6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E6"))) && E6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE6);
									attempt++;
									if (attempt == 9 && E6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E6 = true;
									}
								} else if (E6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E7
							if (location.equals("E7")) {
								if (AIPlayer.getShips(i, j).equals("E7")
										&& E7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E7"))) && E7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE7);
									attempt++;
									if (attempt == 9 && E7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E7 = true;
									}
								} else if (E7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// E8
							if (location.equals("E8")) {
								if (AIPlayer.getShips(i, j).equals("E8")
										&& E8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonE8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									E8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("E8"))) && E8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonE8);
									attempt++;
									if (attempt == 9 && E8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										E8 = true;
									}
								} else if (E8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F1
							if (location.equals("F1")) {
								if (AIPlayer.getShips(i, j).equals("F1")
										&& F1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F1"))) && F1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF1);
									attempt++;
									if (attempt == 9 && F1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F1 = true;
									}
								} else if (F1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F2
							if (location.equals("F2")) {
								if (AIPlayer.getShips(i, j).equals("F2")
										&& F2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F2"))) && F2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF2);
									attempt++;
									if (attempt == 9 && F2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F2 = true;
									}
								} else if (F2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F3
							if (location.equals("F3")) {
								if (AIPlayer.getShips(i, j).equals("F3")
										&& F3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F3"))) && F3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF3);
									attempt++;
									if (attempt == 9 && F3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F3 = true;
									}
								} else if (F3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F4
							if (location.equals("F4")) {
								if (AIPlayer.getShips(i, j).equals("F4")
										&& F4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F4"))) && F4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF4);
									attempt++;
									if (attempt == 9 && F4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F4 = true;
									}
								} else if (F4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F5
							if (location.equals("F5")) {
								if (AIPlayer.getShips(i, j).equals("F5")
										&& F5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F5"))) && F5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF5);
									attempt++;
									if (attempt == 9 && F5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F5 = true;
									}
								} else if (F5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F6
							if (location.equals("F6")) {
								if (AIPlayer.getShips(i, j).equals("F6")
										&& F6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F6"))) && F6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF6);
									attempt++;
									if (attempt == 9 && F6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F6 = true;
									}
								} else if (F6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F7
							if (location.equals("F7")) {
								if (AIPlayer.getShips(i, j).equals("F7")
										&& F7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F7"))) && F7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF7);
									attempt++;
									if (attempt == 9 && F7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F7 = true;
									}
								} else if (F7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// F8
							if (location.equals("F8")) {
								if (AIPlayer.getShips(i, j).equals("F8")
										&& F8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonF8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									F8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("F8"))) && F8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonF8);
									attempt++;
									if (attempt == 9 && F8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										F8 = true;
									}
								} else if (F8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G1
							if (location.equals("G1")) {
								if (AIPlayer.getShips(i, j).equals("G1")
										&& G1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G1"))) && G1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG1);
									attempt++;
									if (attempt == 9 && G1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G1 = true;
									}
								} else if (G1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G2
							if (location.equals("G2")) {
								if (AIPlayer.getShips(i, j).equals("G2")
										&& G2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G2"))) && G2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG2);
									attempt++;
									if (attempt == 9 && G2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G2 = true;
									}
								} else if (G2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G3
							if (location.equals("G3")) {
								if (AIPlayer.getShips(i, j).equals("G3")
										&& G3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G3"))) && G3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG3);
									attempt++;
									if (attempt == 9 && G3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G3 = true;
									}
								} else if (G3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G4
							if (location.equals("G4")) {
								if (AIPlayer.getShips(i, j).equals("G4")
										&& G4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G4"))) && G4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG4);
									attempt++;
									if (attempt == 9 && G4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G4 = true;
									}
								} else if (G4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G5
							if (location.equals("G5")) {
								if (AIPlayer.getShips(i, j).equals("G5")
										&& G5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G5"))) && G5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG5);
									attempt++;
									if (attempt == 9 && G5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G5 = true;
									}
								} else if (G5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G6
							if (location.equals("G6")) {
								if (AIPlayer.getShips(i, j).equals("G6")
										&& G6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G6"))) && G6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG6);
									attempt++;
									if (attempt == 9 && G6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G6 = true;
									}
								} else if (G6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G7
							if (location.equals("G7")) {
								if (AIPlayer.getShips(i, j).equals("G7")
										&& G7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G7"))) && G7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG7);
									attempt++;
									if (attempt == 9 && G7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G7 = true;
									}
								} else if (G7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// G8
							if (location.equals("G8")) {
								if (AIPlayer.getShips(i, j).equals("G8")
										&& G8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonG8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									G8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("G8"))) && G8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonG8);
									attempt++;
									if (attempt == 9 && G8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										G8 = true;
									}
								} else if (G8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H1
							if (location.equals("H1")) {
								if (AIPlayer.getShips(i, j).equals("H1")
										&& H1 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH1);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H1 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H1"))) && H1 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH1);
									attempt++;
									if (attempt == 9 && H1 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H1 = true;
									}
								} else if (H1 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H2
							if (location.equals("H2")) {
								if (AIPlayer.getShips(i, j).equals("H2")
										&& H2 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH2);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H2 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H2"))) && H2 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH2);
									attempt++;
									if (attempt == 9 && H2 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H2 = true;
									}
								} else if (H2 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H3
							if (location.equals("H3")) {
								if (AIPlayer.getShips(i, j).equals("H3")
										&& H3 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH3);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H3 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H3"))) && H3 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH3);
									attempt++;
									if (attempt == 9 && H3 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H3 = true;
									}
								} else if (H3 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H4
							if (location.equals("H4")) {
								if (AIPlayer.getShips(i, j).equals("H4")
										&& H4 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH4);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H4 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H4"))) && H4 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH4);
									attempt++;
									if (attempt == 9 && H4 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H4 = true;
									}
								} else if (H4 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H5
							if (location.equals("H5")) {
								if (AIPlayer.getShips(i, j).equals("H5")
										&& H5 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH5);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H5 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H5"))) && H5 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH5);
									attempt++;
									if (attempt == 9 && H5 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H5 = true;
									}
								} else if (H5 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H6
							if (location.equals("H6")) {
								if (AIPlayer.getShips(i, j).equals("H6")
										&& H6 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH6);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H6 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H6"))) && H6 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH6);
									attempt++;
									if (attempt == 9 && H6 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H6 = true;
									}
								} else if (H6 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H7
							if (location.equals("H7")) {
								if (AIPlayer.getShips(i, j).equals("H7")
										&& H7 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH7);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H7 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H7"))) && H7 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH7);
									attempt++;
									if (attempt == 9 && H7 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H7 = true;
									}
								} else if (H7 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}

							// H8
							if (location.equals("H8")) {
								if (AIPlayer.getShips(i, j).equals("H8")
										&& H8 == false) {
									gameGUI.colorHit(gameGUI.OjButtonH8);
									Game.score++;
									gameGUI.text("OPPONENT SHIP HIT");
									attempt++;
									Game.playerTurn = true;
									H8 = true;
									if ((Game.score > 8)) {
										gameGUI.text("GAME IS OVER - YOU HAVE WON!");
									}
								} else if (!((AIPlayer.getShips(i, j)
										.equals("H8"))) && H8 == false) {
									gameGUI.colorMiss(gameGUI.OjButtonH8);
									attempt++;
									if (attempt == 9 && H8 == false) {
										Game.playerTurn = false;
										gameGUI.text("OPPONENT SHIP MISSED");
										attempt++;
										H8 = true;
									}
								} else if (H8 == true) {
									if (attempt == 0) {
										Game.playerTurn = true;
										gameGUI.text("ERROR - LOCATION ALREADY ATTACKED");
										attempt++;
									}
								}
							}
						}
					}
				}
			}
		} else if (Game.score == 9) {// game is over - player won
			gameGUI.text("GAME IS OVER - YOU HAVE WON!");
		} else {
			gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
		}// game is over - player lost
	}
}
