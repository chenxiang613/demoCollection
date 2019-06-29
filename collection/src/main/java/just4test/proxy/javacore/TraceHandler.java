package just4test.proxy.javacore;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * An invocation handler that prints out the method name and parameters, then
 * invokes the original method
 */
class TransactionHandler implements InvocationHandler
{
   private Object target;

   /**
    * Constructs a TraceHandler
    * @param t the implicit parameter of the method call
    */
   public TransactionHandler(Object t)
   {
      target = t;
   }

   public Object invoke(Object proxy, Method m, Object[] args) throws Throwable
   {
      // print implicit argument
      System.out.print("开启事务——————————————————");
      // print method name
      System.out.print("." + m.getName() + "(");
      // print explicit arguments
      if (args != null)
      {
         for (int i = 0; i < args.length; i++)
         {
            System.out.print(args[i]);
            if (i < args.length - 1) System.out.print(", ");
         }
      }
      System.out.println(")");
      System.out.print("提交事务——————————————————");
      // invoke actual method
      return m.invoke(target, args);
   }
}