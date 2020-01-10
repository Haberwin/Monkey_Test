package org.apache.log4j.spi;

import java.io.PrintWriter;
import java.util.Vector;

class VectorWriter extends PrintWriter {
    /* renamed from: v */
    private Vector f22v = new Vector();

    VectorWriter() {
        super(new NullWriter());
    }

    public void print(Object o) {
        this.f22v.addElement(String.valueOf(o));
    }

    public void print(char[] chars) {
        this.f22v.addElement(new String(chars));
    }

    public void print(String s) {
        this.f22v.addElement(s);
    }

    public void println(Object o) {
        this.f22v.addElement(String.valueOf(o));
    }

    public void println(char[] chars) {
        this.f22v.addElement(new String(chars));
    }

    public void println(String s) {
        this.f22v.addElement(s);
    }

    public void write(char[] chars) {
        this.f22v.addElement(new String(chars));
    }

    public void write(char[] chars, int off, int len) {
        this.f22v.addElement(new String(chars, off, len));
    }

    public void write(String s, int off, int len) {
        this.f22v.addElement(s.substring(off, off + len));
    }

    public void write(String s) {
        this.f22v.addElement(s);
    }

    public String[] toStringArray() {
        int len = this.f22v.size();
        String[] sa = new String[len];
        for (int i = 0; i < len; i++) {
            sa[i] = (String) this.f22v.elementAt(i);
        }
        return sa;
    }
}
