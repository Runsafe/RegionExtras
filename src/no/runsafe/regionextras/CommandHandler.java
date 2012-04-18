package no.runsafe.regionextras;

import no.runsafe.framework.command.RunsafeCommandHandler;
import no.runsafe.framework.server.player.RunsafePlayer;

import java.util.List;

public class CommandHandler extends RunsafeCommandHandler
{
    @Override
    public String getName()
    {
        return "regionextras";
    }

    protected boolean playerExecute(RunsafePlayer player, List<String> args)
    {
        if (args.size() > 0)
        {
            if (args.get(0).equalsIgnoreCase("info"))
            {
                player.sendMessage(Constants.NORMAL_MESSAGE_COLOR + "Here is some information about the plot.");
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean getConsoleAccessible()
    {
        return false;
    }
}
