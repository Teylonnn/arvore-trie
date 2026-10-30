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

public class Main{
    public static void main(String[] args){

    }
}