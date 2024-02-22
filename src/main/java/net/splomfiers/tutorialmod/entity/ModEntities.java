package net.splomfiers.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.splomfiers.tutorialmod.TutorialMod;
import net.splomfiers.tutorialmod.entity.custom.FaerieEntity;
import net.splomfiers.tutorialmod.entity.custom.WendigoEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEntities {
    public static final EntityType<WendigoEntity> WENDIGO = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TutorialMod.MOD_ID, "wendigo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WendigoEntity::new)
                    .dimensions(EntityDimensions.fixed(2f,3f)).build());



    public static final EntityType<FaerieEntity> FAERIE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TutorialMod.MOD_ID, "faerie"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FaerieEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f,1.9f)).build());

    public static void registerModEntities(){
        TutorialMod.LOGGER.info("Registering Entities for" + TutorialMod.MOD_ID);
    }
}

