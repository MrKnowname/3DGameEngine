package com.accele.game;

import com.accele.engine.components.DirectionalLight;
import com.accele.engine.components.MeshRenderer;
import com.accele.engine.components.PointLight;
import com.accele.engine.components.SpotLight;
import com.accele.engine.core.Game;
import com.accele.engine.core.GameObject;
import com.accele.engine.core.Vector2f;
import com.accele.engine.core.Vector3f;
import com.accele.engine.render.Material;
import com.accele.engine.render.Mesh;
import com.accele.engine.render.Texture;
import com.accele.engine.render.Vertex;

public class TestGame extends Game {
	
	public void init() {
		float fieldDepth = 10.0f;
		float fieldWidth = 10.0f;

		Vertex[] vertices = new Vertex[] { 	new Vertex( new Vector3f(-fieldWidth, 0.0f, -fieldDepth), new Vector2f(0.0f, 0.0f)),
				new Vertex( new Vector3f(-fieldWidth, 0.0f, fieldDepth * 3), new Vector2f(0.0f, 1.0f)),
				new Vertex( new Vector3f(fieldWidth * 3, 0.0f, -fieldDepth), new Vector2f(1.0f, 0.0f)),
				new Vertex( new Vector3f(fieldWidth * 3, 0.0f, fieldDepth * 3), new Vector2f(1.0f, 1.0f))};

		int indices[] = { 0, 1, 2,
				2, 1, 3};

		Mesh mesh = new Mesh(vertices, indices, true);
		Material material = new Material(new Texture("test.png"), new Vector3f(1,1,1), 1, 8);

		MeshRenderer meshRenderer = new MeshRenderer(mesh, material);

		GameObject planeObject = new GameObject();
		planeObject.addComponent(meshRenderer);
		planeObject.getTransform().setPos(0, -1, 5);
		
		GameObject directionalLightObject = new GameObject();
		DirectionalLight directionalLight = new DirectionalLight(new Vector3f(0, 0, 1), 0.4f, new Vector3f(1, 1, 0));
		directionalLightObject.addComponent(directionalLight);
		
		GameObject pointLightObject = new GameObject();
		pointLightObject.addComponent(new PointLight(new Vector3f(0,1,0), 0.4f, 0,0,1, new Vector3f(5,0,5), 100));
		
				SpotLight spotLight = new SpotLight(new Vector3f(0,1,1), 0.4f,
						0,0,0.1f,
						new Vector3f(5,0,5), 100,
						new Vector3f(1,0,0), 0.7f);
		
				GameObject spotLightObject = new GameObject();
				spotLightObject.addComponent(spotLight);
		spotLightObject.addComponent(spotLight);
		
		getRootObject().addChild(planeObject);
		getRootObject().addChild(directionalLightObject);
		getRootObject().addChild(pointLightObject);
		getRootObject().addChild(spotLightObject);
	}
	
}
