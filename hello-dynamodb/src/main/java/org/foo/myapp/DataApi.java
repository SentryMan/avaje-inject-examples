package org.foo.myapp;

public interface DataApi {

  void put(DataRecord record);

  DataRecord get(String key);
}
