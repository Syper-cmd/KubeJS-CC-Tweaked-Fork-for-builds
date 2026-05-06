package com.wolfieboy09.kjscc;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("kjscc")
public class KJSCC {
    public static final String MOD_ID = "kjscc";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KJSCC() {
        //EventBuses.registerModEventBus(MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
    }
}