public class Priest extends PartyHero{
    String att1 = "Holy Damage";

    public Priest() {
        super("Hector", 21, 150, 50, 150, "Priest", 100);
        setAdditionalDamage(50);
        setWeapon("Holy Griamore", 100);
        setSkill("Heal", "Memberikan 50 HP dan Mana kepada target");
    }

    public void activateHeal(PartyHero heroMagician ){
        heroMagician.health += 50;
        heroMagician.mana += 50;
        System.out.println("Heal diaktifkan kepada " + heroMagician.classType + "," + heroMagician.name + " mendapatkan tambahan HP dan Mana sebesar 50");
    }
}