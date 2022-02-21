import javax.swing.JFrame;

public class HelloSwing2 extends JFrame {
    public HelloSwing2(){
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new HelloSwing2().setAlwaysOnTop(true);
    }
    
}
