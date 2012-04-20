package no.runsafe.regionextras.commands;

import no.runsafe.framework.command.RunsafeCommand;
import no.runsafe.framework.messaging.PlayerStatus;
import no.runsafe.framework.server.player.RunsafePlayer;

import java.util.List;

public class InfoCommand extends RunsafeCommand
{
    PlayerStatus playerStatus;

    public InfoCommand(PlayerStatus playerStatus)
    {
        super("info", null);
        this.playerStatus = playerStatus;
    }

    @Override
    public boolean Execute(RunsafePlayer player, String[] args)
    {
        List<String> regions = this.playerStatus.getCurrentRegions(player);
        if (regions != null && regions.size() > 0)
            player.sendMessage("You are inside a region.");
        else
            player.sendMessage("You are not inside a region.");

        return true;
    }
}
