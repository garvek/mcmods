package threeDitems.render.item;

import net.minecraft.client.model.ModelBase;

import org.lwjgl.opengl.GL11;

import threeDitems.render.Render3DInterface;

public class RenderIngot extends Render3DInterface {

	public RenderIngot(ModelBase model, String texture) {
		super(model, texture);
	}

	@Override
	public void renderEntity() {
		GL11.glRotatef(0,0,1,0);
		GL11.glRotatef(180,0,0,1);
		GL11.glRotatef(0,1,0,0);

		GL11.glTranslatef(0f, 0f, 0f);
	}

	@Override
	public void renderEquipped() {
		GL11.glRotatef(10,0,1,0);
		GL11.glRotatef(95,0,0,1);
		GL11.glRotatef(180,1,0,0);

		GL11.glTranslatef(0.2f, 0.2f, -0.2f);

		float f = 0.4f;
		GL11.glScalef(f, f, f);
	}

	@Override
	public void renderEquippedFP() {
		GL11.glRotatef(45,0,1,0);
		GL11.glRotatef(160,0,0,1);
		GL11.glRotatef(90,1,0,0);

		GL11.glTranslatef(0f, 0.9f, 0.9f);
	}

	@Override
	public void renderScale() {
		float f = 3f;
		GL11.glScalef(f, f, f);
	}

}