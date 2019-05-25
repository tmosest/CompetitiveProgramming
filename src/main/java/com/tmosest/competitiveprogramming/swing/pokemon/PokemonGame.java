package com.tmosest.competitiveprogramming.swing.pokemon;

import com.tmosest.competitiveprogramming.swing.game.GameFrame;
import com.tmosest.competitiveprogramming.swing.pokemon.ui.PokemonPanel;

import java.awt.Color;

public class PokemonGame extends GameFrame {

  private static final int size = 160;

  private PokemonGame(PokemonPanel pokemonPanel) throws InterruptedException {
    super("Pokemon Game!", pokemonPanel, size);
    setBackground(Color.BLACK);
  }

  @Override
  public void gameLoop() {
  }

  /**
   * Manual testing.
   * @param args The command line args.
   */
  public static void main(String[] args) {
    try {
      new PokemonGame(new PokemonPanel());
    } catch (Exception e) {
      System.out.print("Error " + e.getMessage());
      e.printStackTrace();
    }
  }
}
