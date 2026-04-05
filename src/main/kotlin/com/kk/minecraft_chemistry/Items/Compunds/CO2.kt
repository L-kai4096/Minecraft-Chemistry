package com.kk.minecraft_chemistry.Items.Compunds

import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.world.World

class CO2(settings: Settings): Item(settings) {

    fun appendTooltip(
        itemStack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text?>,
        tooltipContext: TooltipContext?
    )
    {
        // 使用提示
        tooltip.add(Text.translatable("item.chemistry.c_o2.tooltip1"))
        tooltip.add(Text.translatable("item.chemistry.c_o2.tooltip2"))

        // 获取方式
        tooltip.add(Text.translatable("item.chemistry.c_o2.tooltip3").formatted(Formatting.BLUE))
    }
}