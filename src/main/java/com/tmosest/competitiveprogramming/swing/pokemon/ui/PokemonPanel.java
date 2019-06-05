package com.tmosest.competitiveprogramming.swing.pokemon.ui;

import com.tmosest.competitiveprogramming.swing.game.GamePanel;
import com.tmosest.competitiveprogramming.swing.pokemon.entity.Background;
import com.tmosest.competitiveprogramming.swing.pokemon.entity.PalletTown;
import com.tmosest.competitiveprogramming.swing.pokemon.entity.Player;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PokemonPanel extends GamePanel {

  private Background background = new PalletTown();
  private Player player = new Player();

  @Override
  public void paintGame(Graphics graphics) {
    player.drawWithMovingBackground(graphics, background);
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
