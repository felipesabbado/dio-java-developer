package pilha;

public class Pilha {

    private No refNoEntradaPilha = null;

    public void push(Object dado) {
        No novoNo = new No(dado);
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public Object pop() {
        if (!isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped.getDado();
        }
        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "-----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (noAuxiliar != null) {
            stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getRefNo();
        }

        stringRetorno += "===========\n";
        return stringRetorno;
    }
}
