package de.rembel.autototem.Listeners;

import org.bukkit.Material;
import org.bukkit.block.ShulkerBox;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(EntityResurrectEvent event){
        if(event.getHand() == EquipmentSlot.OFF_HAND){
            Player player = (Player) event.getEntity();
            Inventory inv = player.getInventory();
            System.out.println("debug");
            for(int i = 0;i<39;i++){
                System.out.println(i);
                if(inv.getItem(i) != null){
                    if(inv.getItem(i).getType() == Material.TOTEM_OF_UNDYING){
                        inv.setItem(i,null);
                        inv.setItem(40, new ItemStack(Material.TOTEM_OF_UNDYING));
                        break;
                    }
                }
            }
        }
    }
}
