public class Swordmaster extends PartyHero{
    String att1 = "Physical Damage";

    public Swordmaster() {
        super("Bakri", 30, 200, 100, 200, "Swordmaster", 0);
        setAdditionalDamage(150);
        setWeapon("Excalibur", 100);
        setSkill("Berseker", "Meningkatkan serangan sebesar 50% selama 5 menit");
    }

    void activateBerserk(){
        attack += (attack * 0.5);
        System.out.println("Berserk diaktifkan, serangan menjadi " + attack + " selama 5 menit");
    }
}
