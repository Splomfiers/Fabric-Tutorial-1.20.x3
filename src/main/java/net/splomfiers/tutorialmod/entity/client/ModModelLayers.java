package net.splomfiers.tutorialmod.entity.client;

import net.splomfiers.tutorialmod.TutorialMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;


public class ModModelLayers {
    public static final EntityModelLayer WENDIGO =
            new EntityModelLayer(new Identifier(TutorialMod.MOD_ID, "wendigo"), "main");

    public static final EntityModelLayer FAERIE =
            new EntityModelLayer(new Identifier(TutorialMod.MOD_ID, "faerie"), "main");

}
