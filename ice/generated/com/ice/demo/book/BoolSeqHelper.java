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


public final class BoolSeqHelper
{
    public static void
    write(IceInternal.BasicStream __os, boolean[] __v)
    {
        __os.writeBoolSeq(__v);
    }

    public static boolean[]
    read(IceInternal.BasicStream __is)
    {
        boolean[] __v;
        __v = __is.readBoolSeq();
        return __v;
    }

    public static void
    write(Ice.OutputStream __outS, boolean[] __v)
    {
        __outS.writeBoolSeq(__v);
    }

    public static boolean[]
    read(Ice.InputStream __inS)
    {
        boolean[] __v;
        __v = __inS.readBoolSeq();
        return __v;
    }
}