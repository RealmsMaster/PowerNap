package com.realmsmaster.powernap.item;

import com.realmsmaster.powernap.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Matt on 12/22/2014.
 */
//This is a generic "wrapper" class that all items in PowerNap will inherit from so that we
// don't have to keep repeating a lot of  things they all have in common
public class PowerNapItem extends Item
{
    public PowerNapItem()
    {
        super();
        this.maxStackSize = 1;
        this.setNoRepair();
    }

    /*
    These localization methods are to get thing to look pretty in the naming convention the MC expects.
    See ep.8
     */
    @Override
    public String getUnlocalizedName()
    {
        /*
        Minecraft calls items using format: item.PowerNap:Blanket.name
         */
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    /*
    This is the code that looks up the texture for the items (explained in Ep. 8)
     */
    @Override
    @SideOnly(Side.CLIENT) //this is a method that only happens on the client-side of the mod
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}