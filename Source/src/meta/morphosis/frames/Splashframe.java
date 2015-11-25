package meta.morphosis.frames;
import javax.swing.*;




public class Splashframe{
    public static void main(String[] args) {
        JWindow window = new JWindow();
        //Image duduk = new ImageIcon(this.getClass().getResouce("/splash.gif")).getImage();
        window.getContentPane().add(
                new JLabel("", new ImageIcon(Frame1.class.getResource("/meta/morphosis/img/SSE_logo.gif")), SwingConstants.CENTER));
        window.setBounds(500, 150, 402, 302);
        window.setVisible(true);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        window.setVisible(false);
        /*JFrame frame = new JFrame();
        frame.add(new JLabel("Welcome"));
        frame.setVisible(true);
        frame.setSize(300,100); */
        
        window.dispose();
        Frame1.main(null);
    }


}
