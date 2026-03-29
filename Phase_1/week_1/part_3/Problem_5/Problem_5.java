package Phase_1.week_1.part_3.Problem_5;
import java.util.*;
public class Problem_5 {
    public static void main(String[] args) {

        PluginManager manager = new PluginManager();

        // Register plugins
        manager.registerPlugin(new LogPlugin());
        manager.registerPlugin(new CachePlugin());
        manager.registerPlugin(new AuthPlugin());

        // Run all plugins
        manager.runAll();
    }
}

// Plugin interface (CONTRACT)
interface Plugin {
    void execute();

    String getName();
}


// Log Plugin
class LogPlugin implements Plugin {

    public void execute() {
        System.out.println("Logging system events...");
    }

    public String getName() {
        return "LogPlugin";
    }
}


// Cache Plugin
class CachePlugin implements Plugin {

    public void execute() {
        System.out.println("Caching data for faster access...");
    }

    public String getName() {
        return "CachePlugin";
    }
}


// Auth Plugin
class AuthPlugin implements Plugin {

    public void execute() {
        System.out.println("Authenticating user...");
    }

    public String getName() {
        return "AuthPlugin";
    }
}


// Plugin Manager
class PluginManager {

    private List<Plugin> plugins = new ArrayList<>();

    // Register plugin
    public void registerPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    // Run all plugins
    public void runAll() {
        for (Plugin plugin : plugins) {
            System.out.println("Running: " + plugin.getName());
            plugin.execute();
            System.out.println("------------------");
        }
    }
}