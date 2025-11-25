package org.gux83.sp;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.gux83.sp.block.ModBlocks;
import org.gux83.sp.world.gen.ModWorldGeneration;

public class Sp implements ModInitializer {

    public static final String MOD_ID = "sp";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Stone Polish mod...");



        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();

        LOGGER.info("Stone Polish initialized!");
    }
}
