@file:Suppress("FunctionName", "ClassName", "unused", "EnumEntryName", "UnusedImport")
package com.sourcegraph.cody.protocol_generated

data class ProtocolCodeLens(
  val range: Range,
  val command: ProtocolCommand? = null,
  val isResolved: Boolean,
)

