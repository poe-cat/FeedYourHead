package com.mygdx.feedyourhead;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {

    final FeedYourHead game;
    OrthographicCamera camera;

    public MainMenuScreen(final FeedYourHead game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.PURPLE);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Come in & Feed Your Head", 220, 250);
        game.font.draw(game.batch, "click anywhere to start", 250, 200);
        game.font.setColor(Color.YELLOW);
        game.font.getData().setScale(2f);
        game.batch.end();

        if(Gdx.input.isTouched()) {      //when you click, game screen appears
            game.setScreen(new GameScreen(game));
            dispose();
        }
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
