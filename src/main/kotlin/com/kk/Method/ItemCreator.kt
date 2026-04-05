package com.kk.Method

import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier


class ItemCreator {
    companion object{

        fun creator (path: String, factory: Function1<Item.Settings, Item>, settings: Item.Settings?): Item {
            val registryKey = RegistryKey.of<Item>(RegistryKeys.ITEM, Identifier.of("chemistry", path))
            return Items.register(registryKey, factory, settings)
        }
    }
}