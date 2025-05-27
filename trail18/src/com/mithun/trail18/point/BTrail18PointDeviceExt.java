/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.point;

import javax.baja.ndriver.discover.*;
import javax.baja.ndriver.point.*;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

import com.mithun.trail18.*;

/**
 * BTrail18PointDeviceExt is a container for trail18 proxy points.
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "discoveryPreferences",
  type = "BTrail18PointDiscoveryPreferences",
  defaultValue = "new BTrail18PointDiscoveryPreferences()",
  override = true
)
public class BTrail18PointDeviceExt
  extends BNPointDeviceExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.point.BTrail18PointDeviceExt(4040155196)1.0$ @*/
/* Generated Tue May 27 14:42:36 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "discoveryPreferences"

  /**
   * Slot for the {@code discoveryPreferences} property.
   * @see #getDiscoveryPreferences
   * @see #setDiscoveryPreferences
   */
  public static final Property discoveryPreferences = newProperty(0, new BTrail18PointDiscoveryPreferences(), null);

  //endregion Property "discoveryPreferences"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18PointDeviceExt.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail18Network.
   *
   * @return network as a BTrail18Network.
   */
  public final BTrail18Network getTrail18Network()
  {
    return (BTrail18Network) getNetwork();
  }

  /**
   * Get the device cast to a BTrail18Device.
   *
   * @return device as a BTrail18Device.
   */
  public final BTrail18Device getTrail18Device()
  {
    return (BTrail18Device) getDevice();
  }

////////////////////////////////////////////////////////////////
// PointDeviceExt
////////////////////////////////////////////////////////////////

  /**
   * @return the Device type.
   */
  public Type getDeviceType()
  {
    return BTrail18Device.TYPE;
  }

  /**
   * @return the PointFolder type.
   */
  public Type getPointFolderType()
  {
    return BTrail18PointFolder.TYPE;
  }

  /**
   * @return the ProxyExt type.
   */
  public Type getProxyExtType()
  {
    return BTrail18ProxyExt.TYPE;
  }

////////////////////////////////////////////////////////////////
//BINDiscoveryHost
////////////////////////////////////////////////////////////////

  /**
   * Call back for discoveryJob to get an array of discovery objects.
   * Override point for driver specific discovery.
   */
  public BINDiscoveryObject[] getDiscoveryObjects(BNDiscoveryPreferences prefs)
    throws Exception
  {
    //
    // TODO  get array of discovery objects
    //
//    Array<??> a = new Array<>(??.class);
//    for(??)
//     a.add(new BTrail18PointDiscoveryLeaf(??));
//    return a.trim();
    return null;
  }
}
