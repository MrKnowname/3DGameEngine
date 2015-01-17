package com.accele.engine.components;

import com.accele.engine.core.Transform;
import com.accele.engine.render.RenderingEngine;
import com.accele.engine.render.Shader;

public abstract class GameComponent {
	
	public void input(Transform transform, float delta) {}
	public void update(Transform transform, float delta) {}
	public void render(Transform transform, Shader shader) {}
	
	public void addToRenderingEngine(RenderingEngine renderingEngine) {}
	
}

