package Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        if (super.level == 1) {
            super.health += (super.health * 0.3);
        } else if (super.level == 2) {
            super.health += (super.health * 0.4);
        } else if (super.level == 3) {
            super.health += (super.health * 0.5);
        }

    }
    @Override
    public void destroyed() {
        health -= health * 10 / 100;
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}

