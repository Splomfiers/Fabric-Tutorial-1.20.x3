package net.splomfiers.tutorialmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.TutorialMod;
import net.splomfiers.tutorialmod.entity.custom.WendigoEntity;

public class WendigoRenderer extends MobEntityRenderer<WendigoEntity, WendigoModel<WendigoEntity>> {
    private static final Identifier TEXTURE = new Identifier(TutorialMod.MOD_ID, "textures/entity/wendigotexture.png");
    public WendigoRenderer(EntityRendererFactory.Context context) {
        super(context, new WendigoModel<>(context.getPart(ModModelLayers.WENDIGO)),0.6f);
    }

    @Override
    public Identifier getTexture(WendigoEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(WendigoEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()){
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else{
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
