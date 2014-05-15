package com.heisenbugdev.heisenui;

import com.heisenbugdev.heisenui.logger.Logger;
import com.heisenbugdev.heisenui.proxy.UIProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = HeisenProperties.MOD_IDENTIFICATION, name = HeisenProperties.MOD_NAME, version = HeisenProperties.MOD_VERSION)
public class HeisenUI
{

    @Instance
    public static HeisenUI instance;

    @SidedProxy(clientSide = "com.heisenbugdev.heisenui.proxy.UIClientProxy", serverSide = "com.heisenbugdev.heisenui.proxy.UIProxy")
    public static UIProxy proxy;

    public static final Boolean DEBUG = false;

    public HeisenUI()
    {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        if(!DEBUG) {
            Logger.info("Debugging is NOT enabled!");
        } else {
            Logger.info("Debugging is enabled!");
        }

    }



}