package pt.josegamerpt.realskywars.gui;

import java.util.Arrays;
import java.util.Collections;

import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;

import pt.josegamerpt.realskywars.classes.Enum.ProfileCategory;
import pt.josegamerpt.realskywars.classes.Enum.ShopCategory;
import pt.josegamerpt.realskywars.managers.LanguageManager;
import pt.josegamerpt.realskywars.managers.PlayerManager;
import pt.josegamerpt.realskywars.player.GamePlayer;
import pt.josegamerpt.realskywars.utils.GUIBuilder;
import pt.josegamerpt.realskywars.utils.GUIBuilder.ClickRunnable;
import pt.josegamerpt.realskywars.utils.Itens;

public class GUIManager {

	public static void openShopMenu(GamePlayer p) {
		GUIBuilder inventory = new GUIBuilder("&aShop &9Categories", 9, p.p.getUniqueId(),
				Itens.createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ""));

		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ShopViewer v = new ShopViewer(p.p.getUniqueId(), ShopCategory.CAGEBLOCK);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.SPAWNER, 1, "&9Cage Blocks",
				Arrays.asList("&fClick here to open this category.")), 0);

		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ShopViewer v = new ShopViewer(p.p.getUniqueId(), ShopCategory.KITS);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.CHEST, 1, "&9Kits", Collections.singletonList("&fClick here to open this category.")), 1);

		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ShopViewer v = new ShopViewer(p.p.getUniqueId(), ShopCategory.WINBLOCKS);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.FIREWORK_ROCKET, 1, "&9Win Blocks",
				Arrays.asList("&fClick here to open this category.")), 2);
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ShopViewer v = new ShopViewer(p.p.getUniqueId(), ShopCategory.WINPARTICLE);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.GLOWSTONE_DUST, 1, "&9Win Particles",
				Collections.singletonList("&fClick here to open this category.")), 3);

		inventory.openInventory(p.p);
	}

	public static void openSpectate(GamePlayer p) {
		// TODO Auto-generated method stub

	}

	public static void openLanguage(GamePlayer p) {
		GUIBuilder inventory = new GUIBuilder("&9Languages", 54, p.p.getUniqueId(),
				Itens.createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ""));

		int i = 0;
		for (String s : LanguageManager.getLanguages()) {
			inventory.addItem(new ClickRunnable() {
				public void run(InventoryClickEvent e) {
					PlayerManager.setLanguage(p, s);
				}
			}, Itens.createItemLore(Material.JUNGLE_SIGN, 1, "&b" + s,
					Arrays.asList("&fClick here to select this language.")), i);
			i++;

		}
		inventory.openInventory(p.p);
	}

	public static void openPlayerMenu(GamePlayer p) {
		GUIBuilder inventory = new GUIBuilder("&9Your &3Profile", 9, p.p.getUniqueId(),
				Itens.createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ""));

		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ProfileContent v = new ProfileContent(p.p, ProfileCategory.KITS);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.CHEST, 1, "&bYour &9Kits",
				Arrays.asList("&fClick here to view this item.")), 0);
		
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ProfileContent v = new ProfileContent(p.p, ProfileCategory.CAGEBLOCK);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.SPAWNER, 1, "&bYour &9Cage Blocks",
				Arrays.asList("&fClick here to view this item.")), 1);
		
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ProfileContent v = new ProfileContent(p.p, ProfileCategory.WINBLOCKS);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.FIREWORK_ROCKET, 1, "&bYour &9Win Blocks",
				Arrays.asList("&fClick here to view this item.")), 2);		
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				ProfileContent v = new ProfileContent(p.p, ProfileCategory.WINPARTICLE);
				v.openInventory(p);
			}
		}, Itens.createItemLore(Material.GLOWSTONE_DUST, 1, "&bYour &9Win Particles",
				Arrays.asList("&fClick here to view this item.")), 3);	
		
		//settings
		
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.p.closeInventory();
				GUIManager.openLanguage(p);
			}
		}, Itens.createItemLore(Material.JUNGLE_SIGN, 1, "&9Language",
				Arrays.asList("&fCurrently set: " + p.Language)), 7);
		
		inventory.addItem(new ClickRunnable() {
			public void run(InventoryClickEvent e) {
				p.resetPurchases();
			}
		}, Itens.createItemLore(Material.BARRIER, 1, "&4Delete Your Purchases",
				Arrays.asList("&cProceed with caution. This action cannot be rolled back.")), 8);

		inventory.openInventory(p.p);
	}
}
