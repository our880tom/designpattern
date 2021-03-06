package designpattern.pattern;
/**
 * 策略模式测试类
 */
import org.junit.Test;

import designpattern.pattern.strategy.Car;
import designpattern.pattern.strategy.Drive;
import designpattern.pattern.strategy.Travel;

public class TestStrategy {
	@Test
	public void travel(){
		Drive drive = new Car();
		Travel travel = new Travel(drive);
		travel.drive();
	}

}
