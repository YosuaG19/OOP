package Asg_5;

public abstract class Mob implements IAttack, IDamageable{
    String nama;
    HP hp;
    int attack;
    int def;

    public Mob(String nama, HP hp, int attack, int def){
        this.nama = nama;
        this.hp = hp;
        this.attack = attack;
        this.def = def;
    }

    public String getNama() {
        return nama;
    }

    public int getHP(){
        return this.hp.getPoint();
    }

    public int getDef(){
        return this.def;
    }
    
    void showHP(){
        System.out.println(this.nama + " current HP is " + this.hp.getPoint());
    }

    void updateHP(int damage){
        this.hp = new HP(this.hp.getPoint() - damage);
    }

    @Override
    public void attack(IDamageable damageable) {
        // TODO Auto-generated method stub
        int damage = damageable.takeDamage(attack, ((Enemy) damageable).getDef());
        System.out.println(this.nama + " attacking " + ((Enemy) damageable).getNama());
        System.out.println(((Enemy) damageable).getNama() + " is taking damage for " + damage + " point(s)");
        ((Enemy) damageable).updateHP(damage);
    }

    @Override
    public int takeDamage(int damage, int defense) {
        damage = damage <= defense ? 0 : damage - defense;
        return damage;
    }

}
