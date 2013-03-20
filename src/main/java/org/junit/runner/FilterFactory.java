package org.junit.runner;

import org.junit.runner.manipulation.Filter;

/**
 * Extend this class to create a factory that creates {@link Filter}.
 */
public abstract class FilterFactory {
    /**
     * Creates a {@link Filter} using a ${FilterFactoryParams} argument.
     *
     * @param params Parameters needed to create the {@link Filter}
     * @throws FilterNotCreatedException
     */
    abstract public Filter createFilter(FilterFactoryParams params) throws FilterNotCreatedException;

    /**
     * Exception thrown if the {@link Filter} cannot be created.
     */
    public static class FilterNotCreatedException extends FilterFactoryFactory.FilterFactoryNotCreatedException {
        public FilterNotCreatedException(String message) {
            super(message);
        }
    }
}
