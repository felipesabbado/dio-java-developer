package listaencadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada = null;

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i < index + 1; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (referenciaAux != null) {
            tamanhoLista++;
            referenciaAux = referenciaAux.getProximoNo();
        }

        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no indíce " + index + " desta lista. Esta lista só vai até o índice " + (size() - 1) + ".");
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        
        return strRetorno;
    }
}
