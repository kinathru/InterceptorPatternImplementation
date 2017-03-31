package com.kinath.learning.manager;

/**
 * Created by Kinath on 3/31/2017.
 */
public class Client
{
    FilterManager filterManager;

    public void setFilterManager( FilterManager filterManager )
    {
        this.filterManager = filterManager;
    }

    public void sendRequest( String request )
    {
        filterManager.filterRequest( request );
    }
}
