/*
 *
 *  Copyright 2015 Robert Winkler
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package javaslang.circuitbreaker.event;

/**
 * A CircuitBreakerEvent which informs that an error has been recorded
 */
public class CircuitBreakerOnErrorEvent implements CircuitBreakerEvent{

    private final String circuitBreakerName;
    private final Throwable throwable;

    public CircuitBreakerOnErrorEvent(String circuitBreakerName, Throwable throwable) {
        this.circuitBreakerName = circuitBreakerName;
        this.throwable = throwable;
    }

    @Override
    public String getCircuitBreakerName() {
        return circuitBreakerName;
    }

    @Override
    public Type getEventType() {
        return Type.ERROR;
    }

    @Override
    public String toString(){
        return String.format("CircuitBreaker '%s' recorded an error: '%s'", getCircuitBreakerName(), throwable.toString());
    }
}