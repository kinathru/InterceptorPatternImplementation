package com.kinath.learning.manager;

import com.kinath.learning.Target;
import com.kinath.learning.filters.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kinath on 3/31/2017.
 */
public class FilterChain
{
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter( Filter filter )
    {
        filters.add( filter );
    }

    public void execute( String request )
    {
        for( Filter filter : filters )
        {
            filter.execute( request );
        }
        target.execute( request );
    }

    public void setTarget( Target target )
    {
        this.target = target;
    }
}
