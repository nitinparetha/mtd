package com.gwtplatform.samples.mobile.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GetProductListResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.ArrayList getProducts(com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult::products;
  }-*/;
  
  private static native void setProducts(com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult instance, java.util.ArrayList value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult::products = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult instance) throws SerializationException {
    setProducts(instance, (java.util.ArrayList) streamReader.readObject());
    
  }
  
  public static com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult instance) throws SerializationException {
    streamWriter.writeObject(getProducts(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult_FieldSerializer.serialize(writer, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductListResult)object);
  }
  
}
