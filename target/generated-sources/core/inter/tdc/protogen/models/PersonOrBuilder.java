// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tutorial.proto

package core.inter.tdc.protogen.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>optional string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>optional .tutorial.PhoneNumber phone = 4;</code>
   */
  boolean hasPhone();
  /**
   * <code>optional .tutorial.PhoneNumber phone = 4;</code>
   */
  core.inter.tdc.protogen.models.PhoneNumber getPhone();
  /**
   * <code>optional .tutorial.PhoneNumber phone = 4;</code>
   */
  core.inter.tdc.protogen.models.PhoneNumberOrBuilder getPhoneOrBuilder();
}