package org.talend.designer.components.persistent;

import java.io.IOException;


public interface IPersistentHash<K,V> {

    public enum KEYS_MANAGEMENT {
        KEEP_FIRST,
        KEEP_LAST,
        KEEP_ALL,
    }
    
    public void initPut() throws IOException;

    public void put(V bean) throws IOException;

    public void endPut() throws IOException;

    public void initGet() throws IOException;

    public void lookup(K key) throws IOException;
    
    public boolean hasNext() throws IOException;

    public V next() throws IOException;
    
    public void endGet() throws IOException;

    public void clear() throws IOException;
    
}