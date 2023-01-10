public class App {
    public static void main(String[] args) throws Exception {
        Calculator_View calGUI = new Calculator_View();
        Calculator_Model calModel = new Calculator_Model();

        new Calculator_Controller(calModel, calGUI);
    }
}
