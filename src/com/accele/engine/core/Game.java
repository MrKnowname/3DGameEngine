package com.accele.engine.core;

import com.accele.engine.render.RenderingEngine;

public abstract class Game {
	
	private GameObject root;

	public void init() {
	}

	public void input(float delta) {
		getRootObject().input(delta);
	}

	public void update(float delta) {
		getRootObject().update(delta);
	}
	
	public void render(RenderingEngine renderingEngine) {
		renderingEngine.render(getRootObject());
	}
	
	public void addObject(GameObject object) {
		getRootObject().addChild(object);
	}

	private GameObject getRootObject() {
		if(root == null)
			root = new GameObject();

		return root;
	}
	
}
