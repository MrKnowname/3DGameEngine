package com.accele.game;

import com.accele.engine.core.GameComponent;
import com.accele.engine.core.Transform;
import com.accele.engine.render.Material;
import com.accele.engine.render.Mesh;
import com.accele.engine.render.Shader;

public class MeshRenderer implements GameComponent {
	
	private Mesh mesh;
	private Material material;

	public MeshRenderer(Mesh mesh, Material material) {
		this.mesh = mesh;
		this.material = material;
	}

	@Override
	public void input(Transform transform, float delta) {
		
	}

	@Override
	public void update(Transform transform, float delta) {
		
	}

	@Override
	public void render(Transform transform, Shader shader) {
		shader.bind();
		shader.updateUniforms(transform, material);
		mesh.draw();
	}
	
}
