package net.javichu.tutorialmod.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.javichu.tutorialmod.TutorialMod;
import net.javichu.tutorialmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
        //Añadimos el bloque
        public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
                new Block(FabricBlockSettings.of(Material.METAL).requiresTool()), ModItemGroup.JAVICHU);

        //Funcion añadir bloque
        private static Block registerBlock(String name, Block block, ItemGroup group){
            registerBlockItem(name, block, group);
            return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
        }
        private static Item registerBlockItem(String name, Block block, ItemGroup group) {
            return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
        }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);

    }
}
