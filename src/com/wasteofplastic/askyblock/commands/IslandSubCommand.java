package com.wasteofplastic.askyblock.commands;

import org.bukkit.command.CommandSender;

public interface IslandSubCommand {

    String getPermission();

    String getDescription();

    boolean onCommand(CommandSender sender, String[] split);

}
