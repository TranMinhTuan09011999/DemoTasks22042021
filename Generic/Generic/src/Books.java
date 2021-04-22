class Books<K, V, I> extends Dictionary<K, V> {
    private I info; 

    public Books(K key, V value) {
        super(key, value);
    }

    public Books(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }
}