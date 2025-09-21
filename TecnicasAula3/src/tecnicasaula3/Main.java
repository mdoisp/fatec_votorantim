package tecnicasaula3;

public class Main {

    public static void main(String[] args) {
        Pessoa maeDoJoao = new Pessoa("Maria", "CPF", 'F', "telefone");
        Pessoa paiDoJoao = new Pessoa("José", "CPF", 'M', "telefone");
        Pessoa Joao = new Pessoa("João", "CPF", 'M', "telefone", maeDoJoao, paiDoJoao);
        Pessoa irmaoJoao = new Pessoa("Jorel", "CPF", 'M', "telefone", maeDoJoao, paiDoJoao);
        System.out.println("João Dos Santos");
        System.out.println("Nome: "+ Joao.getNome());
        System.out.println("Mãe: "+ Joao.getMae().getNome());
        System.out.println("Pai: "+ Joao.getPai().getNome());
        System.out.println("CPF do josé: "+ Joao.getPai().getCPF());
        //maeDoJoao.addFilho(Joao);
        //maeDoJoao.addFilho(irmaoJoao);
        Joao.addIrmaos(irmaoJoao);
        irmaoJoao.addIrmaos(Joao);
        System.out.println("Irmão do João: "+ Joao.getMae().getListaFilhos()[1].getNome());
        System.out.println("Os filhos de Maria são: "+ maeDoJoao.retornaListaFilhos(maeDoJoao));
        System.out.println("Os irmãos de João são: "+ Joao.retornaListaIrmaos(Joao));
    }
    
}
