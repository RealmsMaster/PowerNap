package com.realmsmaster.powernap;

import com.realmsmaster.powernap.init.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by mike on 12/20/14.
 */
@Mod(modid="PowerNap",name="Power Nap", version="1.7.10-1.0")
public class PowerNap {
    @Mod.Instance("PowerNap")
    public static PowerNap instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
    }
}
