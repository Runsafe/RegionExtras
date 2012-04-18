package no.runsafe.regionextras;

import no.runsafe.framework.RunsafePlugin;

public class RegionExtras extends RunsafePlugin
{
    @Override
    protected void PluginSetup()
    {
        this.addComponent(CommandHandler.class);
    }
}
