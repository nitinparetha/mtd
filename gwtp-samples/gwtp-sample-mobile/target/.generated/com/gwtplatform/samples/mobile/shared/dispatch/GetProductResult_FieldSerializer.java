package com.gwtplatform.samples.mobile.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GetProductResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.gwtplatform.samples.mobile.shared.dispatch.Product getProduct(com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult instance) /*-{
    return instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult::product;
  }-*/;
  
  private static native void setProduct(com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult instance, com.gwtplatform.samples.mobile.shared.dispatch.Product value) 
  /*-{
    instance.@com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult::product = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult instance) throws SerializationException {
    setProduct(instance, (com.gwtplatform.samples.mobile.shared.dispatch.Product) streamReader.readObject());
    
  }
  
  public static com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult instance) throws SerializationException {
    streamWriter.writeObject(getProduct(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult_FieldSerializer.serialize(writer, (com.gwtplatform.samples.mobile.shared.dispatch.GetProductResult)object);
  }
  
}
