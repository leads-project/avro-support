/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DeviceList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceList\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"devices\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String name;
  @Deprecated public java.util.List<java.util.Map<java.lang.String,java.lang.String>> devices;

  /**
   * Default constructor.
   */
  public DeviceList() {}

  /**
   * All-args constructor.
   */
  public DeviceList(java.lang.String name, java.util.List<java.util.Map<java.lang.String,java.lang.String>> devices) {
    this.name = name;
    this.devices = devices;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return devices;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: devices = (java.util.List<java.util.Map<java.lang.String,java.lang.String>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'devices' field.
   */
  public java.util.List<java.util.Map<java.lang.String,java.lang.String>> getDevices() {
    return devices;
  }

  /**
   * Sets the value of the 'devices' field.
   * @param value the value to set.
   */
  public void setDevices(java.util.List<java.util.Map<java.lang.String,java.lang.String>> value) {
    this.devices = value;
  }

  /** Creates a new DeviceList RecordBuilder */
  public static example.avro.DeviceList.Builder newBuilder() {
    return new example.avro.DeviceList.Builder();
  }
  
  /** Creates a new DeviceList RecordBuilder by copying an existing Builder */
  public static example.avro.DeviceList.Builder newBuilder(example.avro.DeviceList.Builder other) {
    return new example.avro.DeviceList.Builder(other);
  }
  
  /** Creates a new DeviceList RecordBuilder by copying an existing DeviceList instance */
  public static example.avro.DeviceList.Builder newBuilder(example.avro.DeviceList other) {
    return new example.avro.DeviceList.Builder(other);
  }
  
  /**
   * RecordBuilder for DeviceList instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceList>
    implements org.apache.avro.data.RecordBuilder<DeviceList> {

    private java.lang.String name;
    private java.util.List<java.util.Map<java.lang.String,java.lang.String>> devices;

    /** Creates a new Builder */
    private Builder() {
      super(example.avro.DeviceList.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.avro.DeviceList.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DeviceList instance */
    private Builder(example.avro.DeviceList other) {
            super(example.avro.DeviceList.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.devices)) {
        this.devices = data().deepCopy(fields()[1].schema(), other.devices);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public example.avro.DeviceList.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public example.avro.DeviceList.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'devices' field */
    public java.util.List<java.util.Map<java.lang.String,java.lang.String>> getDevices() {
      return devices;
    }
    
    /** Sets the value of the 'devices' field */
    public example.avro.DeviceList.Builder setDevices(java.util.List<java.util.Map<java.lang.String,java.lang.String>> value) {
      validate(fields()[1], value);
      this.devices = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'devices' field has been set */
    public boolean hasDevices() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'devices' field */
    public example.avro.DeviceList.Builder clearDevices() {
      devices = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DeviceList build() {
      try {
        DeviceList record = new DeviceList();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.devices = fieldSetFlags()[1] ? this.devices : (java.util.List<java.util.Map<java.lang.String,java.lang.String>>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}