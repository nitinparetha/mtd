package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UnsecuredActionImpl_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl instance) throws SerializationException {
    
  }
  
  public static com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl instance) throws SerializationException {
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.deserialize(reader, (com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl_FieldSerializer.serialize(writer, (com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl)object);
  }
  
}
