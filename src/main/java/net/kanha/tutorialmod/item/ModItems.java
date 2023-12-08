package net.kanha.tutorialmod.item;

import net.kanha.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item regiterItem(String name, Item item){

        return Registry.register(Registries.ITEM,   new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);
    }

}
