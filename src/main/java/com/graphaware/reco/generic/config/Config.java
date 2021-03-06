/*
 * Copyright (c) 2013-2015 GraphAware
 *
 * This file is part of the GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.config;

/**
 * One off (per-request) configuration for the recommendation-computing process. Implementations must be thread-safe.
 */
public interface Config {

    Config UNLIMITED = new SimpleConfig(Integer.MAX_VALUE);

    /**
     * @return desired maximum number of produced recommendations. Please note that it is for information only, i.e.,
     * it is up to the engine to decide whether to honour the configuration or not.
     */
    int limit();

    /**
     * @return desired maximum time in ms that the recommendation-computing process should take. Please note that it is
     * for information only, i.e., it is up to the engine to decide whether to honour the configuration or not.
     */
    long maxTime();
}
