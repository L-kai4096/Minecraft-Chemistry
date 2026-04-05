package com.kk.minecraft_chemistry.Items.Elements

import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.util.Formatting
import net.minecraft.world.World

class Oxygen(settings: Settings): Item(settings) {

    fun appendTooltip(
        itemStack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text?>,
        tooltipContext: TooltipContext?
    )
    {
        // 使用提示
        tooltip.add(Text.translatable("item.chemistry.oxygen.tooltip1"))
        tooltip.add(Text.translatable("item.chemistry.oxygen.tooltip2"))
        tooltip.add(Text.translatable("item.chemistry.oxygen.tooltip3").formatted(Formatting.RED))

        // 获取方式
        tooltip.add(Text.translatable("item.chemistry.oxygen.tooltip4").formatted(Formatting.BLUE))
    }
}