// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package rpcservice.protos.searcher

object SearcherProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      rpcservice.protos.searcher.SearchRequest,
      rpcservice.protos.searcher.SearchReply
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg5zZWFyY2hlci5wcm90bxIRcnBjc2VydmljZS5wcm90b3MiLgoNU2VhcmNoUmVxdWVzdBIdCgRuYW1lGAEgASgJQgniPwYSB
  G5hbWVSBG5hbWUiNQoLU2VhcmNoUmVwbHkSJgoHbWVzc2FnZRgBIAEoCUIM4j8JEgdtZXNzYWdlUgdtZXNzYWdlMlsKCFNlYXJja
  GVyEk8KCXNlYXJjaExvZxIgLnJwY3NlcnZpY2UucHJvdG9zLlNlYXJjaFJlcXVlc3QaHi5ycGNzZXJ2aWNlLnByb3Rvcy5TZWFyY
  2hSZXBseSIAYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}