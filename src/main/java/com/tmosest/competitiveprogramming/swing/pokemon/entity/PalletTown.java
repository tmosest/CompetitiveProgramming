package com.tmosest.competitiveprogramming.swing.pokemon.entity;

import com.tmosest.competitiveprogramming.swing.pokemon.sprites.PalletTownSpriteSheet;

public class PalletTown extends Background {

  /**
   * Creates a new pallet town.
   */
  public PalletTown() {
    super(PalletTownSpriteSheet.instance().getPalletTown());
    // Left Wall
    addObstacle(0,0, 15, getBufferedImage().getHeight());
    // Right Wall
    addObstacle(getBufferedImage().getWidth() - 15,0, 15, getBufferedImage().getHeight());
    // Bottom Wall
    addObstacle(0, getBufferedImage().getHeight() - 15, getBufferedImage().getWidth(), 15);
    // Top Wall
    addObstacle(0, 15, getBufferedImage().getWidth(), 15);
    // First Building
    addObstacle(70, 50, 50, 50);
    // First Sign
    addObstacle(50, 80, 20, 15);
    // Second Building
    addObstacle(200, 50, 50, 50);
    // Second Sign
    addObstacle(180, 80, 20, 15);
    // Third Sign and Fence
    addObstacle(65, 145, 65, 20);
    // Professor Oaks
    addObstacle(165, 130, 85, 60);
    // Fourth Sign and Fence
    addObstacle(160, 210, 90, 20);
  }
}
