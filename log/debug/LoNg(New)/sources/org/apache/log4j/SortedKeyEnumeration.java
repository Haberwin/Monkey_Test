package org.apache.log4j;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PropertyConfigurator */
class SortedKeyEnumeration implements Enumeration {
    /* renamed from: e */
    private Enumeration f6e;

    public SortedKeyEnumeration(Hashtable ht) {
        Enumeration f = ht.keys();
        Vector keys = new Vector(ht.size());
        int last = 0;
        while (f.hasMoreElements()) {
            String key = (String) f.nextElement();
            int i = 0;
            while (i < last && key.compareTo((String) keys.get(i)) > 0) {
                i++;
            }
            keys.add(i, key);
            last++;
        }
        this.f6e = keys.elements();
    }

    public boolean hasMoreElements() {
        return this.f6e.hasMoreElements();
    }

    public Object nextElement() {
        return this.f6e.nextElement();
    }
}
