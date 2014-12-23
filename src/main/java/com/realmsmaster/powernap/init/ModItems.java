package com.realmsmaster.powernap.init;

import com.realmsmaster.powernap.item.ItemBlanket;
import com.realmsmaster.powernap.item.PowerNapItem;
import com.realmsmaster.powernap.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by mike on 12/20/14.
 */
//This is where we register all our items for in-game (Pahimar Ep. 8)
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final PowerNapItem blanket = new ItemBlanket();

    public static void init(){

        GameRegistry.registerItem(blanket,"blanket"); //CHANGE TO UPPER CASE B LATER ON!!!
    }
}