package slm.aliens.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEvilStaff extends ModelBase {

    ModelRenderer Staff1;
    ModelRenderer Staff2;
    ModelRenderer Staff3;
    ModelRenderer Staff4;
    ModelRenderer Staff5;
    ModelRenderer Staff6;
    ModelRenderer Staff7;
    ModelRenderer spike1;
    ModelRenderer spike2;
    ModelRenderer spike3;
    ModelRenderer spike4;
    ModelRenderer spike5;
    ModelRenderer spike6;
    ModelRenderer Gem;
    ModelRenderer ring1;
    ModelRenderer ring2;
    ModelRenderer ring3;
    ModelRenderer ring4;
    ModelRenderer ring5;
  
  public ModelEvilStaff() {
    textureWidth = 64;
    textureHeight = 32;
    
      Staff1 = new ModelRenderer(this, 0, 0);
      Staff1.addBox(-1F, 18F, -1F, 2, 6, 2);
      Staff1.setRotationPoint(0F, 0F, 0F);
      Staff1.setTextureSize(64, 32);
      Staff1.mirror = true;
      setRotation(Staff1, 0F, 0F, 0F);
      Staff2 = new ModelRenderer(this, 8, 0);
      Staff2.addBox(-0.5F, 0F, -0.5F, 1, 18, 1);
      Staff2.setRotationPoint(0F, 0F, 0F);
      Staff2.setTextureSize(64, 32);
      Staff2.mirror = true;
      setRotation(Staff2, 0F, 0F, 0F);
      Staff3 = new ModelRenderer(this, 0, 0);
      Staff3.addBox(-1F, -5F, -0.5F, 2, 6, 2);
      Staff3.setRotationPoint(0F, 0F, 0F);
      Staff3.setTextureSize(64, 32);
      Staff3.mirror = true;
      setRotation(Staff3, -0.418879F, 0F, 0F);
      Staff4 = new ModelRenderer(this, 0, 0);
      Staff4.addBox(-1F, -9F, 2.3F, 2, 6, 2);
      Staff4.setRotationPoint(0F, 0F, 0F);
      Staff4.setTextureSize(64, 32);
      Staff4.mirror = true;
      setRotation(Staff4, 0.1745329F, 0F, 0F);
      Staff5 = new ModelRenderer(this, 12, 0);
      Staff5.addBox(-1.5F, -9F, -2.5F, 3, 6, 3);
      Staff5.setRotationPoint(0F, 0F, 0F);
      Staff5.setTextureSize(64, 32);
      Staff5.mirror = true;
      setRotation(Staff5, 0F, 0F, 0F);
      Staff6 = new ModelRenderer(this, 0, 8);
      Staff6.addBox(-0.5F, -3F, 0.5F, 1, 2, 1);
      Staff6.setRotationPoint(0F, 0F, 0F);
      Staff6.setTextureSize(64, 32);
      Staff6.mirror = true;
      setRotation(Staff6, 0.3346075F, 0F, 0F);
      Staff7 = new ModelRenderer(this, 4, 8);
      Staff7.addBox(-0.5F, -3.7F, -1F, 1, 4, 1);
      Staff7.setRotationPoint(0F, 0F, 0F);
      Staff7.setTextureSize(64, 32);
      Staff7.mirror = true;
      setRotation(Staff7, 0.4044207F, 0F, 0F);
      spike1 = new ModelRenderer(this, 0, 13);
      spike1.addBox(-8.5F, -7F, -1F, 4, 1, 0);
      spike1.setRotationPoint(0F, 0F, 0F);
      spike1.setTextureSize(64, 32);
      spike1.mirror = true;
      setRotation(spike1, 0F, 0.8028515F, 0.5061455F);
      spike2 = new ModelRenderer(this, 0, 13);
      spike2.addBox(4.5F, -7F, -1F, 4, 1, 0);
      spike2.setRotationPoint(0F, 0F, 0F);
      spike2.setTextureSize(64, 32);
      spike2.mirror = true;
      setRotation(spike2, 0F, -0.8028515F, -0.5061455F);
      spike3 = new ModelRenderer(this, 0, 13);
      spike3.addBox(-7.5F, -5F, -1F, 4, 1, 0);
      spike3.setRotationPoint(0F, 0F, 0F);
      spike3.setTextureSize(64, 32);
      spike3.mirror = true;
      setRotation(spike3, 0F, 0.8028515F, 0.5061455F);
      spike4 = new ModelRenderer(this, 0, 13);
      spike4.addBox(3.5F, -5F, -1F, 4, 1, 0);
      spike4.setRotationPoint(0F, 0F, 0F);
      spike4.setTextureSize(64, 32);
      spike4.mirror = true;
      setRotation(spike4, 0F, -0.8028515F, -0.5061455F);
      spike5 = new ModelRenderer(this, 0, 14);
      spike5.addBox(-5.5F, -3.5F, -1F, 3, 1, 0);
      spike5.setRotationPoint(0F, 0F, 0F);
      spike5.setTextureSize(64, 32);
      spike5.mirror = true;
      setRotation(spike5, 0F, 0.8028515F, 0.5061455F);
      spike6 = new ModelRenderer(this, 0, 14);
      spike6.addBox(2.5F, -3.5F, -1F, 3, 1, 0);
      spike6.setRotationPoint(0F, 0F, 0F);
      spike6.setTextureSize(64, 32);
      spike6.mirror = true;
      setRotation(spike6, 0F, -0.8028515F, -0.5061455F);
      Gem = new ModelRenderer(this, 12, 9);
      Gem.addBox(-1F, -9.5F, -2F, 2, 1, 2);
      Gem.setRotationPoint(0F, 0F, 0F);
      Gem.setTextureSize(64, 32);
      Gem.mirror = true;
      setRotation(Gem, 0F, 0F, 0F);
      ring1 = new ModelRenderer(this, 0, 15);
      ring1.addBox(-1F, 2F, -2F, 2, 1, 2);
      ring1.setRotationPoint(0F, 0F, 0F);
      ring1.setTextureSize(64, 32);
      ring1.mirror = true;
      setRotation(ring1, 0.3490659F, 0F, 0F);
      ring2 = new ModelRenderer(this, 0, 15);
      ring2.addBox(-1F, 5F, -3F, 2, 1, 2);
      ring2.setRotationPoint(0F, 0F, 0F);
      ring2.setTextureSize(64, 32);
      ring2.mirror = true;
      setRotation(ring2, 0.3490659F, 0F, 0F);
      ring3 = new ModelRenderer(this, 0, 15);
      ring3.addBox(-1F, 8F, -4F, 2, 1, 2);
      ring3.setRotationPoint(0F, 0F, 0F);
      ring3.setTextureSize(64, 32);
      ring3.mirror = true;
      setRotation(ring3, 0.3490659F, 0F, 0F);
      ring4 = new ModelRenderer(this, 0, 15);
      ring4.addBox(-1F, 11F, -5F, 2, 1, 2);
      ring4.setRotationPoint(0F, 0F, 0F);
      ring4.setTextureSize(64, 32);
      ring4.mirror = true;
      setRotation(ring4, 0.3490659F, 0F, 0F);
      ring5 = new ModelRenderer(this, 0, 15);
      ring5.addBox(-1F, 14F, -6F, 2, 1, 2);
      ring5.setRotationPoint(0F, 0F, 0F);
      ring5.setTextureSize(64, 32);
      ring5.mirror = true;
      setRotation(ring5, 0.3490659F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Staff1.render(f5);
    Staff2.render(f5);
    Staff3.render(f5);
    Staff4.render(f5);
    Staff5.render(f5);
    Staff6.render(f5);
    Staff7.render(f5);
    spike1.render(f5);
    spike2.render(f5);
    spike3.render(f5);
    spike4.render(f5);
    spike5.render(f5);
    spike6.render(f5);
    Gem.render(f5);
    ring1.render(f5);
    ring2.render(f5);
    ring3.render(f5);
    ring4.render(f5);
    ring5.render(f5);
  }
  
  public void renderModel(float f5) {
	    Staff1.render(f5);
	    Staff2.render(f5);
	    Staff3.render(f5);
	    Staff4.render(f5);
	    Staff5.render(f5);
	    Staff6.render(f5);
	    Staff7.render(f5);
	    spike1.render(f5);
	    spike2.render(f5);
	    spike3.render(f5);
	    spike4.render(f5);
	    spike5.render(f5);
	    spike6.render(f5);
	    Gem.render(f5);
	    ring1.render(f5);
	    ring2.render(f5);
	    ring3.render(f5);
	    ring4.render(f5);
	    ring5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
