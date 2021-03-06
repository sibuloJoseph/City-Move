/**
 * This implements the StudySpot class to describe study spots at the University of Calgary.
 *
 * Last modified: April 6, 2019
 *
 */

package logic;

import java.io.Serializable;

public class StudySpot implements Serializable {
    private double noiseLevel, bathroomsNearby, foodNearby, outlets, seatingSpace;
    private double x1, x2, y1, y2;
    private String name;

    /**
     * Default constructor for StudySpot object
     */
    public StudySpot() {
        this("");
    }

    /**
     * Constructor for StudySpot object which takes the name as a parameter
     * @param name: String containing the name of the study spot
     */
    public StudySpot(String name) {
        noiseLevel = 1.0;
        bathroomsNearby = 1.0;
        foodNearby = 1.0;
        outlets = 1.0;
        seatingSpace = 1.0;
        x1 = 1.0;
        x2 = 2.0;
        y1 = 1.0;
        y2 = 2.0;
        this.name = name;
    }
    
    /**
     * Copy constructor for StudySpot object
     * @param studySpotToCopy: StudySpot object to be copied
     */
    public StudySpot(StudySpot studySpotToCopy) {
        this.noiseLevel = studySpotToCopy.noiseLevel;
        this.bathroomsNearby = studySpotToCopy.bathroomsNearby;
        this.foodNearby = studySpotToCopy.foodNearby;
        this.outlets = studySpotToCopy.outlets;
        this.seatingSpace = studySpotToCopy.seatingSpace;
        this.name = studySpotToCopy.name;
        this.x1 = studySpotToCopy.x1;
        this.x2 = studySpotToCopy.x2;
        this.y1 = studySpotToCopy.y1;
        this.y2 = studySpotToCopy.y2;
    }

    /**
     * Sets the indicator of noise level to the given value
     * @param noiseLevel: double representing the noise level of the study spot
     */
    public void setNoiseLevel(double noiseLevel) {
        if (noiseLevel >= 1.0 && noiseLevel <= 10.0) {
            this.noiseLevel = noiseLevel;
        }
        else {
            this.noiseLevel = 1.0;
        }
    }

    /**
     * Sets the indicator of nearby bathrooms to the given value
     * @param bathroomsNearby: double representing whether or not there are bathrooms near the study spot
     */
    public void setBathroomsNearby(double bathroomsNearby) {
        if (bathroomsNearby >= 1.0 && bathroomsNearby <= 10.0) {
            this.bathroomsNearby = bathroomsNearby;
        }
        else {
            this.bathroomsNearby = 1.0;
        }
    }

    /**
     * Sets the indicator of available food places to the given value
     * @param foodNearby: double representing the amount of food places near the study spot
     */
    public void setFoodNearby(double foodNearby) {
        if (foodNearby >= 1.0 && foodNearby <= 10.0) {
            this.foodNearby = foodNearby;
        }
        else {
            this.foodNearby = 1.0;
        }
    }

    /**
     * Sets the indicator of available outlets to the given value
     * @param outlets: double representing whether power outlets are available
     */
    public void setOutlets(double outlets) {
        if (outlets >= 1.0 && outlets <= 10.0) {
            this.outlets = outlets;
        }
        else {
            this.outlets = 1.0;
        }
    }

    /**
     * Sets the indicator of avialable seating space to the given value
     * @param seatingSpace: double indicating the amount of available seats
     */
    public void setSeatingSpace(double seatingSpace) {
        if (seatingSpace >= 1.0 && seatingSpace <= 10.0) {
            this.seatingSpace = seatingSpace;
        }
        else {
            this.seatingSpace = 1.0;
        }
    }

    /**
     * Sets the name of the study spot to the given name
     * @param name: String containing the name of the study spot
     */
    public void setName(String name) {
        if (name == null) {
            this.name = "";
        }
        else {
            this.name = name;
        }
    }

    /**
     * Sets the left boundary of the x location of the study spot to the given value
     * @param x: double representing the left boundary of the x location of the study spot
     */
    public void setX1(double x) {
        if (x >= 0.0 && x <= 764.5) {
            this.x1 = x;
        }
        else {
            this.x1 = 1.0;
        }
    }

    /**
     * Sets the right boundary of the x location of the study spot to the given value
     * @param x: double representing the right boundary of the x location of the study spot
     */
    public void setX2(double x) {
        if (x >= 0.0 && x <= 764.5) {
            this.x2 = x;
        }
        else {
            this.x2 = 2.0;
        }
    }

    /**
     * Sets the upper boundary of the y location of the study spot to the given value
     * @param y: double representing the upper boundary of the y location of the study spot
     */
    public void setY1(double y) {
        if (y >= 0.0 && y <= 586.5) {
            this.y1 = y;
        }
        else {
            this.y1 = 1.0;
        }
    }

    /**
     * Sets the lower boundary of the y location of the study spot to the given value
     * @param y: double representing the lower boundary of the y location of the study spot
     */
    public void setY2(double y) {
        if (y >= 0.0 && y <= 586.5) {
            this.y2 = y;
        }
        else {
            this.y2 = 2.0;
        }
    }

    /**
     * Returns a double representing the noise level of the study spot
     */
    public double getNoiseLevel() {
        return noiseLevel;
    }

    /**
     * Returns a double representing the presence of bathrooms near the study spot
     */
    public double getBathroomsNearby() {
        return bathroomsNearby;
    }

    /**
     * Returns a double representing the amount of food places near the study spot
     */
    public double getFoodNearby() {
        return foodNearby;
    }

    /**
     * Returns a double representing the availability of outlets at the study spot
     */
    public double getOutlets() {
        return outlets;
    }

    /**
     * Returns a double representing the amount of seating space available at the study spot
     */
    public double getSeatingSpace() {
        return seatingSpace;
    }

    /**
     * Returns a String containing the name of the study spot
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a double representing the left boundary of the x location of the study spot
     */
    public double getX1() {
        return x1;
    }

    /**
     * Returns a double representing the right boundary of the x location of the study spot
     */
    public double getX2() {
        return x2;
    }

    /**
     * Returns a double representing the upper boundary of the y location of the study spot
     */
    public double getY1() {
        return y1;
    }

    /**
     * Returns a double representing the lower boundary of the y locartion of the study spot
     */
    public double getY2() {
        return y2;
    }
    
    /**
     * Returns the average of the x coordinates of the study spot
     */
    public double averageX() {
        return (x1 + x2) / 2.0;
    }

    /**
     * Returns the average of the y coordinates of the study spot
     */
    public double averageY() {
        return (y1 + y2) / 2.0;
    }

    /**
     * Returns a string representing the name of the study spot
     */
    public String toString () {
        return name;
    }
    
    /**
     * Tests the StudySpot class
     */
    public static void main(String[] args) {
        StudySpot s = new StudySpot();
        s.setNoiseLevel(1.0);
        s.setFoodNearby(2.0);
        s.setBathroomsNearby(3.0);
        s.setOutlets(4.0);
        s.setSeatingSpace(5.0);

        System.out.println(s.getNoiseLevel());
        System.out.println(s.getFoodNearby());
        System.out.println(s.getBathroomsNearby());
        System.out.println(s.getOutlets());
        System.out.println(s.getSeatingSpace());
        
        StudySpot s2 = new StudySpot(s);
        System.out.println(s2.getNoiseLevel());
        System.out.println(s2.getFoodNearby());
        System.out.println(s2.getBathroomsNearby());
        System.out.println(s2.getOutlets());
        System.out.println(s2.getSeatingSpace());

        s = new StudySpot("My study spot");
        System.out.println(s.getName());
        s.setName("Still a study spot");
        System.out.println(s.getName());

    }

}
