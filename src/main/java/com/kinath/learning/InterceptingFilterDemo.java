package com.kinath.learning;

import com.kinath.learning.filters.AuthenticationFilter;
import com.kinath.learning.filters.DebugFilter;
import com.kinath.learning.manager.Client;
import com.kinath.learning.manager.FilterManager;

/**
 * Created by Kinath on 3/31/2017.
 */
public class InterceptingFilterDemo
{
    public static void main( String[] args )
    {
        FilterManager filterManager = new FilterManager( new Target() );
        filterManager.setFilter( new AuthenticationFilter() );
        filterManager.setFilter( new DebugFilter() );

        Client client = new Client();
        client.setFilterManager( filterManager );
        client.sendRequest( "HOME" );
    }
}
