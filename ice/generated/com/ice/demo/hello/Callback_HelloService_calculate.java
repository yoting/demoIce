// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package com.ice.demo.hello;

// <auto-generated>
//
// Generated from file `hello.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public abstract class Callback_HelloService_calculate extends Ice.TwowayCallback
{
    public abstract void response(int __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        HelloServicePrx __proxy = (HelloServicePrx)__result.getProxy();
        int __ret = 0;
        try
        {
            __ret = __proxy.end_calculate(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
