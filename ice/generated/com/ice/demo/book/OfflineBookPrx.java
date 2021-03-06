// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package com.ice.demo.book;

// <auto-generated>
//
// Generated from file `book.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public interface OfflineBookPrx extends Ice.ObjectPrx
{
    public boolean[] bookTrance(Message[] msg);

    public boolean[] bookTrance(Message[] msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_bookTrance(Message[] msg);

    public Ice.AsyncResult begin_bookTrance(Message[] msg, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_bookTrance(Message[] msg, Ice.Callback __cb);

    public Ice.AsyncResult begin_bookTrance(Message[] msg, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_bookTrance(Message[] msg, Callback_OfflineBook_bookTrance __cb);

    public Ice.AsyncResult begin_bookTrance(Message[] msg, java.util.Map<String, String> __ctx, Callback_OfflineBook_bookTrance __cb);

    public boolean[] end_bookTrance(Ice.AsyncResult __result);
}
