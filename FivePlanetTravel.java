/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    // total travel time
    double total = 0;

    /* your code here */
    System.out.println("Travel time to mercury: " + (double) mercury /  lightSpeed + " hours.");
    total += (double) mercury / lightSpeed;
    System.out.println();
    System.out.println("Travel time to venus: " + (double) venus /  lightSpeed + " hours.");
    total += (double) venus / lightSpeed;
    System.out.println();
    System.out.println("Travel time to mars: " + (double) mars /  lightSpeed + " hours.");
    total += (double) mars / lightSpeed;
    System.out.println();
    System.out.println("Travel time to jupiter: " + (double) jupiter /  lightSpeed + " hours.");
    total += (double) jupiter / lightSpeed;
    System.out.println();
    System.out.println("Travel time to saturn: " + (double) saturn /  lightSpeed + " hours.");
    total += (double) saturn / lightSpeed;
    System.out.println();
    System.out.println("The total time of traveling to all 5 planets is: " + total + " hours");
    System.out.println();
    double average = (int) (total / numPlanets + .5);
    System.out.println("Average travel time: " + average + " hours");
  }
}
