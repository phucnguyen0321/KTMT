import jdepend.xmlui.JDepend;
import java.io.PrintWriter;

public class Swing_UI_Main {
    public static void main(String[] args)throws Exception {
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\NguyenTrongPhuc\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
