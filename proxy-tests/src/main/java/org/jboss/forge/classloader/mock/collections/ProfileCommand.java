/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.classloader.mock.collections;

import java.util.Map;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public class ProfileCommand
{
   private ProfileManager manager;

   public void setManager(ProfileManager manager)
   {
      this.manager = manager;
   }

   public void configureProfile()
   {
      Map<String, Profile> profiles = manager.getProfiles();
      profiles.put("new", new Profile("new"));
      manager.setProfiles(profiles.values());
   }
}
