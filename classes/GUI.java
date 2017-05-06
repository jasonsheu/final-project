
import javax.swing.*;

/**
 *
 * @author jason
 * basic frame and stuff
 */
public class GUI 
{
    private JFrame frame;
    public GUI()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make fullscreen
        frame.setTitle("");
        frame.setUndecorated(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        
        
        
        frame.setVisible(true);
    }
}
