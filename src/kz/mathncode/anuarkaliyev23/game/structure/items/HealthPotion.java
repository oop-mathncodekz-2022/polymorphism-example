package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

public class HealthPotion extends Item {
    public HealthPotion(int price) {
        super(price);
    }

    @Override
    public void effect(Player player) {
        player.setHealthPoints(player.getMaxHealthPoints());
    }
}
