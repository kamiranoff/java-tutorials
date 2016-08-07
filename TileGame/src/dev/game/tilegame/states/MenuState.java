package dev.game.tilegame.states;

import java.awt.*;

import javax.swing.*;

import dev.game.tilegame.Game;
import dev.game.tilegame.Handler;
import dev.game.tilegame.display.Display;
import dev.game.tilegame.gfx.Assets;
import dev.game.tilegame.ui.ClickListener;
import dev.game.tilegame.ui.UIImageButton;
import dev.game.tilegame.ui.UIManager;

/**
 * Created by kevin on 07/01/16.
 */
public class MenuState extends State {

  private UIManager uiManager;




  public MenuState(Handler handler, Display display) {
    super(handler);

    uiManager = new UIManager(handler);
    handler.getMouseManager().setUIManager(uiManager);

    int canvasWidth = display.getCanvas().getWidth();
    int canvasHeight = display.getCanvas().getHeight();
    int canvasCenterX = canvasWidth/2;
    int canvasCenterY = canvasHeight/2;

    uiManager.addObject(new UIImageButton(canvasCenterX - 50, canvasCenterY - 25, 100, 50, Assets.start_button, new ClickListener() {


      @Override
      public void onClick() {
        handler.getMouseManager().setUIManager(null);
        State.setState(handler.getGame().gameState);
      }

    })) ;
  }



  @Override
  public void tick() {
   uiManager.tick();
  }

  @Override
  public void render(Graphics g) {
    uiManager.render(g);
  }
}
