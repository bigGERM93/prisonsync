/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prisonsyncgitversion;

/**
 *
 * @author brettgalloway
 */
public class VisitationSchedule {
   
    private String schedule[][];
    private int[] counter = {1,1,1,1,1,1,1};
   
    public VisitationSchedule(){
        
        int t = 10; //starting hour open to visitation
        schedule = new String[8][7]; //visitation hours are from 10am-5pm
        
        //first row labels all of the columns with the first column "Time"
        //and the remaining "Inmate"
        schedule[0][0] = "Time";
        
        for (int i = 1; i < schedule[0].length; i++)
            schedule[0][i] = "Box" + i;
        
        //The remaining rows label the time frame allowed for visitation
        //we assume that a prisoner is allowed 1 hour per visit
        for (int i = 1; i < schedule.length; i++){
            schedule[i][0] = t + ":00"; 
            t++;
            }
    }
  
    public String[][] getSchedule(){
            
        String[][] copy = new String[8][7];
            
            for (int i = 0; i < schedule.length; i++){
                for (int j = 0; j < schedule[i].length; j++){
                    copy[i][j] = schedule[i][j];
                }
            }
            
            return copy;
        }
    
    //set a timeslot with the inmate to be visited
    public void setVisit(int row, String name){
       
        schedule[row][counter[row - 1]] = name;
        counter[row - 1]++;
        
    }
    
    //this method checks to see if there are any more "Boxes" open at the desired timeslot
    public boolean checkExistingVisit(int row, String name){
        for (int i = 1; i < schedule[row].length; i++){
            if (schedule[row][i] == null)
                continue;
            if (schedule[row][i].equals(name))
                return true;
        }
        return false;
    }
    //reset timeslots
    public void reset(){
        
        for (int i = 1; i < schedule.length; i++){
            for (int j = 1; j < schedule[i].length; j++){
                schedule[i][j] = "";
            }
        }
        
        for (int i = 0; i < counter.length; i++)
            counter[i] = 0;
        
    }
    //check to see if a timeslot is open
    public int checkAvailability(int row){
        if (counter[row] < 7)
            return 1;
        
        return -1;
    }
    
    public static String getDay(int day){
        switch (day){
                case 0:
                    return "Monday";
                case 1: 
                    return "Tuesday";
                case 2:
                    return "Wednesday";
                case 3:
                    return "Thursday";
                case 4:
                    return "Friday";
                default:
                    return "";
                            
              }
    }
    //return a single timeslot in string form
    public String toString(int row){
        return "Your visit with " + schedule[row][counter[row-1] - 1] + " at " + schedule[row][0] + " has been verified";
    }

   
    
    }
    
  

