import java.util.HashMap;
import java.util.Map;

class NoDaTrie{
    private Map<Character, NoDaTrie> noTabelaHash;
    public NoDaTrie(){
        setNoTabelaHash(new HashMap<>());
    }

    public Map<Character, NoDaTrie> getNoTabelaHash() {
        return noTabelaHash;
    }

    public void setNoTabelaHash(Map<Character, NoDaTrie> noTabelaHash) {
        this.noTabelaHash = noTabelaHash;
    }
}

class Trie{
    private NoDaTrie raiz;
    public Trie(){
        setRaiz(new NoDaTrie());
    }

    public NoDaTrie busca(String palavra){
        NoDaTrie noAtual = getRaiz();

        for(Character letra : palavra.toCharArray()){
            if(noAtual.getNoTabelaHash().containsKey(letra)){
                noAtual = noAtual.getNoTabelaHash().get(letra);
            }
            else{
                return null;
            }
        }

        return noAtual;
    }

    public NoDaTrie getRaiz() {
        return raiz;
    }

    public void setRaiz(NoDaTrie raiz) {
        this.raiz = raiz;
    }
}

public class Main{
    public static void main(String[] args){

    }
}