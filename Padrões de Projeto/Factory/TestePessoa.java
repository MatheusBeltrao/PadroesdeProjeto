public class TestePessoa {
    public static void main(String[] args) {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("Matheus", "M");
        factory.getPessoa("Yasmin", "F");
    }
}
