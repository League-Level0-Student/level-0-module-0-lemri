package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
public static void main(String[] args) {
	
  	Robot r2d2 = new Robot("mini");
  	r2d2.setSpeed(100);
  	r2d2.turn(180);
  	r2d2.move(250);
  	r2d2.turn(180);
	r2d2.penDown();

	for (int i = 0; i < 500; i++) {
		r2d2.setPenColor(0, 0, 0);
  	r2d2.move(200);
  	r2d2.setRandomPenColor();
	r2d2.move(130);
  	r2d2.turn(181);
}
}
}