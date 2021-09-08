package josegamerpt.realskywars;

import josegamerpt.realskywars.leaderboards.LeaderboardManager;
import josegamerpt.realskywars.player.PlayerManager;
import org.bukkit.OfflinePlayer;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;

import java.util.Locale;

/**
 * This class will be registered through the register-method in the
 * plugins onEnable-method.
 */
public class RealSkywarsPlaceholderAPI extends PlaceholderExpansion {

    private RealSkywars plugin;

    /**
     * Since we register the expansion inside our own plugin, we
     * can simply use this method here to get an instance of our
     * plugin.
     *
     * @param plugin
     *        The instance of our plugin.
     */
    public RealSkywarsPlaceholderAPI(RealSkywars plugin){
        this.plugin = plugin;
    }

    /**
     * Because this is an internal class,
     * you must override this method to let PlaceholderAPI know to not unregister your expansion class when
     * PlaceholderAPI is reloaded
     *
     * @return true to persist through reloads
     */
    @Override
    public boolean persist(){
        return true;
    }

    /**
     * Because this is a internal class, this check is not needed
     * and we can simply return {@code true}
     *
     * @return Always true since it's an internal class.
     */
    @Override
    public boolean canRegister(){
        return true;
    }

    /**
     * The name of the person who created this expansion should go here.
     * <br>For convienience do we return the author from the plugin.yml
     *
     * @return The name of the author as a String.
     */
    @Override
    public String getAuthor(){
        return plugin.getDescription().getAuthors().toString();
    }

    /**
     * The placeholder identifier should go here.
     * <br>This is what tells PlaceholderAPI to call our onRequest
     * method to obtain a value if a placeholder starts with our
     * identifier.
     * <br>The identifier has to be lowercase and can't contain _ or %
     *
     * @return The identifier in {@code %<identifier>_<value>%} as String.
     */
    @Override
    public String getIdentifier(){
        return "realskywars";
    }

    /**
     * This is the version of the expansion.
     * <br>You don't have to use numbers, since it is set as a String.
     *
     * For convienience do we return the version from the plugin.yml
     *
     * @return The version as a String.
     */
    @Override
    public String getVersion(){
        return plugin.getDescription().getVersion();
    }

    @Override
    public String onRequest(OfflinePlayer player, String identifier){


        switch (identifier.toLowerCase(Locale.ROOT))
        {
            case "playing":
                return RealSkywars.getPlayerManager().getPlayingPlayers(PlayerManager.Modes.ALL) + "";
            case "playing_solo":
                return RealSkywars.getPlayerManager().getPlayingPlayers(PlayerManager.Modes.SOLO) + "";
            case "playing_teams":
                return RealSkywars.getPlayerManager().getPlayingPlayers(PlayerManager.Modes.TEAMS) + "";
            case "playing_ranked":
                return RealSkywars.getPlayerManager().getPlayingPlayers(PlayerManager.Modes.RANKED) + "";
                //SOLO
            case "solo_wins_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(1);
            case "solo_wins_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(2);
            case "solo_wins_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(3);
            case "solo_wins_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(4);
            case "solo_wins_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(5);
            case "solo_wins_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(6);
            case "solo_wins_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(7);
            case "solo_wins_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(8);
            case "solo_wins_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(9);
            case "solo_wins_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_WINS).getIndex(10);
                //TEAMS
            case "teams_wins_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(1);
            case "teams_wins_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(2);
            case "teams_wins_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(3);
            case "teams_wins_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(4);
            case "teams_wins_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(5);
            case "teams_wins_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(6);
            case "teams_wins_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(7);
            case "teams_wins_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(8);
            case "teams_wins_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(9);
            case "teams_wins_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_WINS).getIndex(10);
                //SOLO RANKED
            case "solo_ranked_wins_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(1);
            case "solo_ranked_wins_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(2);
            case "solo_ranked_wins_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(3);
            case "solo_ranked_wins_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(4);
            case "solo_ranked_wins_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(5);
            case "solo_ranked_wins_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(6);
            case "solo_ranked_wins_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(7);
            case "solo_ranked_wins_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(8);
            case "solo_ranked_wins_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(9);
            case "solo_ranked_wins_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.SOLO_RANKED_WINS).getIndex(10);
                //TEAMS RANKED
            case "teams_ranked_wins_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(1);
            case "teams_ranked_wins_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(2);
            case "teams_ranked_wins_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(3);
            case "teams_ranked_wins_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(4);
            case "teams_ranked_wins_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(5);
            case "teams_ranked_wins_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(6);
            case "teams_ranked_wins_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(7);
            case "teams_ranked_wins_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(8);
            case "teams_ranked_wins_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(9);
            case "teams_ranked_wins_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.TEAMS_RANKED_WINS).getIndex(10);
                //KILLS
            case "kills_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(1);
            case "kills_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(2);
            case "kills_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(3);
            case "kills_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(4);
            case "kills_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(5);
            case "kills_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(6);
            case "kills_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(7);
            case "kills_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(8);
            case "kills_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(9);
            case "kills_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS).getIndex(10);
                //KILLS RANKED
            case "kills_ranked_1":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(1);
            case "kills_ranked_2":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(2);
            case "kills_ranked_3":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(3);
            case "kills_ranked_4":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(4);
            case "kills_ranked_5":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(5);
            case "kills_ranked_6":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(6);
            case "kills_ranked_7":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(7);
            case "kills_ranked_8":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(8);
            case "kills_ranked_9":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(9);
            case "kills_ranked_10":
                return RealSkywars.getLeaderboardManager().getLeaderboard(LeaderboardManager.Leaderboard.KILLS_RANKED).getIndex(10);
        }

        return null; // Placeholder is unknown by the Expansion
    }
}