/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.enriquejavier;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author thedoc
 */
public class main extends JavaPlugin {
    
    
    @Override
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage("Javier y Enrique Inicializado correctamente");
    }
}
