package com.accele.engine.components;

import com.accele.engine.core.Vector3f;
import com.accele.engine.render.ForwardDirectional;

public class DirectionalLight extends BaseLight {
	
	public DirectionalLight(Vector3f color, float intensity) {
		super(color, intensity);
		
		setShader(ForwardDirectional.getInstance());
	}

	public Vector3f getDirection() {
		return getTransform().getTransformedRot().getForward();
	}
	
}
