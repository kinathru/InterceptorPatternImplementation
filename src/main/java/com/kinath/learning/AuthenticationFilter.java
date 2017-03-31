package com.kinath.learning;

/**
 * Created by Kinath on 3/31/2017.
 */
public class AuthenticationFilter implements Filter
{
    public void execute( String request )
    {
        System.out.println( "Authenticating Request : " + request );
    }
}
