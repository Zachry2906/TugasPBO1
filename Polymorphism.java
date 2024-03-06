public class Polymorphism {

    public static void main(String[] args) {
        PartyHero heroPriest = new Priest();
        PartyHero heroMagician = new Magician();
        PartyHero heroSwordmaster = new Swordmaster();
        heroPriest.getStatus();
        heroPriest.getSkill();
        heroPriest.getWeapon();
        System.out.println();
        heroMagician.getStatus();
        heroMagician.getSkill();
        heroMagician.getWeapon();
        System.out.println();
        heroSwordmaster.getStatus();
        heroSwordmaster.getSkill();
        heroSwordmaster.getWeapon();
        System.out.println();
        ((Swordmaster) heroSwordmaster).activateBerserk();
        ((Magician) heroMagician).activateFireball(heroMagician);
        ((Priest) heroPriest).activateHeal(heroMagician);
        heroMagician.getStatus();
    }
}