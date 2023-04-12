package net.javichu.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.javichu.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JAVICHU = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "javichu"),
            () -> new ItemStack(ModItems.DRILL));
}
