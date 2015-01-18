package com.accele.engine.render;

import java.util.HashMap;

import com.accele.engine.core.Vector3f;

public class Material {
	
	private HashMap<String, Texture> textureHashMap;
	private HashMap<String, Vector3f> vector3fHashMap;
	private HashMap<String, Float> floatHashMap;
	
	public Material() {
		textureHashMap = new HashMap<>();
		vector3fHashMap = new HashMap<>();
		floatHashMap = new HashMap<>();
	}
	
	public void addTexture(String name, Texture texture) {
		textureHashMap.put(name, texture);
	}
	
	public Texture getTexture(String name) {
		Texture result = textureHashMap.get(name);
		if(result != null) {
			return result;
		}
		
		return new Texture("test.png");
	}
	
	public void addVector3f(String name, Vector3f vector) {
		vector3fHashMap.put(name, vector);
	}
	
	public Vector3f getVector3f(String name) {
		Vector3f result = vector3fHashMap.get(name);
		if(result != null) {
			return result;
		}
		
		return new Vector3f(0, 0, 0);
	}
	
	public void addFloat(String name, float floatValue) {
		floatHashMap.put(name, floatValue);
	}
	
	public float getFloat(String name) {
		Float result = floatHashMap.get(name);
		if(result != null) {
			return result;
		}
		
		return 0;
	}
	
}
