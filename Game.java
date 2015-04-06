import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

	public static ShipSorter shipSorter = new ShipSorter();
	public static String[][] shipsLocation;
	public static int score = 0;
	public static boolean playerTurn = true;

	public Game(String[][] pl) {
		shipsLocation = pl;
	}
}
