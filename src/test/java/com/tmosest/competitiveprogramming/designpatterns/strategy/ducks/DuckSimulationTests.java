package com.tmosest.competitiveprogramming.designpatterns.strategy.ducks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("designPatterns")
@Tag("strategy")
@DisplayName("Design Patterns: Strategy: Duck Simulation")
public class DuckSimulationTests {

  @Test
  @DisplayName("Test Decoy Duck")
  void testDecoyDuck() {
    DecoyDuck decoyDuck = new DecoyDuck();
    Assertions.assertEquals("I'm a decoy duck!", decoyDuck.display());
    Assertions.assertEquals(new QuackMute().quack(), decoyDuck.quack());
    Assertions.assertEquals(new FlyNoWay().fly(), decoyDuck.fly());
  }

  @Test
  @DisplayName("Test Mallard")
  void testMallardDuck() {
    MallardDuck mallardDuck = new MallardDuck();
    Assertions.assertEquals("I'm a mallard!", mallardDuck.display());
    Assertions.assertEquals(new Quack().quack(), mallardDuck.quack());
    Assertions.assertEquals(new FlyWithWings().fly(), mallardDuck.fly());
  }

  @Test
  @DisplayName("Test Rubber Duck")
  void testRubberDuck() {
    RubberDuck rubberDuck = new RubberDuck();
    Assertions.assertEquals("I'm a rubber duck", rubberDuck.display());
    Assertions.assertEquals(new Squeak().quack(), rubberDuck.quack());
    Assertions.assertEquals(new FlyNoWay().fly(), rubberDuck.fly());
  }
}
