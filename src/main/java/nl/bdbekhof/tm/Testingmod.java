package nl.bdbekhof.tm;

import net.fabricmc.api.ModInitializer;

import nl.bdbekhof.tm.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testingmod implements ModInitializer {
	public static final String MOD_ID = "testingmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initiliaze();
		LOGGER.info("Hello Fabric world!");
	}
}