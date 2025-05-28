/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.point;

import javax.baja.driver.point.BReadWriteMode;
import javax.baja.driver.util.BPollFrequency;
import javax.baja.ndriver.point.BNProxyExt;
import javax.baja.ndriver.poll.BINPollable;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusEnum;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusString;
import javax.baja.sys.*;

import com.mithun.trail18.*;

/**
 * BTrail18ProxyExt
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
/*
Override ProxyExt default status to clear stale state if needed
@NiagaraProperty(
  name = "status",
  type = "BStatus",
  defaultValue = "BStatus.ok",
  flags = Flags.READONLY | Flags.TRANSIENT,
  override = true
)
*/
public class BTrail18ProxyExt
  extends BNProxyExt
  implements BINPollable
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.point.BTrail18ProxyExt(2979906276)1.0$ @*/
/* Generated Tue May 27 15:00:21 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18ProxyExt.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail18Network.
   */
  public final BTrail18Network getTrail18Network()
  {
    return (BTrail18Network) getNetwork();
  }

  /**
   * Get the device cast to a BTrail18Device.
   */
  public final BTrail18Device getBTrail18Device()
  {
    return (BTrail18Device) ((BComplex) this).getAncestor(BTrail18Device.TYPE);
  }

  /**
   * Get the point device ext cast to a BTrail18PointDeviceExt.
   */
  public final BTrail18PointDeviceExt getTrail18PointDeviceExt()
  {
    return (BTrail18PointDeviceExt) getDeviceExt();
  }

////////////////////////////////////////////////////////////////
// ProxyExt
////////////////////////////////////////////////////////////////

  /**
   * The poll() callback method called from BPollScheduler when it is
   * time to poll this object.
   */
  @Override
  public void doPoll()
  {
    // TODO add code to poll the point value.
    // It is recommended to use the ((BTrail18Network) getNetwork()).postAsync(Runnable to perform the poll) to not block the engine thread
  }

  /**
   * Return the poll frequency for this proxy.
   * This is used by the BPollScheduler to determine how often to poll this object.
   */
  @Override
  public BPollFrequency getPollFrequency()
  {
    // Customize the poll frequency if necessary
    return BPollFrequency.DEFAULT;
  }

  /**
   * This callback is made when the point enters a subscribed
   * state based on the current status and tuning.
   * The default behavior of the super.readSubscribed() is
   * to register to the poll group or poll scheduler.
   *
   * Any customization of the readSubscribed method would be to
   * register for changes or begin polling. Any IO should
   * be done asynchronously on another thread - never block the
   * calling thread.  The result of reads should be to call the
   * readOk() or readFail() method.
   */
  @Override
  public void readSubscribed(Context cx)
    throws Exception
  {
    super.readSubscribed(cx);
    // TODO subscribe to read the point value
  }

  /**
   * This callback is made when the point enters an unsubscribed
   * state based on the current status and tuning.
   * The default behavior of the super.readUnsubscribed() is
   * to unregister from the poll group or poll scheduler.
   *
   * Any customization of the readUnsubscribed method would be to
   * unregister for changes or stop polling. Any IO should
   * be done asynchronously on another thread - never block the
   * calling thread.
   */
  @Override
  public void readUnsubscribed(Context cx)
    throws Exception
  {
    // TODO unsubscribe to read the point value
    super.readUnsubscribed(cx);
  }

  @Override
  public boolean write(Context cx)
    throws Exception
  {
    // TODO write the point value. If performing any IO, it is recommended to use the (BTrail18Network) getNetwork()).postAsync(Runnable to perform the write) to not block the engine thread
    return false;
  }

  /**
   * Return the device type.
   */
  public Type getDeviceExtType()
  {
    return BTrail18PointDeviceExt.TYPE;
  }


  /**
   * Return the read/write mode of this proxy.
   */
  public BReadWriteMode getMode()
  {
    // TODO determine the read/write mode based on the point.
    return BReadWriteMode.readonly;
  }

  public boolean isBoolean()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusBoolean;
  }

  public boolean isNumeric()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusNumeric;
  }

  public boolean isString()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusString;
  }

  public boolean isEnum()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusEnum;
  }
}
