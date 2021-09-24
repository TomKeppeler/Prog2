package a2;

import ub02.Lifo;

public class Stapel<Typ> implements Puffer<Typ> {
    private Lifo<Typ> speicher = new Lifo<Typ>();
    
    @Override
    public void insert(Typ e) {
        speicher.push(e);
    }

    @Override
    public void remove() {
        speicher.pop();
    }

    @Override
    public int size() {
        return speicher.size();
    }

    @Override
    public boolean isEmpty() {
        return speicher.size() == 0;
    }

    public Typ top() {
        Typ ret = speicher.pop();
        speicher.push(ret);
        return ret;
    }
}
