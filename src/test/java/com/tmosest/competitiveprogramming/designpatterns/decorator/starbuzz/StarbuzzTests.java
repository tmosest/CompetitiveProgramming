package com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz;

import com.tmosest.competitiveprogramming.designpatterns.decorator.starbuzz.Beverage.Size;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("designPatterns")
@Tag("decorator")
@DisplayName("Design Patterns: Decorator: StarBuzz")
public class StarbuzzTests {

  @Test
  @DisplayName("Beverages test")
  void testBeverages() {
    Beverage houseBlend = new Houseblend();
    Beverage darkRoast = new DarkRoast();
    Beverage decaf = new Decaf();
    Beverage espresso = new Espresso();

    Beverage milkHouseBlend = new Milk(houseBlend);
    Beverage milkDarkRoast = new Milk(darkRoast);
    Assertions.assertEquals(milkDarkRoast.cost() - darkRoast.cost(), milkHouseBlend.cost() - houseBlend.cost());

    Beverage soyDecaf = new Soy(decaf);
    Beverage soyEspresso = new Soy(espresso);
    Assertions.assertEquals(soyDecaf.cost() - decaf.cost(), soyEspresso.cost() - espresso.cost());

    Beverage crazyBeverage = new Whip(new Milk(new Soy(new Mocha(new Decaf()))));
    Assertions.assertNotEquals("", crazyBeverage.getDescription());
    Assertions.assertNotEquals(0.0, crazyBeverage.cost());
  }

  @Test
  @DisplayName("Sizes test")
  void testSizes() {
    Beverage crazyBeverage = new Whip(new Milk(new Soy(new Mocha(new Decaf()))));
    double cost = crazyBeverage.cost();
    crazyBeverage.setSize(Size.VENTI);
    Assertions.assertNotEquals(cost, crazyBeverage.cost());
  }
}
