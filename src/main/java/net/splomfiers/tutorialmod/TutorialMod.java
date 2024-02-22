package net.splomfiers.tutorialmod;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.effect.ModEffects;
import net.splomfiers.tutorialmod.entity.ModEntities;
import net.splomfiers.tutorialmod.entity.custom.FaerieEntity;
import net.splomfiers.tutorialmod.entity.custom.WendigoEntity;
import net.splomfiers.tutorialmod.item.ModItemGroups;
import net.splomfiers.tutorialmod.item.ModItems;
import net.splomfiers.tutorialmod.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);






	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModEntities.registerModEntities();
		ModItems.registerModItems();

		ModEffects.registerEffects();
		ModPotions.registerPotions();





		LOGGER.info("Hello Fabric world!");

		FabricDefaultAttributeRegistry.register(ModEntities.WENDIGO, WendigoEntity.createWendigoAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FAERIE, FaerieEntity.createFaerieAttributes());



					}

}