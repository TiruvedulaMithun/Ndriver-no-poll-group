/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.learn;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

/**
 * BTrail18LearnDeviceEntry represents a learned device in the deviceManager learn
 * pane.  Add properties which should be displayed to user to identify device or are
 * need during the add/match step.
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "address",
  type = "String",
  defaultValue = ""
)
public class BTrail18LearnDeviceEntry
  extends BComponent
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.learn.BTrail18LearnDeviceEntry(3857199698)1.0$ @*/
/* Generated Tue May 27 14:42:36 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "address"

  /**
   * Slot for the {@code address} property.
   * @see #getAddress
   * @see #setAddress
   */
  public static final Property address = newProperty(0, "", null);

  /**
   * Get the {@code address} property.
   * @see #address
   */
  public String getAddress() { return getString(address); }

  /**
   * Set the {@code address} property.
   * @see #address
   */
  public void setAddress(String v) { setString(address, v, null); }

  //endregion Property "address"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18LearnDeviceEntry.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BTrail18LearnDeviceEntry()
  {
  }

  public BTrail18LearnDeviceEntry(String address)
  {
    setAddress(address);
  }
}
