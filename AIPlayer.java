import java.util.Random;
import java.util.*;

public class AIPlayer {

	public static String[][] ships = new String[3][4];
	public static int[] shipLocation = new int[2];
	public static String[] atkLocation = new String[2];
	public static int[] attackLocation = new int[2];
   public static int[] tempLocation = new int[2];
	public static boolean[][] alreadyAttacked = new boolean[8][8];
	public static boolean A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5,
			B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D5, D6,
			D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7,
			F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8;
   public static boolean playerHit = false;

	private static int shipsCreated = 0;

	public AIPlayer() {
	}

	public AIPlayer(boolean bool) {
		A1 = bool;
		A2 = bool;
		A3 = bool;
		A4 = bool;
		A5 = bool;
		A6 = bool;
		A7 = bool;
		A8 = bool;
		B1 = bool;
		B2 = bool;
		B3 = bool;
		B4 = bool;
		B5 = bool;
		B6 = bool;
		B7 = bool;
		B8 = bool;
		C1 = bool;
		C2 = bool;
		C3 = bool;
		C4 = bool;
		C5 = bool;
		C6 = bool;
		C7 = bool;
		C8 = bool;
		D1 = bool;
		D2 = bool;
		D3 = bool;
		D4 = bool;
		D5 = bool;
		D6 = bool;
		D7 = bool;
		D8 = bool;
		E1 = bool;
		E2 = bool;
		E3 = bool;
		E4 = bool;
		E5 = bool;
		E6 = bool;
		E7 = bool;
		E8 = bool;
		F1 = bool;
		F2 = bool;
		F3 = bool;
		F4 = bool;
		F5 = bool;
		F6 = bool;
		F7 = bool;
		F8 = bool;
		G1 = bool;
		G2 = bool;
		G3 = bool;
		G4 = bool;
		G5 = bool;
		G6 = bool;
		G7 = bool;
		G8 = bool;
		H1 = bool;
		H2 = bool;
		H3 = bool;
		H4 = bool;
		H5 = bool;
		H6 = bool;
		H7 = bool;
		H8 = bool;
	}

	public static String[][] createShips() {

		if (shipsCreated == 0) {
			int x = 0;
			int y = 0;
			int r = 1;

			Random random = new Random();

			for (int i = 0; i < 3; i++) {// Determine coords for boats + place
											// boats
				r = random.nextInt(2) + 1;// Rotated 1-Vert 2-Horz

				if (i == 0) {// Aircraft
					if (r == 1) {
						x = random.nextInt((8 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((5 - 1) + 1) + 1;
					}// Number coord

					else if (r == 2) {
						x = random.nextInt((5 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((8 - 1) + 1) + 1;
					}// Number coord
				}

				else if (i == 1) {// Destroyer
					if (r == 1) {
						x = random.nextInt((8 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((6 - 1) + 1) + 1;
					}// Number coord

					else if (r == 2) {
						x = random.nextInt((6 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((8 - 1) + 1) + 1;
					}// Number coord
				}

				else if (i == 2) {// Submarine
					if (r == 1) {
						x = random.nextInt((8 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((7 - 1) + 1) + 1;
					}// Number coord

					else if (r == 2) {
						x = random.nextInt((7 - 1) + 1) + 1;// Letter coord
						y = random.nextInt((8 - 1) + 1) + 1;
					}// Number coord
				}

				if (x == 1) {
					shipLocation[0] = 1;
				} else if (x == 2) {
					shipLocation[0] = 2;
				} else if (x == 3) {
					shipLocation[0] = 3;
				} else if (x == 4) {
					shipLocation[0] = 4;
				} else if (x == 5) {
					shipLocation[0] = 5;
				} else if (x == 6) {
					shipLocation[0] = 6;
				} else if (x == 7) {
					shipLocation[0] = 7;
				} else if (x == 8) {
					shipLocation[0] = 8;
				}

				if (y == 1) {
					shipLocation[1] = 1;
				} else if (y == 2) {
					shipLocation[1] = 2;
				} else if (y == 3) {
					shipLocation[1] = 3;
				} else if (y == 4) {
					shipLocation[1] = 4;
				} else if (y == 5) {
					shipLocation[1] = 5;
				} else if (y == 6) {
					shipLocation[1] = 6;
				} else if (y == 7) {
					shipLocation[1] = 7;
				} else if (y == 8) {
					shipLocation[1] = 8;
				}

				if (i == 0) {
					if (r == 1) {
						ships[0][0] = convertArray(shipLocation);
						shipLocation[1]++;
						ships[0][1] = convertArray(shipLocation);
						shipLocation[1]++;
						ships[0][2] = convertArray(shipLocation);
						shipLocation[1]++;
						ships[0][3] = convertArray(shipLocation);
					}

					else if (r == 2) {
						ships[0][0] = convertArray(shipLocation);
						shipLocation[0]++;
						ships[0][1] = convertArray(shipLocation);
						shipLocation[0]++;
						ships[0][2] = convertArray(shipLocation);
						shipLocation[0]++;
						ships[0][3] = convertArray(shipLocation);
					}
				}

				if (i == 1) {
					if (r == 1) {
						if (!(ships[0][0].equals(convertArray(shipLocation))
								|| ships[0][1]
										.equals(convertArray(shipLocation))
								|| ships[0][2]
										.equals(convertArray(shipLocation)) || ships[0][3]
									.equals(convertArray(shipLocation)))) {
							ships[1][0] = convertArray(shipLocation);
							shipLocation[1]++;
							if (!(ships[0][0]
									.equals(convertArray(shipLocation))
									|| ships[0][1]
											.equals(convertArray(shipLocation))
									|| ships[0][2]
											.equals(convertArray(shipLocation)) || ships[0][3]
										.equals(convertArray(shipLocation)))) {
								ships[1][1] = convertArray(shipLocation);
								shipLocation[1]++;
								if (!(ships[0][0]
										.equals(convertArray(shipLocation))
										|| ships[0][1]
												.equals(convertArray(shipLocation))
										|| ships[0][2]
												.equals(convertArray(shipLocation)) || ships[0][3]
											.equals(convertArray(shipLocation)))) {
									ships[1][2] = convertArray(shipLocation);
								} else {
									ships[1][0] = null;
									ships[1][1] = null;
									i--;
								}
							} else {
								ships[1][0] = null;
								i--;
							}
						} else {
							i--;
						}
					} else if (r == 2) {
						if (!(ships[0][0].equals(convertArray(shipLocation))
								|| ships[0][1]
										.equals(convertArray(shipLocation))
								|| ships[0][2]
										.equals(convertArray(shipLocation)) || ships[0][3]
									.equals(convertArray(shipLocation)))) {
							ships[1][0] = convertArray(shipLocation);
							shipLocation[0]++;
							if (!(ships[0][0]
									.equals(convertArray(shipLocation))
									|| ships[0][1]
											.equals(convertArray(shipLocation))
									|| ships[0][2]
											.equals(convertArray(shipLocation)) || ships[0][3]
										.equals(convertArray(shipLocation)))) {
								ships[1][1] = convertArray(shipLocation);
								shipLocation[0]++;
								if (!(ships[0][0]
										.equals(convertArray(shipLocation))
										|| ships[0][1]
												.equals(convertArray(shipLocation))
										|| ships[0][2]
												.equals(convertArray(shipLocation)) || ships[0][3]
											.equals(convertArray(shipLocation)))) {
									ships[1][2] = convertArray(shipLocation);
								} else {
									ships[1][0] = null;
									ships[1][1] = null;
									i--;
								}
							} else {
								ships[1][0] = null;
								i--;
							}
						} else {
							i--;
						}
					}
				}

				if (i == 2) {
					if (r == 1) {
						if (!(ships[0][0].equals(convertArray(shipLocation))
								|| ships[0][1]
										.equals(convertArray(shipLocation))
								|| ships[0][2]
										.equals(convertArray(shipLocation))
								|| ships[0][3]
										.equals(convertArray(shipLocation))
								|| ships[1][0]
										.equals(convertArray(shipLocation))
								|| ships[1][1]
										.equals(convertArray(shipLocation)) || ships[1][2]
									.equals(convertArray(shipLocation)))) {
							ships[2][0] = convertArray(shipLocation);
							shipLocation[1]++;
							if (!(ships[0][0]
									.equals(convertArray(shipLocation))
									|| ships[0][1]
											.equals(convertArray(shipLocation))
									|| ships[0][2]
											.equals(convertArray(shipLocation))
									|| ships[0][3]
											.equals(convertArray(shipLocation))
									|| ships[1][0]
											.equals(convertArray(shipLocation))
									|| ships[1][1]
											.equals(convertArray(shipLocation)) || ships[1][2]
										.equals(convertArray(shipLocation)))) {
								ships[2][1] = convertArray(shipLocation);
							} else {
								ships[2][0] = null;
								i--;
							}
						} else {
							i--;
						}
					}
					if (r == 2) {
						if (!(ships[0][0].equals(convertArray(shipLocation))
								|| ships[0][1]
										.equals(convertArray(shipLocation))
								|| ships[0][2]
										.equals(convertArray(shipLocation))
								|| ships[0][3]
										.equals(convertArray(shipLocation))
								|| ships[1][0]
										.equals(convertArray(shipLocation))
								|| ships[1][1]
										.equals(convertArray(shipLocation)) || ships[1][2]
									.equals(convertArray(shipLocation)))) {
							ships[2][0] = convertArray(shipLocation);
							shipLocation[0]++;
							if (!(ships[0][0]
									.equals(convertArray(shipLocation))
									|| ships[0][1]
											.equals(convertArray(shipLocation))
									|| ships[0][2]
											.equals(convertArray(shipLocation))
									|| ships[0][3]
											.equals(convertArray(shipLocation))
									|| ships[1][0]
											.equals(convertArray(shipLocation))
									|| ships[1][1]
											.equals(convertArray(shipLocation)) || ships[1][2]
										.equals(convertArray(shipLocation)))) {
								ships[2][1] = convertArray(shipLocation);
							} else {
								ships[2][0] = null;
								i--;
							}
						} else {
							i--;
						}
					}
				}
			}

			// TESTING PURPOSES - COLORS AI SHIPS
			
			 OpponentColor OC = new OpponentColor(); OC.colorShip(ships);
			 
			// TESTING PURPOSES - COLORS AI SHIPS

			shipsCreated = 1;
			return ships;
		} else {
			return ships;
		}
	}

	public static String getShips(int i, int j) {
		return ships[i][j];
	}

	public static boolean attackPlayerShipDumb() {
		Random random = new Random();
		GameGUI gameGUI = ShipSorter.getGameGUI();
		int i = 0;
		while (i == 0) {

			if ((Game.AIScore != 9)) {
				if (Game.playerTurn == false) {
					int aX = random.nextInt((8 - 1) + 1) + 1;
					int aY = random.nextInt((8 - 1) + 1) + 1;

					attackLocation[0] = aX;
					attackLocation[1] = aY;

					String location = convertArray(attackLocation);
					String[][] playerShips = ShipSorter.getShips();

					// ---------------------------------------------------------
					if (location.equals("A1")) {
						if (A1 == true) {// A1 has been shot before
							i = 0;
						}// go back to top of while loop
						else if (A1 == false) {// A1 has not been shot before
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {// check if
																	// any ships
																	// are there
										if (playerShips[k][m].equals("A1")
												&& A1 == false) {// if yes -
																	// player
																	// ship is
																	// at A1
											gameGUI.colorHit(gameGUI.jButtonA1);
											gameGUI.text("PLAYER SHIP HIT");// color
																			// spot
																			// +
																			// show
																			// text
											A1 = true;// A1 has been shot
											Game.AIScore++;// increase AI score
											Game.playerTurn = false;// continue
																	// opponents
																	// turn
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {// player ship is not at A1
											gameGUI.colorMiss(gameGUI.jButtonA1);
										}// color A1 missed
									}
								}
							}
							A1 = true;// A1 has been shot
							i = 1;// opponents turn is over
						}
					}
					// ---------------------------------------------------------
					else if (location.equals("A2")) {
						if (A2 == true) {
							i = 0;
						} else if (A2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A2")
												&& A2 == false) {
											gameGUI.colorHit(gameGUI.jButtonA2);
											gameGUI.text("PLAYER SHIP HIT");
											A2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA2);
										}
									}
								}
							}
							A2 = true;
							i = 1;
						}
					}

					else if (location.equals("A3")) {
						if (A3 == true) {
							i = 0;
						} else if (A3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A3")
												&& A3 == false) {
											gameGUI.colorHit(gameGUI.jButtonA3);
											gameGUI.text("PLAYER SHIP HIT");
											A3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA3);
										}
									}
								}
							}
							A3 = true;
							i = 1;
						}
					}

					else if (location.equals("A4")) {
						if (A4 == true) {
							i = 0;
						} else if (A4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A4")
												&& A4 == false) {
											gameGUI.colorHit(gameGUI.jButtonA4);
											gameGUI.text("PLAYER SHIP HIT");
											A4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA4);
										}
									}
								}
							}
							A4 = true;
							i = 1;
						}
					}

					else if (location.equals("A5")) {
						if (A5 == true) {
							i = 0;
						} else if (A5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A5")
												&& A5 == false) {
											gameGUI.colorHit(gameGUI.jButtonA5);
											gameGUI.text("PLAYER SHIP HIT");
											A5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA5);
										}
									}
								}
							}
							A5 = true;
							i = 1;
						}
					}

					else if (location.equals("A6")) {
						if (A6 == true) {
							i = 0;
						} else if (A6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A6")
												&& A6 == false) {
											gameGUI.colorHit(gameGUI.jButtonA6);
											gameGUI.text("PLAYER SHIP HIT");
											A6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA6);
										}
									}
								}
							}
							A6 = true;
							i = 1;
						}
					}

					else if (location.equals("A7")) {
						if (A7 == true) {
							i = 0;
						} else if (A7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A7")
												&& A7 == false) {
											gameGUI.colorHit(gameGUI.jButtonA7);
											gameGUI.text("PLAYER SHIP HIT");
											A7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA7);
										}
									}
								}
							}
							A7 = true;
							i = 1;
						}
					}

					else if (location.equals("A8")) {
						if (A8 == true) {
							i = 0;
						} else if (A8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A8")
												&& A8 == false) {
											gameGUI.colorHit(gameGUI.jButtonA8);
											gameGUI.text("PLAYER SHIP HIT");
											A8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA8);
										}
									}
								}
							}
							A8 = true;
							i = 1;
						}
					}

					else if (location.equals("B1")) {
						if (B1 == true) {
							i = 0;
						} else if (B1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B1")
												&& B1 == false) {
											gameGUI.colorHit(gameGUI.jButtonB1);
											gameGUI.text("PLAYER SHIP HIT");
											B1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB1);
										}
									}
								}
							}
							B1 = true;
							i = 1;
						}
					}

					else if (location.equals("B2")) {
						if (B2 == true) {
							i = 0;
						} else if (B2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B2")
												&& B2 == false) {
											gameGUI.colorHit(gameGUI.jButtonB2);
											gameGUI.text("PLAYER SHIP HIT");
											B2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB2);
										}
									}
								}
							}
							B2 = true;
							i = 1;
						}
					}

					else if (location.equals("B3")) {
						if (B3 == true) {
							i = 0;
						} else if (B3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B3")
												&& B3 == false) {
											gameGUI.colorHit(gameGUI.jButtonB3);
											gameGUI.text("PLAYER SHIP HIT");
											B3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB3);
										}
									}
								}
							}
							B3 = true;
							i = 1;
						}
					}

					else if (location.equals("B4")) {
						if (B4 == true) {
							i = 0;
						} else if (B4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B4")
												&& B4 == false) {
											gameGUI.colorHit(gameGUI.jButtonB4);
											gameGUI.text("PLAYER SHIP HIT");
											B4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB4);
										}
									}
								}
							}
							B4 = true;
							i = 1;
						}
					}

					else if (location.equals("B5")) {
						if (B5 == true) {
							i = 0;
						} else if (B5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B5")
												&& B5 == false) {
											gameGUI.colorHit(gameGUI.jButtonB5);
											gameGUI.text("PLAYER SHIP HIT");
											B5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB5);
										}
									}
								}
							}
							B5 = true;
							i = 1;
						}
					}

					else if (location.equals("B6")) {
						if (B6 == true) {
							i = 0;
						} else if (B6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B6")
												&& B6 == false) {
											gameGUI.colorHit(gameGUI.jButtonB6);
											gameGUI.text("PLAYER SHIP HIT");
											B6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB6);
										}
									}
								}
							}
							B6 = true;
							i = 1;
						}
					}

					else if (location.equals("B7")) {
						if (B7 == true) {
							i = 0;
						} else if (B7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B7")
												&& B7 == false) {
											gameGUI.colorHit(gameGUI.jButtonB7);
											gameGUI.text("PLAYER SHIP HIT");
											B7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB7);
										}
									}
								}
							}
							B7 = true;
							i = 1;
						}
					}

					else if (location.equals("B8")) {
						if (B8 == true) {
							i = 0;
						} else if (B8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B8")
												&& B8 == false) {
											gameGUI.colorHit(gameGUI.jButtonB8);
											gameGUI.text("PLAYER SHIP HIT");
											B8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB8);
										}
									}
								}
							}
							B8 = true;
							i = 1;
						}
					}

					else if (location.equals("C1")) {
						if (C1 == true) {
							i = 0;
						} else if (C1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C1")
												&& C1 == false) {
											gameGUI.colorHit(gameGUI.jButtonC1);
											gameGUI.text("PLAYER SHIP HIT");
											C1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC1);
										}
									}
								}
							}
							C1 = true;
							i = 1;
						}
					}

					else if (location.equals("C2")) {
						if (C2 == true) {
							i = 0;
						} else if (C2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C2")
												&& C2 == false) {
											gameGUI.colorHit(gameGUI.jButtonC2);
											gameGUI.text("PLAYER SHIP HIT");
											C2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC2);
										}
									}
								}
							}
							C2 = true;
							i = 1;
						}
					}

					else if (location.equals("C3")) {
						if (C3 == true) {
							i = 0;
						} else if (C3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C3")
												&& C3 == false) {
											gameGUI.colorHit(gameGUI.jButtonC3);
											gameGUI.text("PLAYER SHIP HIT");
											C3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC3);
										}
									}
								}
							}
							C3 = true;
							i = 1;
						}
					}

					else if (location.equals("C4")) {
						if (C4 == true) {
							i = 0;
						} else if (C4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C4")
												&& C4 == false) {
											gameGUI.colorHit(gameGUI.jButtonC4);
											gameGUI.text("PLAYER SHIP HIT");
											C4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC4);
										}
									}
								}
							}
							C4 = true;
							i = 1;
						}
					}

					else if (location.equals("C5")) {
						if (C5 == true) {
							i = 0;
						} else if (C5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C5")
												&& C5 == false) {
											gameGUI.colorHit(gameGUI.jButtonC5);
											gameGUI.text("PLAYER SHIP HIT");
											C5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC5);
										}
									}
								}
							}
							C5 = true;
							i = 1;
						}
					}

					else if (location.equals("C6")) {
						if (C6 == true) {
							i = 0;
						} else if (C6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C6")
												&& C6 == false) {
											gameGUI.colorHit(gameGUI.jButtonC6);
											gameGUI.text("PLAYER SHIP HIT");
											C6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC6);
										}
									}
								}
							}
							C6 = true;
							i = 1;
						}
					}

					else if (location.equals("C7")) {
						if (C7 == true) {
							i = 0;
						} else if (C7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C7")
												&& C7 == false) {
											gameGUI.colorHit(gameGUI.jButtonC7);
											gameGUI.text("PLAYER SHIP HIT");
											C7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC7);
										}
									}
								}
							}
							C7 = true;
							i = 1;
						}
					}

					else if (location.equals("C8")) {
						if (C8 == true) {
							i = 0;
						} else if (C8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C8")
												&& C8 == false) {
											gameGUI.colorHit(gameGUI.jButtonC8);
											gameGUI.text("PLAYER SHIP HIT");
											C8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC8);
										}
									}
								}
							}
							C8 = true;
							i = 1;
						}
					}

					else if (location.equals("D1")) {
						if (D1 == true) {
							i = 0;
						} else if (D1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D1")
												&& D1 == false) {
											gameGUI.colorHit(gameGUI.jButtonD1);
											gameGUI.text("PLAYER SHIP HIT");
											D1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD1);
										}
									}
								}
							}
							D1 = true;
							i = 1;
						}
					}

					else if (location.equals("D2")) {
						if (D2 == true) {
							i = 0;
						} else if (D2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D2")
												&& D2 == false) {
											gameGUI.colorHit(gameGUI.jButtonD2);
											gameGUI.text("PLAYER SHIP HIT");
											D2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD2);
										}
									}
								}
							}
							D2 = true;
							i = 1;
						}
					}

					else if (location.equals("D3")) {
						if (D3 == true) {
							i = 0;
						} else if (D3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D3")
												&& D3 == false) {
											gameGUI.colorHit(gameGUI.jButtonD3);
											gameGUI.text("PLAYER SHIP HIT");
											D3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD3);
										}
									}
								}
							}
							D3 = true;
							i = 1;
						}
					}

					else if (location.equals("D4")) {
						if (D4 == true) {
							i = 0;
						} else if (D4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D4")
												&& D4 == false) {
											gameGUI.colorHit(gameGUI.jButtonD4);
											gameGUI.text("PLAYER SHIP HIT");
											D4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD4);
										}
									}
								}
							}
							D4 = true;
							i = 1;
						}
					}

					else if (location.equals("D5")) {
						if (D5 == true) {
							i = 0;
						} else if (D5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D5")
												&& D5 == false) {
											gameGUI.colorHit(gameGUI.jButtonD5);
											gameGUI.text("PLAYER SHIP HIT");
											D5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD5);
										}
									}
								}
							}
							D5 = true;
							i = 1;
						}
					}

					else if (location.equals("D6")) {
						if (D6 == true) {
							i = 0;
						} else if (D6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D6")
												&& D6 == false) {
											gameGUI.colorHit(gameGUI.jButtonD6);
											gameGUI.text("PLAYER SHIP HIT");
											D6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD6);
										}
									}
								}
							}
							D6 = true;
							i = 1;
						}
					}

					else if (location.equals("D7")) {
						if (D7 == true) {
							i = 0;
						} else if (D7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D7")
												&& D7 == false) {
											gameGUI.colorHit(gameGUI.jButtonD7);
											gameGUI.text("PLAYER SHIP HIT");
											D7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD7);
										}
									}
								}
							}
							D7 = true;
							i = 1;
						}
					}

					else if (location.equals("D8")) {
						if (D8 == true) {
							i = 0;
						} else if (D8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D8")
												&& D8 == false) {
											gameGUI.colorHit(gameGUI.jButtonD8);
											gameGUI.text("PLAYER SHIP HIT");
											D8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD8);
										}
									}
								}
							}
							D8 = true;
							i = 1;
						}
					}

					if (location.equals("E1")) {
						if (E1 == true) {
							i = 0;
						} else if (E1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E1")
												&& E1 == false) {
											gameGUI.colorHit(gameGUI.jButtonE1);
											gameGUI.text("PLAYER SHIP HIT");
											E1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE1);
										}
									}
								}
							}
							E1 = true;
							i = 1;
						}
					}

					else if (location.equals("E2")) {
						if (E2 == true) {
							i = 0;
						} else if (E2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E2")
												&& E2 == false) {
											gameGUI.colorHit(gameGUI.jButtonE2);
											gameGUI.text("PLAYER SHIP HIT");
											E2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE2);
										}
									}
								}
							}
							E2 = true;
							i = 1;
						}
					}

					else if (location.equals("E3")) {
						if (E3 == true) {
							i = 0;
						} else if (E3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E3")
												&& E3 == false) {
											gameGUI.colorHit(gameGUI.jButtonE3);
											gameGUI.text("PLAYER SHIP HIT");
											E3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE3);
										}
									}
								}
							}
							E3 = true;
							i = 1;
						}
					}

					else if (location.equals("E4")) {
						if (E4 == true) {
							i = 0;
						} else if (E4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E4")
												&& E4 == false) {
											gameGUI.colorHit(gameGUI.jButtonE4);
											gameGUI.text("PLAYER SHIP HIT");
											E4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE4);
										}
									}
								}
							}
							E4 = true;
							i = 1;
						}
					}

					else if (location.equals("E5")) {
						if (E5 == true) {
							i = 0;
						} else if (E5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E5")
												&& E5 == false) {
											gameGUI.colorHit(gameGUI.jButtonE5);
											gameGUI.text("PLAYER SHIP HIT");
											E5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE5);
										}
									}
								}
							}
							E5 = true;
							i = 1;
						}
					}

					else if (location.equals("E6")) {
						if (E6 == true) {
							i = 0;
						} else if (E6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E6")
												&& E6 == false) {
											gameGUI.colorHit(gameGUI.jButtonE6);
											gameGUI.text("PLAYER SHIP HIT");
											E6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE6);
										}
									}
								}
							}
							E6 = true;
							i = 1;
						}
					}

					else if (location.equals("E7")) {
						if (E7 == true) {
							i = 0;
						} else if (E7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E7")
												&& E7 == false) {
											gameGUI.colorHit(gameGUI.jButtonE7);
											gameGUI.text("PLAYER SHIP HIT");
											E7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE7);
										}
									}
								}
							}
							E7 = true;
							i = 1;
						}
					}

					else if (location.equals("E8")) {
						if (E8 == true) {
							i = 0;
						} else if (E8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E8")
												&& E8 == false) {
											gameGUI.colorHit(gameGUI.jButtonE8);
											gameGUI.text("PLAYER SHIP HIT");
											E8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE8);
										}
									}
								}
							}
							E8 = true;
							i = 1;
						}
					}

					else if (location.equals("F1")) {
						if (F1 == true) {
							i = 0;
						} else if (F1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F1")
												&& F1 == false) {
											gameGUI.colorHit(gameGUI.jButtonF1);
											gameGUI.text("PLAYER SHIP HIT");
											F1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF1);
										}
									}
								}
							}
							F1 = true;
							i = 1;
						}
					}

					else if (location.equals("F2")) {
						if (F2 == true) {
							i = 0;
						} else if (F2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F2")
												&& F2 == false) {
											gameGUI.colorHit(gameGUI.jButtonF2);
											gameGUI.text("PLAYER SHIP HIT");
											F2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF2);
										}
									}
								}
							}
							F2 = true;
							i = 1;
						}
					}

					else if (location.equals("F3")) {
						if (F3 == true) {
							i = 0;
						} else if (F3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F3")
												&& F3 == false) {
											gameGUI.colorHit(gameGUI.jButtonF3);
											gameGUI.text("PLAYER SHIP HIT");
											F3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF3);
										}
									}
								}
							}
							F3 = true;
							i = 1;
						}
					}

					else if (location.equals("F4")) {
						if (F4 == true) {
							i = 0;
						} else if (F4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F4")
												&& F4 == false) {
											gameGUI.colorHit(gameGUI.jButtonF4);
											gameGUI.text("PLAYER SHIP HIT");
											F4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF4);
										}
									}
								}
							}
							F4 = true;
							i = 1;
						}
					}

					else if (location.equals("F5")) {
						if (F5 == true) {
							i = 0;
						} else if (F5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F5")
												&& F5 == false) {
											gameGUI.colorHit(gameGUI.jButtonF5);
											gameGUI.text("PLAYER SHIP HIT");
											F5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF5);
										}
									}
								}
							}
							F5 = true;
							i = 1;
						}
					}

					else if (location.equals("F6")) {
						if (F6 == true) {
							i = 0;
						} else if (F6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F6")
												&& F6 == false) {
											gameGUI.colorHit(gameGUI.jButtonF6);
											gameGUI.text("PLAYER SHIP HIT");
											F6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF6);
										}
									}
								}
							}
							F6 = true;
							i = 1;
						}
					}

					else if (location.equals("F7")) {
						if (F7 == true) {
							i = 0;
						} else if (F7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F7")
												&& F7 == false) {
											gameGUI.colorHit(gameGUI.jButtonF7);
											gameGUI.text("PLAYER SHIP HIT");
											F7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF7);
										}
									}
								}
							}
							F7 = true;
							i = 1;
						}
					}

					else if (location.equals("F8")) {
						if (F8 == true) {
							i = 0;
						} else if (F8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F8")
												&& F8 == false) {
											gameGUI.colorHit(gameGUI.jButtonF8);
											gameGUI.text("PLAYER SHIP HIT");
											F8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF8);
										}
									}
								}
							}
							F8 = true;
							i = 1;
						}
					}

					else if (location.equals("G1")) {
						if (G1 == true) {
							i = 0;
						} else if (G1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G1")
												&& G1 == false) {
											gameGUI.colorHit(gameGUI.jButtonG1);
											gameGUI.text("PLAYER SHIP HIT");
											G1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG1);
										}
									}
								}
							}
							G1 = true;
							i = 1;
						}
					}

					else if (location.equals("G2")) {
						if (G2 == true) {
							i = 0;
						} else if (G2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G2")
												&& G2 == false) {
											gameGUI.colorHit(gameGUI.jButtonG2);
											gameGUI.text("PLAYER SHIP HIT");
											G2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG2);
										}
									}
								}
							}
							G2 = true;
							i = 1;
						}
					}

					else if (location.equals("G3")) {
						if (G3 == true) {
							i = 0;
						} else if (G3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G3")
												&& G3 == false) {
											gameGUI.colorHit(gameGUI.jButtonG3);
											gameGUI.text("PLAYER SHIP HIT");
											G3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG3);
										}
									}
								}
							}
							G3 = true;
							i = 1;
						}
					}

					else if (location.equals("G4")) {
						if (G4 == true) {
							i = 0;
						} else if (G4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G4")
												&& G4 == false) {
											gameGUI.colorHit(gameGUI.jButtonG4);
											gameGUI.text("PLAYER SHIP HIT");
											G4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG4);
										}
									}
								}
							}
							G4 = true;
							i = 1;
						}
					}

					else if (location.equals("G5")) {
						if (G5 == true) {
							i = 0;
						} else if (G5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G5")
												&& G5 == false) {
											gameGUI.colorHit(gameGUI.jButtonG5);
											gameGUI.text("PLAYER SHIP HIT");
											G5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG5);
										}
									}
								}
							}
							G5 = true;
							i = 1;
						}
					}

					else if (location.equals("G6")) {
						if (G6 == true) {
							i = 0;
						} else if (G6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G6")
												&& G6 == false) {
											gameGUI.colorHit(gameGUI.jButtonG6);
											gameGUI.text("PLAYER SHIP HIT");
											G6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG6);
										}
									}
								}
							}
							G6 = true;
							i = 1;
						}
					}

					else if (location.equals("G7")) {
						if (G7 == true) {
							i = 0;
						} else if (G7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G7")
												&& G7 == false) {
											gameGUI.colorHit(gameGUI.jButtonG7);
											gameGUI.text("PLAYER SHIP HIT");
											G7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG7);
										}
									}
								}
							}
							G7 = true;
							i = 1;
						}
					}

					else if (location.equals("G8")) {
						if (G8 == true) {
							i = 0;
						} else if (G8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G8")
												&& G8 == false) {
											gameGUI.colorHit(gameGUI.jButtonG8);
											gameGUI.text("PLAYER SHIP HIT");
											G8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG8);
										}
									}
								}
							}
							G8 = true;
							i = 1;
						}
					}

					else if (location.equals("H1")) {
						if (H1 == true) {
							i = 0;
						} else if (H1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H1")
												&& H1 == false) {
											gameGUI.colorHit(gameGUI.jButtonH1);
											gameGUI.text("PLAYER SHIP HIT");
											H1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH1);
										}
									}
								}
							}
							H1 = true;
							i = 1;
						}
					}

					else if (location.equals("H2")) {
						if (H2 == true) {
							i = 0;
						} else if (H2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H2")
												&& H2 == false) {
											gameGUI.colorHit(gameGUI.jButtonH2);
											gameGUI.text("PLAYER SHIP HIT");
											H2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH2);
										}
									}
								}
							}
							H2 = true;
							i = 1;
						}
					}

					else if (location.equals("H3")) {
						if (H3 == true) {
							i = 0;
						} else if (H3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H3")
												&& H3 == false) {
											gameGUI.colorHit(gameGUI.jButtonH3);
											gameGUI.text("PLAYER SHIP HIT");
											H3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH3);
										}
									}
								}
							}
							H3 = true;
							i = 1;
						}
					}

					else if (location.equals("H4")) {
						if (H4 == true) {
							i = 0;
						} else if (H4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H4")
												&& H4 == false) {
											gameGUI.colorHit(gameGUI.jButtonH4);
											gameGUI.text("PLAYER SHIP HIT");
											H4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH4);
										}
									}
								}
							}
							H4 = true;
							i = 1;
						}
					}

					else if (location.equals("H5")) {
						if (H5 == true) {
							i = 0;
						} else if (H5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H5")
												&& H5 == false) {
											gameGUI.colorHit(gameGUI.jButtonH5);
											gameGUI.text("PLAYER SHIP HIT");
											H5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH5);
										}
									}
								}
							}
							H5 = true;
							i = 1;
						}
					}

					else if (location.equals("H6")) {
						if (H6 == true) {
							i = 0;
						} else if (H6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H6")
												&& H6 == false) {
											gameGUI.colorHit(gameGUI.jButtonH6);
											gameGUI.text("PLAYER SHIP HIT");
											H6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH6);
										}
									}
								}
							}
							H6 = true;
							i = 1;
						}
					}

					else if (location.equals("H7")) {
						if (H7 == true) {
							i = 0;
						} else if (H7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H7")
												&& H7 == false) {
											gameGUI.colorHit(gameGUI.jButtonH7);
											gameGUI.text("PLAYER SHIP HIT");
											H7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH7);
										}
									}
								}
							}
							H7 = true;
							i = 1;
						}
					}

					else if (location.equals("H8")) {
						if (H8 == true) {
							i = 0;
						} else if (H8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H8")
												&& H8 == false) {
											gameGUI.colorHit(gameGUI.jButtonH8);
											gameGUI.text("PLAYER SHIP HIT");
											H8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH8);
										}
									}
								}
							}
							H8 = true;
							i = 1;
						}
					}

				}
			}
		}
		return true;
	}

	// --------------------------------------------------------

	public static String convertArray(int[] intShip) {
		String location = "";
		if (intShip[0] == 1) {
			location = "A";
		} else if (intShip[0] == 2) {
			location = "B";
		} else if (intShip[0] == 3) {
			location = "C";
		} else if (intShip[0] == 4) {
			location = "D";
		} else if (intShip[0] == 5) {
			location = "E";
		} else if (intShip[0] == 6) {
			location = "F";
		} else if (intShip[0] == 7) {
			location = "G";
		} else if (intShip[0] == 8) {
			location = "H";
		}

		if (intShip[1] == 1) {
			location = location + "1";
		} else if (intShip[1] == 2) {
			location = location + "2";
		} else if (intShip[1] == 3) {
			location = location + "3";
		} else if (intShip[1] == 4) {
			location = location + "4";
		} else if (intShip[1] == 5) {
			location = location + "5";
		} else if (intShip[1] == 6) {
			location = location + "6";
		} else if (intShip[1] == 7) {
			location = location + "7";
		} else if (intShip[1] == 8) {
			location = location + "8";
		}

		return location;
	}
   
   // --------------------------------------------------------
   
	public static boolean attackPlayerShipSmart() {
		Random random = new Random();
		GameGUI gameGUI = ShipSorter.getGameGUI();
		int i = 0;
      int j = 0;
      int a = 0;
		while (i == 0) {
			if (Game.AIScore != 9) {
				if (Game.playerTurn == false) {
               if(playerHit == true && a < 12){
                  //while(j == 0&&a<12){
                     boolean aR = random.nextBoolean();
                     boolean aV = random.nextBoolean();
                     
                     if(aR == true){
                        if(aV==true){
                           tempLocation[0] = attackLocation[0]-1;
                           tempLocation[1] = attackLocation[1];}
                        else if (aV==false){
                           tempLocation[0] = attackLocation[0]+1;
                           tempLocation[1] = attackLocation[1];}
                        }   
                     else if(aR == false){
                        if(aV==true){
                           tempLocation[0] = attackLocation[0];
                           tempLocation[1] = attackLocation[1]-1;}
                        else if (aV==false){
                           tempLocation[0] = attackLocation[0];
                           tempLocation[1] = attackLocation[1]+1;}
                        }
                        
                        if(tempLocation[0]<=9&&tempLocation[0]>=1&&tempLocation[1]<=9&&tempLocation[1]>=1){  
                           if(convertArray(tempLocation).equals("A1")){if(A1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A1==true){a++;}}
                           if(convertArray(tempLocation).equals("A2")){if(A2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A2==true){a++;}}
                           if(convertArray(tempLocation).equals("A3")){if(A3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A3==true){a++;}}
                           if(convertArray(tempLocation).equals("A4")){if(A4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A4==true){a++;}}
                           if(convertArray(tempLocation).equals("A5")){if(A5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A5==true){a++;}}
                           if(convertArray(tempLocation).equals("A6")){if(A6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A6==true){a++;}}
                           if(convertArray(tempLocation).equals("A7")){if(A7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A7==true){a++;}}
                           if(convertArray(tempLocation).equals("A8")){if(A8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(A8==true){a++;}}
                           if(convertArray(tempLocation).equals("B1")){if(B1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B1==true){a++;}}
                           if(convertArray(tempLocation).equals("B2")){if(B2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B2==true){a++;}}
                           if(convertArray(tempLocation).equals("B3")){if(B3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B3==true){a++;}}
                           if(convertArray(tempLocation).equals("B4")){if(B4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B4==true){a++;}}
                           if(convertArray(tempLocation).equals("B5")){if(B5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B5==true){a++;}}
                           if(convertArray(tempLocation).equals("B6")){if(B6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B6==true){a++;}}
                           if(convertArray(tempLocation).equals("B7")){if(B7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B7==true){a++;}}
                           if(convertArray(tempLocation).equals("B8")){if(B8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(B8==true){a++;}}
                           if(convertArray(tempLocation).equals("C1")){if(C1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C1==true){a++;}}
                           if(convertArray(tempLocation).equals("C2")){if(C2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C2==true){a++;}}
                           if(convertArray(tempLocation).equals("C3")){if(C3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C3==true){a++;}}
                           if(convertArray(tempLocation).equals("C4")){if(C4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C4==true){a++;}}
                           if(convertArray(tempLocation).equals("C5")){if(C5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C5==true){a++;}}
                           if(convertArray(tempLocation).equals("C6")){if(C6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C6==true){a++;}}
                           if(convertArray(tempLocation).equals("C7")){if(C7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C7==true){a++;}}
                           if(convertArray(tempLocation).equals("C8")){if(C8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(C8==true){a++;}}
                           if(convertArray(tempLocation).equals("D1")){if(D1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D1==true){a++;}}
                           if(convertArray(tempLocation).equals("D2")){if(D2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D2==true){a++;}}
                           if(convertArray(tempLocation).equals("D3")){if(D3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D3==true){a++;}}
                           if(convertArray(tempLocation).equals("D4")){if(D4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D4==true){a++;}}
                           if(convertArray(tempLocation).equals("D5")){if(D5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D5==true){a++;}}
                           if(convertArray(tempLocation).equals("D6")){if(D6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D6==true){a++;}}
                           if(convertArray(tempLocation).equals("D7")){if(D7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D7==true){a++;}}
                           if(convertArray(tempLocation).equals("D8")){if(D8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(D8==true){a++;}}
                           if(convertArray(tempLocation).equals("E1")){if(E1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E1==true){a++;}}
                           if(convertArray(tempLocation).equals("E2")){if(E2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E2==true){a++;}}
                           if(convertArray(tempLocation).equals("E3")){if(E3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E3==true){a++;}}
                           if(convertArray(tempLocation).equals("E4")){if(E4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E4==true){a++;}}
                           if(convertArray(tempLocation).equals("E5")){if(E5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E5==true){a++;}}
                           if(convertArray(tempLocation).equals("E6")){if(E6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E6==true){a++;}}
                           if(convertArray(tempLocation).equals("E7")){if(E7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E7==true){a++;}}
                           if(convertArray(tempLocation).equals("E8")){if(E8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(E8==true){a++;}}
                           if(convertArray(tempLocation).equals("F1")){if(F1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F1==true){a++;}}
                           if(convertArray(tempLocation).equals("F2")){if(F2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F2==true){a++;}}
                           if(convertArray(tempLocation).equals("F3")){if(F3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F3==true){a++;}}
                           if(convertArray(tempLocation).equals("F4")){if(F4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F4==true){a++;}}
                           if(convertArray(tempLocation).equals("F5")){if(F5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F5==true){a++;}}
                           if(convertArray(tempLocation).equals("F6")){if(F6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F6==true){a++;}}
                           if(convertArray(tempLocation).equals("F7")){if(F7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F7==true){a++;}}
                           if(convertArray(tempLocation).equals("F8")){if(F8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(F8==true){a++;}}
                           if(convertArray(tempLocation).equals("G1")){if(G1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G1==true){a++;}}
                           if(convertArray(tempLocation).equals("G2")){if(G2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G2==true){a++;}}
                           if(convertArray(tempLocation).equals("G3")){if(G3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G3==true){a++;}}
                           if(convertArray(tempLocation).equals("G4")){if(G4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G4==true){a++;}}
                           if(convertArray(tempLocation).equals("G5")){if(G5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G5==true){a++;}}
                           if(convertArray(tempLocation).equals("G6")){if(G6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G6==true){a++;}}
                           if(convertArray(tempLocation).equals("G7")){if(G7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G7==true){a++;}}
                           if(convertArray(tempLocation).equals("G8")){if(G8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(G8==true){a++;}}
                           if(convertArray(tempLocation).equals("H1")){if(H1==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H1==true){a++;}}
                           if(convertArray(tempLocation).equals("H2")){if(H2==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H2==true){a++;}}
                           if(convertArray(tempLocation).equals("H3")){if(H3==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H3==true){a++;}}
                           if(convertArray(tempLocation).equals("H4")){if(H4==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H4==true){a++;}}
                           if(convertArray(tempLocation).equals("H5")){if(H5==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H5==true){a++;}}
                           if(convertArray(tempLocation).equals("H6")){if(H6==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H6==true){a++;}}
                           if(convertArray(tempLocation).equals("H7")){if(H7==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H7==true){a++;}}
                           if(convertArray(tempLocation).equals("H8")){if(H8==false){attackLocation[0] = tempLocation[0]; attackLocation[1] = tempLocation[1]; j=1;}else if(H8==true){a++;}}
                           }
                        else{
                           j=0;}//}
                           System.out.println(convertArray(attackLocation));System.out.println(a);}
                           
               
               
               else{
					   int aX = random.nextInt((8 - 1) + 1) + 1;
					   int aY = random.nextInt((8 - 1) + 1) + 1;

					   attackLocation[0] = aX;
					   attackLocation[1] = aY;}

					String location = convertArray(attackLocation);
					String[][] playerShips = ShipSorter.getShips();

					// ---------------------------------------------------------
					if (location.equals("A1")) {
						if (A1 == true) {// A1 has been shot before
							i = 0;
						}// go back to top of while loop
						else if (A1 == false) {// A1 has not been shot before
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {// check if any ships are there
										if (playerShips[k][m].equals("A1")
												&& A1 == false) {
											gameGUI.colorHit(gameGUI.jButtonA1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A1 = true;// A1 has been shot
											Game.AIScore++;// increase AI score
											Game.playerTurn = false;// continue opponents turn
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {// player ship is not at A1
											gameGUI.colorMiss(gameGUI.jButtonA1);
                                 playerHit = false;
										}
									}
								}
							}
							A1 = true;// A1 has been shot
							i = 1;// opponents turn is over
						}
					}
               
               else if (location.equals("A2")) {
						if (A2 == true) {
							i = 0;
						} else if (A2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A2")
												&& A2 == false) {
											gameGUI.colorHit(gameGUI.jButtonA2);
											gameGUI.text("PLAYER SHIP HIT");
                                                                  if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA2);
										   playerHit = false;
										}
									}
								}
							}
							A2 = true;
							i = 1;
						}
					}

					else if (location.equals("A3")) {
						if (A3 == true) {
							i = 0;
						} else if (A3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A3")
												&& A3 == false) {
											gameGUI.colorHit(gameGUI.jButtonA3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA3);
										   playerHit = false;
										}
									}
								}
							}
							A3 = true;
							i = 1;
						}
					}

					else if (location.equals("A4")) {
						if (A4 == true) {
							i = 0;
						} else if (A4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A4")
												&& A4 == false) {
											gameGUI.colorHit(gameGUI.jButtonA4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA4);
										   playerHit = false;
										}
									}
								}
							}
							A4 = true;
							i = 1;
						}
					}

					else if (location.equals("A5")) {
						if (A5 == true) {
							i = 0;
						} else if (A5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A5")
												&& A5 == false) {
											gameGUI.colorHit(gameGUI.jButtonA5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA5);
										   playerHit = false;
										}
									}
								}
							}
							A5 = true;
							i = 1;
						}
					}

					else if (location.equals("A6")) {
						if (A6 == true) {
							i = 0;
						} else if (A6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A6")
												&& A6 == false) {
											gameGUI.colorHit(gameGUI.jButtonA6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA6);
										   playerHit = false;
										}
									}
								}
							}
							A6 = true;
							i = 1;
						}
					}

					else if (location.equals("A7")) {
						if (A7 == true) {
							i = 0;
						} else if (A7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A7")
												&& A7 == false) {
											gameGUI.colorHit(gameGUI.jButtonA7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA7);
										   playerHit = false;
										}
									}
								}
							}
							A7 = true;
							i = 1;
						}
					}

					else if (location.equals("A8")) {
						if (A8 == true) {
							i = 0;
						} else if (A8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A8")
												&& A8 == false) {
											gameGUI.colorHit(gameGUI.jButtonA8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											A8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonA8);
										   playerHit = false;
										}
									}
								}
							}
							A8 = true;
							i = 1;
						}
					}

					else if (location.equals("B1")) {
						if (B1 == true) {
							i = 0;
						} else if (B1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B1")
												&& B1 == false) {
											gameGUI.colorHit(gameGUI.jButtonB1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB1);
										   playerHit = false;
										}
									}
								}
							}
							B1 = true;
							i = 1;
						}
					}

					else if (location.equals("B2")) {
						if (B2 == true) {
							i = 0;
						} else if (B2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B2")
												&& B2 == false) {
											gameGUI.colorHit(gameGUI.jButtonB2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB2);
										   playerHit = false;
										}
									}
								}
							}
							B2 = true;
							i = 1;
						}
					}

					else if (location.equals("B3")) {
						if (B3 == true) {
							i = 0;
						} else if (B3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B3")
												&& B3 == false) {
											gameGUI.colorHit(gameGUI.jButtonB3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB3);
										   playerHit = false;
										}
									}
								}
							}
							B3 = true;
							i = 1;
						}
					}

					else if (location.equals("B4")) {
						if (B4 == true) {
							i = 0;
						} else if (B4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B4")
												&& B4 == false) {
											gameGUI.colorHit(gameGUI.jButtonB4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB4);
										   playerHit = false;
										}
									}
								}
							}
							B4 = true;
							i = 1;
						}
					}

					else if (location.equals("B5")) {
						if (B5 == true) {
							i = 0;
						} else if (B5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B5")
												&& B5 == false) {
											gameGUI.colorHit(gameGUI.jButtonB5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB5);
										   playerHit = false;
										}
									}
								}
							}
							B5 = true;
							i = 1;
						}
					}

					else if (location.equals("B6")) {
						if (B6 == true) {
							i = 0;
						} else if (B6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B6")
												&& B6 == false) {
											gameGUI.colorHit(gameGUI.jButtonB6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB6);
										   playerHit = false;
										}
									}
								}
							}
							B6 = true;
							i = 1;
						}
					}

					else if (location.equals("B7")) {
						if (B7 == true) {
							i = 0;
						} else if (B7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B7")
												&& B7 == false) {
											gameGUI.colorHit(gameGUI.jButtonB7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB7);
										   playerHit = false;
										}
									}
								}
							}
							B7 = true;
							i = 1;
						}
					}

					else if (location.equals("B8")) {
						if (B8 == true) {
							i = 0;
						} else if (B8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B8")
												&& B8 == false) {
											gameGUI.colorHit(gameGUI.jButtonB8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											B8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB8);
										   playerHit = false;
										}
									}
								}
							}
							B8 = true;
							i = 1;
						}
					}

					else if (location.equals("C1")) {
						if (C1 == true) {
							i = 0;
						} else if (C1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C1")
												&& C1 == false) {
											gameGUI.colorHit(gameGUI.jButtonC1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC1);
										   playerHit = false;
										}
									}
								}
							}
							C1 = true;
							i = 1;
						}
					}

					else if (location.equals("C2")) {
						if (C2 == true) {
							i = 0;
						} else if (C2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C2")
												&& C2 == false) {
											gameGUI.colorHit(gameGUI.jButtonC2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC2);
										   playerHit = false;
										}
									}
								}
							}
							C2 = true;
							i = 1;
						}
					}

					else if (location.equals("C3")) {
						if (C3 == true) {
							i = 0;
						} else if (C3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C3")
												&& C3 == false) {
											gameGUI.colorHit(gameGUI.jButtonC3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC3);
										   playerHit = false;
										}
									}
								}
							}
							C3 = true;
							i = 1;
						}
					}

					else if (location.equals("C4")) {
						if (C4 == true) {
							i = 0;
						} else if (C4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C4")
												&& C4 == false) {
											gameGUI.colorHit(gameGUI.jButtonC4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC4);
										   playerHit = false;
										}
									}
								}
							}
							C4 = true;
							i = 1;
						}
					}

					else if (location.equals("C5")) {
						if (C5 == true) {
							i = 0;
						} else if (C5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C5")
												&& C5 == false) {
											gameGUI.colorHit(gameGUI.jButtonC5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC5);
										   playerHit = false;
										}
									}
								}
							}
							C5 = true;
							i = 1;
						}
					}

					else if (location.equals("C6")) {
						if (C6 == true) {
							i = 0;
						} else if (C6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C6")
												&& C6 == false) {
											gameGUI.colorHit(gameGUI.jButtonC6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC6);
										   playerHit = false;
										}
									}
								}
							}
							C6 = true;
							i = 1;
						}
					}

					else if (location.equals("C7")) {
						if (C7 == true) {
							i = 0;
						} else if (C7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C7")
												&& C7 == false) {
											gameGUI.colorHit(gameGUI.jButtonC7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC7);
										   playerHit = false;
										}
									}
								}
							}
							C7 = true;
							i = 1;
						}
					}

					else if (location.equals("C8")) {
						if (C8 == true) {
							i = 0;
						} else if (C8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C8")
												&& C8 == false) {
											gameGUI.colorHit(gameGUI.jButtonC8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											C8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonC8);
										   playerHit = false;
										}
									}
								}
							}
							C8 = true;
							i = 1;
						}
					}

					else if (location.equals("D1")) {
						if (D1 == true) {
							i = 0;
						} else if (D1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D1")
												&& D1 == false) {
											gameGUI.colorHit(gameGUI.jButtonD1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD1);
										   playerHit = false;
										}
									}
								}
							}
							D1 = true;
							i = 1;
						}
					}

					else if (location.equals("D2")) {
						if (D2 == true) {
							i = 0;
						} else if (D2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D2")
												&& D2 == false) {
											gameGUI.colorHit(gameGUI.jButtonD2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD2);
										   playerHit = false;
										}
									}
								}
							}
							D2 = true;
							i = 1;
						}
					}

					else if (location.equals("D3")) {
						if (D3 == true) {
							i = 0;
						} else if (D3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D3")
												&& D3 == false) {
											gameGUI.colorHit(gameGUI.jButtonD3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD3);
										   playerHit = false;
										}
									}
								}
							}
							D3 = true;
							i = 1;
						}
					}

					else if (location.equals("D4")) {
						if (D4 == true) {
							i = 0;
						} else if (D4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D4")
												&& D4 == false) {
											gameGUI.colorHit(gameGUI.jButtonD4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD4);
										   playerHit = false;
										}
									}
								}
							}
							D4 = true;
							i = 1;
						}
					}

					else if (location.equals("D5")) {
						if (D5 == true) {
							i = 0;
						} else if (D5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D5")
												&& D5 == false) {
											gameGUI.colorHit(gameGUI.jButtonD5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD5);
										   playerHit = false;
										}
									}
								}
							}
							D5 = true;
							i = 1;
						}
					}

					else if (location.equals("D6")) {
						if (D6 == true) {
							i = 0;
						} else if (D6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D6")
												&& D6 == false) {
											gameGUI.colorHit(gameGUI.jButtonD6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD6);
										   playerHit = false;
										}
									}
								}
							}
							D6 = true;
							i = 1;
						}
					}

					else if (location.equals("D7")) {
						if (D7 == true) {
							i = 0;
						} else if (D7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D7")
												&& D7 == false) {
											gameGUI.colorHit(gameGUI.jButtonD7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD7);
										   playerHit = false;
										}
									}
								}
							}
							D7 = true;
							i = 1;
						}
					}

					else if (location.equals("D8")) {
						if (D8 == true) {
							i = 0;
						} else if (D8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D8")
												&& D8 == false) {
											gameGUI.colorHit(gameGUI.jButtonD8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											D8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonD8);
										   playerHit = false;
										}
									}
								}
							}
							D8 = true;
							i = 1;
						}
					}

					if (location.equals("E1")) {
						if (E1 == true) {
							i = 0;
						} else if (E1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E1")
												&& E1 == false) {
											gameGUI.colorHit(gameGUI.jButtonE1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE1);
										   playerHit = false;
										}
									}
								}
							}
							E1 = true;
							i = 1;
						}
					}

					else if (location.equals("E2")) {
						if (E2 == true) {
							i = 0;
						} else if (E2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E2")
												&& E2 == false) {
											gameGUI.colorHit(gameGUI.jButtonE2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE2);
										   playerHit = false;
										}
									}
								}
							}
							E2 = true;
							i = 1;
						}
					}

					else if (location.equals("E3")) {
						if (E3 == true) {
							i = 0;
						} else if (E3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E3")
												&& E3 == false) {
											gameGUI.colorHit(gameGUI.jButtonE3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE3);
										   playerHit = false;
										}
									}
								}
							}
							E3 = true;
							i = 1;
						}
					}

					else if (location.equals("E4")) {
						if (E4 == true) {
							i = 0;
						} else if (E4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E4")
												&& E4 == false) {
											gameGUI.colorHit(gameGUI.jButtonE4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE4);
										   playerHit = false;
										}
									}
								}
							}
							E4 = true;
							i = 1;
						}
					}

					else if (location.equals("E5")) {
						if (E5 == true) {
							i = 0;
						} else if (E5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E5")
												&& E5 == false) {
											gameGUI.colorHit(gameGUI.jButtonE5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE5);
										   playerHit = false;
										}
									}
								}
							}
							E5 = true;
							i = 1;
						}
					}

					else if (location.equals("E6")) {
						if (E6 == true) {
							i = 0;
						} else if (E6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E6")
												&& E6 == false) {
											gameGUI.colorHit(gameGUI.jButtonE6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE6);
										   playerHit = false;
										}
									}
								}
							}
							E6 = true;
							i = 1;
						}
					}

					else if (location.equals("E7")) {
						if (E7 == true) {
							i = 0;
						} else if (E7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E7")
												&& E7 == false) {
											gameGUI.colorHit(gameGUI.jButtonE7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE7);
										   playerHit = false;
										}
									}
								}
							}
							E7 = true;
							i = 1;
						}
					}

					else if (location.equals("E8")) {
						if (E8 == true) {
							i = 0;
						} else if (E8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E8")
												&& E8 == false) {
											gameGUI.colorHit(gameGUI.jButtonE8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											E8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonE8);
										   playerHit = false;
										}
									}
								}
							}
							E8 = true;
							i = 1;
						}
					}

					else if (location.equals("F1")) {
						if (F1 == true) {
							i = 0;
						} else if (F1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F1")
												&& F1 == false) {
											gameGUI.colorHit(gameGUI.jButtonF1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF1);
										   playerHit = false;
										}
									}
								}
							}
							F1 = true;
							i = 1;
						}
					}

					else if (location.equals("F2")) {
						if (F2 == true) {
							i = 0;
						} else if (F2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F2")
												&& F2 == false) {
											gameGUI.colorHit(gameGUI.jButtonF2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF2);
										   playerHit = false;
										}
									}
								}
							}
							F2 = true;
							i = 1;
						}
					}

					else if (location.equals("F3")) {
						if (F3 == true) {
							i = 0;
						} else if (F3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F3")
												&& F3 == false) {
											gameGUI.colorHit(gameGUI.jButtonF3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF3);
										   playerHit = false;
										}
									}
								}
							}
							F3 = true;
							i = 1;
						}
					}

					else if (location.equals("F4")) {
						if (F4 == true) {
							i = 0;
						} else if (F4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F4")
												&& F4 == false) {
											gameGUI.colorHit(gameGUI.jButtonF4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF4);
										   playerHit = false;
										}
									}
								}
							}
							F4 = true;
							i = 1;
						}
					}

					else if (location.equals("F5")) {
						if (F5 == true) {
							i = 0;
						} else if (F5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F5")
												&& F5 == false) {
											gameGUI.colorHit(gameGUI.jButtonF5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF5);
										   playerHit = false;
										}
									}
								}
							}
							F5 = true;
							i = 1;
						}
					}

					else if (location.equals("F6")) {
						if (F6 == true) {
							i = 0;
						} else if (F6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F6")
												&& F6 == false) {
											gameGUI.colorHit(gameGUI.jButtonF6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF6);
										   playerHit = false;
										}
									}
								}
							}
							F6 = true;
							i = 1;
						}
					}

					else if (location.equals("F7")) {
						if (F7 == true) {
							i = 0;
						} else if (F7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F7")
												&& F7 == false) {
											gameGUI.colorHit(gameGUI.jButtonF7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF7);
										   playerHit = false;
										}
									}
								}
							}
							F7 = true;
							i = 1;
						}
					}

					else if (location.equals("F8")) {
						if (F8 == true) {
							i = 0;
						} else if (F8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F8")
												&& F8 == false) {
											gameGUI.colorHit(gameGUI.jButtonF8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											F8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonF8);
										   playerHit = false;
										}
									}
								}
							}
							F8 = true;
							i = 1;
						}
					}

					else if (location.equals("G1")) {
						if (G1 == true) {
							i = 0;
						} else if (G1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G1")
												&& G1 == false) {
											gameGUI.colorHit(gameGUI.jButtonG1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG1);
										   playerHit = false;
										}
									}
								}
							}
							G1 = true;
							i = 1;
						}
					}

					else if (location.equals("G2")) {
						if (G2 == true) {
							i = 0;
						} else if (G2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G2")
												&& G2 == false) {
											gameGUI.colorHit(gameGUI.jButtonG2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG2);
										   playerHit = false;
										}
									}
								}
							}
							G2 = true;
							i = 1;
						}
					}

					else if (location.equals("G3")) {
						if (G3 == true) {
							i = 0;
						} else if (G3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G3")
												&& G3 == false) {
											gameGUI.colorHit(gameGUI.jButtonG3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG3);
										   playerHit = false;
										}
									}
								}
							}
							G3 = true;
							i = 1;
						}
					}

					else if (location.equals("G4")) {
						if (G4 == true) {
							i = 0;
						} else if (G4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G4")
												&& G4 == false) {
											gameGUI.colorHit(gameGUI.jButtonG4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG4);
										   playerHit = false;
										}
									}
								}
							}
							G4 = true;
							i = 1;
						}
					}

					else if (location.equals("G5")) {
						if (G5 == true) {
							i = 0;
						} else if (G5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G5")
												&& G5 == false) {
											gameGUI.colorHit(gameGUI.jButtonG5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG5);
										   playerHit = false;
										}
									}
								}
							}
							G5 = true;
							i = 1;
						}
					}

					else if (location.equals("G6")) {
						if (G6 == true) {
							i = 0;
						} else if (G6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G6")
												&& G6 == false) {
											gameGUI.colorHit(gameGUI.jButtonG6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG6);
										   playerHit = false;
										}
									}
								}
							}
							G6 = true;
							i = 1;
						}
					}

					else if (location.equals("G7")) {
						if (G7 == true) {
							i = 0;
						} else if (G7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G7")
												&& G7 == false) {
											gameGUI.colorHit(gameGUI.jButtonG7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG7);
										   playerHit = false;
										}
									}
								}
							}
							G7 = true;
							i = 1;
						}
					}

					else if (location.equals("G8")) {
						if (G8 == true) {
							i = 0;
						} else if (G8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G8")
												&& G8 == false) {
											gameGUI.colorHit(gameGUI.jButtonG8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											G8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonG8);
										   playerHit = false;
										}
									}
								}
							}
							G8 = true;
							i = 1;
						}
					}

					else if (location.equals("H1")) {
						if (H1 == true) {
							i = 0;
						} else if (H1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H1")
												&& H1 == false) {
											gameGUI.colorHit(gameGUI.jButtonH1);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H1 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH1);
										   playerHit = false;
										}
									}
								}
							}
							H1 = true;
							i = 1;
						}
					}

					else if (location.equals("H2")) {
						if (H2 == true) {
							i = 0;
						} else if (H2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H2")
												&& H2 == false) {
											gameGUI.colorHit(gameGUI.jButtonH2);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H2 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH2);
										   playerHit = false;
										}
									}
								}
							}
							H2 = true;
							i = 1;
						}
					}

					else if (location.equals("H3")) {
						if (H3 == true) {
							i = 0;
						} else if (H3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H3")
												&& H3 == false) {
											gameGUI.colorHit(gameGUI.jButtonH3);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H3 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH3);
										   playerHit = false;
										}
									}
								}
							}
							H3 = true;
							i = 1;
						}
					}

					else if (location.equals("H4")) {
						if (H4 == true) {
							i = 0;
						} else if (H4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H4")
												&& H4 == false) {
											gameGUI.colorHit(gameGUI.jButtonH4);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H4 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH4);
										   playerHit = false;
										}
									}
								}
							}
							H4 = true;
							i = 1;
						}
					}

					else if (location.equals("H5")) {
						if (H5 == true) {
							i = 0;
						} else if (H5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H5")
												&& H5 == false) {
											gameGUI.colorHit(gameGUI.jButtonH5);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H5 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH5);
										   playerHit = false;
										}
									}
								}
							}
							H5 = true;
							i = 1;
						}
					}

					else if (location.equals("H6")) {
						if (H6 == true) {
							i = 0;
						} else if (H6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H6")
												&& H6 == false) {
											gameGUI.colorHit(gameGUI.jButtonH6);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H6 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH6);
										   playerHit = false;
										}
									}
								}
							}
							H6 = true;
							i = 1;
						}
					}

					else if (location.equals("H7")) {
						if (H7 == true) {
							i = 0;
						} else if (H7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H7")
												&& H7 == false) {
											gameGUI.colorHit(gameGUI.jButtonH7);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H7 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH7);
										   playerHit = false;
										}
									}
								}
							}
							H7 = true;
							i = 1;
						}
					}

					else if (location.equals("H8")) {
						if (H8 == true) {
							i = 0;
						} else if (H8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H8")
												&& H8 == false) {
											gameGUI.colorHit(gameGUI.jButtonH8);
											gameGUI.text("PLAYER SHIP HIT");
                                 if(Game.AIScore != 9){ 
                                    playerHit = true;}
                                 else{
                                    playerHit = false;}
											H8 = true;
											Game.AIScore++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonH8);
										   playerHit = false;
										}
									}
								}
							}
							H8 = true;
							i = 1;
						}
					}
            }
         
         }
         else {
				gameGUI.text("GAME IS OVER - YOU HAVE LOST!");
				Game.playerTurn = false;
				i = 1;}
      }
      return true;
   }
}
