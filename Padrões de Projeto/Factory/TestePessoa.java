public class TestePessoa {
    public static void main(String[] args) {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("Guilherme", "M");
        factory.getPessoa("Thaís", "F");
    }
}