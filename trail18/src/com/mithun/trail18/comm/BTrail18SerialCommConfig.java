/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.comm;

import javax.baja.ndriver.comm.IMessageFactory;
import javax.baja.ndriver.comm.LinkMessage;
import javax.baja.ndriver.comm.NLinkMessageFactory;
import javax.baja.ndriver.datatypes.BSerialCommConfig;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.mithun.trail18.message.Trail18MessageFactory;

/**
 * BTrail18SerialCommConfig Handles the serial communication for the driver.
 *
 * @author mithun on 27 May 2025
 */
@NiagaraType
public class BTrail18SerialCommConfig
  extends BSerialCommConfig
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail18.comm.BTrail18SerialCommConfig(2979906276)1.0$ @*/
/* Generated Tue May 27 14:42:36 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail18SerialCommConfig.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  /**
   * Empty constructor
   */
  public BTrail18SerialCommConfig()
  {
  }

//  /** Override to configure the maximum number of request messages that can
//   *  be outstanding at the same time.  Default implementation returns 32. */
//  public int getMaxOutstandingTransactions() { return 1; }

  /**
   * Provide custom LinkMessage factory.
   */
  protected NLinkMessageFactory makeLinkMessageFactory()
  {
    // link message factory must create
    return new NLinkMessageFactory(1024)
    {
      protected LinkMessage createLinkMessage()
      {
        return new Trail18SerialLinkMessage(1024);
      }
    };
  }

  /**
   * Provide custom Message factory.
   */
  protected IMessageFactory makeMessageFactory()
  {
    return new Trail18MessageFactory();
  }
}
