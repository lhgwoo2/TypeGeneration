
public abstract class Generation<T> {

  @SuppressWarnings("unchecked")
  public T get() {
    try {
      Class<T> mClass = (Class<T>) ClassUtils.getReclusiveGenericClass(getClass(), 0);
      if(mClass != null) {
        return mClass.newInstance();
      }
    }catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
