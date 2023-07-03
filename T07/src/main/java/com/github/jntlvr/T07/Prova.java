package T07.src.main.java.com.github.jntlvr.T07;

public class Prova {
    private byte qtdQuestoes;

    public byte getQtdQuestoes(){
        return qtdQuestoes;
    }

    public void setQtdQuestoes(byte n){
        if(n>0){
            qtdQuestoes = n;
        }
    }
}
