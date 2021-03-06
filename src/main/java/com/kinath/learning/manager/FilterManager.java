package com.kinath.learning.manager;

import com.kinath.learning.Target;
import com.kinath.learning.filters.Filter;

/**
 * Created by Kinath on 3/31/2017.
 */
public class FilterManager
{
    FilterChain filterChain;

    public FilterManager(Target target)
    {
        filterChain = new FilterChain();
        filterChain.setTarget( target );
    }

    public void setFilter(Filter filter)
    {
        filterChain.addFilter( filter );
    }

    public void filterRequest(String request)
    {
        filterChain.execute( request);
    }
}
