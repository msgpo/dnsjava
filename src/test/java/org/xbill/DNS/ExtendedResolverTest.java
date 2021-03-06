// SPDX-License-Identifier: BSD-2-Clause
package org.xbill.DNS;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.UnknownHostException;
import org.junit.jupiter.api.Test;

public class ExtendedResolverTest {
  @Test
  void testGetExtendedResolver() throws UnknownHostException {
    ExtendedResolver r = new ExtendedResolver(new SimpleResolver[] {new SimpleResolver("0.0.0.0")});
    assertEquals(1, r.getResolvers().length);
  }
}
