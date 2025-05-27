/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18;

import javax.baja.ndriver.BNDeviceFolder;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;


/**
 * BTrail18DeviceFolder is a folder for BTrail18Device.
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
public class BTrail18DeviceFolder
  extends BNDeviceFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.BTrail18DeviceFolder(2979906276)1.0$ @*/
/* Generated Tue May 27 14:42:36 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18DeviceFolder.class);

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
   * @return true if parent is BTrail18Network or BTrail18DeviceFolder.
   */
  public boolean isParentLegal(BComponent parent)
  {
    return parent instanceof BTrail18Network ||
           parent instanceof BTrail18DeviceFolder;
  }
}
