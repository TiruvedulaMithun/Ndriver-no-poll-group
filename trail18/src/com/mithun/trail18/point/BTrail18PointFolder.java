/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.point;

import javax.baja.ndriver.point.BNPointFolder;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;


import com.mithun.trail18.*;

/**
 * BTrail18PointFolder
 *
 * @author   mithun on 27 May 2025
 */
@NiagaraType
public class BTrail18PointFolder
  extends BNPointFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.point.BTrail18PointFolder(2979906276)1.0$ @*/
/* Generated Tue May 27 14:42:37 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18PointFolder.class);

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
}
