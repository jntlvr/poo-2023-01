public class Pessoa {
    private Data nascimento;
    private String nome;
    private Pessoa pai;
    private Pessoa mae;
}


public class Prova {
    private byte numQuestoes;
    
    public byte getNumQuestoes() {
        return numQuestoes;
    }
    public void setNumQuestoes(byte n) {
        if (n>0) {
            numQuestoes=n;
        }
    }
}



public class Livro extends Object {
    
}

public class TesteProva {
    public static void main(String[] args) {
        Prova pf = new Prova();
    }
}

public class Casa {
    public Casa() {
        System.out.print("Mais uma Casa.");
    }
    
    public static void main(String[] args) {
        Casa c = new Casa();
    }
}

Public abstract class Pessoa {}



import java.util.TreeSet;

public class Festa {
    private TreeSet convidados = new TreeSet();
    
	public void novoConvidado(Convidado c) {
	    convidados.add(c);
	}
	
	public Festa(Convidado c) {
	    convidados.add(c);
	}
}



public class Uniao {
    private ArrayList filhos;
    private Pessoa parceiros[2];
    
    public void novoFilho(Pessoa p){
        filhos.add(p);
    }
    
    public Uniao(Pessoa a, Pessoa b) {
        parceiros[0]=a;
        parceiros[1]=b;
    }
}


public class Aluno {
    private Curso[] cursos;
}


public class Curso {
    private Aluno[] alunos;
}


public class TestaSomaNaturais {
    public static long SomaNaturais(int n) {
        int c=1;
        long s=0;
        while (c<=n) {
            s=s+c;
            c=c+1;
        }
    }
    public static void main(String[] args) {
        System.out.println(SomaNaturais(10));
    }
}


public class Permuta {
    public static void Permutacao(String p, String S) {
        if (S.length()==1) {
            System.out.println(p+S);
        } else {
            String Slinha;
            String pLinha;
            
            for (int i=0; i<S.length(); i++) {
                SLinha=S.substring(0,i) + S.substring(i+1);
                pLinha = p + S.charAt(i);
                Permutacao(pLinha,Slinha);
            }
        }
    }
    public static void main (String[] args) {
        Permutacao(new string(), args[0]);
    }
}



public class Religiao {
    private ArrayList devotos;
    
    public void novoFiel(Devoto d) {
        devotos.add(d);
    }
}

public class Devoto {
    public Devoto(Religiao r) {
        r.novoFiel(this);
    }
}

public class Aluno extends Pessoa {}

public class Referencia {
}

class Revista extends Referencia {
}

class Prova implements Identificacao {
    String getNome();
}

package escola;
import ensino.Disciplina;

public class Matricula {
    private Disciplina disciplina;
}











