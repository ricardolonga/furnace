package org.jboss.forge.classloader.mock.sidewaysproxy;

public class Action1 implements Action
{

   @Override
   public void handle(Context context)
   {
      Object payload = context.get().get();
      System.out.println(payload);
   }

}
