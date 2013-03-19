/**
 *  Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */
package org.apache.servicemix.akka.aries

import akka.actor.ActorSystem

/**
 * Just a simple POJO that can contain an actor system.
 * Used for testing dependency injection with Blueprint
 */
class ActorSystemAwareBean(val system: ActorSystem) {

}
