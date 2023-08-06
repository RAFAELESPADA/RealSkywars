package josegamerpt.realskywars.utils.holograms.support;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import josegamerpt.realskywars.RealSkywars;
import josegamerpt.realskywars.utils.holograms.SWHologram;
import josegamerpt.realskywars.utils.Text;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class HDHologram implements SWHologram {

    private Hologram holo;

    @Override
    public void spawnHologram(Location loc) {
        if (this.holo == null || this.holo.isDeleted()) {
            this.holo = HologramsAPI.createHologram(RealSkywars.getPlugin(), loc.add(0.5, 2, 0.5));
            this.holo.clearLines();
            this.holo.appendItemLine(new ItemStack(Material.CLOCK));
        }
    }

    @Override
    public void setTime(int time) {
        if (this.holo == null || this.holo.isDeleted()) {
            this.holo.insertTextLine(1, Text.formatSeconds(time));
        }
    }

    @Override
    public void deleteHologram() {
        if (this.holo != null && !this.holo.isDeleted()) {
            this.holo.delete();
        }
        this.holo = null;
    }

    @Override
    public HType getType() {
        return HType.HOLOGRAPHIC_DISPLAYS;
    }
}