package com.accele.engine.components;

import com.accele.engine.core.GameObject;
import com.accele.engine.core.Transform;
import com.accele.engine.render.RenderingEngine;
import com.accele.engine.render.Shader;

public abstract class GameComponent {
	
	private GameObject parent;
	
	public void input(float delta) {}
	public void update(float delta) {}
	public void render(Shader shader) {}
	
	public Transform getTransform() {
		return parent.getTransform();
	}
	
	public void setParent(GameObject parent) {
		this.parent = parent;
	}
	
	public void addToRenderingEngine(RenderingEngine renderingEngine) {}
	
}

