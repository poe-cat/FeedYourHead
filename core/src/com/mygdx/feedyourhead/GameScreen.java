package com.mygdx.feedyourhead;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;


public class GameScreen implements Screen {

    final FeedYourHead game;

    OrthographicCamera camera;

    public GameScreen(final FeedYourHead game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}