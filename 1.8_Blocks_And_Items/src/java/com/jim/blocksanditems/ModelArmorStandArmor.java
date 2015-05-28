package com.jim.blocksanditems;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelArmorStandArmor extends ModelBiped {

    public ModelArmorStandArmor() {
        this(0.0F);
    }

    public ModelArmorStandArmor(float p_i46307_1_) {
        this(p_i46307_1_, 64, 32);
    }

    protected ModelArmorStandArmor(float p_i46308_1_, int p_i46308_2_,
            int p_i46308_3_) {
        super(p_i46308_1_, 0.0F, p_i46308_2_, p_i46308_3_);
    }

    @Override
    public void setRotationAngles(float p_78087_1_, float p_78087_2_,
            float p_78087_3_, float p_78087_4_, float p_78087_5_,
            float p_78087_6_, Entity entity) {
        if (entity instanceof EntityArmourStand) {
            EntityArmourStand entityarmorstand = (EntityArmourStand) entity;
            this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand
                    .getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand
                    .getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
            this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand
                    .getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand
                    .getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand
                    .getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand
                    .getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand
                    .getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand
                    .getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand
                    .getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand
                    .getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
            this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand
                    .getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand
                    .getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand
                    .getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
            copyModelAngles(this.bipedHead, this.bipedHeadwear);
        }
    }

    public static void copyModelAngles(ModelRenderer source, ModelRenderer dest) {
        dest.rotateAngleX = source.rotateAngleX;
        dest.rotateAngleY = source.rotateAngleY;
        dest.rotateAngleZ = source.rotateAngleZ;
        dest.rotationPointX = source.rotationPointX;
        dest.rotationPointY = source.rotationPointY;
        dest.rotationPointZ = source.rotationPointZ;
    }
}