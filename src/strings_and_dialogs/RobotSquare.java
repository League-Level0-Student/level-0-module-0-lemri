package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot r2d2 = new Robot("mini");

        // 3. Put the robot's pen down
    	r2d2.setSpeed(100);
    	r2d2.penDown();
		r2d2.move(200);
		for (int i = 0; i < 150; i++) {
			
		r2d2.setRandomPenColor();
r2d2.turn(97);
r2d2.move(85);
r2d2.turn(7);
r2d2.move(43);
r2d2.setRandomPenColor();
r2d2.turn(70);
r2d2.move(173);
r2d2.turn(81);
r2d2.move(25);
r2d2.turn(65);
r2d2.move(56);
		}
        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
