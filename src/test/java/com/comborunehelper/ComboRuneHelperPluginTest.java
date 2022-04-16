package com.comborunehelper;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ComboRuneHelperPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ComboRuneHelperPlugin.class);
		RuneLite.main(args);
	}
}