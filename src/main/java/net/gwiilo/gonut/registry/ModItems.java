package net.gwiilo.gonut.registry;

import net.gwiilo.gonut.Gonut;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GONUT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Gonut.MOD_ID, "gonut"), GONUT);

    }
}
