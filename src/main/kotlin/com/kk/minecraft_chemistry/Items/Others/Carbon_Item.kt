package com.kk.minecraft_chemistry.Items.Others

import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.world.World

/**
 *  这是物品——炭粉！
 *
 *  This is an item----Carbon powder!
 **/
class Carbon_Item(settings: Item.Settings): Item(settings){

    fun Carbon_Item(){

    }

    fun appendTooltip(
        itemStack: ItemStack,
        world: World,
        tooltip: MutableList<Text>,
        tooltipContext: TooltipContext
    )
    {
        // 使用提示
        tooltip.add(Text.translatable("item.chemistry.carbon_item.tooltip1"))

        // 获取方式
        tooltip.add(Text.translatable("item.chemistry.carbon_item.tooltip2").formatted(Formatting.BLUE))
    }
}