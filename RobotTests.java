import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.*;

public class RobotTests
{
	public static void main(String args[])
	{
		try {

            Robot robot = new Robot();

            robot.mouseMove(22, 750);

            robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);


            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_N);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_O);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_T);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_E);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_P);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_A);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_D);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);



			robot.delay(500);
            robot.keyPress(KeyEvent.VK_H);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_E);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_O);
            robot.delay(2000);


			System.out.println("Cursor position = " + MouseInfo.getPointerInfo().getLocation());

            robot.mouseMove(1219, 120);

            robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);

			robot.delay(2000);
			robot.mouseMove(716, 385);

			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);

        } catch (AWTException e) {
            e.printStackTrace();
        }

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();


	}


}