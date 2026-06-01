public class Principal {
    public static void main(String[] args) {
        Personal obj = new Personal("Matheus","12345678");
        System.out.println(obj);
        System.out.println("Salario: "+obj.calcularSalario());
    }
}
