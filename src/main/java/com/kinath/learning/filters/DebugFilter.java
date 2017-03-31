package com.kinath.learning.filters;

/**
 * Created by Kinath on 3/31/2017.
 */
public class DebugFilter implements Filter
{
    public void execute( String request )
    {
        System.out.println( "Request Log : " + request );
    }
}
