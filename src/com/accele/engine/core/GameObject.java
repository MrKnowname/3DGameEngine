package com.accele.engine.core;

import com.accele.engine.components.GameComponent;
import com.accele.engine.render.RenderingEngine;
import com.accele.engine.render.Shader;

import java.util.ArrayList;

public class GameObject {
	
	private ArrayList<GameObject> children;
	private ArrayList<GameComponent> components;
	private Transform transform;

	public GameObject() {
		children = new ArrayList<GameObject>();
		components = new ArrayList<GameComponent>();
		transform = new Transform();
	}

	public void addChild(GameObject child) {
		children.add(child);
		child.getTransform().setParent(transform);
	}

	public GameObject addComponent(GameComponent component) {
		components.add(component);
		component.setParent(this);
		
		return this;
	}

	public void input(float delta) {
		transform.update();
		
		for(GameComponent component : components)
			component.input(delta);

		for(GameObject child : children)
			child.input(delta);
	}

	public void update(float delta) {
		for(GameComponent component : components)
			component.update(delta);

		for(GameObject child : children)
			child.update(delta);
	}

	public void render(Shader shader, RenderingEngine renderingEngine) {
		for(GameComponent component : components)
			component.render(shader, renderingEngine);

		for(GameObject child : children)
			child.render(shader, renderingEngine);
	}
	
	public void addToRenderingEngine(RenderingEngine renderingEngine) {
		for(GameComponent component : components)
			component.addToRenderingEngine(renderingEngine);

		for(GameObject child : children)
			child.addToRenderingEngine(renderingEngine);
	}

	public Transform getTransform() {
		return transform;
	}
	
}
