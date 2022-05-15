package com.totallynotagame.blockixel;

import com.totallynotagame.blockixel.item.BlockixelItems;
import net.fabricmc.api.ModInitializer;

public class BlockixelConcepts implements ModInitializer {
	public static final String MOD_ID = "blockixel";

	@Override
	public void onInitialize() {
		BlockixelItems.RegisterItems();
	}
}
