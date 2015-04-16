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
	private static int shipsCreated = 0;
   public static WinScreen winScreen = new WinScreen();
   public static LoseScreen loseScreen = new LoseScreen();

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
			//////////////////////
			//OpponentColor OC = new OpponentColor(); OC.colorShip(ships);
			///////////////////// 
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");// color
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
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											A8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											B8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											C8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											D8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											E8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											F8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											G8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H1 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H2 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H3 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H4 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H5 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H6 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H7 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
											H8 = true;
											Game.AIScore++;

											Game.playerTurn = false;

											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
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

	public static int[] reverseConvert(String location) {
      int[] aLocation = new int[2];
		if (location.charAt(0)=='A') {
			aLocation[0] = 1;
		} else if (location.charAt(0)=='B') {
			aLocation[0] = 2;
		} else if (location.charAt(0)=='C') {
			aLocation[0] = 3;
		} else if (location.charAt(0)=='D') {
			aLocation[0] = 4;
		} else if (location.charAt(0)=='E') {
			aLocation[0] = 5;
		} else if (location.charAt(0)=='F') {
			aLocation[0] = 6;
		} else if (location.charAt(0)=='G') {
			aLocation[0] = 7;
		} else if (location.charAt(0)=='H') {
			aLocation[0] = 8;
		}

		if (location.charAt(1)=='1') {
			aLocation[1] = 1;
		} else if (location.charAt(1)=='2') {
			aLocation[1] = 2;
		} else if (location.charAt(1)=='3') {
			aLocation[1] = 3;
		} else if (location.charAt(1)=='4') {
			aLocation[1] = 4;
		} else if (location.charAt(1)=='5') {
			aLocation[1] = 5;
		} else if (location.charAt(1)=='6') {
			aLocation[1] = 6;
		} else if (location.charAt(1)=='7') {
			aLocation[1] = 7;
		} else if (location.charAt(1)=='8') {
			aLocation[1] = 8;
		}
		return aLocation;
	}

   
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
   
   public static int AITurn = 0;
   public static int hitTests = 0;
   public static boolean direction = true;
   
   public static boolean attackPlayerShipSmart() {
		Random random = new Random();
		GameGUI gameGUI = ShipSorter.getGameGUI();
      String[][] playerShips = ShipSorter.getShips();
      String location = "";
      int attempts = 0;
      boolean convertTemp = false;
      
      while(Game.playerTurn == false){
      if(Game.AIScore != 9){
            if(hitTests >= 1){
              if(hitTests==4){direction = random.nextBoolean();}//true - H false - V
               if(direction==true){
                  if(hitTests==4){
                     tempLocation[0]=attackLocation[0]+1;
                     tempLocation[1]=attackLocation[1];
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==3){
                     tempLocation[0]=attackLocation[0]-1;
                     tempLocation[1]=attackLocation[1];
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==2){
                     tempLocation[0]=attackLocation[0];
                     tempLocation[1]=attackLocation[1]+1;
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==1){
                     tempLocation[0]=attackLocation[0];
                     tempLocation[1]=attackLocation[1]-1;
                     hitTests--;
                     convertTemp=true;}
                  }  
               
              else if(direction==false){
                  if(hitTests==4){
                     tempLocation[0]=attackLocation[0];
                     tempLocation[1]=attackLocation[1]+1;
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==3){
                     tempLocation[0]=attackLocation[0];
                     tempLocation[1]=attackLocation[1]-1;
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==2){
                     tempLocation[0]=attackLocation[0]+1;
                     tempLocation[1]=attackLocation[1];
                     hitTests--;
                     convertTemp=true;}
                  else if(hitTests==1){
                     tempLocation[0]=attackLocation[0]-1;
                     tempLocation[1]=attackLocation[1];
                     hitTests--;
                     convertTemp=true;}
                  }
               System.out.println("Location: "+convertArray(attackLocation)+" Attack: "+convertArray(tempLocation));
               }
            
            else{//hitTests == 0
               convertTemp=false;
               if(AITurn<32){
                  int tx = random.nextInt((8 - 1) + 1) + 1;
                  int ty = random.nextInt((4 - 1) + 1) + 1;
                  if(tx%2==0){//even x rows
                     if(ty==1){attackLocation[0]=tx;attackLocation[1]=1;}
                     else if(ty==2){attackLocation[0]=tx;attackLocation[1]=3;}
                     else if(ty==3){attackLocation[0]=tx;attackLocation[1]=5;}
                     else if(ty==4){attackLocation[0]=tx;attackLocation[1]=7;}
                  }
                  else{//odd x rows
                     if(ty==1){attackLocation[0]=tx;attackLocation[1]=2;}
                     else if(ty==2){attackLocation[0]=tx;attackLocation[1]=4;}
                     else if(ty==3){attackLocation[0]=tx;attackLocation[1]=6;}
                     else if(ty==4){attackLocation[0]=tx;attackLocation[1]=8;}
                 }
               }
               else{
                  attackLocation[0] = random.nextInt((8 - 1) + 1) + 1;
                  attackLocation[1] = random.nextInt((8 - 1) + 1) + 1;
               }
            
            }
            
            if(tempLocation[0]>=9||tempLocation[0]<=0||tempLocation[1]>=9||tempLocation[0]<=0){
               convertTemp=true;
               tempLocation[0] = random.nextInt((8 - 1) + 1) + 1;
               tempLocation[1] = random.nextInt((8 - 1) + 1) + 1;
            }
            
            if(convertTemp==true){location = convertArray(tempLocation);}
            else {location = convertArray(attackLocation);}
            //System.out.println(location);
					// ---------------------------------------------------------
					if (location.equals("A1")) {
						if (A1 == true) {// A1 has been shot before
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A1 == false) {// A1 has not been shot before
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {// check if any ships are there
										if (playerShips[k][m].equals("A1")
												&& A1 == false) {
											gameGUI.colorHit(gameGUI.jButtonA1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A1 = true;// A1 has been shot
                                 attackLocation=reverseConvert("A1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;// continue opponents turn
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {// player ship is not at A1

											gameGUI.colorMiss(gameGUI.jButtonA1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A1 = true;// A1 has been shot
							Game.playerTurn = true;// opponents turn is over
                     AITurn++;
						}
					}
               
               if (location.equals("A2")) {
						if (A2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A2")
												&& A2 == false) {
											gameGUI.colorHit(gameGUI.jButtonA2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A2 = true;// A2 has been shot
                                 attackLocation=reverseConvert("A2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A3")) {
						if (A3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A3")
												&& A3 == false) {
											gameGUI.colorHit(gameGUI.jButtonA3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A3 = true;// A3 has been shot
                                 attackLocation=reverseConvert("A3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A4")) {
						if (A4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A4")
												&& A4 == false) {
											gameGUI.colorHit(gameGUI.jButtonA4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A4 = true;// A4 has been shot
                                 attackLocation=reverseConvert("A4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A5")) {
						if (A5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A5")
												&& A5 == false) {
											gameGUI.colorHit(gameGUI.jButtonA5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A5 = true;// A5 has been shot
                                 attackLocation=reverseConvert("A5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A6")) {
						if (A6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A6")
												&& A6 == false) {
											gameGUI.colorHit(gameGUI.jButtonA6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A6 = true;// A6 has been shot
                                 attackLocation=reverseConvert("A6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A7")) {
						if (A7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A7")
												&& A7 == false) {
											gameGUI.colorHit(gameGUI.jButtonA7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A7 = true;// A7 has been shot
                                 attackLocation=reverseConvert("A7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("A8")) {
						if (A8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (A8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("A8")
												&& A8 == false) {
											gameGUI.colorHit(gameGUI.jButtonA8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											A8 = true;// A8 has been shot
                                 attackLocation=reverseConvert("A8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonA8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							A8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B1")) {
						if (B1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B1")
												&& B1 == false) {
											gameGUI.colorHit(gameGUI.jButtonB1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B1 = true;
                                 attackLocation=reverseConvert("B1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {
											gameGUI.colorMiss(gameGUI.jButtonB1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B2")) {
						if (B2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B2")
												&& B2 == false) {
											gameGUI.colorHit(gameGUI.jButtonB2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B2 = true;// B2 has been shot
                                 attackLocation=reverseConvert("B2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B3")) {
						if (B3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B3")
												&& B3 == false) {
											gameGUI.colorHit(gameGUI.jButtonB3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B3 = true;// B3 has been shot
                                 attackLocation=reverseConvert("B3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B4")) {
						if (B4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B4")
												&& B4 == false) {
											gameGUI.colorHit(gameGUI.jButtonB4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B4 = true;// B4 has been shot
                                 attackLocation=reverseConvert("B4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B5")) {
						if (B5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B5")
												&& B5 == false) {
											gameGUI.colorHit(gameGUI.jButtonB5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B5 = true;// B5 has been shot
                                 attackLocation=reverseConvert("B5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B6")) {
						if (B6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B6")
												&& B6 == false) {
											gameGUI.colorHit(gameGUI.jButtonB6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B6 = true;// B6 has been shot
                                 attackLocation=reverseConvert("B6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B7")) {
						if (B7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B7")
												&& B7 == false) {
											gameGUI.colorHit(gameGUI.jButtonB7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B7 = true;// B7 has been shot
                                 attackLocation=reverseConvert("B7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("B8")) {
						if (B8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (B8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("B8")
												&& B8 == false) {
											gameGUI.colorHit(gameGUI.jButtonB8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											B8 = true;// B8 has been shot
                                 attackLocation=reverseConvert("B8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonB8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							B8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
					if (location.equals("C1")) {
						if (C1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C1")
												&& C1 == false) {
											gameGUI.colorHit(gameGUI.jButtonC1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C1 = true;
                                 attackLocation=reverseConvert("C1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C2")) {
						if (C2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C2")
												&& C2 == false) {
											gameGUI.colorHit(gameGUI.jButtonC2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C2 = true;// C2 has been shot
                                 attackLocation=reverseConvert("C2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C3")) {
						if (C3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C3")
												&& C3 == false) {
											gameGUI.colorHit(gameGUI.jButtonC3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C3 = true;// C3 has been shot
                                 attackLocation=reverseConvert("C3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C4")) {
						if (C4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C4")
												&& C4 == false) {
											gameGUI.colorHit(gameGUI.jButtonC4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C4 = true;// C4 has been shot
                                 attackLocation=reverseConvert("C4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C5")) {
						if (C5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C5")
												&& C5 == false) {
											gameGUI.colorHit(gameGUI.jButtonC5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C5 = true;// C5 has been shot
                                 attackLocation=reverseConvert("C5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C6")) {
						if (C6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C6")
												&& C6 == false) {
											gameGUI.colorHit(gameGUI.jButtonC6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C6 = true;// C6 has been shot
                                 attackLocation=reverseConvert("C6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C7")) {
						if (C7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C7")
												&& C7 == false) {
											gameGUI.colorHit(gameGUI.jButtonC7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C7 = true;// C7 has been shot
                                 attackLocation=reverseConvert("C7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("C8")) {
						if (C8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (C8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("C8")
												&& C8 == false) {
											gameGUI.colorHit(gameGUI.jButtonC8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											C8 = true;// C8 has been shot
                                 attackLocation=reverseConvert("C8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonC8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							C8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
					if (location.equals("D1")) {
						if (D1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D1")
												&& D1 == false) {
											gameGUI.colorHit(gameGUI.jButtonD1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D1 = true;
                                 attackLocation=reverseConvert("D1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D2")) {
						if (D2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D2")
												&& D2 == false) {
											gameGUI.colorHit(gameGUI.jButtonD2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D2 = true;// D2 has been shot
                                 attackLocation=reverseConvert("D2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D3")) {
						if (D3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D3")
												&& D3 == false) {
											gameGUI.colorHit(gameGUI.jButtonD3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D3 = true;// D3 has been shot
                                 attackLocation=reverseConvert("D3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D4")) {
						if (D4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D4")
												&& D4 == false) {
											gameGUI.colorHit(gameGUI.jButtonD4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D4 = true;// D4 has been shot
                                 attackLocation=reverseConvert("D4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D5")) {
						if (D5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D5")
												&& D5 == false) {
											gameGUI.colorHit(gameGUI.jButtonD5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D5 = true;// D5 has been shot
                                 attackLocation=reverseConvert("D5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D6")) {
						if (D6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D6")
												&& D6 == false) {
											gameGUI.colorHit(gameGUI.jButtonD6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D6 = true;// D6 has been shot
                                 attackLocation=reverseConvert("D6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D7")) {
						if (D7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D7")
												&& D7 == false) {
											gameGUI.colorHit(gameGUI.jButtonD7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D7 = true;// D7 has been shot
                                 attackLocation=reverseConvert("D7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("D8")) {
						if (D8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (D8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("D8")
												&& D8 == false) {
											gameGUI.colorHit(gameGUI.jButtonD8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											D8 = true;// D8 has been shot
                                 attackLocation=reverseConvert("D8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonD8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							D8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E1")) {
						if (E1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E1")
												&& E1 == false) {
											gameGUI.colorHit(gameGUI.jButtonE1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E1 = true;
                                 attackLocation=reverseConvert("E1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E2")) {
						if (E2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E2")
												&& E2 == false) {
											gameGUI.colorHit(gameGUI.jButtonE2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E2 = true;// E2 has been shot
                                 attackLocation=reverseConvert("E2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E3")) {
						if (E3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E3")
												&& E3 == false) {
											gameGUI.colorHit(gameGUI.jButtonE3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E3 = true;// E3 has been shot
                                 attackLocation=reverseConvert("E3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E4")) {
						if (E4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E4")
												&& E4 == false) {
											gameGUI.colorHit(gameGUI.jButtonE4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E4 = true;// E4 has been shot
                                 attackLocation=reverseConvert("E4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E5")) {
						if (E5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E5")
												&& E5 == false) {
											gameGUI.colorHit(gameGUI.jButtonE5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E5 = true;// E5 has been shot
                                 attackLocation=reverseConvert("E5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E6")) {
						if (E6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E6")
												&& E6 == false) {
											gameGUI.colorHit(gameGUI.jButtonE6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E6 = true;// E6 has been shot
                                 attackLocation=reverseConvert("E6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E7")) {
						if (E7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E7")
												&& E7 == false) {
											gameGUI.colorHit(gameGUI.jButtonE7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E7 = true;// E7 has been shot
                                 attackLocation=reverseConvert("E7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("E8")) {
						if (E8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (E8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("E8")
												&& E8 == false) {
											gameGUI.colorHit(gameGUI.jButtonE8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											E8 = true;// E8 has been shot
                                 attackLocation=reverseConvert("E8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonE8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							E8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F1")) {
						if (F1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F1")
												&& F1 == false) {
											gameGUI.colorHit(gameGUI.jButtonF1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F1 = true;
                                 attackLocation=reverseConvert("F1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F2")) {
						if (F2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F2")
												&& F2 == false) {
											gameGUI.colorHit(gameGUI.jButtonF2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F2 = true;// F2 has been shot
                                 attackLocation=reverseConvert("F2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F3")) {
						if (F3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F3")
												&& F3 == false) {
											gameGUI.colorHit(gameGUI.jButtonF3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F3 = true;// F3 has been shot
                                 attackLocation=reverseConvert("F3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F4")) {
						if (F4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F4")
												&& F4 == false) {
											gameGUI.colorHit(gameGUI.jButtonF4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F4 = true;// F4 has been shot
                                 attackLocation=reverseConvert("F4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F5")) {
						if (F5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F5")
												&& F5 == false) {
											gameGUI.colorHit(gameGUI.jButtonF5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F5 = true;// F5 has been shot
                                 attackLocation=reverseConvert("F5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F6")) {
						if (F6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F6")
												&& F6 == false) {
											gameGUI.colorHit(gameGUI.jButtonF6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F6 = true;// F6 has been shot
                                 attackLocation=reverseConvert("F6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F7")) {
						if (F7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F7")
												&& F7 == false) {
											gameGUI.colorHit(gameGUI.jButtonF7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F7 = true;// F7 has been shot
                                 attackLocation=reverseConvert("F7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("F8")) {
						if (F8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (F8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("F8")
												&& F8 == false) {
											gameGUI.colorHit(gameGUI.jButtonF8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											F8 = true;// F8 has been shot
                                 attackLocation=reverseConvert("F8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonF8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							F8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
					if (location.equals("G1")) {
						if (G1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G1")
												&& G1 == false) {
											gameGUI.colorHit(gameGUI.jButtonG1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G1 = true;
                                 attackLocation=reverseConvert("G1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G2")) {
						if (G2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G2")
												&& G2 == false) {
											gameGUI.colorHit(gameGUI.jButtonG2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G2 = true;// G2 has been shot
                                 attackLocation=reverseConvert("G2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G3")) {
						if (G3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G3")
												&& G3 == false) {
											gameGUI.colorHit(gameGUI.jButtonG3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G3 = true;// G3 has been shot
                                 attackLocation=reverseConvert("G3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G4")) {
						if (G4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G4")
												&& G4 == false) {
											gameGUI.colorHit(gameGUI.jButtonG4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G4 = true;// G4 has been shot
                                 attackLocation=reverseConvert("G4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G5")) {
						if (G5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G5")
												&& G5 == false) {
											gameGUI.colorHit(gameGUI.jButtonG5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G5 = true;// G5 has been shot
                                 attackLocation=reverseConvert("G5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G6")) {
						if (G6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G6")
												&& G6 == false) {
											gameGUI.colorHit(gameGUI.jButtonG6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G6 = true;// G6 has been shot
                                 attackLocation=reverseConvert("G6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G7")) {
						if (G7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G7")
												&& G7 == false) {
											gameGUI.colorHit(gameGUI.jButtonG7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G7 = true;// G7 has been shot
                                 attackLocation=reverseConvert("G7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("G8")) {
						if (G8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (G8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("G8")
												&& G8 == false) {
											gameGUI.colorHit(gameGUI.jButtonG8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											G8 = true;// G8 has been shot
                                 attackLocation=reverseConvert("G8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonG8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							G8 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
					if (location.equals("H1")) {
						if (H1 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H1 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H1")
												&& H1 == false) {
											gameGUI.colorHit(gameGUI.jButtonH1);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H1 = true;
                                 attackLocation=reverseConvert("H1");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH1);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H1 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H2")) {
						if (H2 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H2 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H2")
												&& H2 == false) {
											gameGUI.colorHit(gameGUI.jButtonH2);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H2 = true;// H2 has been shot
                                 attackLocation=reverseConvert("H2");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH2);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H2 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H3")) {
						if (H3 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H3 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H3")
												&& H3 == false) {
											gameGUI.colorHit(gameGUI.jButtonH3);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H3 = true;// H3 has been shot
                                 attackLocation=reverseConvert("H3");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH3);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H3 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H4")) {
						if (H4 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H4 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H4")
												&& H4 == false) {
											gameGUI.colorHit(gameGUI.jButtonH4);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H4 = true;// H4 has been shot
                                 attackLocation=reverseConvert("H4");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH4);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H4 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H5")) {
						if (H5 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H5 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H5")
												&& H5 == false) {
											gameGUI.colorHit(gameGUI.jButtonH5);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H5 = true;// H5 has been shot
                                 attackLocation=reverseConvert("H5");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH5);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H5 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H6")) {
						if (H6 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H6 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H6")
												&& H6 == false) {
											gameGUI.colorHit(gameGUI.jButtonH6);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H6 = true;// H6 has been shot
                                 attackLocation=reverseConvert("H6");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH6);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H6 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H7")) {
						if (H7 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H7 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H7")
												&& H7 == false) {
											gameGUI.colorHit(gameGUI.jButtonH7);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H7 = true;// H7 has been shot
                                 attackLocation=reverseConvert("H7");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH7);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H7 = true;
							Game.playerTurn = true;
                     AITurn++;
						}
					}
               
               if (location.equals("H8")) {
						if (H8 == true) {
							Game.playerTurn = false;
						}// go back to top of while loop
						else if (H8 == false) {
							for (int k = 0; k < 3; k++) {
								for (int m = 0; m < 4; m++) {
									if (playerShips[k][m] != null) {
										if (playerShips[k][m].equals("H8")
												&& H8 == false) {
											gameGUI.colorHit(gameGUI.jButtonH8);
											gameGUI.text("OPPONENT HIT PLAYER SHIP");
                                 if(hitTests == 0){
                                    hitTests = 4;}
                                 else{
                                    hitTests++;}
											H8 = true;// H8 has been shot
                                 attackLocation=reverseConvert("H8");
											Game.AIScore++;
                                 AITurn++;
											Game.playerTurn = false;
											if ((Game.AIScore > 8)) {
												gameGUI.setVisible(false);
                                    loseScreen.setVisible(true);
											}
											return false;
										} else {

											gameGUI.colorMiss(gameGUI.jButtonH8);
										}
									}
								}
							}
                     gameGUI.text("OPPONENT MISSED PLAYER SHIP");
							H8 = true;
							Game.playerTurn = true;
                     AITurn++;
                     
						}
					}
               
               
               }else{Game.playerTurn = true;}
            }return true;
         }
      }
