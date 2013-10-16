// Date: 10/15/2013 2:05:00 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package azathoth.thaumcraft.grimoires;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGrimoire extends ModelBase
{
  //fields
    ModelRenderer front_cover;
    ModelRenderer back_cover;
    ModelRenderer spine;
    ModelRenderer front_page_block;
    ModelRenderer back_page_block;
    ModelRenderer page1;
    ModelRenderer page2;
    ModelRenderer page3;
    ModelRenderer page4;
    ModelRenderer page5;
  
  public ModelGrimoire()
  {
    textureWidth = 64;
    textureHeight = 32;
    
		spine = new ModelRenderer(this, 20, 0);
		spine.addBox(0F, -5F, -1F, 1, 12, 2);
		spine.setRotationPoint(-5F, 8F, 0F);
		spine.setTextureSize(64, 32);
		spine.mirror = true;
		setRotation(spine, 0F, 0F, 0F);

		front_cover = new ModelRenderer(this, 0, 0);
		front_cover.addBox(-0.5F, -6F, -1F, 9, 12, 1);
		front_cover.setRotationPoint(0.5F, 1F, -1F);
		front_cover.setTextureSize(64, 32);
		front_cover.mirror = true;
		setRotation(front_cover, 0F, 0F, 0F);

		back_cover = new ModelRenderer(this, 26, 0);
		back_cover.addBox(-0.5F, -6F, 0F, 9, 12, 1);
		back_cover.setRotationPoint(0.5F, 1F, 1F);
		back_cover.setTextureSize(64, 32);
		back_cover.mirror = true;
		setRotation(back_cover, 0F, 0F, 0F);

		front_page_block = new ModelRenderer(this, 0, 13);
		front_page_block.addBox(0F, -5.5F, -1F, 7, 11, 1);
		front_page_block.setRotationPoint(1F, 1F, 0F);
		front_page_block.setTextureSize(64, 32);
		front_page_block.mirror = true;
		setRotation(front_page_block, 0F, 0F, 0F);

		back_page_block = new ModelRenderer(this, 26, 13);
		back_page_block.addBox(0F, -5.5F, 0F, 7, 11, 1);
		back_page_block.setRotationPoint(1F, 1F, 0F);
		back_page_block.setTextureSize(64, 32);
		back_page_block.mirror = true;
		setRotation(back_page_block, 0F, 0F, 0F);

		page1 = new ModelRenderer(this, 50, 21);
		page1.addBox(0F, -5.5F, 0F, 7, 11, 0);
		page1.setRotationPoint(1F, 1F, 0F);
		page1.setTextureSize(64, 32);
		page1.mirror = true;
		setRotation(page1, 0F, 0F, 0F);

		page2 = new ModelRenderer(this, 50, 21);
		page2.addBox(0F, -5.5F, 0F, 7, 11, 0);
		page2.setRotationPoint(1F, 1F, 0F);
		page2.setTextureSize(64, 32);
		page2.mirror = true;
		setRotation(page2, 0F, 0F, 0F);

		page3 = new ModelRenderer(this, 50, 21);
		page3.addBox(0F, -5.5F, 0F, 7, 11, 0);
		page3.setRotationPoint(1F, 1F, 0F);
		page3.setTextureSize(64, 32);
		page3.mirror = true;
		setRotation(page3, 0F, 0F, 0F);

		page4 = new ModelRenderer(this, 50, 21);
		page4.addBox(0F, -5.5F, 0F, 7, 11, 0);
		page4.setRotationPoint(1F, 1F, 0F);
		page4.setTextureSize(64, 32);
		page4.mirror = true;
		setRotation(page4, 0F, 0F, 0F);

		page5 = new ModelRenderer(this, 50, 21);
		page5.addBox(0F, -5.5F, 0F, 7, 11, 0);
		page5.setRotationPoint(1F, 1F, 0F);
		page5.setTextureSize(64, 32);
		page5.mirror = true;
		setRotation(page5, 0F, 0F, 0F);

		spine.addChild(front_cover);
		spine.addChild(back_cover);
		spine.addChild(front_page_block);
		spine.addChild(back_page_block);
		spine.addChild(page1);
		spine.addChild(page2);
		spine.addChild(page3);
		spine.addChild(page4);
		spine.addChild(page5);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);

    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    spine.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		this.spine.rotateAngleX = 0.8F * f1;
		this.back_cover.rotateAngleY = -0.8F * f1;
		this.back_page_block.rotateAngleY = this.back_cover.rotateAngleY;

		this.page1.rotateAngleY = back_cover.rotateAngleY * MathHelper.abs(MathHelper.sin((f * f1 * 0.3F) + ((1/5) * back_cover.rotateAngleY)));
		this.page2.rotateAngleY = back_cover.rotateAngleY * MathHelper.abs(MathHelper.sin((f * f1 * 0.3F) + ((2/5) * back_cover.rotateAngleY)));
		this.page3.rotateAngleY = back_cover.rotateAngleY * MathHelper.abs(MathHelper.sin((f * f1 * 0.3F) + ((3/5) * back_cover.rotateAngleY)));
		this.page4.rotateAngleY = back_cover.rotateAngleY * MathHelper.abs(MathHelper.sin((f * f1 * 0.3F) + ((4/5) * back_cover.rotateAngleY)));
		this.page5.rotateAngleY = back_cover.rotateAngleY * MathHelper.abs(MathHelper.sin((f * f1 * 0.3F) + back_cover.rotateAngleY));
	
  }

}