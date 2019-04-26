
// Opstartklasse voor applicatie met paneel voor twee knoppen en tekstvak
import javax.swing.*;



public class Lingo extends JFrame { 
  public static void main( String args[] ) {	  
    JFrame frame = new Lingo();
    frame.setSize( 600, 800 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "LINGO" );
   
    JPanel lingopaneel = new LingoPaneel();
    frame.setContentPane( lingopaneel );
    frame.setVisible( true );
  } 
}

