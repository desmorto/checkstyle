package com.puppycrawl.tools.checkstyle.checks.misc.fileset;

public class InputFileSetIllegalTokens
{
    public void methodWithPreviouslyIllegalTokens()
    {
        int i = 0;
        switch (i)
        {
            default:
                i--;
                i++;
                break;
        }
    }
    
    public native void nativeMethod();
}
