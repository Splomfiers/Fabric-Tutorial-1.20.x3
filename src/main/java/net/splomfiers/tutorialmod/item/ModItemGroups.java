package net.splomfiers.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.TutorialMod;

public class ModItemGroups {
    public static final ItemGroup HERBS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID, "hemlock"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.herbs"))
                    .icon(()  -> new ItemStack(ModItems.HEMLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HEMLOCK);
                        entries.add(ModItems.HENBANE);

                    } ).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
