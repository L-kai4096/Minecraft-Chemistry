package com.kk.minecraft_chemistry.Items

import com.kk.Method.ItemCreator

import com.kk.minecraft_chemistry.Items.Elements.gas.*
import com.kk.minecraft_chemistry.Items.Elements.metal.*
import com.kk.minecraft_chemistry.Items.Elements.inert_gas.*
import com.kk.minecraft_chemistry.Items.Elements.non_metal.*
import com.kk.minecraft_chemistry.Items.Elements.radio_active.*

import com.kk.minecraft_chemistry.Items.compounds.gas.*
import com.kk.minecraft_chemistry.Items.compounds.solid.*
import com.kk.minecraft_chemistry.Items.compounds.liquid.*

import com.kk.minecraft_chemistry.Items.Others.*

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

class Initializer {
    companion object {
        // 注册元素
        @JvmStatic
        val Hydrogen = ItemCreator.creator("hydrogen", { settings -> Hydrogen(settings) }, Item.Settings())

        @JvmStatic
        val Helium = ItemCreator.creator("helium", { settings -> Helium(settings) }, Item.Settings())

        @JvmStatic
        val Lithium = ItemCreator.creator("lithium", { settings -> Lithium(settings) }, Item.Settings())

        @JvmStatic
        val Beryllium = ItemCreator.creator("beryllium", { settings -> Beryllium(settings) }, Item.Settings())

        @JvmStatic
        val Boron = ItemCreator.creator("boron", { settings -> Boron(settings) }, Item.Settings())

        @JvmStatic
        val Carbon = ItemCreator.creator("carbon", { settings -> Carbon(settings) }, Item.Settings())

        @JvmStatic
        val Nitrogen = ItemCreator.creator("nitrogen", { settings -> Nitrogen(settings) }, Item.Settings())

        @JvmStatic
        val Oxygen = ItemCreator.creator("oxygen", { settings -> Oxygen(settings) }, Item.Settings())

        @JvmStatic
        val Fluorine = ItemCreator.creator("fluorine", { settings -> Fluorine(settings) }, Item.Settings())

        @JvmStatic
        val Neon = ItemCreator.creator("neon", { settings -> Neon(settings) }, Item.Settings())

        @JvmStatic
        val Sodium = ItemCreator.creator("sodium", { settings -> Sodium(settings) }, Item.Settings())

        @JvmStatic
        val Magnesium = ItemCreator.creator("magnesium", { settings -> Magnesium(settings) }, Item.Settings())

        @JvmStatic
        val Aluminum = ItemCreator.creator("aluminum", { settings -> Aluminum(settings) }, Item.Settings())

        @JvmStatic
        val Silicon = ItemCreator.creator("silicon", { settings -> Silicon(settings) }, Item.Settings())

        @JvmStatic
        val Phosphorus = ItemCreator.creator("phosphorus", { settings -> Phosphorus(settings) }, Item.Settings())

        @JvmStatic
        val Sulfur = ItemCreator.creator("sulfur", { settings -> Sulfur(settings) }, Item.Settings())

        @JvmStatic
        val Chlorine = ItemCreator.creator("chlorine", { settings -> Chlorine(settings) }, Item.Settings())

        @JvmStatic
        val Potassium = ItemCreator.creator("potassium", { settings -> Potassium(settings) }, Item.Settings())

        @JvmStatic
        val Calcium = ItemCreator.creator("calcium", { settings -> Calcium(settings) }, Item.Settings())

        @JvmStatic
        val Titanium = ItemCreator.creator("titanium", { settings -> Titanium(settings) }, Item.Settings())

        @JvmStatic
        val Chromium = ItemCreator.creator("chromium", { settings -> Chromium(settings) }, Item.Settings())

        @JvmStatic
        val Manganese = ItemCreator.creator("manganese", { settings -> Manganese(settings) }, Item.Settings())

        @JvmStatic
        val Iron = ItemCreator.creator("iron", { settings -> Iron(settings) }, Item.Settings())

        @JvmStatic
        val Cobalt = ItemCreator.creator("cobalt", { settings -> Cobalt(settings) }, Item.Settings())

        @JvmStatic
        val Nickel = ItemCreator.creator("nickel", { settings -> Nickel(settings) }, Item.Settings())

        @JvmStatic
        val Copper = ItemCreator.creator("copper", { settings -> Copper(settings) }, Item.Settings())

        @JvmStatic
        val Zinc = ItemCreator.creator("zinc", { settings -> Zinc(settings) }, Item.Settings())

        @JvmStatic
        val Gallium = ItemCreator.creator("gallium", { settings -> Gallium(settings) }, Item.Settings())

        @JvmStatic
        val Silver = ItemCreator.creator("silver", { settings -> Silver(settings) }, Item.Settings())

        @JvmStatic
        val Tin = ItemCreator.creator("tin", { settings -> Tin(settings) }, Item.Settings())

        @JvmStatic
        val Iodine = ItemCreator.creator("iodine", { settings -> Iodine(settings) }, Item.Settings())

        @JvmStatic
        val Tungsten = ItemCreator.creator("tungsten", { settings -> Tungsten(settings) }, Item.Settings())

        @JvmStatic
        val Gold = ItemCreator.creator("gold", { settings -> Gold(settings) }, Item.Settings())

        @JvmStatic
        val Mercury = ItemCreator.creator("mercury", { settings -> Mercury(settings) }, Item.Settings())

        @JvmStatic
        val Lead = ItemCreator.creator("lead", { settings -> Lead(settings) }, Item.Settings())

        @JvmStatic
        val Radium = ItemCreator.creator("radium", { settings -> Radium(settings) }, Item.Settings())

        @JvmStatic
        val Uranium = ItemCreator.creator("uranium", { settings -> Uranium(settings) }, Item.Settings())

        @JvmStatic
        val Plutonium = ItemCreator.creator("plutonium", { settings -> Plutonium(settings) }, Item.Settings())

        // 化合物
        @JvmStatic
        val Fe2O3 = ItemCreator.creator("fe2_o3", { settings -> Fe2O3(settings) }, Item.Settings())

        @JvmStatic
        val Fe3O4 = ItemCreator.creator("fe3_o4", { settings -> Fe3O4(settings) }, Item.Settings())

        @JvmStatic
        val FeO = ItemCreator.creator("fe_o", { settings -> FeO(settings) }, Item.Settings())

//        @JvmStatic
//        val NO = ItemCreator.creator("n_o", { settings -> NO(settings) }, Item.Settings())

        @JvmStatic
        val NO2 = ItemCreator.creator("n_o2", { settings -> NO2(settings) }, Item.Settings())

        @JvmStatic
        val CO = ItemCreator.creator("c_o", { settings -> CO(settings) }, Item.Settings())

        @JvmStatic
        val CO2 = ItemCreator.creator("c_o2", { settings -> CO2(settings) }, Item.Settings())

        @JvmStatic
        val CuO = ItemCreator.creator("cu_o", { settings -> CuO(settings) }, Item.Settings())

        @JvmStatic
        val Al2O3 = ItemCreator.creator("al2_o3", { settings -> Al2O3(settings) }, Item.Settings())

        @JvmStatic
        val H2CO3 = ItemCreator.creator("h2_co3", { settings -> H2CO3(settings) }, Item.Settings())

        @JvmStatic
        val CaCO3 = ItemCreator.creator("ca_co3", { settings -> CaCO3(settings) }, Item.Settings())

        @JvmStatic
        val CaOH2_liquid = ItemCreator.creator("ca_oh2", { settings -> `Ca(OH)2_liquid`(settings) }, Item.Settings())

        @JvmStatic
        val CaOH2_solid = ItemCreator.creator("ca_oh2", { settings -> `Ca(OH)2_solid`(settings) }, Item.Settings())

        @JvmStatic
        val CaO = ItemCreator.creator("ca_o", { settings -> CaO(settings) }, Item.Settings())

        @JvmStatic
        val HCl_gas = ItemCreator.creator("h_cl", { settings -> HCl_gas(settings) }, Item.Settings())

        @JvmStatic
        val HCl_liquid = ItemCreator.creator("h_cl", { settings -> HCl_liquid(settings) }, Item.Settings())

        @JvmStatic
        val H2SO4 = ItemCreator.creator("h2_so4", { settings -> H2SO4(settings) }, Item.Settings())

        @JvmStatic
        val Na2CO3_liquid = ItemCreator.creator("na2_co3", { settings -> Na2CO3_liquid(settings) }, Item.Settings())

        @JvmStatic
        val Na2CO3_solid = ItemCreator.creator("na2_co3", { settings -> Na2CO3_solid(settings) }, Item.Settings())

        @JvmStatic
        val C2H5OH = ItemCreator.creator("c2_h5_oh", { settings -> C2H5OH(settings) }, Item.Settings())

        @JvmStatic
        val CH4 = ItemCreator.creator("c_h4", { settings -> CH4(settings) }, Item.Settings())

        @JvmStatic
        val H2O = ItemCreator.creator("h2_o", { settings -> H2O(settings) }, Item.Settings())        //                                                                                  —— Wrote by Deepseek
        // 不愧是Deepseek，AI就是好用


        // 注册其他物品
        // 炭粉
        @JvmStatic
        val Carbon_Item = ItemCreator.creator("carbon_item", { settings -> Carbon_Item(settings) }, Item.Settings())

//        // （核聚变）托卡马克反应堆
//        @JvmStatic
//        val TKMK_Stack = ItemCreator.creator("tkmk_stack", { settings -> TKMK_Stack(settings) }, Item.Settings())

        // 裂变反应堆
        @JvmStatic
        val LB_Stack = ItemCreator.creator("lb_stack", { settings -> LB_Stack(settings) }, Item.Settings())

        @JvmStatic
        val NO_Extactor = ItemCreator.creator("no_extactor", { settings -> NO_Extactor(settings) }, Item.Settings())
    }

    // 注册物品栏
    val ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(Hydrogen) }
        .displayName(Text.translatable("itemGroup.tutorial.test_group"))
        .entries { displayContext, entries ->
            // 把物品加入物品组
            // 元素
            entries.add(Hydrogen)
            entries.add(Helium)
            entries.add(Lithium)
            entries.add(Beryllium)
            entries.add(Boron)
            entries.add(Carbon)
            entries.add(Nitrogen)
            entries.add(Oxygen)
            entries.add(Fluorine)
            entries.add(Neon)
            entries.add(Sodium)
            entries.add(Magnesium)
            entries.add(Aluminum)
            entries.add(Silicon)
            entries.add(Phosphorus)
            entries.add(Sulfur)
            entries.add(Chlorine)
            entries.add(Potassium)
            entries.add(Calcium)
            entries.add(Titanium)
            entries.add(Chromium)
            entries.add(Manganese)
            entries.add(Iron)
            entries.add(Cobalt)
            entries.add(Nickel)
            entries.add(Copper)
            entries.add(Zinc)
            entries.add(Gallium)
            entries.add(Silver)
            entries.add(Tin)
            entries.add(Iodine)
            entries.add(Tungsten)
            entries.add(Gold)
            entries.add(Mercury)
            entries.add(Lead)
            entries.add(Radium)
            entries.add(Uranium)
            entries.add(Plutonium)

            // 化合物
            entries.add(Fe2O3)
            entries.add(Fe3O4)
            entries.add(FeO)
//            entries.add(NO)
            entries.add(NO2)
            entries.add(CO)
            entries.add(CO2)
            entries.add(CuO)
            entries.add(Al2O3)
            entries.add(H2CO3)
            entries.add(CaCO3)
            entries.add(CaOH2_solid)
            entries.add(CaOH2_liquid)
            entries.add(CaO)
            entries.add(HCl_liquid)
            entries.add(HCl_gas)
            entries.add(H2SO4)
            entries.add(Na2CO3_liquid)
            entries.add(Na2CO3_solid)
            entries.add(C2H5OH)
            entries.add(CH4)
            entries.add(H2O)

            // 其他
            entries.add(Carbon_Item)
            //entries.add(TKMK_Stack)
            entries.add(LB_Stack)
            entries.add(NO_Extactor)
        }
        .build()

    fun Initializer(){

        // 注册物品组
        Registry.register(Registries.ITEM_GROUP, Identifier.of("chemistry","item_group"), ItemGroup)

        // 创建物品提示
        Tooltip_add.Add()
    }

}