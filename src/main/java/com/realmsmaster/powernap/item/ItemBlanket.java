package com.realmsmaster.powernap.item;

import net.minecraft.entity.Entity;
import  net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by mike on 12/20/14.
 */
public class ItemBlanket extends PowerNapItem {
    public ItemBlanket() {
        super();
        this.setUnlocalizedName("blanket");

    }

    /*
    This is where we override the armor check rather than extending the ItemArmor class
    because a blanket really isn't armor, but it needs to be in the chest slot for the
    mechanic to work as intended. Hopefully this doesn't have nasty side effects later
    for other mods??!?
     */
    @Override
    public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
    {
        //* @param armorType Armor slot ID: 0: Helmet, 1: Chest, 2: Legs, 3: Boots
        if (armorType == 1)
        {
            return true;
        }

        return false;
    }
}

