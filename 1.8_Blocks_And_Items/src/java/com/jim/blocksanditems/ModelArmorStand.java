package com.jim.blocksanditems;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelArmorStand extends ModelArmorStandArmor {

    public ModelRenderer standRightSide;
    public ModelRenderer standLeftSide;
    public ModelRenderer standWaist;
    public ModelRenderer standBase;

    public ModelArmorStand() {
        this(0.0F);
    }

    public ModelArmorStand(float size) {
        super(size, 64, 64);
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.addBox(-1.0F, -7.0F, -1.0F, 2, 7, 2, size);
        this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody = new ModelRenderer(this, 0, 26);
        this.bipedBody.addBox(-6.0F, 0.0F, -1.5F, 12, 3, 3, size);
        this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 24, 0);
        this.bipedRightArm.addBox(-2.0F, -2.0F, -1.0F, 2, 12, 2, size);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.bipedLeftArm = new ModelRenderer(this, 32, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(0.0F, -2.0F, -1.0F, 2, 12, 2, size);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedRightLeg = new ModelRenderer(this, 8, 0);
        this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, size);
        this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.bipedLeftLeg = new ModelRenderer(this, 40, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, size);
        this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.standRightSide = new ModelRenderer(this, 16, 0);
        this.standRightSide.addBox(-3.0F, 3.0F, -1.0F, 2, 7, 2, size);
        this.standRightSide.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.standRightSide.showModel = true;
        this.standLeftSide = new ModelRenderer(this, 48, 16);
        this.standLeftSide.addBox(1.0F, 3.0F, -1.0F, 2, 7, 2, size);
        this.standLeftSide.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.standWaist = new ModelRenderer(this, 0, 48);
        this.standWaist.addBox(-4.0F, 10.0F, -1.0F, 8, 2, 2, size);
        this.standWaist.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.standBase = new ModelRenderer(this, 0, 32);
        this.standBase.addBox(-6.0F, 11.0F, -6.0F, 12, 1, 12, size);
        this.standBase.setRotationPoint(0.0F, 12.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(float p_78087_1_, float p_78087_2_,
            float p_78087_3_, float p_78087_4_, float p_78087_5_,
            float p_78087_6_, Entity entity) {
        super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_,
                p_78087_5_, p_78087_6_, entity);

        if (entity instanceof EntityArmourStand) {
            EntityArmourStand stand = (EntityArmourStand) entity;
            this.bipedLeftArm.showModel = stand.getShowArms();
            this.bipedRightArm.showModel = stand.getShowArms();
            this.standBase.showModel = !stand.hasNoBasePlate();
            this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
            this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
            this.standRightSide.rotateAngleX = 0.017453292F * stand
                    .getBodyRotation().getX();
            this.standRightSide.rotateAngleY = 0.017453292F * stand
                    .getBodyRotation().getY();
            this.standRightSide.rotateAngleZ = 0.017453292F * stand
                    .getBodyRotation().getZ();
            this.standLeftSide.rotateAngleX = 0.017453292F * stand
                    .getBodyRotation().getX();
            this.standLeftSide.rotateAngleY = 0.017453292F * stand
                    .getBodyRotation().getY();
            this.standLeftSide.rotateAngleZ = 0.017453292F * stand
                    .getBodyRotation().getZ();
            this.standWaist.rotateAngleX = 0.017453292F * stand
                    .getBodyRotation().getX();
            this.standWaist.rotateAngleY = 0.017453292F * stand
                    .getBodyRotation().getY();
            this.standWaist.rotateAngleZ = 0.017453292F * stand
                    .getBodyRotation().getZ();
            this.standBase.rotateAngleX = 0.0F;
            this.standBase.rotateAngleY = 0.017453292F * -entity.rotationYaw;
            this.standBase.rotateAngleZ = 0.0F;
        }
    }

    @Override
    public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_,
            float p_78088_4_, float p_78088_5_, float p_78088_6_,
            float p_78088_7_) {
        super.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_,
                p_78088_5_, p_78088_6_, p_78088_7_);
        OpenGLHelper.pushMatrix();

        if (this.isChild) {
            float f6 = 2.0F;
            OpenGLHelper.scale(1.0F / f6, 1.0F / f6, 1.0F / f6);
            OpenGLHelper.translate(0.0F, 24.0F * p_78088_7_, 0.0F);
            this.standRightSide.render(p_78088_7_);
            this.standLeftSide.render(p_78088_7_);
            this.standWaist.render(p_78088_7_);
            this.standBase.render(p_78088_7_);
        } else {
            if (p_78088_1_.isSneaking()) {
                OpenGLHelper.translate(0.0F, 0.2F, 0.0F);
            }

            this.standRightSide.render(p_78088_7_);
            this.standLeftSide.render(p_78088_7_);
            this.standWaist.render(p_78088_7_);
            this.standBase.render(p_78088_7_);
        }

        OpenGLHelper.popMatrix();
    }
}