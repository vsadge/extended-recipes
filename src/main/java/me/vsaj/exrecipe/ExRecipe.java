package me.vsaj.exrecipe;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExRecipe implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    @Override
    public void onInitialize() {
        LOGGER.info("Extended Recipes starting up!");
    }
}