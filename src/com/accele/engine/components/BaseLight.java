package com.accele.engine.components;

import com.accele.engine.core.Vector3f;
import com.accele.engine.render.RenderingEngine;
import com.accele.engine.render.Shader;

public class BaseLight extends GameComponent {
	
	private Vector3f color;
	private float intensity;
	private Shader shader;
	
	public BaseLight(Vector3f color, float intensity) {
		this.color = color;
		this.intensity = intensity;
	}
	
	public void addToRenderingEngine(RenderingEngine renderingEngine) {
		renderingEngine.addLight(this);
	}
	
	public Shader getShader() {
		return shader;
	}
	
	public void setShader(Shader shader) {
		this.shader = shader;
	}

	public Vector3f getColor() {
		return color;
	}

	public void setColor(Vector3f color) {
		this.color = color;
	}

	public float getIntensity() {
		return intensity;
	}

	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}
	
}
