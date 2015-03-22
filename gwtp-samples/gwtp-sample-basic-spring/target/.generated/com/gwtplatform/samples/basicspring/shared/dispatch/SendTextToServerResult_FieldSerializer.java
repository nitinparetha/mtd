package com.gwtplatform.samples.basicspring.shared.dispatch;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SendTextToServerResult_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getResponse(com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult instance) /*-{
    return instance.@com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult::response;
  }-*/;
  
  private static native void setResponse(com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult instance, java.lang.String value) 
  /*-{
    instance.@com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult::response = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult instance) throws SerializationException {
    setResponse(instance, streamReader.readString());
    
  }
  
  public static native com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult instance) throws SerializationException {
    streamWriter.writeString(getResponse(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult_FieldSerializer.deserialize(reader, (com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult_FieldSerializer.serialize(writer, (com.gwtplatform.samples.basicspring.shared.dispatch.SendTextToServerResult)object);
  }
  
}
