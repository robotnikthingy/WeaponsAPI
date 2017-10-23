package com.github.robotnikthingy.ironsight.api.weapon;

import com.github.robotnikthingy.ironsight.api.ammo.Ammunition;
import com.github.robotnikthingy.ironsight.api.mechanic.data.MechanicDataHandler;
import org.bukkit.entity.Player;

public interface WeaponLoadout {

    /**
     * Get the shooting-related mechanic data handler
     *
     * @return the shooting data handler
     */
    public MechanicDataHandler getShootingDataHandler();

    /**
     * Shoot this weapon and create an entity representing its bullet
     * or respective type of ammunition
     *
     * @param player the player that shot the weapon. Can be null
     */
    public void shoot(Player player);

    /**
     * Get the amount of ammunition that can be held in a clip
     *
     * @return the clip size
     */
    public int getClipSize();

    /**
     * Get the maximum amount of ammunition capable of being held
     * by a player whilst this weapon is in use
     *
     * @return the maximum ammunition
     */
    public int getMaxAmmo();

    /**
     * Get the current amount of ammunition loaded into the weapon
     * ready to shoot
     *
     * @return the amount of loaded ammunition
     */
    public int getAmmo();

    /**
     * Get the reload-related mechanic data handler
     *
     * @return the reload data handler
     */
    public MechanicDataHandler getReloadDataHandler();

    /**
     * Reload this weapon's ammunition clip
     *
     * @param player the player that initiated the reload. Can be null
     * @param ammo the ammunition used to reload this weapon
     */
    public void reload(Player player, Ammunition ammo);

    /**
     * Get the amount of damage that this weapon will inflict
     *
     * @return the weapon damage
     */
    public double getDamage();
}
