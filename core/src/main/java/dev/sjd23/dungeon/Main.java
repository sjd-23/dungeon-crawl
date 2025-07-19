package dev.sjd23.dungeon;

import com.badlogic.gdx.Game;
import dev.sjd23.dungeon.screens.GameScreen;

public class Main extends Game {
    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
