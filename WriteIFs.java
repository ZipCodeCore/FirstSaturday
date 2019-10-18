
/**
 * Write a description of class WriteIFs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteIFs
{
    int x;
    int tt_t;
    int tt_s;
    int oo1, oo2;
    String ss;

    
    public void playerDied(boolean player1) {
        // Write an IF statement that checks “player1.isAlive()”
        if (this.isAlive(player1) == false){
            displayGameOver(player1);
        }
        // and if that’s false, calls “displayGameOver(player1)”
     }
    
    
    public String thermoSTAT(int room) {
        // Write an IF statement that checks the
        // “temperature(room)” and if that check is less than 70, 
        if(tempurature(room) < 70){
            heatOn();
        }
        else{
            coolOn();
        }
        // calls “heatOn()” else calls “coolOn()”
        return this.ss;
    }
    
    public void fireplaceControl(Object fireplace1) {
        // Write an IF statement that checks
        // “outsideTemp()” is less than 50
        if(outsideTemp() < 50 && insideTemp() < 62){
            startAFire(fireplace1);
        }
        System.out.println(tt_s);
        // AND 
        // “insideTemp()” is less than 62,
        // calls “startAFire(fireplace1)”

    }
    
    public void checkFuel(double fuelLevel) {
        // Write an IF statement that checks “fuelLevel”
        if(fuelLevel < 0.08){
            refuel();
        }
        // and if that check is less than 0.08, calls “refuel()”

    }
    
    
       /**
     * Constructor for objects of class WriteIFs
     */
    public WriteIFs() {
      // initialise instance variables
      x = 0;
      tt_t = 0;
      tt_s = 1;
      ss = "";
      oo1 = 61;
      oo2 = 49;
    }
    
    // associated routine
    public boolean isAlive(boolean p) {
        return !p;
    }
    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }
      private int tempurature(int t) {
        return t+2;
    }
    private void heatOn() {
        this.ss = "heating";
    }
    private void coolOn() {
        this.ss = "cooling";
    }

    private int insideTemp() {
        return oo1;
    }
    private int outsideTemp() {
        return oo2;
    }
    private void startAFire(Object o) {
        this.tt_s = 213;
    }

    private void refuel() {
        this.x = 99;
    }

}
