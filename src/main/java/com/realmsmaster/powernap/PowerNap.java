package com.realmsmaster.powernap;

import com.realmsmaster.powernap.init.ModItems;
import com.realmsmaster.powernap.proxy.IProxy;
import com.realmsmaster.powernap.reference.Reference;
import com.realmsmaster.powernap.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sun.rmi.runtime.Log;

import java.sql.Ref;

/**
 * Created by mike on 12/20/14.
 */
@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME, version=Reference.VERSION)
public class PowerNap {

    //This is our local instance copy of the PowerNap object
    @Mod.Instance("PowerNap")
    public static PowerNap instance;

    //Define the sided-proxies
    //@SidedProxy(clientSide="com.realmsmaster.powernap.proxy.ClientProxy", serverSide="com.realmsmaster.powernap.proxy.ServerProxy")
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //This is the pre-init stuff for the mod
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //This is stuff that should happen as Forge Mod Loader is getting your mod ready
        //like: Network Handling, Mod Configuration, Initialize your Items, Initialize your Blocks
        ModItems.init();

        LogHelper.info("Pre Init Complete -- Items Loaded Captain!");
    }

    //This is the regular init stuff for the mod
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //This is stuff that should happen as your Mod is initialized
        //like: crafting recipes, register GUIs, tile entities, and general event handlers your Mod uses


        LogHelper.info("Regular Init Complete -- Stay on Target!");
    }

    //This is the post-init stuff for the mod
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //This is stuff that should happen after other Mods have finished being initialized
        //like: wrapping up your stuff, checking if some other mod config has been set


        LogHelper.info("Post Init Complete -- Man the Torpedoes!");
    }
}
