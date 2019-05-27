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
		for (int i = 0; i < 1000; i++) {
			
r2d2.setPenColor(0, 0, 0);
r2d2.turn(378);
r2d2.move(85);
r2d2.turn(70);
r2d2.move(23);
r2d2.turn(120);
r2d2.move(85);
r2d2.setPenColor(7, 9, 145);
r2d2.move(85);
r2d2.setPenColor(15, 145, 22);
r2d2.turn(81);
r2d2.move(45);
r2d2.setPenColor(70, 183, 5);
r2d2.move(25);
r2d2.setPenColor(255, 247, 22);
r2d2.turn(125);
r2d2.move(56);
r2d2.turn(23);
r2d2.move(20);
r2d2.setPenColor(224, 6, 6);
r2d2.move(96);
r2d2.turn(181);
r2d2.move(56);
		}
        // 6. Make the robot move as fast as possible


        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
