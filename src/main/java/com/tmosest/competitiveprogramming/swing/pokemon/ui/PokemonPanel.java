package com.tmosest.competitiveprogramming.swing.pokemon.ui;

import com.tmosest.competitiveprogramming.swing.game.GamePanel;
import com.tmosest.competitiveprogramming.swing.pokemon.entity.Player;
import com.tmosest.competitiveprogramming.swing.pokemon.sprites.PalletTownSpriteSheet;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PokemonPanel extends GamePanel {

  PalletTownSpriteSheet palletTownSpriteSheet = PalletTownSpriteSheet.instance();
  Player player = new Player();

  @Override
  public void paintGame(Graphics graphics) {
    player.drawWithMovingBackground(graphics, palletTownSpriteSheet.getPalletTown());
  }

  @Override
  public void keyPressed(KeyEvent key) {
    int keyCode = key.getKeyCode();
    switch (keyCode) {
      case 37:
        player.moveLeft();
        break;
      case 38:
        player.moveUp();
        break;
      case 39:
        player.moveRight();
        break;
      case 40:
        player.moveDown();
        break;
      default:
    }
  }
}
