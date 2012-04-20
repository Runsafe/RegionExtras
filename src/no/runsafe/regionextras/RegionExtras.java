package no.runsafe.regionextras;

import no.runsafe.framework.RunsafePlugin;
import no.runsafe.framework.command.ICommand;
import no.runsafe.framework.command.RunsafeCommand;
import no.runsafe.framework.messaging.PlayerStatus;
import no.runsafe.regionextras.commands.InfoCommand;

import java.util.ArrayList;

public class RegionExtras extends RunsafePlugin
{
    @Override
    protected void PluginSetup()
    {
        this.addComponent(InfoCommand.class);

        ArrayList<ICommand> subCommands = new ArrayList<ICommand>();
        subCommands.add(this.getComponent(InfoCommand.class));

        RunsafeCommand myCommand = new RunsafeCommand("regionextras", subCommands);
        this.addComponent(myCommand);
    }
}
