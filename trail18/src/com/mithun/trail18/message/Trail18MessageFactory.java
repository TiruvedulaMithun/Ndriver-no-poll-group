/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.message;

import javax.baja.ndriver.comm.IMessageFactory;
import javax.baja.ndriver.comm.LinkMessage;
import javax.baja.ndriver.comm.NMessage;

/**
 * Trail18MessageFactory implementation of IMessageFactory.
 *
 * @author mithun on 27 May 2025
 */
public class Trail18MessageFactory
  implements IMessageFactory
{
  public Trail18MessageFactory()
  {
  }

  public NMessage makeMessage(LinkMessage lm)
    throws Exception
  {
    //
    // TODO - convert linkMessage driver specific NMessage
    return null;
  }
}
