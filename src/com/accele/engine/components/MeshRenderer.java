package com.accele.engine.components;

import com.accele.engine.render.Material;
import com.accele.engine.render.Mesh;
import com.accele.engine.render.RenderingEngine;
import com.accele.engine.render.Shader;

public class MeshRenderer extends GameComponent {
	
	private Mesh mesh;
	private Material material;

	public MeshRenderer(Mesh mesh, Material material) {
		this.mesh = mesh;
		this.material = material;
	}

	@Override
	public void render(Shader shader, RenderingEngine renderingEngine) {
		shader.bind();
		shader.updateUniforms(getTransform(), material, renderingEngine);
		mesh.draw();
	}
	
}
