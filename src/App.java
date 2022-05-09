public class App {
    public static void main(String[] args) throws Exception {
        Car porsche = new Car();
        Car holden = new Car();
        
        porsche.setModel("Carrera");
        System.out.println("Car model is "+porsche.getModel());
    }
}
