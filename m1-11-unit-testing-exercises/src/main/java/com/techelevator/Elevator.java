package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen = true;

    /**
     * Creates a new elevator 
     * @param shaftNumber Shaft for the elevator
     * @param totalNumberOfFloors Number of floors in the elevator
     */
    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
    } 

    /**
     * Elevator Shaft Number 
     * @return shaftNumber
     */
    public int getShaftNumber() {
        return shaftNumber;
    }

    /**
     * Current elevator level 
     * @return currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Number of levels available for elevator. 
     * @return numberOfLevels
     */
    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Is Elevator Door Open? 
     * @return doorOpen
     */
    public boolean isDoorOpen() {
        return doorOpen;
    }

 

    /**
     * Opens the elevator door, as long as it is not moving 
     */
    public void OpenDoor()
    { 
    	doorOpen = true;
    }

    /**
     * Closes the elevator door, as long as it is not moving. 
     */
    public void CloseDoor()
    {
<<<<<<< HEAD
        if (!moving)
        {
            doorOpen = false;
        }
=======
    	doorOpen = false;
>>>>>>> f224f1587b4e5a69363b4be9bd346f2b8264412b
    }

    /**
     * Moves the elevator up, as long as the door is closed and the desired floor is not past the last floor 
     * @param desiredFloor Desired floor to go to
     * @return If the elevator was able to move up
     */
    public boolean GoUp(int desiredFloor)
    {
        

        if (desiredFloor > currentLevel && desiredFloor <= numberOfLevels && !doorOpen)
        {
        	currentLevel = desiredFloor;
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Moves the elevator down, as long as the door is closed and desired floor is lower than current but not past 1 
     * @param desiredFloor Floor to go to
     * @return True if possible to move
     */
    public boolean GoDown(int desiredFloor)
    {
        if (!doorOpen && desiredFloor < currentLevel && desiredFloor > 0)
        {
            currentLevel = desiredFloor;
            return true;
        }

        return false;
    }

}
