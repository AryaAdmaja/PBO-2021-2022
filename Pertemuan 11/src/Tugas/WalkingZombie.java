package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (super.level == 1) {
            super.health += (super.health * 0.1);
        } else if (super.level == 2) {
            super.health += (super.health * 0.3);
        } else if (super.level == 3) {
            super.health += (super.health * 0.4);
        }
    }

    @Override
    public void destroyed() {
        health -= health * 20 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}


