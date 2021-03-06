/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.items.base;

import com.google.common.collect.Sets;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.armorplus.ARPConfig;
import net.thedragonteam.armorplus.ArmorPlus;
import net.thedragonteam.armorplus.items.BattleAxes;

import java.util.List;
import java.util.Set;

import static net.thedragonteam.thedragonlib.util.TextHelper.localize;

public class BaseBattleAxe extends ItemSword {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

    public Item itemEasy;
    public Item itemExpert;
    public TextFormatting formatting;
    public String effect;
    public BattleAxes battleAxes;
    public float efficiency;

    public static Item.ToolMaterial battleAxeCoalMaterial = EnumHelper.addToolMaterial("battleAxeCoalMaterial", 1, ARPConfig.coalBattleAxeDurability, 1.0F, (float) ARPConfig.coalBattleAxeDamage, 15);
    public static Item.ToolMaterial battleAxeLapisMaterial = EnumHelper.addToolMaterial("battleAxeLapisMaterial", 1, ARPConfig.lapisBattleAxeDurability, 1.0F, (float) ARPConfig.lapisBattleAxeDamage, 30);
    public static Item.ToolMaterial battleAxeRedstoneMaterial = EnumHelper.addToolMaterial("battleAxeRedstoneMaterial", 1, ARPConfig.redstoneBattleAxeDurability, 1.0F, (float) ARPConfig.redstoneBattleAxeDamage, 20);
    public static Item.ToolMaterial battleAxeEmeraldMaterial = EnumHelper.addToolMaterial("battleAxeEmeraldMaterial", 1, ARPConfig.emeraldBattleAxeDurability, 1.0F, (float) ARPConfig.emeraldBattleAxeDamage, 20);
    public static Item.ToolMaterial battleAxeObsidianMaterial = EnumHelper.addToolMaterial("battleAxeObsidianMaterial", 1, ARPConfig.obsidianBattleAxeDurability, 1.0F, (float) ARPConfig.obsidianBattleAxeDamage, 20);
    public static Item.ToolMaterial battleAxeLavaMaterial = EnumHelper.addToolMaterial("battleAxeLavaMaterial", 1, ARPConfig.lavaBattleAxeDurability, 1.0F, (float) ARPConfig.lavaBattleAxeDamage, 20);
    public static Item.ToolMaterial battleAxeGuardianMaterial = EnumHelper.addToolMaterial("battleAxeGuardianMaterial", 1, ARPConfig.guardianBattleAxeDurability, 1.0F, (float) ARPConfig.guardianBattleAxeDamage, 30);
    public static Item.ToolMaterial battleAxeSuperStarMaterial = EnumHelper.addToolMaterial("battleAxeSuperStarMaterial", 1, ARPConfig.superStarBattleAxeDurability, 1.0F, (float) ARPConfig.superStarBattleAxeDamage, 20);
    public static Item.ToolMaterial battleAxeEnderDragonMaterial = EnumHelper.addToolMaterial("battleAxeEnderDragonMaterial", 1, ARPConfig.enderDragonBattleAxeDurability, 1.0F, (float) ARPConfig.enderDragonBattleAxeDamage, 20);

    public BaseBattleAxe(BattleAxes battleAxes) {
        super(battleAxes.getToolMaterial());
        this.battleAxes = battleAxes;
        this.itemEasy = battleAxes.getRepairEasy();
        this.itemExpert = battleAxes.getRepairExpert();
        this.formatting = battleAxes.getTextFormatting();
        this.effect = battleAxes.getEffect();
        this.efficiency = battleAxes.getEfficiency();
        setRegistryName(battleAxes.getName());
        setUnlocalizedName(ArmorPlus.MODID + "." + battleAxes.getName());
        GameRegistry.register(this);
        this.setCreativeTab(ArmorPlus.tabArmorplusWeapons);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : battleAxes.getEfficiency();
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        switch (battleAxes) {
            case COAL:
                target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 180, 0, false, true));
                break;
            case LAPIS:
                target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 120, 1, false, true));
                break;
            case REDSTONE:
                target.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 1, false, true));
                break;
            case EMERALD:
                target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 120, 1, false, true));
                break;
            case OBSIDIAN:
                target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 120, 1, false, true));
                break;
            case LAVA:
                target.setFire(8);
                break;
            case GUARDIAN:
                target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 120, 1, false, true));
                break;
            case SUPER_STAR:
                target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 120, 1, false, true));
                break;
            case ENDER_DRAGON:
                target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 60, 3, false, true));
                break;
        }
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        if (GameSettings.isKeyDown(keyBindSneak)) {
            tooltip.add("\2479Ability: " + "\247r" + effect);
            tooltip.add("\2473Use: " + "\247rHit a Target");
        } else
            tooltip.add(I18n.format("tooltip.tesla.showinfo", formatting, keyBindSneak.getDisplayName(), ChatFormatting.GRAY));
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (formatting + localize(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        switch (ARPConfig.recipes) {
            case 0:
                return repair.getItem() == itemEasy;
            case 1:
                return repair.getItem() == itemExpert;
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
