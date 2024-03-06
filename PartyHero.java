public class PartyHero {
    protected String name;
    protected int level;
    protected int health;
    protected int attack;
    protected int defense;
    protected String classType;
    protected int mana;
    private String skillName;
    private String skillDesc;
    private String weapon;

    public PartyHero(String name, int level, int health, int attack, int defense, String classType, int mana) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.classType = classType;
        this.mana = mana;
    }

    protected int setAdditionalDamage(int att2){
        return attack += att2;
    }

    protected String setSkill(String skill, String Desc){
        skillName = skill;
        skillDesc = Desc;
        return skillName + " : " + skillDesc;
    }

    void getStatus(){
        System.out.println("Name : " + name);
        System.out.println("Level : " + level);
        System.out.println("Health : " + health);
        System.out.println("Attack : " + attack);
        System.out.println("Defense : " + defense);
        System.out.println("Class : " + classType);
        System.out.println("Mana : " + mana);
    }

    void getSkill(){
        System.out.println("Skill : " + skillName + " : " + skillDesc);
    }

    void setWeapon(String weapon, int att3){
        attack += att3;
        this.weapon = weapon;
    }

    void getWeapon(){
        System.out.println("Weapon : " + weapon);
    }
}
