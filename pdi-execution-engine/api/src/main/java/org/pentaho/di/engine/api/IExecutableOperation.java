package org.pentaho.di.engine.api;

import java.io.Serializable;

/**
 * ICallableOperation is the materialized version of
 * an IOperation.  It represents the mapping of the
 * structural specification of the op to it's concrete
 * executable form, as applicable to the IEngine in which
 * it is running.
 *
 * An ICallableOperation encapsulates a function capable of transforming input
 * tuples received "From" parent operations and published
 * "To" child ops.
 */
public interface IExecutableOperation extends Serializable, IOperation, IProgressReporting<IDataEvent>, IPDIEventSource<IDataEvent>, IPDIEventSink<IDataEvent> {


  boolean isRunning();


}
