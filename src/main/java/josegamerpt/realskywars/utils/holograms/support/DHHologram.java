package josegamerpt.realskywars.utils.holograms.support;

import eu.decentsoftware.holograms.api.DHAPI;
import eu.decentsoftware.holograms.api.holograms.Hologram;
import josegamerpt.realskywars.utils.holograms.SWHologram;
import josegamerpt.realskywars.utils.Text;
import org.bukkit.Location;
import org.bukkit.Material;

public class DHHologram implements SWHologram {
    private Hologram holo;

    @Override
    public void spawnHologram(Location loc) {
        if (this.holo == null) {
            this.holo = DHAPI.createHologram("RSW-" + loc.getWorld().getName() + "-X" + loc.getBlockX() + "Y" + loc.getBlockY() + "Z" + loc.getBlockZ(), loc.add(0.5, 2, 0.5));
            DHAPI.addHologramLine(this.holo, Material.CLOCK);
            DHAPI.addHologramLine(this.holo, "~");
        }
    }

    @Override
    public void setTime(int seconds) {
        if (this.holo != null) {
            DHAPI.setHologramLine(this.holo, 1, Text.formatSeconds(seconds));
        }
    }

    @Override
    public void deleteHologram() {
        if (this.holo != null) {
            this.holo.delete();
        }
        this.holo = null;
    }


    @Override
    public HType getType() {
        return HType.DECENT_HOLOGRAMS;
    }
}