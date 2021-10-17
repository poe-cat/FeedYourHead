package com.mygdx.feedyourhead;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class MainMenuScreen implements Screen {

    final FeedYourHead game;
    OrthographicCamera camera;

    public MainMenuScreen(final FeedYourHead game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }


}
