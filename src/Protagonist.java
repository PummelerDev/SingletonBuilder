import java.util.Objects;

public class Protagonist {
    private String characterName = "value";
    private int level = 0;
    private int hp = 0;
    private int ap = 0;
    private int xp = 0;
    private int weight = 0;
    private int strength = 0;
    private int perception = 0;
    private int endurance = 0;
    private int charisma = 0;
    private int intelligence = 0;
    private int agility = 0;
    private int luck = 0;
    private int barter = 0;
    private int bigGuns = 0;
    private int energyWeapons = 0;
    private int explosives = 0;
    private int lockpick = 0;
    private int medicine = 0;
    private int meleeWeapons = 0;
    private int repair = 0;
    private int science = 0;
    private int smallGuns = 0;
    private int sneak = 0;
    private int speech = 0;
    private int unarmed = 0;
    private int skillPoints = 0;
    private int pointsRemaining = 0;

    public static class Builder {
        private static Protagonist protagonist;

        public Builder(String characterName) {
            if (protagonist != null) {
                return;
            }
            protagonist = new Protagonist();
            protagonist.setCharacterName(characterName);
           }

        public Protagonist build() {
            return protagonist;
        }

        public Builder withLevel(int level) {
            protagonist.setLevel(level);
            return this;
        }

        public Builder withHp(int hp) {
            protagonist.setHp(hp);
            return this;
        }

        public Builder withAp(int ap) {
            protagonist.setAp(ap);
            return this;
        }

        public Builder withXp(int xp) {
            protagonist.setXp(xp);
            return this;
        }

        public Builder withWeight(int weight) {
            protagonist.setWeight(weight);
            return this;
        }

        public Builder withStrength(int strength) {
            protagonist.setStrength(strength);
            return this;
        }

        public Builder withPerception(int perception) {
            protagonist.setPerception(perception);
            return this;
        }

        public Builder withEndurance(int endurance) {
            protagonist.setEndurance(endurance);
            return this;
        }

        public Builder withCharisma(int charisma) {
            protagonist.setCharisma(charisma);
            return this;
        }

        public Builder withIntelligence(int intelligence) {
            protagonist.setIntelligence(intelligence);
            return this;
        }

        public Builder withAgility(int agility) {
            protagonist.setAgility(agility);
            return this;
        }

        public Builder withLuck(int luck) {
            protagonist.setLuck(luck);
            return this;
        }

        public Builder withBarter(int barter) {
            protagonist.setBarter(barter);
            return this;
        }

        public Builder withBigGuns(int bigGuns) {
            protagonist.setBigGuns(bigGuns);
            return this;
        }

        public Builder withEnergyWeapons(int energyWeapons) {
            protagonist.setEnergyWeapons(energyWeapons);
            return this;
        }

        public Builder withExplosives(int explosives) {
            protagonist.setExplosives(explosives);
            return this;
        }

        public Builder withLockpick(int lockpick) {
            protagonist.setLockpick(lockpick);
            return this;
        }

        public Builder withMedicine(int medicine) {
            protagonist.setMedicine(medicine);
            return this;
        }

        public Builder withMeleeWeapons(int meleeWeapons) {
            protagonist.setMeleeWeapons(meleeWeapons);
            return this;
        }

        public Builder withRepair(int repair) {
            protagonist.setRepair(repair);
            return this;
        }

        public Builder withScience(int science) {
            protagonist.setScience(science);
            return this;
        }

        public Builder withSmallGuns(int smallGuns) {
            protagonist.setSmallGuns(smallGuns);
            return this;
        }

        public Builder withSneak(int sneak) {
            protagonist.setSneak(sneak);
            return this;
        }

        public Builder withSpeech(int speech) {
            protagonist.setSpeech(speech);
            return this;
        }

        public Builder withUnarmed(int unarmed) {
            protagonist.setUnarmed(unarmed);
            return this;
        }

        public Builder withSkillPoints(int skillPoints) {
            protagonist.setSkillPoints(skillPoints);
            return this;
        }

        public Builder withPointsRemaining(int pointsRemaining) {
            protagonist.setPointsRemaining(pointsRemaining);
            return this;
        }
    }

    private Protagonist() {
    }

    public String getCharacterName() {
        return characterName;
    }

    private void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getBarter() {
        return barter;
    }

    public void setBarter(int barter) {
        this.barter = barter;
    }

    public int getBigGuns() {
        return bigGuns;
    }

    public void setBigGuns(int bigGuns) {
        this.bigGuns = bigGuns;
    }

    public int getEnergyWeapons() {
        return energyWeapons;
    }

    public void setEnergyWeapons(int energyWeapons) {
        this.energyWeapons = energyWeapons;
    }

    public int getExplosives() {
        return explosives;
    }

    public void setExplosives(int explosives) {
        this.explosives = explosives;
    }

    public int getLockpick() {
        return lockpick;
    }

    public void setLockpick(int lockpick) {
        this.lockpick = lockpick;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getMeleeWeapons() {
        return meleeWeapons;
    }

    public void setMeleeWeapons(int meleeWeapons) {
        this.meleeWeapons = meleeWeapons;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSmallGuns() {
        return smallGuns;
    }

    public void setSmallGuns(int smallGuns) {
        this.smallGuns = smallGuns;
    }

    public int getSneak() {
        return sneak;
    }

    public void setSneak(int sneak) {
        this.sneak = sneak;
    }

    public int getSpeech() {
        return speech;
    }

    public void setSpeech(int speech) {
        this.speech = speech;
    }

    public int getUnarmed() {
        return unarmed;
    }

    public void setUnarmed(int unarmed) {
        this.unarmed = unarmed;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getPointsRemaining() {
        return pointsRemaining;
    }

    public void setPointsRemaining(int pointsRemaining) {
        this.pointsRemaining = pointsRemaining;
    }

    @Override
    public String toString() {
        return "Protagonist{" + "characterName='" + characterName + '\'' + ", level='" + level + '\'' + ", hp='" + hp + '\'' + ", ap='" + ap + '\'' + ", xp='" + xp + '\'' + ", weight='" + weight + '\'' + ", strength='" + strength + '\'' + ", perception='" + perception + '\'' + ", endurance='" + endurance + '\'' + ", charisma='" + charisma + '\'' + ", intelligence='" + intelligence + '\'' + ", agility='" + agility + '\'' + ", luck='" + luck + '\'' + ", barter='" + barter + '\'' + ", bigGuns='" + bigGuns + '\'' + ", energyWeapons='" + energyWeapons + '\'' + ", explosives='" + explosives + '\'' + ", lockpick='" + lockpick + '\'' + ", medicine='" + medicine + '\'' + ", meleeWeapons='" + meleeWeapons + '\'' + ", repair='" + repair + '\'' + ", science='" + science + '\'' + ", smallGuns='" + smallGuns + '\'' + ", sneak='" + sneak + '\'' + ", speech='" + speech + '\'' + ", unarmed='" + unarmed + '\'' + ", skillPoints='" + skillPoints + '\'' + ", pointsRemaining='" + pointsRemaining + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Protagonist that = (Protagonist) o;
        return Objects.equals(characterName, that.characterName) && Objects.equals(level, that.level) && Objects.equals(hp, that.hp) && Objects.equals(ap, that.ap) && Objects.equals(xp, that.xp) && Objects.equals(weight, that.weight) && Objects.equals(strength, that.strength) && Objects.equals(perception, that.perception) && Objects.equals(endurance, that.endurance) && Objects.equals(charisma, that.charisma) && Objects.equals(intelligence, that.intelligence) && Objects.equals(agility, that.agility) && Objects.equals(luck, that.luck) && Objects.equals(barter, that.barter) && Objects.equals(bigGuns, that.bigGuns) && Objects.equals(energyWeapons, that.energyWeapons) && Objects.equals(explosives, that.explosives) && Objects.equals(lockpick, that.lockpick) && Objects.equals(medicine, that.medicine) && Objects.equals(meleeWeapons, that.meleeWeapons) && Objects.equals(repair, that.repair) && Objects.equals(science, that.science) && Objects.equals(smallGuns, that.smallGuns) && Objects.equals(sneak, that.sneak) && Objects.equals(speech, that.speech) && Objects.equals(unarmed, that.unarmed) && Objects.equals(skillPoints, that.skillPoints) && Objects.equals(pointsRemaining, that.pointsRemaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterName, level, hp, ap, xp, weight, strength, perception, endurance, charisma, intelligence, agility, luck, barter, bigGuns, energyWeapons, explosives, lockpick, medicine, meleeWeapons, repair, science, smallGuns, sneak, speech, unarmed, skillPoints, pointsRemaining);
    }
}