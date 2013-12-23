package no.runsafe.regionextras.commands;


import no.runsafe.framework.server.player.RunsafePlayer;

public class UnusedCommand
{
    public boolean Execute(RunsafePlayer player, String[] args)
    {
        player.sendMessage("Yaw: " + player.getLocation().getYaw());
        player.sendMessage("Pitch: " + player.getLocation().getPitch());

        int blockX = player.getLocation().getBlockX();
        int blockZ = player.getLocation().getBlockZ();

        int chunkX = blockX / 16;
        int chunkZ = blockZ / 16;

        int positionInChunkX = blockX % 16;
        int positionInChunkZ = blockZ % 16;

        int plotPositionX = chunkX % 3;
        int plotPositionZ = chunkZ % 3;

        if (plotPositionX == 0 && positionInChunkX >= 8 && positionInChunkX <= 10)
            return true;

        if (plotPositionZ == 0 && positionInChunkZ >= 8 && positionInChunkZ <= 10)
            return true;

        if (plotPositionZ == 0 && positionInChunkZ <= 7)
            plotPositionZ = 3;

        if (plotPositionX == 0 && positionInChunkX <= 11)
            plotPositionX = 3;

        int originX = (((chunkX + 3) * 16) - (16 * plotPositionX)) + 7;
        int originZ = (((chunkZ) * 16) - (16 * plotPositionZ)) + 11;

        player.sendMessage("ChunkX: " + chunkX + " ChunkZ: " + chunkZ);
        player.sendMessage("PositionInChunkX: " + positionInChunkX + " PositionInChunkZ: " + positionInChunkZ);
        player.sendMessage("PlotPartIDX: " + plotPositionX + " PlotPartIDZ: " + plotPositionZ);
        player.sendMessage("OriginX: " + originX + " OriginZ: " + originZ);

        player.teleport(player.getWorld().getLocation(originX + 0.5, 70.0, originZ + 0.5, 43, 5));

        return true;
    }
}
