package io.github.quafadas.peerscalajs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
class DataConnection extends js.Object {
  def send(data: js.Any): Unit                        = js.native
  def close(): Unit                                   = js.native
  def on(event: String, callback: js.Function): Unit  = js.native
  def dataChannel: js.Object                          = js.native
  def label: String                                   = js.native
  def metadata: js.Any                                = js.native
  def open: Boolean                                   = js.native
  def peerConnection: js.Object                       = js.native
  def peer: String                                    = js.native
  def reliable: Boolean                               = js.native
  def serialization: String                           = js.native
  def `type`: String                                  = js.native
  def bufferSize: Int                                 = js.native
}
