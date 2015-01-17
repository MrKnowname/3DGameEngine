package com.accele.engine.core;

import com.accele.engine.render.Shader;

public interface GameComponent {
	
	public void input(Transform transform, float delta);
	public void update(Transform transform, float delta);
	public void render(Transform transform, Shader shader);
	
}

