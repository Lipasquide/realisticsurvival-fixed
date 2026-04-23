package me.val_mobile.utils;

import me.val_mobile.rsv.RSVPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;

import java.util.HashSet;

public class RSVEnchants {
    private static final HashSet<Enchantment> enchants = new HashSet<>();

    // Custom enchants disabled in 1.21+ (registry-based API)
    // These are kept as stubs for compatibility; actual registration not supported
    public static final Enchantment WARMING = getOrNull("warming");
    public static final Enchantment COOLING = getOrNull("cooling");
    public static final Enchantment OZZY_LINER = getOrNull("ozzy_liner");

    private static Enchantment getOrNull(String key) {
        try {
            return org.bukkit.Registry.ENCHANTMENT.get(NamespacedKey.minecraft(key));
        } catch (Exception e) {
            return null;
        }
    }

    private final RSVPlugin plugin;

    public RSVEnchants(RSVPlugin plugin) {
        this.plugin = plugin;
    }

    public void registerAllEnchants() { /* no-op in 1.21+ */ }
    public void register(Enchantment ench) { /* no-op in 1.21+ */ }
    public void registerEnchantment(Enchantment ench) { /* no-op in 1.21+ */ }
    public void populateEnchants() { /* no-op */ }

    public static HashSet<Enchantment> getEnchants() { return enchants; }
}
