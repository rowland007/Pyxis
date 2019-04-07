package com.randarlabs.pyxis.XMLRPC;

public interface RPCArg{
    boolean isString();
    boolean isBoolean();
    boolean isInteger();
    boolean isList();
    Object literal();
}
