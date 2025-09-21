package Model;

public class Main {
    public static void main(String[] args) {
        Impostos i1 = new Impostos("ICMS", "IMPOSTO SOBRE CIRCULAÇÃO DE MERCADORIAS e SERVIÇOS", 0.05);
        Impostos i2 = new Impostos("IE", "IMPOSTO SOBRE EXPORTAÇÃO", 0.1);
        System.out.println(i1.toString());
        MateriaPrima mp = new MateriaPrima("Ouro", "18 quilates", 1000, "Imposto 1: "+i1);
        mp.addImposto(i1);
        System.out.println(mp.getNome());
        System.out.println(mp.getImpostos());
    }
}
