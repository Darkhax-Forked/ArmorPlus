/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus;

import net.thedragonteam.thedragonlib.config.ModConfigProperty;

/**
 * net.thedragonteam.armorplus
 * ArmorPlus created by sokratis12GR on 7/26/2016 4:47 PM.
 * - TheDragonTeam
 */
public class ARPConfig {

    //Weapons.*.Registry
    @ModConfigProperty(category = "Weapons.Coal.Registry", name = "enableCoalSword", comment = "Enable/Disable the Coal Sword from the Game")
    public static boolean enableCoalSword = true;
    @ModConfigProperty(category = "Weapons.Coal.Registry", name = "enableCoalBattleAxe", comment = "Enable/Disable the Coal BattleAxe from the Game")
    public static boolean enableCoalBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Coal.Registry", name = "enableCoalBow", comment = "Enable/Disable the Coal Bow from the Game")
    public static boolean enableCoalBow = true;
    @ModConfigProperty(category = "Weapons.Lapis.Registry", name = "enableLapisSword", comment = "Enable/Disable the Lapis Sword from the Game")
    public static boolean enableLapisSword = true;
    @ModConfigProperty(category = "Weapons.Lapis.Registry", name = "enableLapisSword", comment = "Enable/Disable the Lapis BattleAxe from the Game")
    public static boolean enableLapisBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Lapis.Registry", name = "enableLapisSword", comment = "Enable/Disable the Lapis Bow from the Game")
    public static boolean enableLapisBow = true;
    @ModConfigProperty(category = "Weapons.Redstone.Registry", name = "enableRedstoneSword", comment = "Enable/Disable the Redstone Sword from the Game")
    public static boolean enableRedstoneSword = true;
    @ModConfigProperty(category = "Weapons.Redstone.Registry", name = "enableRedstoneBattleAxe", comment = "Enable/Disable the Redstone BattleAxe from the Game")
    public static boolean enableRedstoneBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Redstone.Registry", name = "enableRedstoneBow", comment = "Enable/Disable the Redstone Bow from the Game")
    public static boolean enableRedstoneBow = true;
    @ModConfigProperty(category = "Weapons.Emerald.Registry", name = "enableEmeraldSword", comment = "Enable/Disable the Emerald Sword from the Game")
    public static boolean enableEmeraldSword = true;
    @ModConfigProperty(category = "Weapons.Emerald.Registry", name = "enableEmeraldBattleAxe", comment = "Enable/Disable the Emerald Battle from the Game")
    public static boolean enableEmeraldBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Emerald.Registry", name = "enableEmeraldBow", comment = "Enable/Disable the Emerald Bow from the Game")
    public static boolean enableEmeraldBow = true;
    @ModConfigProperty(category = "Weapons.Obsidian.Registry", name = "enableObsidianSword", comment = "Enable/Disable the Obsidian Sword from the Game")
    public static boolean enableObsidianSword = true;
    @ModConfigProperty(category = "Weapons.Obsidian.Registry", name = "enableObsidianBattleAxe", comment = "Enable/Disable the Obsidian BattleAxe from the Game")
    public static boolean enableObsidianBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Obsidian.Registry", name = "enableObsidianBow", comment = "Enable/Disable the Obsidian Bow from the Game")
    public static boolean enableObsidianBow = true;
    @ModConfigProperty(category = "Weapons.Lava.Registry", name = "enableLavaSword", comment = "Enable/Disable the Lava Sword from the Game")
    public static boolean enableLavaSword = true;
    @ModConfigProperty(category = "Weapons.Lava.Registry", name = "enableLavaBattleAxe", comment = "Enable/Disable the Lava BattleAxe from the Game")
    public static boolean enableLavaBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Lava.Registry", name = "enableLavaBow", comment = "Enable/Disable the Lava Bow from the Game")
    public static boolean enableLavaBow = true;
    @ModConfigProperty(category = "Weapons.Guardian.Registry", name = "enableGuardianSword", comment = "Enable/Disable the Guardian Sword from the Game")
    public static boolean enableGuardianSword = true;
    @ModConfigProperty(category = "Weapons.Guardian.Registry", name = "enableGuardianBattleAxe", comment = "Enable/Disable the Guardian BattleAxe from the Game")
    public static boolean enableGuardianBattleAxe = true;
    @ModConfigProperty(category = "Weapons.Guardian.Registry", name = "enableGuardianBow", comment = "Enable/Disable the Guardian Bow from the Game")
    public static boolean enableGuardianBow = true;
    @ModConfigProperty(category = "Weapons.SuperStar.Registry", name = "enableSuperStarSword", comment = "Enable/Disable the Super Star Sword from the Game")
    public static boolean enableSuperStarSword = true;
    @ModConfigProperty(category = "Weapons.SuperStar.Registry", name = "enableSuperStarBattleAxe", comment = "Enable/Disable the Super Star BattleAxe from the Game")
    public static boolean enableSuperStarBattleAxe = true;
    @ModConfigProperty(category = "Weapons.SuperStar.Registry", name = "enableSuperStarBow", comment = "Enable/Disable the Super Star Bow from the Game")
    public static boolean enableSuperStarBow = true;
    @ModConfigProperty(category = "Weapons.EnderDragon.Registry", name = "enableEnderDragonSword", comment = "Enable/Disable the Ender Dragon Sword from the Game")
    public static boolean enableEnderDragonSword = true;
    @ModConfigProperty(category = "Weapons.EnderDragon.Registry", name = "enableEnderDragonBattleAxe", comment = "Enable/Disable the Ender Dragon BattleAxe from the Game")
    public static boolean enableEnderDragonBattleAxe = true;
    @ModConfigProperty(category = "Weapons.EnderDragon.Registry", name = "enableEnderDragonBow", comment = "Enable/Disable the Ender Dragon Bow from the Game")
    public static boolean enableEnderDragonBow = true;

    //Weapons.*.Sword
    @ModConfigProperty(category = "Weapons.Coal.Sword", name = "coalSwordDamage", comment = "Set the amount of damage the Coal Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double coalSwordDamage = 0.5;
    @ModConfigProperty(category = "Weapons.Lapis.Sword", name = "lapisSwordDamage", comment = "Set the amount of damage the Lapis Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double lapisSwordDamage = 1.0;
    @ModConfigProperty(category = "Weapons.Redstone.Sword", name = "redstoneSwordDamage", comment = "Set the amount of damage the Redstone Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double redstoneSwordDamage = 1.0;
    @ModConfigProperty(category = "Weapons.Emerald.Sword", name = "emeraldSwordDamage", comment = "Set the amount of damage the Emerald Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double emeraldSwordDamage = 1.5;
    @ModConfigProperty(category = "Weapons.Obsidian.Sword", name = "obsidianSwordDamage", comment = "Set the amount of damage the Obsidian Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double obsidianSwordDamage = 4.0;
    @ModConfigProperty(category = "Weapons.Lava.Sword", name = "lavaSwordDamage", comment = "Set the amount of damage the Lava Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double lavaSwordDamage = 4.5;
    @ModConfigProperty(category = "Weapons.Guardian.Sword", name = "guardianSwordDamage", comment = "Set the amount of damage the Guardian Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double guardianSwordDamage = 6.0;
    @ModConfigProperty(category = "Weapons.SuperStar.Sword", name = "superStarSwordDamage", comment = "Set the amount of damage the Super Star Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double superStarSwordDamage = 7.0;
    @ModConfigProperty(category = "Weapons.EnderDragon.Sword", name = "enderDragonSwordDamage", comment = "Set the amount of damage the Ender Dragon Sword will do (Additional +4 damage will be added automatically by minecraft)")
    public static double enderDragonSwordDamage = 8.0;
    @ModConfigProperty(category = "Weapons.Coal.Sword", name = "coalSwordDurability", comment = "Set the amount of durability the Coal Sword have")
    public static int coalSwordDurability = 59;
    @ModConfigProperty(category = "Weapons.Lapis.Sword", name = "lapisSwordDurability", comment = "Set the amount of durability the Lapis Sword have")
    public static int lapisSwordDurability = 250;
    @ModConfigProperty(category = "Weapons.Redstone.Sword", name = "redstoneSwordDurability", comment = "Set the amount of durability the Redstone Sword have")
    public static int redstoneSwordDurability = 200;
    @ModConfigProperty(category = "Weapons.Emerald.Sword", name = "emeraldSwordDurability", comment = "Set the amount of durability the Emerald Sword have")
    public static int emeraldSwordDurability = 1561;
    @ModConfigProperty(category = "Weapons.Obsidian.Sword", name = "obsidianSwordDurability", comment = "Set the amount of durability the Obsidian Sword have")
    public static int obsidianSwordDurability = 1500;
    @ModConfigProperty(category = "Weapons.Lava.Sword", name = "lavaSwordDurability", comment = "Set the amount of durability the Lava Sword have")
    public static int lavaSwordDurability = 1750;
    @ModConfigProperty(category = "Weapons.Guardian.Sword", name = "guardianSwordDurability", comment = "Set the amount of durability the Guardian Sword have")
    public static int guardianSwordDurability = 1800;
    @ModConfigProperty(category = "Weapons.SuperStar.Sword", name = "superStarSwordDurability", comment = "Set the amount of durability the Super Star Sword have")
    public static int superStarSwordDurability = 1950;
    @ModConfigProperty(category = "Weapons.EnderDragon.Sword", name = "enderDragonSwordDurability", comment = "Set the amount of durability the Ender Dragon Sword have")
    public static int enderDragonSwordDurability = 2310;

    //Weapons.*.BattleAxe
    @ModConfigProperty(category = "Weapons.Coal.BattleAxe", name = "coalBattleAxeDamage", comment = "Set the amount of damage the Coal BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double coalBattleAxeDamage = 2.5;
    @ModConfigProperty(category = "Weapons.Lapis.BattleAxe", name = "lapisBattleAxeDamage", comment = "Set the amount of damage the Lapis BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double lapisBattleAxeDamage = 3.0;
    @ModConfigProperty(category = "Weapons.Redstone.BattleAxe", name = "redstoneBattleAxeDamage", comment = "Set the amount of damage the Redstone BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double redstoneBattleAxeDamage = 3.0;
    @ModConfigProperty(category = "Weapons.Emerald.BattleAxe", name = "emeraldBattleAxeDamage", comment = "Set the amount of damage the Emerald BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double emeraldBattleAxeDamage = 3.5;
    @ModConfigProperty(category = "Weapons.Obsidian.BattleAxe", name = "obsidianBattleAxeDamage", comment = "Set the amount of damage the Obsidian BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double obsidianBattleAxeDamage = 6.0;
    @ModConfigProperty(category = "Weapons.Lava.BattleAxe", name = "lavaBattleAxeDamage", comment = "Set the amount of damage the Lava BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double lavaBattleAxeDamage = 6.5;
    @ModConfigProperty(category = "Weapons.Guardian.BattleAxe", name = "guardianBattleAxeDamage", comment = "Set the amount of damage the Guardian BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double guardianBattleAxeDamage = 7.0;
    @ModConfigProperty(category = "Weapons.SuperStar.BattleAxe", name = "superStarBattleAxeDamage", comment = "Set the amount of damage the Super Star BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double superStarBattleAxeDamage = 8.0;
    @ModConfigProperty(category = "Weapons.EnderDragon.BattleAxe", name = "enderDragonBattleAxeDamage", comment = "Set the amount of damage the Ender Dragon BattleAxe will do (Additional +4 damage will be added automatically by minecraft)")
    public static double enderDragonBattleAxeDamage = 10.0;
    @ModConfigProperty(category = "Weapons.Coal.BattleAxe", name = "coalBattleAxeDurability", comment = "Set the amount of durability the Coal BattleAxe have")
    public static int coalBattleAxeDurability = 59;
    @ModConfigProperty(category = "Weapons.Lapis.BattleAxe", name = "lapisBattleAxeDurability", comment = "Set the amount of durability the Lapis BattleAxe have")
    public static int lapisBattleAxeDurability = 250;
    @ModConfigProperty(category = "Weapons.Redstone.BattleAxe", name = "redstoneBattleAxeDurability", comment = "Set the amount of durability the Redstone BattleAxe have")
    public static int redstoneBattleAxeDurability = 200;
    @ModConfigProperty(category = "Weapons.Emerald.BattleAxe", name = "emeraldBattleAxeDurability", comment = "Set the amount of durability the Emerald BattleAxe have")
    public static int emeraldBattleAxeDurability = 1561;
    @ModConfigProperty(category = "Weapons.Obsidian.BattleAxe", name = "obsidianBattleAxeDurability", comment = "Set the amount of durability the Obsidian BattleAxe have")
    public static int obsidianBattleAxeDurability = 1500;
    @ModConfigProperty(category = "Weapons.Lava.BattleAxe", name = "lavaBattleAxeDurability", comment = "Set the amount of durability the Lava BattleAxe have")
    public static int lavaBattleAxeDurability = 1750;
    @ModConfigProperty(category = "Weapons.Guardian.BattleAxe", name = "guardianBattleAxeDurability", comment = "Set the amount of durability the Guardian BattleAxe have")
    public static int guardianBattleAxeDurability = 1800;
    @ModConfigProperty(category = "Weapons.SuperStar.BattleAxe", name = "superStarBattleAxeDurability", comment = "Set the amount of durability the Super Star BattleAxe have")
    public static int superStarBattleAxeDurability = 1950;
    @ModConfigProperty(category = "Weapons.EnderDragon.BattleAxe", name = "enderDragonBattleAxeDurability", comment = "Set the amount of durability the Ender Dragon BattleAxe have")
    public static int enderDragonBattleAxeDurability = 2310;

    //Weapons.*.Bow
    @ModConfigProperty(category = "Weapons.Coal.Bow", name = "coalBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Coal Bow will do")
    public static double coalBowArrowBonusDamage = -1.0;
    @ModConfigProperty(category = "Weapons.Lapis.Bow", name = "lapisBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Lapis Bow will do")
    public static double lapisBowArrowBonusDamage = -0.5;
    @ModConfigProperty(category = "Weapons.Redstone.Bow", name = "redstoneBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Redstone Bow will do")
    public static double redstoneBowArrowBonusDamage = -0.5;
    @ModConfigProperty(category = "Weapons.Emerald.Bow", name = "emeraldBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Emerald Bow will do")
    public static double emeraldBowArrowBonusDamage = 0.0;
    @ModConfigProperty(category = "Weapons.Obsidian.Bow", name = "obsidianBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Obsidian Bow will do")
    public static double obsidianBowArrowBonusDamage = 0.5;
    @ModConfigProperty(category = "Weapons.Lava.Bow", name = "lavaBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Lava Bow will do")
    public static double lavaBowArrowBonusDamage = 1.0;
    @ModConfigProperty(category = "Weapons.Guardian.Bow", name = "guardianBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Guardian Bow will do")
    public static double guardianBowArrowBonusDamage = 1.5;
    @ModConfigProperty(category = "Weapons.SuperStar.Bow", name = "superStarBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Super Star Bow will do")
    public static double superStarBowArrowBonusDamage = 2.5;
    @ModConfigProperty(category = "Weapons.EnderDragon.Bow", name = "enderDragonBowArrowBonusDamage", comment = "Set the amount of bonus arrow damage the Ender Dragon Bow will do")
    public static double enderDragonBowArrowBonusDamage = 3.5;
    @ModConfigProperty(category = "Weapons.Coal.Bow", name = "coalBowDurability", comment = "Set the amount of durability the Coal Bow have")
    public static int coalBowDurability = 59;
    @ModConfigProperty(category = "Weapons.Lapis.Bow", name = "lapisBowDurability", comment = "Set the amount of durability the Lapis Bow have")
    public static int lapisBowDurability = 250;
    @ModConfigProperty(category = "Weapons.Redstone.Bow", name = "redstoneBowDurability", comment = "Set the amount of durability the Redstone Bow have")
    public static int redstoneBowDurability = 200;
    @ModConfigProperty(category = "Weapons.Emerald.Bow", name = "emeraldBowDurability", comment = "Set the amount of durability the Emerald Bow have")
    public static int emeraldBowDurability = 1561;
    @ModConfigProperty(category = "Weapons.Obsidian.Bow", name = "obsidianBowDurability", comment = "Set the amount of durability the Obsidian Bow have")
    public static int obsidianBowDurability = 1500;
    @ModConfigProperty(category = "Weapons.Lava.Bow", name = "lavaBowDurability", comment = "Set the amount of durability the Lava Bow have")
    public static int lavaBowDurability = 1750;
    @ModConfigProperty(category = "Weapons.Guardian.Bow", name = "guardianBowDurability", comment = "Set the amount of durability the Guardian Bow have")
    public static int guardianBowDurability = 1800;
    @ModConfigProperty(category = "Weapons.SuperStar.Bow", name = "superStarBowDurability", comment = "Set the amount of durability the Super Star Bow have")
    public static int superStarBowDurability = 1950;
    @ModConfigProperty(category = "Weapons.EnderDragon.Bow", name = "enderDragonBowDurability", comment = "Set the amount of durability the Ender Dragon Bow have")
    public static int enderDragonBowDurability = 2310;

    //Armors.*.Registry
    @ModConfigProperty(category = "Armors.CoalArmor.Registry", name = "coalArmorItemNameColor", comment = "Set the color name the Coal Armor will have")
    public static String coalArmorItemNameColor = "gray";
    @ModConfigProperty(category = "Armors.LapisArmor.Registry", name = "lapisArmorItemNameColor", comment = "Set the color name the Lapis Armor will have")
    public static String lapisArmorItemNameColor = "dark_blue";
    @ModConfigProperty(category = "Armors.RedstoneArmor.Registry", name = "redstoneArmorItemNameColor", comment = "Set the color name the Redstone Armor will have")
    public static String redstoneArmorItemNameColor = "dark_red";
    @ModConfigProperty(category = "Armors.EmeraldArmor.Registry", name = "emeraldArmorItemNameColor", comment = "Set the color name the Emerald Armor will have")
    public static String emeraldArmorItemNameColor = "dark_green";
    @ModConfigProperty(category = "Armors.ObsidianArmor.Registry", name = "obsidianArmorItemNameColor", comment = "Set the color name the Obsidian Armor will have")
    public static String obsidianArmorItemNameColor = "dark_gray";
    @ModConfigProperty(category = "Armors.LavaArmor.Registry", name = "lavaArmorItemNameColor", comment = "Set the color name the Lava Armor will have")
    public static String lavaArmorItemNameColor = "gold";
    @ModConfigProperty(category = "Armors.SuperStarArmor.Registry", name = "superStarArmorItemNameColor", comment = "Set the color name the Super Star Armor will have")
    public static String superStarArmorItemNameColor = "white";
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Registry", name = "enderDragonArmorItemNameColor", comment = "Set the color name the Ender Dragon Armor will have")
    public static String enderDragonArmorItemNameColor = "dark_pruple";
    @ModConfigProperty(category = "Armors.GuardianArmor.Registry", name = "guardianArmorItemNameColor", comment = "Set the color name the Guardian Armor will have")
    public static String guardianArmorItemNameColor = "aqua";
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Registry", name = "theUltimateArmorItemNameColor", comment = "Set the color name the Ultimate Armor will have")
    public static String theUltimateArmorItemNameColor = "green";
    @ModConfigProperty(category = "Armors.ArditeArmor.Registry", name = "arditeArmorItemNameColor", comment = "Set the color name the Ardite Armor will have")
    public static String arditeArmorItemNameColor = "dark_red";
    @ModConfigProperty(category = "Armors.CobaltArmor.Registry", name = "cobaltArmorItemNameColor", comment = "Set the color name the Cobalt Armor will have")
    public static String cobaltArmorItemNameColor = "blue";
    @ModConfigProperty(category = "Armors.ManyullynArmor.Registry", name = "manyullynArmorItemNameColor", comment = "Set the color name the Manyullyn Armor will have")
    public static String manyullynArmorItemNameColor = "dark_pirple";
    @ModConfigProperty(category = "Armors.PigIronArmor.Registry", name = "pigIronArmorItemNameColor", comment = "Set the color name the Pig Iron Armor will have")
    public static String pigIronArmorItemNameColor = "light_purple";
    @ModConfigProperty(category = "Armors.KnightSlimeArmor.Registry", name = "knightSlimeArmorItemNameColor", comment = "Set the color name the Knight Slime Armor will have")
    public static String knightSlimeArmorItemNameColor = "dark_pirple";
    @ModConfigProperty(category = "Armors.ChickenArmor.Registry", name = "chickenArmorItemNameColor", comment = "Set the color name the Chicken Armor will have")
    public static String chickenArmorItemNameColor = "aqua";
    @ModConfigProperty(category = "Armors.SlimeArmor.Registry", name = "slimeArmorItemNameColor", comment = "Set the color name the Slime Armor will have")
    public static String slimeArmorItemNameColor = "green";
    @ModConfigProperty(category = "Armors.SteelArmor.Registry", name = "steelArmorItemNameColor", comment = "Set the color name the Steel Armor will have")
    public static String steelArmorItemNameColor = "dark_red";
    @ModConfigProperty(category = "Armors.ElectricalArmor.Registry", name = "electricalArmorItemNameColor", comment = "Set the color name the Electrical Armor will have")
    public static String electricalArmorItemNameColor = "dark_red";

    @ModConfigProperty(category = "Armors.CoalArmor.Registry", name = "coalArmorToughnessPoints", comment = "Set the amount of toughness points the Coal Armor will have")
    public static double coalArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.LapisArmor.Registry", name = "lapisArmorToughnessPoints", comment = "Set the amount of toughness points the Lapis Armor will have")
    public static double lapisArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Registry", name = "redstoneArmorToughnessPoints", comment = "Set the amount of toughness points the Redstone Armor will have")
    public static double redstoneArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Registry", name = "emeraldArmorToughnessPoints", comment = "Set the amount of toughness points the Emerald Armor will have")
    public static double emeraldArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Registry", name = "obsidianArmorToughnessPoints", comment = "Set the amount of toughness points the Obsidian Armor will have")
    public static double obsidianArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.LavaArmor.Registry", name = "lavaArmorToughnessPoints", comment = "Set the amount of toughness points the Lava Armor will have")
    public static double lavaArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Registry", name = "superStarArmorToughnessPoints", comment = "Set the amount of toughness points the Super Star Armor will have")
    public static double superStarArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Registry", name = "enderDragonArmorToughnessPoints", comment = "Set the amount of toughness points the Ender Dragon Armor will have")
    public static double enderDragonArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.GuardianArmor.Registry", name = "guardianArmorToughnessPoints", comment = "Set the amount of toughness points the Guardian Armor will have")
    public static double guardianArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Registry", name = "theUltimateArmorToughnessPoints", comment = "Set the amount of toughness points the Ultimate Armor will have")
    public static double theUltimateArmorToughnessPoints = 6.0;
    @ModConfigProperty(category = "Armors.ArditeArmor.Registry", name = "arditeArmorToughnessPoints", comment = "Set the amount of toughness points the Ardite Armor will have")
    public static double arditeArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.CobaltArmor.Registry", name = "cobaltArmorToughnessPoints", comment = "Set the amount of toughness points the Cobalt Armor will have")
    public static double cobaltArmorToughnessPoints = 2.0;
    @ModConfigProperty(category = "Armors.ManyullynArmor.Registry", name = "manyullynArmorToughnessPoints", comment = "Set the amount of toughness points the Manyullyn Armor will have")
    public static double manyullynArmorToughnessPoints = 3.0;
    @ModConfigProperty(category = "Armors.PigIronArmor.Registry", name = "pigIronArmorToughnessPoints", comment = "Set the amount of toughness points the Pig Iron Armor will have")
    public static double pigIronArmorToughnessPoints = 1.0;
    @ModConfigProperty(category = "Armors.KnightSlimeArmor.Registry", name = "knightSlimeArmorToughnessPoints", comment = "Set the amount of toughness points the Knight Slime Armor will have")
    public static double knightSlimeArmorToughnessPoints = 1.0;
    @ModConfigProperty(category = "Armors.ChickenArmor.Registry", name = "chickenArmorToughnessPoints", comment = "Set the amount of toughness points the Chicken Armor will have")
    public static double chickenArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.SlimeArmor.Registry", name = "slimeArmorToughnessPoints", comment = "Set the amount of toughness points the Slime Armor will have")
    public static double slimeArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.SteelArmor.Registry", name = "steelArmorToughnessPoints", comment = "Set the amount of toughness points the Steel Armor will have")
    public static double steelArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.ElectricalArmor.Registry", name = "electricalArmorToughnessPoints", comment = "Set the amount of toughness points the Electrical Armor will have")
    public static double electricalArmorToughnessPoints = 0.0;
    @ModConfigProperty(category = "Armors.CoalArmor.Registry", name = "coalArmorProtectionPoints", comment = "Set the amount of protection points the Coal Armor will have (boots, leggings, chestplate, boots)")
    public static int[] coalArmorProtectionPoints = new int[]{1, 2, 3, 1};
    @ModConfigProperty(category = "Armors.LapisArmor.Registry", name = "lapisArmorProtectionPoints", comment = "Set the amount of protection points the Lapis Armor will have (boots, leggings, chestplate, boots)")
    public static int[] lapisArmorProtectionPoints = new int[]{1, 3, 5, 2};
    @ModConfigProperty(category = "Armors.RedstoneArmor.Registry", name = "redstoneArmorProtectionPoints", comment = "Set the amount of protection points the Redstone Armor will have (boots, leggings, chestplate, boots)")
    public static int[] redstoneArmorProtectionPoints = new int[]{1, 3, 5, 2};
    @ModConfigProperty(category = "Armors.EmeraldArmor.Registry", name = "emeraldArmorProtectionPoints", comment = "Set the amount of protection points the Emerald Armor will have (boots, leggings, chestplate, boots)")
    public static int[] emeraldArmorProtectionPoints = new int[]{3, 6, 9, 4};
    @ModConfigProperty(category = "Armors.ObsidianArmor.Registry", name = "obsidianArmorProtectionPoints", comment = "Set the amount of protection points the Obsidian Armor will have (boots, leggings, chestplate, boots)")
    public static int[] obsidianArmorProtectionPoints = new int[]{3, 7, 10, 5};
    @ModConfigProperty(category = "Armors.LavaArmor.Registry", name = "lavaArmorProtectionPoints", comment = "Set the amount of protection points the Lava Armor will have (boots, leggings, chestplate, boots)")
    public static int[] lavaArmorProtectionPoints = new int[]{4, 8, 11, 6};
    @ModConfigProperty(category = "Armors.SuperStarArmor.Registry", name = "superStarArmorProtectionPoints", comment = "Set the amount of protection points the Super Star Armor will have (boots, leggings, chestplate, boots)")
    public static int[] superStarArmorProtectionPoints = new int[]{5, 9, 12, 6};
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Registry", name = "enderDragonArmorProtectionPoints", comment = "Set the amount of protection points the Ender Dragon Armor will have (boots, leggings, chestplate, boots)")
    public static int[] enderDragonArmorProtectionPoints = new int[]{5, 9, 12, 6};
    @ModConfigProperty(category = "Armors.GuardianArmor.Registry", name = "guardianArmorProtectionPoints", comment = "Set the amount of protection points the Guardian Armor will have (boots, leggings, chestplate, boots)")
    public static int[] guardianArmorProtectionPoints = new int[]{4, 8, 11, 6};
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Registry", name = "theUltimateArmorProtectionPoints", comment = "Set the amount of protection points the Ultimate Armor will have (boots, leggings, chestplate, boots)")
    public static int[] theUltimateArmorProtectionPoints = new int[]{10, 20, 30, 15};
    @ModConfigProperty(category = "Armors.ArditeArmor.Registry", name = "arditeArmorProtectionPoints", comment = "Set the amount of protection points the Ardite Armor will have (boots, leggings, chestplate, boots)")
    public static int[] arditeArmorProtectionPoints = new int[]{4, 8, 10, 4};
    @ModConfigProperty(category = "Armors.CobaltArmor.Registry", name = "cobaltArmorProtectionPoints", comment = "Set the amount of protection points the Cobalt Armor will have (boots, leggings, chestplate, boots)")
    public static int[] cobaltArmorProtectionPoints = new int[]{3, 7, 9, 3};
    @ModConfigProperty(category = "Armors.ManyullynArmor.Registry", name = "manyullynArmorProtectionPoints", comment = "Set the amount of protection points the Manyullyn Armor will have (boots, leggings, chestplate, boots)")
    public static int[] manyullynArmorProtectionPoints = new int[]{5, 10, 12, 5};
    @ModConfigProperty(category = "Armors.PigIronArmor.Registry", name = "pigIronArmorProtectionPoints", comment = "Set the amount of protection points the Pig Iron Armor will have (boots, leggings, chestplate, boots)")
    public static int[] pigIronArmorProtectionPoints = new int[]{3, 6, 8, 3};
    @ModConfigProperty(category = "Armors.KnightSlimeArmor.Registry", name = "knightSlimeArmorProtectionPoints", comment = "Set the amount of protection points the Knight Slime Armor will have (boots, leggings, chestplate, boots)")
    public static int[] knightSlimeArmorProtectionPoints = new int[]{3, 6, 8, 3};
    @ModConfigProperty(category = "Armors.ChickenArmor.Registry", name = "chickenArmorProtectionPoints", comment = "Set the amount of protection points the Chicen Armor will have (boots, leggings, chestplate, boots)")
    public static int[] chickenArmorProtectionPoints = new int[]{1, 1, 2, 1};
    @ModConfigProperty(category = "Armors.SlimeArmor.Registry", name = "slimeArmorProtectionPoints", comment = "Set the amount of protection points the Slime Armor will have (boots, leggings, chestplate, boots)")
    public static int[] slimeArmorProtectionPoints = new int[]{1, 1, 2, 1};
    @ModConfigProperty(category = "Armors.SteelArmor.Registry", name = "steelArmorProtectionPoints", comment = "Set the amount of protection points the Steel Armor will have (boots, leggings, chestplate, boots)")
    public static int[] steelArmorProtectionPoints = new int[]{2, 5, 6, 2};
    @ModConfigProperty(category = "Armors.ElectricalArmor.Registry", name = "electricalArmorProtectionPoints", comment = "Set the amount of protection points the Electrical Armor will have (boots, leggings, chestplate, boots)")
    public static int[] electricalArmorProtectionPoints = new int[]{3, 6, 7, 3};

    //Armors.SteelArmor
    @ModConfigProperty(category = "Armors.SteelArmor", name = "inputSteelArmor", comment = "Set the amount of Energy that the item can input")
    public static int inputSteelArmor = 10;
    @ModConfigProperty(category = "Armors.SteelArmor", name = "outputSteelArmor", comment = "Set the amount of Energy that the item can output")
    public static int outputSteelArmor = 1;
    @ModConfigProperty(category = "Armors.SteelArmor", name = "maxCapacitySteelArmor", comment = "Set the max capacity that the item can hold")
    public static int maxCapacitySteelArmor = 3000;
    //Armors.ElectricalArmor
    @ModConfigProperty(category = "Armors.ElectricalArmor", name = "inputElectricalArmor", comment = "Set the amount of Energy that the item can input")
    public static int inputElectricalArmor = 10;
    @ModConfigProperty(category = "Armors.ElectricalArmor", name = "outputElectricalArmor", comment = "Set the amount of Energy that the item can output")
    public static int outputElectricalArmor = 1;
    @ModConfigProperty(category = "Armors.ElectricalArmor", name = "maxCapacityElectricalArmor", comment = "Set the max capacity that the item can hold")
    public static int maxCapacityElectricalArmor = 8000;
    //EnergyItems.Sword
    @ModConfigProperty(category = "EnergyItems", name = "inputSword", comment = "Set the amount of Energy that the item can input")
    public static int inputSword = 10;
    @ModConfigProperty(category = "EnergyItems", name = "outputSword", comment = "Set the amount of Energy that the item can output")
    public static int outputSword = 10;
    @ModConfigProperty(category = "EnergyItems", name = "maxCapacitySword", comment = "Set the max capacity that the item can hold")
    public static int maxCapacitySword = 3000;
    //EnergyItems.Pickaxe
    @ModConfigProperty(category = "EnergyItems", name = "inputPickaxe", comment = "Set the amount of Energy that the item can input")
    public static int inputPickaxe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "outputPickaxe", comment = "Set the amount of Energy that the item can output")
    public static int outputPickaxe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "maxCapacityPickaxe", comment = "Set the max capacity that the item can hold")
    public static int maxCapacityPickaxe = 3000;
    //EnergyItems.Axe
    @ModConfigProperty(category = "EnergyItems", name = "inputAxe", comment = "Set the amount of Energy that the item can input")
    public static int inputAxe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "outputAxe", comment = "Set the amount of Energy that the item can output")
    public static int outputAxe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "maxCapacityAxe", comment = "Set the max capacity that the item can hold")
    public static int maxCapacityAxe = 3000;
    //EnergyItemsShovel
    @ModConfigProperty(category = "EnergyItems", name = "inputShovel", comment = "Set the amount of Energy that the item can input")
    public static int inputShovel = 10;
    @ModConfigProperty(category = "EnergyItems", name = "outputShovel", comment = "Set the amount of Energy that the item can output")
    public static int outputShovel = 10;
    @ModConfigProperty(category = "EnergyItems", name = "maxCapacityShovel", comment = "Set the max capacity that the item can hold")
    public static int maxCapacityShovel = 3000;
    //EnergyItems.Hoe
    @ModConfigProperty(category = "EnergyItems", name = "inputHoe", comment = "Set the amount of Energy that the item can input")
    public static int inputHoe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "outputHoe", comment = "Set the amount of Energy that the item can output")
    public static int outputHoe = 10;
    @ModConfigProperty(category = "EnergyItems", name = "maxCapacityHoe", comment = "Set the max capacity that the item can hold")
    public static int maxCapacityHoe = 3000;

    //TheGiftOfTheGods (TGOTG)
    @ModConfigProperty(category = "TheGiftOfTheGods", name = "enableTheGiftOfTheGods", comment = "Enable/Disable The Gift Of The Gods")
    public static boolean enableTheGiftOfTheGods = true;
    @ModConfigProperty(category = "TheGiftOfTheGods", name = "cooldownTicks", comment = "Set the cooldown ticks until you can use The Gift Of The Gods (1 second = 20 ticks)")
    public static int cooldownTicks = 600;
    @ModConfigProperty(category = "TheGiftOfTheGods", name = "maxUses", comment = "Set the max amount of uses for the item")
    public static int maxUses = 2;

    //EnderDragonZombie
    @ModConfigProperty(category = "EnderDragonZombie.Spawn", name = "enableEnderDragonZombieSpawnEnd", comment = "Enable/Disable the Ender Dragon Zombie to spawn in the End")
    public static boolean enableEnderDragonZombieSpawnEnd = false;
    @ModConfigProperty(category = "EnderDragonZombie.Properties", name = "enderDragonZombieHealth", comment = "Set the Ender Dragon Zombie's Health")
    public static double enderDragonZombieHealth = 40.0;
    @ModConfigProperty(category = "EnderDragonZombie.Properties", name = "enderDragonZombieArmor", comment = "Set the Ender Dragon Zombie's Armor")
    public static double enderDragonZombieArmor = 2.0;
    @ModConfigProperty(category = "EnderDragonZombie.Properties", name = "enderDragonZombieAttackDamage", comment = "Set the Ender Dragon Zombie's Attack Damage")
    public static double enderDragonZombieAttackDamage = 3.0;
    @ModConfigProperty(category = "EnderDragonZombie.Properties", name = "enderDragonZombieMovementSpeed", comment = "Set the Ender Dragon Zombie's Movement Speed")
    public static double enderDragonZombieMovementSpeed = 0.23000000417232513;
    @ModConfigProperty(category = "EnderDragonZombie.Properties", name = "enderDragonZombieFollowRange", comment = "Set the Ender Dragon Zombie's Follow Range")
    public static double enderDragonZombieFollowRange = 35.0;
    @ModConfigProperty(category = "EnderDragonZombie.Effects", name = "enableEnderDragonZombieWithering", comment = "Enable/Disable the Ender Dragon Zombie's Withering Effect")
    public static boolean enableEnderDragonZombieWithering = true;
    @ModConfigProperty(category = "EnderDragonZombie.Effects", name = "enderDragonZombieWitheringEffectDuration", comment = "Set the Ender Dragon Zombie's Withering Effect Duration")
    public static int enderDragonZombieWitheringEffectDuration = 20;
    @ModConfigProperty(category = "EnderDragonZombie.Effects", name = "enderDragonZombieWitheringEffectLevel", comment = "Set the Ender Dragon Zombie's Withering Effect Level")
    public static int enderDragonZombieWitheringEffectLevel = 4;

    //Debug
    @ModConfigProperty(category = "Debug", name = "debugMode", comment = "Enable/Disable Debug Mode")
    public static boolean debugMode = false;
    @ModConfigProperty(category = "Debug", name = "debugModeGOTG", comment = "Enable/Disable Debug Mode for the Gift Of The Gods")
    public static boolean debugModeGOTG = false;
    @ModConfigProperty(category = "Debug", name = "debugModeEnchantments", comment = "Enable/Disable Debug Mode for the Enchantments")
    public static boolean debugModeEnchantments = false;
    //Weapons
    @ModConfigProperty(category = "Weapons", name = "enableSwordsRecipes", comment = "Enable/Disable ArmorPlus Sword's Recipes")
    public static boolean enableSwordsRecipes = true;
    @ModConfigProperty(category = "Weapons", name = "enableBattleAxesRecipes", comment = "Enable/Disable ArmorPlus Battle Axes's Recipes")
    public static boolean enableBattleAxesRecipes = true;
    @ModConfigProperty(category = "Weapons", name = "enableBowsRecipes", comment = "Enable/Disable ArmorPlus Bows's Recipes")
    public static boolean enableBowsRecipes = true;
    //SuperStarArmor
    @ModConfigProperty(category = "Armors.SuperStarArmor.Effects", name = "enableSuperStarHRegen", comment = "Enable/Disable the Super Star Helmet Regeneration")
    public static boolean enableSuperStarHRegen = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Effects", name = "enableSuperStarCRegen", comment = "Enable/Disable the Super Star Chestplate Regeneration")
    public static boolean enableSuperStarCRegen = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Effects", name = "enableSuperStarLRegen", comment = "Enable/Disable the Super Star Leggings Regeneration")
    public static boolean enableSuperStarLRegen = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Effects", name = "enableSuperStarBRegen", comment = "Enable/Disable the Super Star Boots Regeneration")
    public static boolean enableSuperStarBRegen = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Effects", name = "enableFullSuperStarArmorEffect", comment = "Enable/Disable the Full Super Star Armor Effect")
    public static boolean enableFullSuperStarArmorEffect = false;
    //LavaArmor
    @ModConfigProperty(category = "Armors.LavaArmor.Effects", name = "enableLavaHEffects", comment = "Enable/Disable the Lava Helmet Resistance and Fire Resistance")
    public static boolean enableLavaHEffects = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Effects", name = "enableLavaCEffects", comment = "Enable/Disable the Lava Chestplate Resistance and Fire Resistance")
    public static boolean enableLavaCEffects = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Effects", name = "enableLavaLEffects", comment = "Enable/Disable the Lava Leggings Resistance and Fire Resistance")
    public static boolean enableLavaLEffects = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Effects", name = "enableLavaBEffects", comment = "Enable/Disable the Lava Boots Resistance and Fire Resistance")
    public static boolean enableLavaBEffects = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Effects", name = "enableFullLavaArmorEffect", comment = "Enable/Disable the Full Lava Armor Effect")
    public static boolean enableFullLavaArmorEffect = false;
    //ObsidianArmor
    @ModConfigProperty(category = "Armors.ObsidianArmor.Effects", name = "enableObsidianHResistance", comment = "Enable/Disable the Obsidian Helmet Resistance")
    public static boolean enableObsidianHResistance = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Effects", name = "enableObsidianCResistance", comment = "Enable/Disable the Obsidian Chestplate Resistance")
    public static boolean enableObsidianCResistance = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Effects", name = "enableObsidianLResistance", comment = "Enable/Disable the Obsidian Leggings Resistance")
    public static boolean enableObsidianLResistance = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Effects", name = "enableObsidianBResistance", comment = "Enable/Disable the Obsidian Boots Resistance")
    public static boolean enableObsidianBResistance = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Effects", name = "enableFullObsidianArmorEffect", comment = "Enable/Disable the Full Obsidian Armor Effect")
    public static boolean enableFullObsidianArmorEffect = false;
    //EmeraldArmor
    @ModConfigProperty(category = "Armors.EmeraldArmor.Effects", name = "enableEmeraldHHaste", comment = "Enable/Disable the Emerald Helmet Haste")
    public static boolean enableEmeraldHHaste = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Effects", name = "enableEmeraldCHaste", comment = "Enable/Disable the Emerald Chestplate Haste")
    public static boolean enableEmeraldCHaste = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Effects", name = "enableEmeraldLHaste", comment = "Enable/Disable the Emerald Leggings Haste")
    public static boolean enableEmeraldLHaste = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Effects", name = "enableEmeraldBHaste", comment = "Enable/Disable the Emerald Boots Haste")
    public static boolean enableEmeraldBHaste = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Effects", name = "enableFullEmeraldArmorEffect", comment = "Enable/Disable the Full Emerald Armor Effect")
    public static boolean enableFullEmeraldArmorEffect = false;
    //RedstoneArmor
    @ModConfigProperty(category = "Armors.RedstoneArmor.Effects", name = "enableRedstoneHSpeed", comment = "Enable/Disable the Redstone Helmet Speed")
    public static boolean enableRedstoneHSpeed = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Effects", name = "enableRedstoneCSpeed", comment = "Enable/Disable the Redstone Chestplate Speed")
    public static boolean enableRedstoneCSpeed = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Effects", name = "enableRedstoneLSpeed", comment = "Enable/Disable the Redstone Leggings Speed")
    public static boolean enableRedstoneLSpeed = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Effects", name = "enableRedstoneBSpeed", comment = "Enable/Disable the Redstone Boots Speed")
    public static boolean enableRedstoneBSpeed = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Effects", name = "enableFullRedstoneArmorEffect", comment = "Enable/Disable the Full Redstone Armor Effect")
    public static boolean enableFullRedstoneArmorEffect = false;
    //LapisArmor
    @ModConfigProperty(category = "Armors.LapisArmor.Effects", name = "enableLapisHBreathing", comment = "Enable/Disable the Lapis Helmet Water Breathing")
    public static boolean enableLapisHBreathing = true;
    @ModConfigProperty(category = "Armors.LapisArmor.Effects", name = "enableLapisCBreathing", comment = "Enable/Disable the Lapis Chestplate Water Breathing")
    public static boolean enableLapisCBreathing = true;
    @ModConfigProperty(category = "Armors.LapisArmor.Effects", name = "enableLapisLBreathing", comment = "Enable/Disable the Lapis Leggings Water Breathing")
    public static boolean enableLapisLBreathing = true;
    @ModConfigProperty(category = "Armors.LapisArmor.Effects", name = "enableLapisBBreathing", comment = "Enable/Disable the Lapis Boots Water Breathing")
    public static boolean enableLapisBBreathing = true;
    @ModConfigProperty(category = "Armors.LapisArmor.Effects", name = "enableFullLapisArmorEffect", comment = "Enable/Disable the Full Lapis Armor Effect")
    public static boolean enableFullLapisArmorEffect = false;
    //CoalArmor
    @ModConfigProperty(category = "Armors.CoalArmor.Effects", name = "enableCoalHNightVision", comment = "Enable/Disable the Coal Helmet NightVision")
    public static boolean enableCoalHNightVision = true;
    @ModConfigProperty(category = "Armors.CoalArmor.Effects", name = "enableCoalCNightVision", comment = "Enable/Disable the Coal Chestplate NightVision")
    public static boolean enableCoalCNightVision = true;
    @ModConfigProperty(category = "Armors.CoalArmor.Effects", name = "enableCoalLNightVision", comment = "Enable/Disable the Coal Leggings NightVision")
    public static boolean enableCoalLNightVision = true;
    @ModConfigProperty(category = "Armors.CoalArmor.Effects", name = "enableCoalBNightVision", comment = "Enable/Disable the Coal Boots NightVision")
    public static boolean enableCoalBNightVision = true;
    @ModConfigProperty(category = "Armors.CoalArmor.Effects", name = "enableFullCoalArmorEffect", comment = "Enable/Disable the Full Coal Armor Effect")
    public static boolean enableFullCoalArmorEffect = false;
    //Registry
    @ModConfigProperty(category = "Armors.CoalArmor.Registry", name = "enableCoalArmor", comment = "Enable/Disable the Coal Armor from the Game")
    public static boolean enableCoalArmor = true;
    @ModConfigProperty(category = "Armors.LapisArmor.Registry", name = "enableLapisArmor", comment = "Enable/Disable the Lapis Armor from the Game")
    public static boolean enableLapisArmor = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Registry", name = "enableRedstoneArmor", comment = "Enable/Disable the Redstone Armor from the Game")
    public static boolean enableRedstoneArmor = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Registry", name = "enableEmeraldArmor", comment = "Enable/Disable the Emerald Armor from the Game")
    public static boolean enableEmeraldArmor = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Registry", name = "enableObsidianArmor", comment = "Enable/Disable the Obsidian Armor from the Game")
    public static boolean enableObsidianArmor = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Registry", name = "enableLavaArmor", comment = "Enable/Disable the Lava Armor from the Game")
    public static boolean enableLavaArmor = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Registry", name = "enableSuperStarArmor", comment = "Enable/Disable the Super Star Armor from the Game")
    public static boolean enableSuperStarArmor = true;
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Registry", name = "enableEnderDragonArmor", comment = "Enable/Disable the Ender Dragon Armor from the Game")
    public static boolean enableEnderDragonArmor = true;
    @ModConfigProperty(category = "Armors.GuardianArmor.Registry", name = "enableGuardianArmor", comment = "Enable/Disable the Guardian Armor from the Game")
    public static boolean enableGuardianArmor = true;
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Registry", name = "enableTheUltimateArmor", comment = "Enable/Disable The Ultimate Armor from the Game")
    public static boolean enableTheUltimateArmor = true;
    @ModConfigProperty(category = "Armors.ArditeArmor.Registry", name = "enableArditeArmor", comment = "Enable/Disable the Ardite Armors from the Game")
    public static boolean enableArditeArmor = true;
    @ModConfigProperty(category = "Armors.CobaltArmor.Registry", name = "enableCobaltArmor", comment = "Enable/Disable the Cobalt Armors from the Game")
    public static boolean enableCobaltArmor = true;
    @ModConfigProperty(category = "Armors.ManyullynArmor.Registry", name = "enableManyullynArmor", comment = "Enable/Disable the Manyullyn Armors from the Game")
    public static boolean enableManyullynArmor = true;
    @ModConfigProperty(category = "Armors.PigIronArmor.Registry", name = "enablePigIronArmor", comment = "Enable/Disable the Pig Iron Armors from the Game")
    public static boolean enablePigIronArmor = true;
    @ModConfigProperty(category = "Armors.KnightSlimeArmor.Registry", name = "enableKnightSlimeArmor", comment = "Enable/Disable the Knight Slime Armors from the Game")
    public static boolean enableKnightSlimeArmor = true;
    @ModConfigProperty(category = "Armors.ChickenArmor.Registry", name = "enableChickenArmor", comment = "Enable/Disable the Chicken Armors from the Game")
    public static boolean enableChickenArmor = true;
    @ModConfigProperty(category = "Armors.SlimeArmor.Registry", name = "enableSlimeArmor", comment = "Enable/Disable the Slime Armors from the Game")
    public static boolean enableSlimeArmor = true;
    @ModConfigProperty(category = "Armors.SteelArmor.Registry", name = "enableSteelArmor", comment = "Enable/Disable the Steel Armors from the Game")
    public static boolean enableSteelArmor = true;
    @ModConfigProperty(category = "Armors.ElectricalArmor.Registry", name = "enableElectricalArmor", comment = "Enable/Disable the Electrical Armors from the Game")
    public static boolean enableElectricalArmor = true;
    //FlightAbility
    @ModConfigProperty(category = "FlightAbility", name = "enableFlightAbility", comment = "Enable/Disable the Armors Flight")
    public static boolean enableFlightAbility = true;
    //EffectLevel
    @ModConfigProperty(category = "Armors.EmeraldArmor.EffectLevel", name = "emeraldArmorEffectlevel", comment = "Set the level of the Haste effect by the Emerald Armor.")
    public static int emeraldArmorEffectlevel = 1;
    @ModConfigProperty(category = "Armors.ObsidianArmor.EffectLevel", name = "obsidianArmorEffectlevel", comment = "Set the level of the Resistance effect by the Obsidian Armor.")
    public static int obsidianArmorEffectlevel = 0;
    @ModConfigProperty(category = "Armors.RedstoneArmor.EffectLevel", name = "redstoneArmorEffectlevel", comment = "Set the level of the Swiftness effect by the Redstone Armor.")
    public static int redstoneArmorEffectlevel = 1;
    @ModConfigProperty(category = "Armors.SuperStarArmor.EffectLevel", name = "superstarArmorEffectlevel", comment = "Set the level of the Regeneration effect by the Super Star Armor.")
    public static int superstarArmorEffectlevel = 1;
    @ModConfigProperty(category = "Armors.TheUltimateArmor.EffectLevel", name = "ultimateArmorEffectlevel", comment = "Set the level of the Regeneration effect by The Ultimate Armor.")
    public static int ultimateArmorEffectlevel = 1;
    //WorldGeneration
    @ModConfigProperty(category = "WorldGeneration.Overworld", name = "enableLavaCrystalOreOverworldGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `Overworld`")
    public static boolean enableLavaCrystalOverworldGen = true;
    @ModConfigProperty(category = "WorldGeneration.TheEnd", name = "enableLavaCrystalOreTheEndGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `The End`")
    public static boolean enableLavaCrystalTheEndGen = false;
    @ModConfigProperty(category = "WorldGeneration.TheNether", name = "enableLavaCrystalOreTheNetherGen", comment = "Enable/Disable The Lava Crystal World Generation in the dimension `The Nether`")
    public static boolean enableLavaCrystalTheNetherGen = false;
    @ModConfigProperty(category = "WorldGeneration.Overworld", name = "lavaCrystalOverworldRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldRarity = 7;
    @ModConfigProperty(category = "WorldGeneration.Overworld", name = "lavaCrystalOverworldMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldMinYSpawn = 6;
    @ModConfigProperty(category = "WorldGeneration.Overworld", name = "lavaCrystalOverworldMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldMaxYSpawn = 16;
    @ModConfigProperty(category = "WorldGeneration.TheEnd", name = "lavaCrystalTheEndRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndRarity = 0;
    @ModConfigProperty(category = "WorldGeneration.TheEnd", name = "lavaCrystalTheEndMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndMinYSpawn = 0;
    @ModConfigProperty(category = "WorldGeneration.TheEnd", name = "lavaCrystalTheEndMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndMaxYSpawn = 0;
    @ModConfigProperty(category = "WorldGeneration.TheNether", name = "lavaCrystalTheNetherRarity", comment = "Set the rarity level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherRarity = 0;
    @ModConfigProperty(category = "WorldGeneration.TheNether", name = "lavaCrystalTheNetherMinYSpawn", comment = "Set the min Y level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherMinYSpawn = 0;
    @ModConfigProperty(category = "WorldGeneration.TheNether", name = "lavaCrystalTheNetherMaxYSpawn", comment = "Set the max Y level of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherMaxYSpawn = 0;
    @ModConfigProperty(category = "WorldGeneration.Overworld", name = "lavaCrystalOverworldVeinAmount", comment = "Set the vein amount of the Lava Crystal Generation in the dimension `Overworld`")
    public static int lavaCrystalOverworldVeinAmount = 5;
    @ModConfigProperty(category = "WorldGeneration.TheEnd", name = "lavaCrystalTheEndVeinAmount", comment = "Set the vein amount of the Lava Crystal Generation in the dimension `The End`")
    public static int lavaCrystalTheEndVeinAmount = 0;
    @ModConfigProperty(category = "WorldGeneration.TheNether", name = "lavaCrystalTheNetherVeinAmount", comment = "Set the vein amount of the Lava Crystal Generation in the dimension `The Nether`")
    public static int lavaCrystalTheNetherVeinAmount = 0;
    @ModConfigProperty(category = "WorldGeneration.CastleGeneration", name = "castleGenSpawnChance", comment = "Set the spawn chance of the Castle Generation in the Overworld")
    public static int castleGenSpawnChance = 1;
    @ModConfigProperty(category = "WorldGeneration.CastleGeneration", name = "enableCastleGenSpawnChance", comment = "Enable/Disable the Castle Generation")
    public static boolean enableCastleGen = true;
    //GameModes
    @ModConfigProperty(category = "GameModes", name = "recipes", comment = "Sets the Recipe Difficulty \n0 = easy , 1 = expert")
    public static int recipes = 1;
    //WhiteList
    @ModConfigProperty(category = "WhiteList", name = "whitelistmax", comment = "Set the maximum amount of items that the player can get by the \"The Gift Of The Gods\". \nNote:You will need to have that many WhiteListed Items.")
    public static int whitelistmax = 0;
    @ModConfigProperty(category = "WhiteList", name = "whitelistmin", comment = "Set the minimum amount of items that the player can get by the \"The Gift Of The Gods\". \nNote:Don't change this from 0\"")
    public static int whitelistmin = 0;
    @ModConfigProperty(category = "WhiteList", name = "enableWhiteList", comment = "Enable/Disable the WhiteList")
    public static boolean enableWhiteList = false;
    @ModConfigProperty(category = "WhiteList", name = "whiteListedItems", comment = "Add WhiteListed Items to the \"The Gift Of The Gods\" \nIf You add want to add an item to the whitelist \nYou will need to replace 1 from \"minecraft:dirt\" to the item you want to add")
    public static String[] whiteListedItems = new String[]{"minecraft:dirt"};
    //BlackList
    @ModConfigProperty(category = "BlackList", name = "enableBlackList", comment = "Enable/Disable the BlackList")
    public static boolean enableBlackList = true;
    @ModConfigProperty(category = "BlackList", name = "blackListedItems", comment = "Add Blacklisted Items to the \"The Gift Of The Gods\" \nIf You add want to add an item to the blacklist \nYou will need to replace 1 from \"minecraft:dirt\" to the item you want to add")
    public static String[] blackListedItems = new String[]{"armorplus:dev_helmet", "armorplus:dev_chestplate", "armorplus:dev_leggings", "armorplus:dev_boots", "minecraft:dirt"};
    //TinkersEffects
    @ModConfigProperty(category = "Armors.ArditeArmor.Effects", name = "enableArditeArmorEffects", comment = "Enable/Disable Ardite Armor Effects")
    public static boolean enableArditeArmorEffects = true;
    @ModConfigProperty(category = "Armors.CobaltArmor.Effects", name = "enableCobaltArmorEffects", comment = "Enable/Disable Cobalt Armor Effects")
    public static boolean enableCobaltArmorEffects = true;
    @ModConfigProperty(category = "Armors.ManyullynArmor.Effects", name = "enableManyullynArmorEffects", comment = "Enable/Disable Manyullyn Armor Effects")
    public static boolean enableManyullynArmorEffects = true;
    @ModConfigProperty(category = "Armors.PigIronArmor.Effects", name = "enablePigIronArmorEffects", comment = "Enable/Disable Manyullym Armor Effects")
    public static boolean enablePigIronArmorEffects = true;
    @ModConfigProperty(category = "Armors.PigIronArmor.Effects", name = "enableKnightSlimeArmorEffects", comment = "Enable/Disable Knight Slime Armor Effects")
    public static boolean enableKnightSlimeArmorEffects = true;
    //TheUltimateArmor
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Ability", name = "enableTheUltimateArmorInvincibility", comment = "Enable/Disable The Ultimate Armor Invincibility")
    public static boolean enableTheUltimateArmorInvincibility = false;
    @ModConfigProperty(category = "Armors.TheUltimateArmor.DeBuffs", name = "enableTheUltimateArmorDeBuffs", comment = "Enable/Disable The Ultimate Armor DeBuffs")
    public static boolean enableTheUltimateArmorDeBuffs = true;
    //EnderDragonArmor
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Recipes", name = "enableEnderDragonArmorElytra", comment = "Enable/Disable The Ender Dragon Chestplate to require 2 x Elytras instead of 2 x End Crystals to craft")
    public static boolean enableEnderDragonArmorElytra = false;
    //Recipes
    @ModConfigProperty(category = "Armors.CoalArmor.Recipes", name = "enableCoalArmorRecipes", comment = "Enable/Disable The Coal Armor Recipes")
    public static boolean enableCoalArmorRecipes = true;
    @ModConfigProperty(category = "Armors.CoalArmor.Recipes", name = "enableCharcoalCoalArmorRecipe", comment = "Enable/Disable The Charcoal Coal Armor Recipes")
    public static boolean enableCharcoalCoalArmorRecipe = false;
    @ModConfigProperty(category = "Armors.LapisArmor.Recipes", name = "enableLapisArmorRecipes", comment = "Enable/Disable The Lapis Armor Recipes")
    public static boolean enableLapisArmorRecipes = true;
    @ModConfigProperty(category = "Armors.RedstoneArmor.Recipes", name = "enableRedstoneArmorRecipes", comment = "Enable/Disable The Redstone Armor Recipes")
    public static boolean enableRedstoneArmorRecipes = true;
    @ModConfigProperty(category = "Armors.EmeraldArmor.Recipes", name = "enableEmeraldArmorRecipes", comment = "Enable/Disable The Emerald Armor Recipes")
    public static boolean enableEmeraldArmorRecipes = true;
    @ModConfigProperty(category = "Armors.ObsidianArmor.Recipes", name = "enableObsidianArmorRecipes", comment = "Enable/Disable The Obsidian Armor Recipes")
    public static boolean enableObsidianArmorRecipes = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Recipes", name = "enableLavaArmorRecipes", comment = "Enable/Disable The Lava Armor Recipes")
    public static boolean enableLavaArmorRecipes = true;
    @ModConfigProperty(category = "Armors.SuperStarArmor.Recipes", name = "enableSuperStarArmorRecipes", comment = "Enable/Disable The Super Star Armor Recipes")
    public static boolean enableSuperStarArmorRecipes = true;
    @ModConfigProperty(category = "Armors.EnderDragonArmor.Recipes", name = "enableEnderDragonArmorRecipes", comment = "Enable/Disable The Ender Dragon Armor Recipes")
    public static boolean enableEnderDragonArmorRecipes = true;
    @ModConfigProperty(category = "Armors.GuardianArmor.Recipes", name = "enableGuardianArmorRecipes", comment = "Enable/Disable The Guardian Armor Recipes")
    public static boolean enableGuardianArmorRecipes = true;
    @ModConfigProperty(category = "Armors.TheUltimateArmor.Recipes", name = "enableTheUltimateArmorRecipes", comment = "Enable/Disable The Ultimate Armor Recipes")
    public static boolean enableTheUltimateArmorRecipes = true;
    @ModConfigProperty(category = "Armors.ChainArmor.Recipes", name = "enableChainArmorRecipes", comment = "Enable/Disable The Chain Armors Recipes")
    public static boolean enableChainArmorRecipes = true;
    @ModConfigProperty(category = "Armors.ArditeArmor.Recipes", name = "enableArditeArmorRecipes", comment = "Enable/Disable The Ardite Armors Recipes")
    public static boolean enableArditeArmorRecipes = true;
    @ModConfigProperty(category = "Armors.CobaltArmor.Recipes", name = "enableCobaltArmorRecipes", comment = "Enable/Disable The Cobalt Armors Recipes")
    public static boolean enableCobaltArmorRecipes = true;
    @ModConfigProperty(category = "Armors.ManyullynArmor.Recipes", name = "enableManyullynArmorRecipes", comment = "Enable/Disable The Manyullyn Armors Recipes")
    public static boolean enableManyullynArmorRecipes = true;
    @ModConfigProperty(category = "Armors.PigIronArmor.Recipes", name = "enablePigIronArmorRecipes", comment = "Enable/Disable The Pig Iron Armors Recipes")
    public static boolean enablePigIronArmorRecipes = true;
    @ModConfigProperty(category = "Armors.KnightSlimeArmor.Recipes", name = "enableKnightSlimeArmorRecipes", comment = "Enable/Disable The Knight Slime Armors Recipes")
    public static boolean enableKnightSlimeArmorRecipes = true;
    @ModConfigProperty(category = "Armors.ChickenArmor.Recipes", name = "enableChickenArmorRecipes", comment = "Enable/Disable The Chicken Armors Recipes")
    public static boolean enableChickenArmorRecipes = true;
    @ModConfigProperty(category = "Armors.SlimeArmor.Recipes", name = "enableSlimeArmorRecipes", comment = "Enable/Disable The Slime Armors Recipes")
    public static boolean enableSlimeArmorRecipes = true;
    @ModConfigProperty(category = "Armors.LavaArmor.Recipes", name = "enableOldLavaArmorRecipes", comment = "Enable/Disable The Old Lava Armors Recipes")
    public static boolean enableOldLavaArmorRecipes = false;
    //Items.Recipes
    @ModConfigProperty(category = "Items.Recipes", name = "enableRedstoneAppleRecipes", comment = "Enable/Disable The Redstone Apple Recipes")
    public static boolean enableRedstoneAppleRecipes = true;
    @ModConfigProperty(category = "Items.Recipes", name = "enableElytraRecipe", comment = "Enable/Disable The Elytra Recipe")
    public static boolean enableElytraRecipe = false;
    @ModConfigProperty(category = "Items.Recipes", name = "enableArrowRecipes", comment = "Enable/Disable The ArmorPlus Arrows Recipes")
    public static boolean enableArrowRecipes = true;
    //MobDrops
    @ModConfigProperty(category = "MobDrops.EnderDragon", name = "enderdragonScaleDropAmount", comment = "Set the amount of dropped Ender Dragon Scales that the Ender Dragon will drop")
    public static int enderdragonScaleDropAmount = 12;
    @ModConfigProperty(category = "MobDrops.WitherBoss", name = "witherBoneDropAmount", comment = "Set the amount of dropped Wither Bones that the Wither Boss will drop")
    public static int witherBoneDropAmount = 6;
    @ModConfigProperty(category = "MobDrops.ElderGuardian", name = "guardianScaleElderDropAmount", comment = "Set the amount of dropped Guardian Scales that the Elder Guardian will drop")
    public static int guardianScaleElderDropAmount = 6;

    public static boolean isDebugMode() {
        return debugMode;
    }
}