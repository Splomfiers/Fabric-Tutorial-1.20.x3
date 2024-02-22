package net.splomfiers.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.splomfiers.tutorialmod.entity.ModEntities;
import net.splomfiers.tutorialmod.entity.client.*;


public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.WENDIGO, WendigoRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WENDIGO, WendigoModel::getTexturedModelData);


        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FAERIE, FaerieModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FAERIE, FaerieRenderer::new);


    }

}

