public class Magician extends PartyHero{
    String att1 = "Magic Damage";

    public Magician() {
        super("Merlin", 24, 100, 70, 50, "Magician", 200);
        setAdditionalDamage(200);
        setWeapon("Staff of Tempest", 120);
        setSkill("Fireball", "Menggunakan 100 mana dan Memberikan 100 Magic Damage + stat attack magican kepada musuh");
    }

    void activateFireball(PartyHero heroMagician){
        int dmg = heroMagician.attack + 100;
        heroMagician.mana -= 100;
        System.out.println("Fireball diaktifkan, demon king mendapatkan kerusakan sebesar " + dmg);
    }
}