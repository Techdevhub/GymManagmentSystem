
package TrayBar;
//Aman Project

import java.awt.*;
import java.net.URL;
import javax.swing.ImageIcon;


public class DisplayTrayIcon {
    
    static TrayIcon trayIcon;
    
    public DisplayTrayIcon()
    {
        showTrayIcon();
    }

    public static void showTrayIcon() {
        if(!SystemTray.isSupported())
        {
            System.out.println("Error");
            System.exit(0);
        }
        
        final PopupMenu popup = new PopupMenu();
        trayIcon= new TrayIcon(createIcon("trayIcon.png","Tray Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        
        trayIcon.setToolTip("Version 1.0 \nGym Managment software \nCreated By Aman");
        
        //add componant in menuItem
        MenuItem About = new MenuItem("About");
        MenuItem Exit = new MenuItem("Exit");
        
        //add popup menu
        popup.add(About);
        popup.addSeparator();
        popup.add(Exit);
        
        trayIcon.setPopupMenu(popup);
        
        try
        {
            tray.add(trayIcon);
        }
        catch(AWTException e)
        {
            
        }
    }
    
    protected static Image createIcon(String path, String desc)
    {
        URL ImageURL = DisplayTrayIcon.class.getResource(path);
        return(new ImageIcon(ImageURL, desc)).getImage();
    }
}
