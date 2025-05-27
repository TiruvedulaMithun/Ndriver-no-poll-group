/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail18.comm;

import javax.baja.ndriver.comm.ICommListener;
import javax.baja.ndriver.comm.NMessage;
import javax.baja.ndriver.datatypes.BCommConfig;

/**
 * Trail18Listener processes unsolicited messages.
 *
 * @author mithun on 27 May 2025
 */
public class Trail18Listener
  implements ICommListener
{
  /**
   * Constructor
   */
  public Trail18Listener(BCommConfig ccfg)
  {
  }

  /**
   * Customized to process the unsolicited message for this driver.
   *
   * @param nMsg message received from device
   */
  public void receiveMessage(NMessage nMsg)
  {
    // TODO
  }
}
