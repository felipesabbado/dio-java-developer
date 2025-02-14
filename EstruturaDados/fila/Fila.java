package fila;

public class Fila<T> {
    private No<T> refNoEntradaFila = null;

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;

            while (primeiroNo.getRefNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAuxiliar.setRefNo(null);

            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null) {
            while (noAuxiliar != null) {
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]--->";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            stringRetorno += "null";
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
