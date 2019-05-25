package com.tmosest.competitiveprogramming.swing.pokemon.sprites;

import com.tmosest.competitiveprogramming.utils.sprite.Sprite;

import java.awt.image.BufferedImage;

public class PalletTownSpriteSheet extends Sprite {

  private static final String PALLET_TOWN_URL =
      "https://www.spriters-resource.com/resources/sheets/9/9130.png";

  private PalletTownSpriteSheet() {
    super(PALLET_TOWN_URL);
  }

  private static PalletTownSpriteSheet instance = new PalletTownSpriteSheet();

  public static PalletTownSpriteSheet instance() {
    return instance;
  }

  public BufferedImage getPalletTown() {
    return getSprite(5, 5, getSpriteSheet().getHeight() - 5, 320);
  }
}
