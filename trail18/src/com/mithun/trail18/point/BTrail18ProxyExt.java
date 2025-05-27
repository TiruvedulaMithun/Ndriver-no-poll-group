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
   * The poll() callback method called from BPollScheduler when it is time to poll this object.
   */
  @Override
  public void doPoll()
  {
    // This method is called by the BPollScheduler when it is time to poll this object.
    // TODO add code to poll the point value
  }

  /**
   * Return the poll frequency for this proxy.
   * This is used by the BPollScheduler to determine how often to poll this object.
   */
  @Override
  public BPollFrequency getPollFrequency()
  {
    return BPollFrequency.DEFAULT;
  }

  public void readSubscribed(Context cx)
    throws Exception
  {
    // TODO subscribe to read the point value
  }

  public void readUnsubscribed(Context cx)
    throws Exception
  {
    // TODO unsubscribe to read the point value
  }

  public boolean write(Context cx)
    throws Exception
  {
    // TODO
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
