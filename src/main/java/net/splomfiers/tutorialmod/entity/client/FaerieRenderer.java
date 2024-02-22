package net.splomfiers.tutorialmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.TutorialMod;
import net.splomfiers.tutorialmod.entity.custom.FaerieEntity;

public class FaerieRenderer extends MobEntityRenderer <FaerieEntity,FaerieModel<FaerieEntity>> {
    private static final Identifier TEXTURE = new Identifier(TutorialMod.MOD_ID,"textures/entity/faerietexture.png");

    public FaerieRenderer(EntityRendererFactory.Context context) {
        super(context, new FaerieModel<>(context.getPart(ModModelLayers.FAERIE)),0.6f);
    }

    @Override
    public Identifier getTexture(FaerieEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(FaerieEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);

        if (mobEntity.isBaby()){
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
