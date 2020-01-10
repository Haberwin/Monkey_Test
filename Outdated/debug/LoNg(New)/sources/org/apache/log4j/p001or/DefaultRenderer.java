package org.apache.log4j.p001or;

/* renamed from: org.apache.log4j.or.DefaultRenderer */
class DefaultRenderer implements ObjectRenderer {
    DefaultRenderer() {
    }

    public String doRender(Object o) {
        try {
            return o.toString();
        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
