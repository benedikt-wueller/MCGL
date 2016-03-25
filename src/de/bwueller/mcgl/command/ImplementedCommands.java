package de.bwueller.mcgl.command;

import de.bwueller.mcgl.coordinate.*;
import de.bwueller.mcgl.entity.*;
import de.bwueller.mcgl.nbt.*;
import de.bwueller.mcgl.nbt.text.NBTText;

/**
 * Implemented methods
 */
public interface ImplementedCommands {
    
    public abstract void giveAchievement(Entities players, String achievement, boolean ifPrevious);
    public abstract void takeAchievement(Entities players, String achievement, boolean ifPrevious);
    public abstract void setBlockData(Coordinates coordinates, NBTObject NBT, boolean ifPrevious);
    public abstract void setEntityData(Entities entities, NBTObject NBT, boolean ifPrevious);
    public abstract void setBlockStat(Coordinates location, String stat, Entities targets, String objective, boolean ifPrevious);
    public abstract void setEntityStat(Entities entities, String stat, Entities targets, String objective, boolean ifPrevious);
    public abstract void clearBlockStat(Coordinates location, String stat, boolean ifPrevious);
    public abstract void clearEntityStat(Entities entities, String stat, boolean ifPrevious);
    public abstract void clearInventory(Entities players, boolean ifPrevious);
    public abstract void clearItemFromInventory(Entities players, String item, int dataValue, int damount, NBTObject NBT, boolean ifPrevious);
    public abstract void giveItem(Entities players, String item, int amount, int dataValue, NBTObject NBT, boolean ifPrevious);
    public abstract void replaceBlockItem(Coordinates location, String slot, String item, int amount, int dataValue, NBTObject NBT, boolean ifPrevious);
    public abstract void replaceEntityItem(Entities entities, String slot, String item, int amount, int dataValue, NBTObject NBT, boolean ifPrevious);
    public abstract void setDefaultGamemode(String gamemode, boolean ifPrevious);
    public abstract void setGamemode(Entities players, String gamemode, boolean ifPrevious);
    public abstract void setDifficulty(String difficulty, boolean ifPrevious);
    public abstract void setGamerule(String gamerule, Object value, boolean ifPrevious);
    public abstract void giveEffect(Entities entities, String effect, int duration, int amplifier, boolean hideParticles, boolean ifPrevious);
    public abstract void takeEffect(Entities entities, String effect, boolean ifPrevious);
    public abstract void clearEffects(Entities entities, boolean ifPrevious);
    public abstract void enchant(Entities players, String enchantment, int level, boolean ifPrevious);
    public abstract void cloneArea(Area source, Coordinates target, String mask, String mode, String block, boolean ifPrevious);
    public abstract void fillArea(Area area, String block, int dataValue, String mode, NBTObject NBT, boolean ifPrevious);
    public abstract void replaceArea(Area area, String block, int dataValue, String replaceWith, int replaceWithDataValue, boolean ifPrevious);
    public abstract void setBlock(Coordinates location, String block, int dataValue, String mode, NBTObject NBT, boolean ifPrevious);
    public abstract void kill(Entities entities, NBTObject NBT, boolean ifPrevious);
    public abstract void sendStatusMessage(String message, boolean ifPrevious);
    public abstract void sendChatMessage(String message, boolean ifPrevious);
    public abstract void sendPrivateMessage(Entities players, String message, boolean ifPrevious);
    public abstract void sendRawChatMessage(Entities players, NBTText message, boolean ifPrevious);
    public abstract void showParticles(String particle, Coordinates location, AbsoluteCoordinates distance, double speed, int count, String mode, Entities players, String parameters, boolean ifPrevious);
    public abstract void playSound(String sound, String source, Entities players, Coordinates location, double volume, double pitch, double minimumVolume, boolean ifPrevious);
    public abstract void setGlobalSpawn(Coordinates location, boolean ifPrevious);
    public abstract void setSpawnPoint(Entities players, Coordinates location, boolean ifPrevious);
    public abstract void spreadEntities(Entities entities, Coordinates center, double targetDistance, double range, boolean respectTeams, boolean ifPrevious);
    public abstract void summonEntity(EntityType type, Coordinates location, NBTObject NBT, boolean ifPrevious);
    public abstract void testForEntity(Entities entities, NBTObject NBT, boolean ifPrevious);
    public abstract void testForBlock(Coordinates location, String block, int dataValue, NBTObject NBT, boolean ifPrevious);
    public abstract void testForBlocks(Area source, Coordinates target, String mode, boolean ifPrevious);
    public abstract void setTime(int value, boolean ifPrevious);
    public abstract void addTime(int value, boolean ifPrevious);
    public abstract void queryTime(String value, boolean ifPrevious);
    public abstract void toggleDownfall(boolean ifPrevious);
    public abstract void teleportToLocation(Entities entities, Coordinates target, Rotation rotation, boolean ifPrevious);
    public abstract void teleportToEntity(Entities entities, Entities target, boolean ifPrevious);
    public abstract void addToTrigger(String objective, int value, boolean ifPrevious);
    public abstract void setTrigger(String objective, int value, boolean ifPrevious);
    public abstract void setWeather(String weather, int duration, boolean ifPrevious);
    public abstract void addExperience(Entities players, int amount, boolean ifPrevious);
    public abstract void addExperienceLevels(Entities players, int amount, boolean ifPrevious);
    public abstract void removeExperience(Entities players, boolean ifPrevious);
    public abstract void increaseWorldBorder(int distance, int time, boolean ifPrevious);
    public abstract void setWorldBorder(int distance, int time, boolean ifPrevious);
    public abstract void setWorldBorderCenter(Coordinates center, boolean ifPrevious);
    public abstract void setWorldBorderDamageRate(int damagePerBlock, boolean ifPrevious);
    public abstract void setWorldBorderDamageBuffer(int distance, boolean ifPrevious);
    public abstract void setWorldBorderWarningDistance(int distance, boolean ifPrevious);
    public abstract void setWorldBorderWarningTime(int time, boolean ifPrevious);
    public abstract void clearTitle(Entities players, boolean ifPrevious);
    public abstract void resetTitle(Entities players, boolean ifPrevious);
    public abstract void setTitleTimes(Entities players, int fadeIn, int show, int fadeOut, boolean ifPrevious);
    public abstract void setSubtitle(Entities players, NBTText title, boolean ifPrevious);
    public abstract void showTitle(Entities players, NBTText title, boolean ifPrevious);
    public abstract void addScoreboardObjective(String objective, String criteria, String displayName, boolean ifPrevious);
    public abstract void removeScoreboardObjective(String objective, boolean ifPrevious);
    public abstract void showScoreboardObjective(String objective, String slot, boolean ifPrevious);
    public abstract void hideScoreboard(String slot, boolean ifPrevious);
    public abstract void setScore(Entities entities, String objective, int score, NBTObject NBT, boolean ifPrevious);
    public abstract void addToScore(Entities entities, String objective, int amount, NBTObject NBT, boolean ifPrevious);
    public abstract void removeFromScore(Entities entities, String objective, int amount, NBTObject NBT, boolean ifPrevious);
    public abstract void resetScore(Entities entities, String objective, boolean ifPrevious);
    public abstract void enableTrigger(Entities players, String trigger, boolean ifPrevious);
    public abstract void testForScore(Entities entities, String objective, int min, int max, boolean ifPrevious);
    public abstract void modifyScore(Entities target, String targetObjective, String operation, Entities sourceEntities, String sourceObjective, boolean ifPrevious);
    public abstract void addTeam(String name, String displayName, boolean ifPrevious);
    public abstract void removeTeam(String team, boolean ifPrevious);
    public abstract void emptyTeam(String team, boolean ifPrevious);
    public abstract void addEntityToTeam(Entities entities, String team, boolean ifPrevious);
    public abstract void removeEntityFromTeam(Entities entities, String team, boolean ifPrevious);
    public abstract void removeEntityFromAllTeams(Entities entities, boolean ifPrevious);
    public abstract void setTeamOption(String team, String option, String value, boolean ifPrevious);
    public abstract void addTag(Entities entities, String tag, NBTObject NBT, boolean ifPrevious);
    public abstract void removeTag(Entities entities, String tag, NBTObject NBT, boolean ifPrevious);
}