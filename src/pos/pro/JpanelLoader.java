package pos.pro;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * JpanelLoader - Dynamically loads and switches between JPanels using CardLayout
 */
public class JpanelLoader {
   
   /**
    * Loads a given JPanel into the main container panel using CardLayout.
    * 
    * @param Main The main container JPanel (parent panel)
    * @param setPanel The panel to be displayed
    */
   public void jPanelLoader(JPanel Main, JPanel setPanel) {
       // Check if the layout of the Main panel is CardLayout, if not, set it
       if (!(Main.getLayout() instanceof CardLayout)) {
           CardLayout layout = new CardLayout();
           Main.setLayout(layout);
       }

       // Set a name for the panel if it's not already set
       if (setPanel.getName() == null || setPanel.getName().isEmpty()) {
           setPanel.setName(setPanel.getClass().getName()); // Use class name as identifier
       }

       // Add the panel to the main container
       Main.add(setPanel, setPanel.getName());

       // Use CardLayout to show the newly added panel
       CardLayout layout = (CardLayout) Main.getLayout();
       layout.show(Main, setPanel.getName());

       // Refresh the container
       Main.revalidate();
       Main.repaint();
   }
}
