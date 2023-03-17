

import java.awt.Color;

public class Settings {

  static int numToKill = 24;
  static int difficulty = 1;
  static String name = "unknown";
  static String player = "src/images/yellowPlayer.png";
  static Color bg = Color.black;
  static Color text = Color.white;
 
  
  
  
  
  String getPlayer(){
	  return player;
  }
  
  int getNumToKill() {
	  return numToKill;
  }
  
  void setDifficulty(int diff) {
	  difficulty = diff;
  }
  
  int getDifficulty() {
	  return difficulty;
  }
}