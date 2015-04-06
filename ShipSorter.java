import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShipSorter {

	// Varibles
	public static String name;
	public static boolean rotate;
	public static boolean done;
	public static String[][] shipsLocation = new String[3][4];
	public static SetupGUI setupGUI = new SetupGUI();
	public static GameGUI gameGUI = new GameGUI();
	public static ShipColor shipColor = new ShipColor();
	public static GameStart gameStart = new GameStart();

	public ShipSorter() {
	}

	public ShipSorter(String error) {
		setupGUI.text(error);
	}

	public ShipSorter(String n, boolean r, boolean d) {
		rotate = r;
		done = d;
		name = n;
	}

	public static boolean locationCheckAC() {// check if boat exists at location
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (shipsLocation[0][i] != null) {// check if location has element
					if (shipsLocation[0][i].equals(shipsLocation[1][j])
							|| shipsLocation[0][i].equals(shipsLocation[2][j])) {// check if element is = to submarine/destoryer
						setupGUI.text("ERROR - SHIP ALREADY AT LOCATION");// error message
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean locationCheckDS() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (shipsLocation[1][i] != null) {
					if (shipsLocation[1][i].equals(shipsLocation[0][j])
							|| shipsLocation[1][i].equals(shipsLocation[2][j])) {
						setupGUI.text("ERROR - SHIP ALREADY AT LOCATION");
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean locationCheckSM() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (shipsLocation[2][i] != null) {
					if (shipsLocation[2][i].equals(shipsLocation[1][j])
							|| shipsLocation[2][i].equals(shipsLocation[0][j])) {
						setupGUI.text("ERROR - SHIP ALREADY AT LOCATION");
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean buttonPressed(String location) {
		if (setupGUI.doneButton() == false) {// ship locations are not finalized or missing ship
			if (rotate == false) {// all ships are vertical
				if (name.equals("AircraftCarrier")) {// if boat is AircraftCarrier
					if (location.equals("A1")) {// if location is A1
						shipsLocation[0][0] = "A1";// set ship locations
						shipsLocation[0][1] = "B1";
						shipsLocation[0][2] = "C1";
						shipsLocation[0][3] = "D1";
						if (locationCheckAC()) {// if location is true
							shipColor.colorShip(shipsLocation);
						} else {// if location is false, nullify ship
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						shipsLocation[0][0] = "A2";
						shipsLocation[0][1] = "B2";
						shipsLocation[0][2] = "C2";
						shipsLocation[0][3] = "D2";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = "";
							shipsLocation[0][1] = "";
							shipsLocation[0][2] = "";
							shipsLocation[0][3] = "";
						}
						return true;
					} else if (location.equals("A3")) {
						shipsLocation[0][0] = "A3";
						shipsLocation[0][1] = "B3";
						shipsLocation[0][2] = "C3";
						shipsLocation[0][3] = "D3";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						shipsLocation[0][0] = "A4";
						shipsLocation[0][1] = "B4";
						shipsLocation[0][2] = "C4";
						shipsLocation[0][3] = "D4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						shipsLocation[0][0] = "A5";
						shipsLocation[0][1] = "B5";
						shipsLocation[0][2] = "C5";
						shipsLocation[0][3] = "D5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A6")) {
						shipsLocation[0][0] = "A6";
						shipsLocation[0][1] = "B6";
						shipsLocation[0][2] = "C6";
						shipsLocation[0][3] = "D6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A7")) {
						shipsLocation[0][0] = "A7";
						shipsLocation[0][1] = "B7";
						shipsLocation[0][2] = "C7";
						shipsLocation[0][3] = "D7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A8")) {
						shipsLocation[0][0] = "A8";
						shipsLocation[0][1] = "B8";
						shipsLocation[0][2] = "C8";
						shipsLocation[0][3] = "D8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						shipsLocation[0][0] = "B1";
						shipsLocation[0][1] = "C1";
						shipsLocation[0][2] = "D1";
						shipsLocation[0][3] = "E1";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[0][0] = "B2";
						shipsLocation[0][1] = "C2";
						shipsLocation[0][2] = "D2";
						shipsLocation[0][3] = "E2";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[0][0] = "B3";
						shipsLocation[0][1] = "C3";
						shipsLocation[0][2] = "D3";
						shipsLocation[0][3] = "E3";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[0][0] = "B4";
						shipsLocation[0][1] = "C4";
						shipsLocation[0][2] = "D4";
						shipsLocation[0][3] = "E4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[0][0] = "B5";
						shipsLocation[0][1] = "C5";
						shipsLocation[0][2] = "D5";
						shipsLocation[0][3] = "E5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B6")) {
						setupGUI.text("B6");
						shipsLocation[0][0] = "B6";
						shipsLocation[0][1] = "C6";
						shipsLocation[0][2] = "D6";
						shipsLocation[0][3] = "E6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B7")) {
						setupGUI.text("B7");
						shipsLocation[0][0] = "B7";
						shipsLocation[0][1] = "C7";
						shipsLocation[0][2] = "D7";
						shipsLocation[0][3] = "E7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B8")) {
						setupGUI.text("B8");
						shipsLocation[0][0] = "B8";
						shipsLocation[0][1] = "C8";
						shipsLocation[0][2] = "D8";
						shipsLocation[0][3] = "E8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[0][0] = "C1";
						shipsLocation[0][1] = "D1";
						shipsLocation[0][2] = "E1";
						shipsLocation[0][3] = "F1";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[0][0] = "C2";
						shipsLocation[0][1] = "D2";
						shipsLocation[0][2] = "E2";
						shipsLocation[0][3] = "F2";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[0][0] = "C3";
						shipsLocation[0][1] = "D3";
						shipsLocation[0][2] = "E3";
						shipsLocation[0][3] = "F3";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[0][0] = "C4";
						shipsLocation[0][1] = "D4";
						shipsLocation[0][2] = "E4";
						shipsLocation[0][3] = "F4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[0][0] = "C5";
						shipsLocation[0][1] = "D5";
						shipsLocation[0][2] = "E5";
						shipsLocation[0][3] = "F5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C6")) {
						setupGUI.text("C6");
						shipsLocation[0][0] = "C6";
						shipsLocation[0][1] = "D6";
						shipsLocation[0][2] = "E6";
						shipsLocation[0][3] = "F6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C7")) {
						setupGUI.text("C7");
						shipsLocation[0][0] = "C7";
						shipsLocation[0][1] = "D7";
						shipsLocation[0][2] = "E7";
						shipsLocation[0][3] = "F7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C8")) {
						setupGUI.text("C8");
						shipsLocation[0][0] = "C8";
						shipsLocation[0][1] = "D8";
						shipsLocation[0][2] = "E8";
						shipsLocation[0][3] = "F8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[0][0] = "D1";
						shipsLocation[0][1] = "E1";
						shipsLocation[0][2] = "F1";
						shipsLocation[0][3] = "G1";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[0][0] = "D2";
						shipsLocation[0][1] = "E2";
						shipsLocation[0][2] = "F2";
						shipsLocation[0][3] = "G2";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[0][0] = "D3";
						shipsLocation[0][1] = "E3";
						shipsLocation[0][2] = "F3";
						shipsLocation[0][3] = "G3";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[0][0] = "D4";
						shipsLocation[0][1] = "E4";
						shipsLocation[0][2] = "F4";
						shipsLocation[0][3] = "G4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[0][0] = "D5";
						shipsLocation[0][1] = "E5";
						shipsLocation[0][2] = "F5";
						shipsLocation[0][3] = "G5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D6")) {
						setupGUI.text("D6");
						shipsLocation[0][0] = "D6";
						shipsLocation[0][1] = "E6";
						shipsLocation[0][2] = "F6";
						shipsLocation[0][3] = "G6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D7")) {
						setupGUI.text("D7");
						shipsLocation[0][0] = "D7";
						shipsLocation[0][1] = "E7";
						shipsLocation[0][2] = "F7";
						shipsLocation[0][3] = "G7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D8")) {
						setupGUI.text("D8");
						shipsLocation[0][0] = "D8";
						shipsLocation[0][1] = "E8";
						shipsLocation[0][2] = "F8";
						shipsLocation[0][3] = "G8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[0][0] = "E1";
						shipsLocation[0][1] = "F1";
						shipsLocation[0][2] = "G1";
						shipsLocation[0][3] = "H1";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[0][0] = "E2";
						shipsLocation[0][1] = "F2";
						shipsLocation[0][2] = "G2";
						shipsLocation[0][3] = "H2";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[0][0] = "E3";
						shipsLocation[0][1] = "F3";
						shipsLocation[0][2] = "G3";
						shipsLocation[0][3] = "H3";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[0][0] = "E4";
						shipsLocation[0][1] = "F4";
						shipsLocation[0][2] = "G4";
						shipsLocation[0][3] = "H4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[0][0] = "E5";
						shipsLocation[0][1] = "F5";
						shipsLocation[0][2] = "G5";
						shipsLocation[0][3] = "H5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E6")) {
						setupGUI.text("E6");
						shipsLocation[0][0] = "E6";
						shipsLocation[0][1] = "F6";
						shipsLocation[0][2] = "G6";
						shipsLocation[0][3] = "H6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E7")) {
						setupGUI.text("E7");
						shipsLocation[0][0] = "E7";
						shipsLocation[0][1] = "F7";
						shipsLocation[0][2] = "G7";
						shipsLocation[0][3] = "H7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E8")) {
						setupGUI.text("E8");
						shipsLocation[0][0] = "E8";
						shipsLocation[0][1] = "F8";
						shipsLocation[0][2] = "G8";
						shipsLocation[0][3] = "H8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					}

				}
				if (name.equals("Destroyer")) {
					if (location.equals("A1")) {
						setupGUI.text("A1 B1 C1");
						shipsLocation[1][0] = "A1";
						shipsLocation[1][1] = "B1";
						shipsLocation[1][2] = "C1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						setupGUI.text("A2 B2 C2");
						shipsLocation[1][0] = "A2";
						shipsLocation[1][1] = "B2";
						shipsLocation[1][2] = "C2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A3")) {
						setupGUI.text("A3");
						shipsLocation[1][0] = "A3";
						shipsLocation[1][1] = "B3";
						shipsLocation[1][2] = "C3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						setupGUI.text("A4");
						shipsLocation[1][0] = "A4";
						shipsLocation[1][1] = "B4";
						shipsLocation[1][2] = "C4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						setupGUI.text("A5");
						shipsLocation[1][0] = "A5";
						shipsLocation[1][1] = "B5";
						shipsLocation[1][2] = "C5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A6")) {
						setupGUI.text("A6");
						shipsLocation[1][0] = "A6";
						shipsLocation[1][1] = "B6";
						shipsLocation[1][2] = "C6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A7")) {
						setupGUI.text("A7 B7 C7");
						shipsLocation[1][0] = "A7";
						shipsLocation[1][1] = "B7";
						shipsLocation[1][2] = "C7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A8")) {
						setupGUI.text("A8");
						shipsLocation[1][0] = "A8";
						shipsLocation[1][1] = "B8";
						shipsLocation[1][2] = "C8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						setupGUI.text("B1");
						shipsLocation[1][0] = "B1";
						shipsLocation[1][1] = "C1";
						shipsLocation[1][2] = "D1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[1][0] = "B2";
						shipsLocation[1][1] = "C2";
						shipsLocation[1][2] = "D2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[1][0] = "B3";
						shipsLocation[1][1] = "C3";
						shipsLocation[1][2] = "D3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[1][0] = "B4";
						shipsLocation[1][1] = "C4";
						shipsLocation[1][2] = "D4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[1][0] = "B5";
						shipsLocation[1][1] = "C5";
						shipsLocation[1][2] = "D5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B6")) {
						setupGUI.text("B6");
						shipsLocation[1][0] = "B6";
						shipsLocation[1][1] = "C6";
						shipsLocation[1][2] = "D6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B7")) {
						setupGUI.text("B7");
						shipsLocation[1][0] = "B7";
						shipsLocation[1][1] = "C7";
						shipsLocation[1][2] = "D7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B8")) {
						setupGUI.text("B8");
						shipsLocation[1][0] = "B8";
						shipsLocation[1][1] = "C8";
						shipsLocation[1][2] = "D8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[1][0] = "C1";
						shipsLocation[1][1] = "D1";
						shipsLocation[1][2] = "E1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[1][0] = "C2";
						shipsLocation[1][1] = "D2";
						shipsLocation[1][2] = "E2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[1][0] = "C3";
						shipsLocation[1][1] = "D3";
						shipsLocation[1][2] = "E3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[1][0] = "C4";
						shipsLocation[1][1] = "D4";
						shipsLocation[1][2] = "E4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[1][0] = "C5";
						shipsLocation[1][1] = "D5";
						shipsLocation[1][2] = "E5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C6")) {
						setupGUI.text("C6");
						shipsLocation[1][0] = "C6";
						shipsLocation[1][1] = "D6";
						shipsLocation[1][2] = "E6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C7")) {
						setupGUI.text("C7");
						shipsLocation[1][0] = "C7";
						shipsLocation[1][1] = "D7";
						shipsLocation[1][2] = "E7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C8")) {
						setupGUI.text("C8");
						shipsLocation[1][0] = "C8";
						shipsLocation[1][1] = "D8";
						shipsLocation[1][2] = "E8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[1][0] = "D1";
						shipsLocation[1][1] = "E1";
						shipsLocation[1][2] = "F1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[1][0] = "D2";
						shipsLocation[1][1] = "E2";
						shipsLocation[1][2] = "F2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[1][0] = "D3";
						shipsLocation[1][1] = "E3";
						shipsLocation[1][2] = "F3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[1][0] = "D4";
						shipsLocation[1][1] = "E4";
						shipsLocation[1][2] = "F4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[1][0] = "D5";
						shipsLocation[1][1] = "E5";
						shipsLocation[1][2] = "F5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D6")) {
						setupGUI.text("D6");
						shipsLocation[1][0] = "D6";
						shipsLocation[1][1] = "E6";
						shipsLocation[1][2] = "F6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D7")) {
						setupGUI.text("D7");
						shipsLocation[1][0] = "D7";
						shipsLocation[1][1] = "E7";
						shipsLocation[1][2] = "F7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D8")) {
						setupGUI.text("D8");
						shipsLocation[1][0] = "D8";
						shipsLocation[1][1] = "E8";
						shipsLocation[1][2] = "F8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[1][0] = "E1";
						shipsLocation[1][1] = "F1";
						shipsLocation[1][2] = "G1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[1][0] = "E2";
						shipsLocation[1][1] = "F2";
						shipsLocation[1][2] = "G2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[1][0] = "E3";
						shipsLocation[1][1] = "F3";
						shipsLocation[1][2] = "G3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[1][0] = "E4";
						shipsLocation[1][1] = "F4";
						shipsLocation[1][2] = "G4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[1][0] = "E5";
						shipsLocation[1][1] = "F5";
						shipsLocation[1][2] = "G5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E6")) {
						setupGUI.text("E6");
						shipsLocation[1][0] = "E6";
						shipsLocation[1][1] = "F6";
						shipsLocation[1][2] = "G6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E7")) {
						setupGUI.text("E7");
						shipsLocation[1][0] = "E7";
						shipsLocation[1][1] = "F7";
						shipsLocation[1][2] = "G7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E8")) {
						setupGUI.text("E8");
						shipsLocation[1][0] = "E8";
						shipsLocation[1][1] = "F8";
						shipsLocation[1][2] = "G8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F1")) {
						setupGUI.text("F1");
						shipsLocation[1][0] = "F1";
						shipsLocation[1][1] = "G1";
						shipsLocation[1][2] = "H1";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F2")) {
						setupGUI.text("F2");
						shipsLocation[1][0] = "F2";
						shipsLocation[1][1] = "G2";
						shipsLocation[1][2] = "H2";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F3")) {
						setupGUI.text("F3");
						shipsLocation[1][0] = "F3";
						shipsLocation[1][1] = "G3";
						shipsLocation[1][2] = "H3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F4")) {
						setupGUI.text("F4");
						shipsLocation[1][0] = "F4";
						shipsLocation[1][1] = "G4";
						shipsLocation[1][2] = "H4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F5")) {
						setupGUI.text("F5");
						shipsLocation[1][0] = "F5";
						shipsLocation[1][1] = "G5";
						shipsLocation[1][2] = "H5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F6")) {
						setupGUI.text("F6");
						shipsLocation[1][0] = "F6";
						shipsLocation[1][1] = "G6";
						shipsLocation[1][2] = "H6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F7")) {
						setupGUI.text("F7");
						shipsLocation[1][0] = "F7";
						shipsLocation[1][1] = "G7";
						shipsLocation[1][2] = "H7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F8")) {
						setupGUI.text("F8");
						shipsLocation[1][0] = "F8";
						shipsLocation[1][1] = "G8";
						shipsLocation[1][2] = "H8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					}
				}

				// -------------------------------------------------------

				if (name.equals("Submarine")) {

					if (location.equals("A1")) {
						setupGUI.text("A1 B1");
						shipsLocation[2][0] = "A1";
						shipsLocation[2][1] = "B1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						setupGUI.text("A2 B2");
						shipsLocation[2][0] = "A2";
						shipsLocation[2][1] = "B2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A3")) {
						setupGUI.text("A3");
						shipsLocation[2][0] = "A3";
						shipsLocation[2][1] = "B3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						setupGUI.text("A4");
						shipsLocation[2][0] = "A4";
						shipsLocation[2][1] = "B4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						setupGUI.text("A5");
						shipsLocation[2][0] = "A5";
						shipsLocation[2][1] = "B5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A6")) {
						setupGUI.text("A6");
						shipsLocation[2][0] = "A6";
						shipsLocation[2][1] = "B6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A7")) {
						setupGUI.text("A7");
						shipsLocation[2][0] = "A7";
						shipsLocation[2][1] = "B7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("A8")) {
						setupGUI.text("A8");
						shipsLocation[2][0] = "A8";
						shipsLocation[2][1] = "B8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						setupGUI.text("B1");
						shipsLocation[2][0] = "B1";
						shipsLocation[2][1] = "C1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[2][0] = "B2";
						shipsLocation[2][1] = "C2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[2][0] = "B3";
						shipsLocation[2][1] = "C3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[2][0] = "B4";
						shipsLocation[2][1] = "C4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[2][0] = "B5";
						shipsLocation[2][1] = "C5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B6")) {
						setupGUI.text("B6");
						shipsLocation[2][0] = "B6";
						shipsLocation[2][1] = "C6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B7")) {
						setupGUI.text("B7");
						shipsLocation[2][0] = "B7";
						shipsLocation[2][1] = "C7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("B8")) {
						setupGUI.text("B8");
						shipsLocation[2][0] = "B8";
						shipsLocation[2][1] = "C8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[2][0] = "C1";
						shipsLocation[2][1] = "D1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[2][0] = "C2";
						shipsLocation[2][1] = "D2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[2][0] = "C3";
						shipsLocation[2][1] = "D3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[2][0] = "C4";
						shipsLocation[2][1] = "D4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[2][0] = "C5";
						shipsLocation[2][1] = "D5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C6")) {
						setupGUI.text("C6");
						shipsLocation[2][0] = "C6";
						shipsLocation[2][1] = "D6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C7")) {
						setupGUI.text("C7");
						shipsLocation[2][0] = "C7";
						shipsLocation[2][1] = "D7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("C8")) {
						setupGUI.text("C8");
						shipsLocation[2][0] = "C8";
						shipsLocation[2][1] = "D8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[2][0] = "D1";
						shipsLocation[2][1] = "E1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[2][0] = "D2";
						shipsLocation[2][1] = "E2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[2][0] = "D3";
						shipsLocation[2][1] = "E3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[2][0] = "D4";
						shipsLocation[2][1] = "E4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[2][0] = "D5";
						shipsLocation[2][1] = "E5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D6")) {
						setupGUI.text("D6");
						shipsLocation[2][0] = "D6";
						shipsLocation[2][1] = "E6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D7")) {
						setupGUI.text("D7");
						shipsLocation[2][0] = "D7";
						shipsLocation[2][1] = "E7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("D8")) {
						setupGUI.text("D8");
						shipsLocation[2][0] = "D8";
						shipsLocation[2][1] = "E8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[2][0] = "E1";
						shipsLocation[2][1] = "F1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[2][0] = "E2";
						shipsLocation[2][1] = "F2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[2][0] = "E3";
						shipsLocation[2][1] = "F3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[2][0] = "E4";
						shipsLocation[2][1] = "F4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[2][0] = "E5";
						shipsLocation[2][1] = "F5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E6")) {
						setupGUI.text("E6");
						shipsLocation[2][0] = "E6";
						shipsLocation[2][1] = "F6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E7")) {
						setupGUI.text("E7");
						shipsLocation[2][0] = "E7";
						shipsLocation[2][1] = "F7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("E8")) {
						setupGUI.text("E8");
						shipsLocation[2][0] = "E8";
						shipsLocation[2][1] = "F8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F1")) {
						setupGUI.text("F1");
						shipsLocation[2][0] = "F1";
						shipsLocation[2][1] = "G1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F2")) {
						setupGUI.text("F2");
						shipsLocation[2][0] = "F2";
						shipsLocation[2][1] = "G2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F3")) {
						setupGUI.text("F3");
						shipsLocation[2][0] = "F3";
						shipsLocation[2][1] = "G3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F4")) {
						setupGUI.text("F4");
						shipsLocation[2][0] = "F4";
						shipsLocation[2][1] = "G4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F5")) {
						setupGUI.text("F5");
						shipsLocation[2][0] = "F5";
						shipsLocation[2][1] = "G5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F6")) {
						setupGUI.text("F6");
						shipsLocation[2][0] = "F6";
						shipsLocation[2][1] = "G6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F7")) {
						setupGUI.text("F7");
						shipsLocation[2][0] = "F7";
						shipsLocation[2][1] = "G7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("F8")) {
						setupGUI.text("F8");
						shipsLocation[2][0] = "F8";
						shipsLocation[2][1] = "G8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G1")) {
						setupGUI.text("G1");
						shipsLocation[2][0] = "G1";
						shipsLocation[2][1] = "H1";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G2")) {
						setupGUI.text("G2");
						shipsLocation[2][0] = "G2";
						shipsLocation[2][1] = "H2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G3")) {
						setupGUI.text("G3");
						shipsLocation[2][0] = "G3";
						shipsLocation[2][1] = "H3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G4")) {
						setupGUI.text("G4");
						shipsLocation[2][0] = "G4";
						shipsLocation[2][1] = "H4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G5")) {
						setupGUI.text("G5");
						shipsLocation[2][0] = "G5";
						shipsLocation[2][1] = "H5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G6")) {
						setupGUI.text("G6");
						shipsLocation[2][0] = "G6";
						shipsLocation[2][1] = "H6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G7")) {
						setupGUI.text("G7");
						shipsLocation[2][0] = "G7";
						shipsLocation[2][1] = "H7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					} else if (location.equals("G8")) {
						setupGUI.text("G8");
						shipsLocation[2][0] = "G8";
						shipsLocation[2][1] = "H8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[2][0] = null;
							shipsLocation[2][1] = null;
							shipsLocation[2][2] = null;
							shipsLocation[2][3] = null;
						}
						return true;
					}
				}
			} else {// Rotate = false
				if (name.equals("AircraftCarrier")) {
					if (location.equals("A1")) {
						setupGUI.text("A1");
						shipsLocation[0][0] = "A1";
						shipsLocation[0][1] = "A2";
						shipsLocation[0][2] = "A3";
						shipsLocation[0][3] = "A4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						setupGUI.text("A2");
						shipsLocation[0][0] = "A2";
						shipsLocation[0][1] = "A3";
						shipsLocation[0][2] = "A4";
						shipsLocation[0][3] = "A5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A3")) {
						setupGUI.text("A3");
						shipsLocation[0][0] = "A3";
						shipsLocation[0][1] = "A4";
						shipsLocation[0][2] = "A5";
						shipsLocation[0][3] = "A6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						setupGUI.text("A4");
						shipsLocation[0][0] = "A4";
						shipsLocation[0][1] = "A5";
						shipsLocation[0][2] = "A6";
						shipsLocation[0][3] = "A7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						setupGUI.text("A5");
						shipsLocation[0][0] = "A5";
						shipsLocation[0][1] = "A6";
						shipsLocation[0][2] = "A7";
						shipsLocation[0][3] = "A8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						setupGUI.text("B1");
						shipsLocation[0][0] = "B1";
						shipsLocation[0][1] = "B2";
						shipsLocation[0][2] = "B3";
						shipsLocation[0][3] = "B4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[0][0] = "B2";
						shipsLocation[0][1] = "B3";
						shipsLocation[0][2] = "B4";
						shipsLocation[0][3] = "B5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[0][0] = "B3";
						shipsLocation[0][1] = "B4";
						shipsLocation[0][2] = "B5";
						shipsLocation[0][3] = "B6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[0][0] = "B4";
						shipsLocation[0][1] = "B5";
						shipsLocation[0][2] = "B6";
						shipsLocation[0][3] = "B7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[0][0] = "B5";
						shipsLocation[0][1] = "B6";
						shipsLocation[0][2] = "B7";
						shipsLocation[0][3] = "B8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[0][0] = "C1";
						shipsLocation[0][1] = "C2";
						shipsLocation[0][2] = "C3";
						shipsLocation[0][3] = "C4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[0][0] = "C2";
						shipsLocation[0][1] = "C3";
						shipsLocation[0][2] = "C4";
						shipsLocation[0][3] = "C5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[0][0] = "C3";
						shipsLocation[0][1] = "C4";
						shipsLocation[0][2] = "C5";
						shipsLocation[0][3] = "C6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[0][0] = "C4";
						shipsLocation[0][1] = "C5";
						shipsLocation[0][2] = "C6";
						shipsLocation[0][3] = "C7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[0][0] = "C5";
						shipsLocation[0][1] = "C6";
						shipsLocation[0][2] = "C7";
						shipsLocation[0][3] = "C8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[0][0] = "D1";
						shipsLocation[0][1] = "D2";
						shipsLocation[0][2] = "D3";
						shipsLocation[0][3] = "D4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[0][0] = "D2";
						shipsLocation[0][1] = "D3";
						shipsLocation[0][2] = "D4";
						shipsLocation[0][3] = "D5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[0][0] = "D3";
						shipsLocation[0][1] = "D4";
						shipsLocation[0][2] = "D5";
						shipsLocation[0][3] = "D6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[0][0] = "D4";
						shipsLocation[0][1] = "D5";
						shipsLocation[0][2] = "D6";
						shipsLocation[0][3] = "D7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[0][0] = "D5";
						shipsLocation[0][1] = "D6";
						shipsLocation[0][2] = "D7";
						shipsLocation[0][3] = "D8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[0][0] = "E1";
						shipsLocation[0][1] = "E2";
						shipsLocation[0][2] = "E3";
						shipsLocation[0][3] = "E4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[0][0] = "E2";
						shipsLocation[0][1] = "E3";
						shipsLocation[0][2] = "E4";
						shipsLocation[0][3] = "E5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[0][0] = "E3";
						shipsLocation[0][1] = "E4";
						shipsLocation[0][2] = "E5";
						shipsLocation[0][3] = "E6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[0][0] = "E4";
						shipsLocation[0][1] = "E5";
						shipsLocation[0][2] = "E6";
						shipsLocation[0][3] = "E7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[0][0] = "E5";
						shipsLocation[0][1] = "E6";
						shipsLocation[0][2] = "E7";
						shipsLocation[0][3] = "E8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("F1")) {
						setupGUI.text("F1");
						shipsLocation[0][0] = "F1";
						shipsLocation[0][1] = "F2";
						shipsLocation[0][2] = "F3";
						shipsLocation[0][3] = "F4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("F2")) {
						setupGUI.text("F2");
						shipsLocation[0][0] = "F2";
						shipsLocation[0][1] = "F3";
						shipsLocation[0][2] = "F4";
						shipsLocation[0][3] = "F5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("F3")) {
						setupGUI.text("F3");
						shipsLocation[0][0] = "F3";
						shipsLocation[0][1] = "F4";
						shipsLocation[0][2] = "F5";
						shipsLocation[0][3] = "F6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("F4")) {
						setupGUI.text("F4");
						shipsLocation[0][0] = "F4";
						shipsLocation[0][1] = "F5";
						shipsLocation[0][2] = "F6";
						shipsLocation[0][3] = "F7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("F5")) {
						setupGUI.text("F5");
						shipsLocation[0][0] = "F5";
						shipsLocation[0][1] = "F6";
						shipsLocation[0][2] = "F7";
						shipsLocation[0][3] = "F8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("G1")) {
						setupGUI.text("G1");
						shipsLocation[0][0] = "G1";
						shipsLocation[0][1] = "G2";
						shipsLocation[0][2] = "G3";
						shipsLocation[0][3] = "G4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("G2")) {
						setupGUI.text("G2");
						shipsLocation[0][0] = "G2";
						shipsLocation[0][1] = "G3";
						shipsLocation[0][2] = "G4";
						shipsLocation[0][3] = "G5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("G3")) {
						setupGUI.text("G3");
						shipsLocation[0][0] = "G3";
						shipsLocation[0][1] = "G4";
						shipsLocation[0][2] = "G5";
						shipsLocation[0][3] = "G6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("G4")) {
						setupGUI.text("G4");
						shipsLocation[0][0] = "G4";
						shipsLocation[0][1] = "G5";
						shipsLocation[0][2] = "G6";
						shipsLocation[0][3] = "G7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("G5")) {
						setupGUI.text("G5");
						shipsLocation[0][0] = "G5";
						shipsLocation[0][1] = "G6";
						shipsLocation[0][2] = "G7";
						shipsLocation[0][3] = "G8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("H1")) {
						setupGUI.text("H1");
						shipsLocation[0][0] = "H1";
						shipsLocation[0][1] = "H2";
						shipsLocation[0][2] = "H3";
						shipsLocation[0][3] = "H4";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("H2")) {
						setupGUI.text("H2");
						shipsLocation[0][0] = "H2";
						shipsLocation[0][1] = "H3";
						shipsLocation[0][2] = "H4";
						shipsLocation[0][3] = "H5";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("H3")) {
						setupGUI.text("H3");
						shipsLocation[0][0] = "H3";
						shipsLocation[0][1] = "H4";
						shipsLocation[0][2] = "H5";
						shipsLocation[0][3] = "H6";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("H4")) {
						setupGUI.text("H4");
						shipsLocation[0][0] = "H4";
						shipsLocation[0][1] = "H5";
						shipsLocation[0][2] = "H6";
						shipsLocation[0][3] = "H7";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					} else if (location.equals("H5")) {
						setupGUI.text("H5");
						shipsLocation[0][0] = "H5";
						shipsLocation[0][1] = "H6";
						shipsLocation[0][2] = "H7";
						shipsLocation[0][3] = "H8";
						if (locationCheckAC()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[0][0] = null;
							shipsLocation[0][1] = null;
							shipsLocation[0][2] = null;
							shipsLocation[0][3] = null;
						}
						return true;
					}
				}
				if (name.equals("Destroyer")) {

					if (location.equals("A1")) {
						setupGUI.text("A1 A2 A3");
						shipsLocation[1][0] = "A1";
						shipsLocation[1][1] = "A2";
						shipsLocation[1][2] = "A3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						setupGUI.text("A2");
						shipsLocation[1][0] = "A2";
						shipsLocation[1][1] = "A3";
						shipsLocation[1][2] = "A4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A3")) {
						setupGUI.text("A3");
						shipsLocation[1][0] = "A3";
						shipsLocation[1][1] = "A4";
						shipsLocation[1][2] = "A5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						setupGUI.text("A4");
						shipsLocation[1][0] = "A4";
						shipsLocation[1][1] = "A5";
						shipsLocation[1][2] = "A6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						setupGUI.text("A5");
						shipsLocation[1][0] = "A5";
						shipsLocation[1][1] = "A6";
						shipsLocation[1][2] = "A7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A6")) {
						setupGUI.text("A6");
						shipsLocation[1][0] = "A6";
						shipsLocation[1][1] = "A7";
						shipsLocation[1][2] = "A8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						setupGUI.text("B1");
						shipsLocation[1][0] = "B1";
						shipsLocation[1][1] = "B2";
						shipsLocation[1][2] = "B3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[1][0] = "B2";
						shipsLocation[1][1] = "B3";
						shipsLocation[1][2] = "B4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[1][0] = "B3";
						shipsLocation[1][1] = "B4";
						shipsLocation[1][2] = "B5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[1][0] = "B4";
						shipsLocation[1][1] = "B5";
						shipsLocation[1][2] = "B6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[1][0] = "B5";
						shipsLocation[1][1] = "B6";
						shipsLocation[1][2] = "B7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B6")) {
						setupGUI.text("B6");
						shipsLocation[1][0] = "B6";
						shipsLocation[1][1] = "B7";
						shipsLocation[1][2] = "B8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[1][0] = "C1";
						shipsLocation[1][1] = "C2";
						shipsLocation[1][2] = "C3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[1][0] = "C2";
						shipsLocation[1][1] = "C3";
						shipsLocation[1][2] = "C4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[1][0] = "C3";
						shipsLocation[1][1] = "C4";
						shipsLocation[1][2] = "C5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[1][0] = "C4";
						shipsLocation[1][1] = "C5";
						shipsLocation[1][2] = "C6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[1][0] = "C5";
						shipsLocation[1][1] = "C6";
						shipsLocation[1][2] = "C7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C6")) {
						setupGUI.text("C6");
						shipsLocation[1][0] = "C6";
						shipsLocation[1][1] = "C7";
						shipsLocation[1][2] = "C8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[1][0] = "D1";
						shipsLocation[1][1] = "D2";
						shipsLocation[1][2] = "D3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[1][0] = "D2";
						shipsLocation[1][1] = "D3";
						shipsLocation[1][2] = "D4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[1][0] = "D3";
						shipsLocation[1][1] = "D4";
						shipsLocation[1][2] = "D5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[1][0] = "D4";
						shipsLocation[1][1] = "D5";
						shipsLocation[1][2] = "D6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[1][0] = "D5";
						shipsLocation[1][1] = "D6";
						shipsLocation[1][2] = "D7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D6")) {
						setupGUI.text("D6");
						shipsLocation[1][0] = "D6";
						shipsLocation[1][1] = "D7";
						shipsLocation[1][2] = "D8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[1][0] = "E1";
						shipsLocation[1][1] = "E2";
						shipsLocation[1][2] = "E3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[1][0] = "E2";
						shipsLocation[1][1] = "E3";
						shipsLocation[1][2] = "E4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[1][0] = "E3";
						shipsLocation[1][1] = "E4";
						shipsLocation[1][2] = "E5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[1][0] = "E4";
						shipsLocation[1][1] = "E5";
						shipsLocation[1][2] = "E6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[1][0] = "E5";
						shipsLocation[1][1] = "E6";
						shipsLocation[1][2] = "E7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E6")) {
						setupGUI.text("E6");
						shipsLocation[1][0] = "E6";
						shipsLocation[1][1] = "E7";
						shipsLocation[1][2] = "E8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F1")) {
						setupGUI.text("F1");
						shipsLocation[1][0] = "F1";
						shipsLocation[1][1] = "F2";
						shipsLocation[1][2] = "F3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F2")) {
						setupGUI.text("F2");
						shipsLocation[1][0] = "F2";
						shipsLocation[1][1] = "F3";
						shipsLocation[1][2] = "F4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F3")) {
						setupGUI.text("F3");
						shipsLocation[1][0] = "F3";
						shipsLocation[1][1] = "F4";
						shipsLocation[1][2] = "F5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F4")) {
						setupGUI.text("F4");
						shipsLocation[1][0] = "F4";
						shipsLocation[1][1] = "F5";
						shipsLocation[1][2] = "F6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F5")) {
						setupGUI.text("F5");
						shipsLocation[1][0] = "F5";
						shipsLocation[1][1] = "F6";
						shipsLocation[1][2] = "F7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F6")) {
						setupGUI.text("F6");
						shipsLocation[1][0] = "F6";
						shipsLocation[1][1] = "F7";
						shipsLocation[1][2] = "F8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G1")) {
						setupGUI.text("G1");
						shipsLocation[1][0] = "G1";
						shipsLocation[1][1] = "G2";
						shipsLocation[1][2] = "G3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G2")) {
						setupGUI.text("G2");
						shipsLocation[1][0] = "G2";
						shipsLocation[1][1] = "G3";
						shipsLocation[1][2] = "G4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G3")) {
						setupGUI.text("G3");
						shipsLocation[1][0] = "G3";
						shipsLocation[1][1] = "G4";
						shipsLocation[1][2] = "G5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G4")) {
						setupGUI.text("G4");
						shipsLocation[1][0] = "G4";
						shipsLocation[1][1] = "G5";
						shipsLocation[1][2] = "G6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G5")) {
						setupGUI.text("G5");
						shipsLocation[1][0] = "G5";
						shipsLocation[1][1] = "G6";
						shipsLocation[1][2] = "G7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G6")) {
						setupGUI.text("G6");
						shipsLocation[1][0] = "G6";
						shipsLocation[1][1] = "G7";
						shipsLocation[1][2] = "G8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H1")) {
						setupGUI.text("H1");
						shipsLocation[1][0] = "H1";
						shipsLocation[1][1] = "H2";
						shipsLocation[1][2] = "H3";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H2")) {
						setupGUI.text("H2");
						shipsLocation[1][0] = "H2";
						shipsLocation[1][1] = "H3";
						shipsLocation[1][2] = "H4";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H3")) {
						setupGUI.text("H3");
						shipsLocation[1][0] = "H3";
						shipsLocation[1][1] = "H4";
						shipsLocation[1][2] = "H5";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H4")) {
						setupGUI.text("H4");
						shipsLocation[1][0] = "H4";
						shipsLocation[1][1] = "H5";
						shipsLocation[1][2] = "H6";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H5")) {
						setupGUI.text("H5");
						shipsLocation[1][0] = "H5";
						shipsLocation[1][1] = "H6";
						shipsLocation[1][2] = "H7";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H6")) {
						setupGUI.text("H6");
						shipsLocation[1][0] = "H6";
						shipsLocation[1][1] = "H7";
						shipsLocation[1][2] = "H8";
						if (locationCheckDS()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					}
				}
				if (name.equals("Submarine")) {

					if (location.equals("A1")) {
						setupGUI.text("A1");
						shipsLocation[2][0] = "A1";
						shipsLocation[2][1] = "A2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A2")) {
						setupGUI.text("A2");
						shipsLocation[2][0] = "A2";
						shipsLocation[2][1] = "A3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A3")) {
						setupGUI.text("A3");
						shipsLocation[2][0] = "A3";
						shipsLocation[2][1] = "A4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A4")) {
						setupGUI.text("A4");
						shipsLocation[2][0] = "A4";
						shipsLocation[2][1] = "A5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A5")) {
						setupGUI.text("A5");
						shipsLocation[2][0] = "A5";
						shipsLocation[2][1] = "A6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A6")) {
						setupGUI.text("A6");
						shipsLocation[2][0] = "A6";
						shipsLocation[2][1] = "A7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("A7")) {
						setupGUI.text("A7");
						shipsLocation[2][0] = "A7";
						shipsLocation[2][1] = "A8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B1")) {
						setupGUI.text("B1");
						shipsLocation[2][0] = "B1";
						shipsLocation[2][1] = "B2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B2")) {
						setupGUI.text("B2");
						shipsLocation[2][0] = "B2";
						shipsLocation[2][1] = "B3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B3")) {
						setupGUI.text("B3");
						shipsLocation[2][0] = "B3";
						shipsLocation[2][1] = "B4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B4")) {
						setupGUI.text("B4");
						shipsLocation[2][0] = "B4";
						shipsLocation[2][1] = "B5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B5")) {
						setupGUI.text("B5");
						shipsLocation[2][0] = "B5";
						shipsLocation[2][1] = "B6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B6")) {
						setupGUI.text("B6");
						shipsLocation[2][0] = "B6";
						shipsLocation[2][1] = "B7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("B7")) {
						setupGUI.text("B7");
						shipsLocation[2][0] = "B7";
						shipsLocation[2][1] = "B8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C1")) {
						setupGUI.text("C1");
						shipsLocation[2][0] = "C1";
						shipsLocation[2][1] = "C2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C2")) {
						setupGUI.text("C2");
						shipsLocation[2][0] = "C2";
						shipsLocation[2][1] = "C3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C3")) {
						setupGUI.text("C3");
						shipsLocation[2][0] = "C3";
						shipsLocation[2][1] = "C4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C4")) {
						setupGUI.text("C4");
						shipsLocation[2][0] = "C4";
						shipsLocation[2][1] = "C5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C5")) {
						setupGUI.text("C5");
						shipsLocation[2][0] = "C5";
						shipsLocation[2][1] = "C6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C6")) {
						setupGUI.text("C6");
						shipsLocation[2][0] = "C6";
						shipsLocation[2][1] = "C7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("C7")) {
						setupGUI.text("C7");
						shipsLocation[2][0] = "C7";
						shipsLocation[2][1] = "C8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D1")) {
						setupGUI.text("D1");
						shipsLocation[2][0] = "D1";
						shipsLocation[2][1] = "D2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D2")) {
						setupGUI.text("D2");
						shipsLocation[2][0] = "D2";
						shipsLocation[2][1] = "D3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D3")) {
						setupGUI.text("D3");
						shipsLocation[2][0] = "D3";
						shipsLocation[2][1] = "D4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D4")) {
						setupGUI.text("D4");
						shipsLocation[2][0] = "D4";
						shipsLocation[2][1] = "D5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D5")) {
						setupGUI.text("D5");
						shipsLocation[2][0] = "D5";
						shipsLocation[2][1] = "D6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D6")) {
						setupGUI.text("D6");
						shipsLocation[2][0] = "D6";
						shipsLocation[2][1] = "D7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("D7")) {
						setupGUI.text("D7");
						shipsLocation[2][0] = "D7";
						shipsLocation[2][1] = "D8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E1")) {
						setupGUI.text("E1");
						shipsLocation[2][0] = "E1";
						shipsLocation[2][1] = "E2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E2")) {
						setupGUI.text("E2");
						shipsLocation[2][0] = "E2";
						shipsLocation[2][1] = "E3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E3")) {
						setupGUI.text("E3");
						shipsLocation[2][0] = "E3";
						shipsLocation[2][1] = "E4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E4")) {
						setupGUI.text("E4");
						shipsLocation[2][0] = "E4";
						shipsLocation[2][1] = "E5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E5")) {
						setupGUI.text("E5");
						shipsLocation[2][0] = "E5";
						shipsLocation[2][1] = "E6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E6")) {
						setupGUI.text("E6");
						shipsLocation[2][0] = "E6";
						shipsLocation[2][1] = "E7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("E7")) {
						setupGUI.text("E7");
						shipsLocation[2][0] = "E7";
						shipsLocation[2][1] = "E8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F1")) {
						setupGUI.text("F1");
						shipsLocation[2][0] = "F1";
						shipsLocation[2][1] = "F2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F2")) {
						setupGUI.text("F2");
						shipsLocation[2][0] = "F2";
						shipsLocation[2][1] = "F3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F3")) {
						setupGUI.text("F3");
						shipsLocation[2][0] = "F3";
						shipsLocation[2][1] = "F4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F4")) {
						setupGUI.text("F4");
						shipsLocation[2][0] = "F4";
						shipsLocation[2][1] = "F5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F5")) {
						setupGUI.text("F5");
						shipsLocation[2][0] = "F5";
						shipsLocation[2][1] = "F6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F6")) {
						setupGUI.text("F6");
						shipsLocation[2][0] = "F6";
						shipsLocation[2][1] = "F7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("F7")) {
						setupGUI.text("F7");
						shipsLocation[2][0] = "F7";
						shipsLocation[2][1] = "F8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G1")) {
						setupGUI.text("G1");
						shipsLocation[2][0] = "G1";
						shipsLocation[2][1] = "G2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G2")) {
						setupGUI.text("G2");
						shipsLocation[2][0] = "G2";
						shipsLocation[2][1] = "G3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G3")) {
						setupGUI.text("G3");
						shipsLocation[2][0] = "G3";
						shipsLocation[2][1] = "G4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G4")) {
						setupGUI.text("G4");
						shipsLocation[2][0] = "G4";
						shipsLocation[2][1] = "G5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G5")) {
						setupGUI.text("G5");
						shipsLocation[2][0] = "G5";
						shipsLocation[2][1] = "G6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G6")) {
						setupGUI.text("G6");
						shipsLocation[2][0] = "G6";
						shipsLocation[2][1] = "G7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("G7")) {
						setupGUI.text("G7");
						shipsLocation[2][0] = "G7";
						shipsLocation[2][1] = "G8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H1")) {
						setupGUI.text("H1");
						shipsLocation[2][0] = "H1";
						shipsLocation[2][1] = "H2";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H2")) {
						setupGUI.text("H2");
						shipsLocation[2][0] = "H2";
						shipsLocation[2][1] = "H3";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H3")) {
						setupGUI.text("H3");
						shipsLocation[2][0] = "H3";
						shipsLocation[2][1] = "H4";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H4")) {
						setupGUI.text("H4");
						shipsLocation[2][0] = "H4";
						shipsLocation[2][1] = "H5";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H5")) {
						setupGUI.text("H5");
						shipsLocation[2][0] = "H5";
						shipsLocation[2][1] = "H6";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H6")) {
						setupGUI.text("H6");
						shipsLocation[2][0] = "H6";
						shipsLocation[2][1] = "H7";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					} else if (location.equals("H7")) {
						setupGUI.text("H7");
						shipsLocation[2][0] = "H7";
						shipsLocation[2][1] = "H8";
						if (locationCheckSM()) {
							shipColor.colorShip(shipsLocation);
						} else {
							shipsLocation[1][0] = null;
							shipsLocation[1][1] = null;
							shipsLocation[1][2] = null;
							shipsLocation[1][3] = null;
						}
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void doneTrue() {
		setupGUI.setVisible(false);
		gameGUI.setVisible(true);
	}

	public static SetupGUI getGUI() {
		return setupGUI;
	}

	public static GameGUI getGameGUI() {
		return gameGUI;
	}

	public static String[][] getShips() {
		return shipsLocation;
	}

	public static void main(String[] args) {
		setupGUI.setVisible(true);
		gameGUI.setVisible(false);
	}
}
