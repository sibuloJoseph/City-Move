package logic;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class outputs result of the best study spots for the user based on their answers and preferences.
 * 
 * Last modified: FMarch 25, 2019

 */
public class StudySpotList{
    private IdealStudySpot userIdeal = new IdealStudySpot();
    private ArrayList<StudySpot> studySpotList = new ArrayList<StudySpot>();
    private Scanner studySpotsFromTxt;
    private StudySpot studySpot = new StudySpot();

    /**
     * Default constructor for the StudySpotList object
     */
    public StudySpotList(){
        try {
            studySpotsFromTxt = new Scanner(new File("StudySpotsListV1.0.0.txt"));
            while (studySpotsFromTxt.hasNext()){
                studySpot = new StudySpot();
                studySpot.setName(studySpotsFromTxt.nextLine());
                studySpot.setNoiseLevel(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setBathroomsNearby(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setFoodNearby(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setSeatingSpace(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setOutlets(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setX1(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setX2(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setY1(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpot.setY2(Double.parseDouble(studySpotsFromTxt.nextLine()));
                studySpotList.add(studySpot);
            }
        }
        catch (Exception e) {
            System.out.println("No File"); 
            System.exit(0);
        }

    }

    /**
     * Copy Constructor for StudySpot object
     * @param studySpotlistToCopy StudySpotList object to be copied
     */
    public StudySpotList(StudySpotList studySpotlistToCopy){
        this.userIdeal = studySpotlistToCopy.userIdeal;
        this.studySpotList = studySpotlistToCopy.studySpotList;
    }

    /**
     * Sets the userIdeal object to the given IdealStudySpot parameter.   
     * @param userIdeal variable from the IdealStudySpot class.
     */
    public void setUserIdeal(IdealStudySpot sUserIdeal){
        if(sUserIdeal == null){
            userIdeal = userIdeal;
        }
        else{
            userIdeal = new IdealStudySpot(sUserIdeal);
        }
    }

    /**
     * Returns the ideal StudySpot based on the user's input.
     */
    public IdealStudySpot getUserIdeal(){
        return new IdealStudySpot(userIdeal);
    }

    /**
     * Returns the list of StudySpots after getting the study spots from the StudySpotsList text file.
     */
    public ArrayList<StudySpot> getStudySpotList(){
        ArrayList<StudySpot> s = new ArrayList<StudySpot>();
        for(int i =0; i<studySpotList.size(); i++){
            s.add(new StudySpot(studySpotList.get(i)));
        }
        return s;
    }

    /**
     * Returns the best and  most ideal study spots based on the user's input.
     */
    public ArrayList<StudySpot> getBestStudySpots(){
        double temp;
        StudySpot tempss;
        ArrayList<StudySpot> bestStudySpotList = this.getStudySpotList();
        //Create an ArrayList for the comparison values from the compareTo() method in the IdealStudySpot Class
        ArrayList<Double> comparisonValues = new ArrayList<Double>();
        for(int x=0; x<bestStudySpotList.size(); x++){
            comparisonValues.add(this.getUserIdeal().compareTo(new StudySpot(bestStudySpotList.get(x))));
        }
        
        //Sort the comparisonValues array in ascending order and match it with the studySpotList array so that 
        //the studySpotList array will have the best study spot in the first index. 
        for(int i = 1; i < bestStudySpotList.size(); i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(comparisonValues.get(j) > comparisonValues.get(j+1)) {
                    temp = comparisonValues.get(j);
                    comparisonValues.set(j, comparisonValues.get(j+1));
                    comparisonValues.set(j+1, temp);
                    tempss = bestStudySpotList.get(j);
                    bestStudySpotList.set(j, bestStudySpotList.get(j+1));
                    bestStudySpotList.set(j+1, tempss);
                }
            }
        }
        return bestStudySpotList;
    }

    public StudySpot getLocation(double x, double y){
        StudySpot s = null;        
        for(int i=0; i<studySpotList.size(); i++){
            if(studySpotList.get(i).getX1()<x && studySpotList.get(i).getX2()>x){
                if(studySpotList.get(i).getY1()<y && studySpotList.get(i).getY2()>y){
                    s = new StudySpot(studySpotList.get(i));
                }
            }
        }
        return s;
    }

    /**
    *Test the StudySpotList class
    */
    public static void main(String[] args) throws FileNotFoundException{
        StudySpotList list1 = new StudySpotList();

        System.out.println(list1.getUserIdeal());
        System.out.println(list1.getStudySpotList()); 
        System.out.println(list1.getBestStudySpots()); 
    }
}
