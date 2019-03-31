# Decorator Pattern

Attaches additional responsibilities to an object dynamically.
Decorator provides a flexible alternative to subclassing
for extending functionality.

## Problem

We use the example of a coffee shop to understand the pattern.
StarBuzz coffee has tons of options and is constantly growing.
If we made each combination of beverages its own class,
things would grow out of control. If we had several classes
that needed to know the cost of milk then we would have to find them
all and update them one by one. 

The design in the starbuzz package is a much better implementation.