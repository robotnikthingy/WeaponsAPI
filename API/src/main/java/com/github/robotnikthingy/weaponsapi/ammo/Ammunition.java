package com.github.robotnikthingy.weaponsapi.ammo;

import com.github.robotnikthingy.weaponsapi.weapon.Weapon;
import com.github.robotnikthingy.weaponsapi.weapon.state.Reloadable;
import com.github.robotnikthingy.weaponsapi.weapon.state.Shootable;

import org.bukkit.inventory.ItemStack;

/**
 * Represents a piece of ammunition as an item. Ammunition may be used
 * by {@link Shootable} and {@link Reloadable} weapons to shoot and
 * reload bullets respectively
 * 
 * @author Parker Hawke - 2008Choco
 */
public interface Ammunition {
	
	/**
	 * Get the name of this ammunition
	 * 
	 * @return the ammunition name
	 */
	public String getName();
	
	/**
	 * Check whether this type of ammunition is usable by the specified
	 * weapon
	 * 
	 * @param weapon the weapon to check
	 * @return true if usable. false otherwise
	 */
	public boolean isUsableBy(Weapon weapon);
	
	/**
	 * Get the speed at which this ammunition will be fired from a gun
	 * 
	 * @return the speed of the bullet
	 */
	public double getBulletSpeed();
	
	/**
	 * Get the {@link ItemStack} that represents this ammunition in
	 * an inventory
	 * 
	 * @return the representing item stack
	 */
	public ItemStack getItem();
	
}