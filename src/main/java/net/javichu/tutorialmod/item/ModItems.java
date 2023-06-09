package net.javichu.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.javichu.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

        public static final Item DRILL = registerItem("drill",
        new Item(new FabricItemSettings().group(ModItemGroup.JAVICHU)));

        public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
                new Item(new FabricItemSettings().group(ModItemGroup.JAVICHU)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

    }
}
