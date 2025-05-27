/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.point;

import javax.baja.ndriver.discover.BNDiscoveryPreferences;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;


/**
 * BTrail18PointDiscoveryPreferences controls the type of discovery leafs using during
 * point discovery for trail18
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
public class BTrail18PointDiscoveryPreferences
  extends BNDiscoveryPreferences
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.point.BTrail18PointDiscoveryPreferences(2979906276)1.0$ @*/
/* Generated Tue May 27 14:42:36 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18PointDiscoveryPreferences.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BTrail18PointDiscoveryPreferences()
  {
  }

  public Type getDiscoveryLeafType()
  {
    return BTrail18PointDiscoveryLeaf.TYPE;
  }
}
