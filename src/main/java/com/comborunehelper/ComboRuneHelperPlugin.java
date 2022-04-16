package com.comborunehelper;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ClientTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import java.util.Arrays;

@Slf4j
@PluginDescriptor(
		name = "ComboRuneHelper"
)
public class ComboRuneHelperPlugin extends Plugin {
	@Inject
	private Client client;

	private static final WorldPoint FIRE_ALTAR = new WorldPoint(2574, 4848, 0);
	private static final WorldPoint WATER_ALTAR = new WorldPoint(2725, 4832, 0);
	private static final WorldPoint EARTH_ALTAR = new WorldPoint(2655, 4830, 0);
	private static final WorldPoint AIR_ALTAR = new WorldPoint(2841, 4829, 0);

	@Override
	protected void startUp() throws Exception {
		log.info("ComboRunesOnly started!");
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("ComboRunesOnly stopped!");
	}

	@Subscribe
	public void onClientTick(ClientTick event) {
		Player p = client.getLocalPlayer();
		if (p == null)
			return;

		WorldPoint currentLoc = p.getWorldLocation();
		if (currentLoc == null)
			return;

		if (currentLoc.distanceTo2D(FIRE_ALTAR) > 20)
			return;

		MenuEntry[] newEntries = Arrays.stream(client.getMenuEntries())
				.filter(menuEntry -> !(menuEntry.getTarget().contains("Altar") && menuEntry.getOption().equals("Craft-rune")))
				.toArray(MenuEntry[]::new);
		client.setMenuEntries(newEntries);

		if (currentLoc.distanceTo2D(WATER_ALTAR) > 20)
			return;

		MenuEntry[] newEntries2 = Arrays.stream(client.getMenuEntries())
				.filter(menuEntry -> !(menuEntry.getTarget().contains("Altar") && menuEntry.getOption().equals("Craft-rune")))
				.toArray(MenuEntry[]::new);
		client.setMenuEntries(newEntries2);

		if (currentLoc.distanceTo2D(EARTH_ALTAR) > 20)
			return;

		MenuEntry[] newEntries3 = Arrays.stream(client.getMenuEntries())
				.filter(menuEntry -> !(menuEntry.getTarget().contains("Altar") && menuEntry.getOption().equals("Craft-rune")))
				.toArray(MenuEntry[]::new);
		client.setMenuEntries(newEntries3);

		if (currentLoc.distanceTo2D(AIR_ALTAR) > 20)
			return;

		MenuEntry[] newEntries4 = Arrays.stream(client.getMenuEntries())
				.filter(menuEntry -> !(menuEntry.getTarget().contains("Altar") && menuEntry.getOption().equals("Craft-rune")))
				.toArray(MenuEntry[]::new);
		client.setMenuEntries(newEntries4);
	}

}
