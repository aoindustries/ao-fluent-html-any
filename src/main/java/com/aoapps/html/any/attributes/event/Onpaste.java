/*
 * ao-fluent-html-any - Base abstract classes and interfaces for Fluent Java DSL for high-performance HTML generation.
 * Copyright (C) 2019, 2020, 2021, 2022, 2023, 2024  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-fluent-html-any.
 *
 * ao-fluent-html-any is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-fluent-html-any is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-fluent-html-any.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.aoapps.html.any.attributes.event;

import com.aoapps.encoding.JavaScriptWritable;
import com.aoapps.html.any.Attributes;
import com.aoapps.html.any.Element;
import com.aoapps.lang.Coercion;
import com.aoapps.lang.io.function.IOSupplierE;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-onpaste">3.2.6 Global attributes / onpaste</a>.</li>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onpaste">8.1.7.2 Event handlers on elements, Document objects, and Window objects / onpaste</a>.</li>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-onpaste">8.1.7.2.1 IDL definitions / onpaste</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste</a>.</li>
 * <li>See <a href="https://www.w3schools.com/jsref/event_onpaste.asp">onpaste Event</a>.</li>
 * </ul>
 *
 * @param  <E>   This element type
 *
 * @author  AO Industries, Inc.
 */
// Matches OnpasteUnexpected
public interface Onpaste<E extends Element<?, ?, E> & Onpaste<E>> {

  /**
   * Utility class for working with {@link Onpaste}.
   *
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-onpaste">3.2.6 Global attributes / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onpaste">8.1.7.2 Event handlers on elements, Document objects, and Window objects / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-onpaste">8.1.7.2.1 IDL definitions / onpaste</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste</a>.</li>
   * <li>See <a href="https://www.w3schools.com/jsref/event_onpaste.asp">onpaste Event</a>.</li>
   * </ul>
   */
  public static final class onpaste {
    /** Make no instances. */
    private onpaste() {
      throw new AssertionError();
    }

    /**
     * Normalizes an onpaste attribute.
     *
     * @see  Coercion#trimNullIfEmpty(java.lang.Object)
     */
    public static Object normalize(Object onpaste) {
      return Coercion.trimNullIfEmpty(onpaste);
    }
  }

  /**
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-onpaste">3.2.6 Global attributes / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onpaste">8.1.7.2 Event handlers on elements, Document objects, and Window objects / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-onpaste">8.1.7.2.1 IDL definitions / onpaste</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste</a>.</li>
   * <li>See <a href="https://www.w3schools.com/jsref/event_onpaste.asp">onpaste Event</a>.</li>
   * </ul>
   */
  @Attributes.Funnel
  default E onpaste(Object onpaste) throws IOException {
    @SuppressWarnings("unchecked")
    E element = (E) this;
    return Attributes.Event.attribute(element, "onpaste", onpaste, Onpaste.onpaste::normalize);
  }

  /**
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-onpaste">3.2.6 Global attributes / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onpaste">8.1.7.2 Event handlers on elements, Document objects, and Window objects / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-onpaste">8.1.7.2.1 IDL definitions / onpaste</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste</a>.</li>
   * <li>See <a href="https://www.w3schools.com/jsref/event_onpaste.asp">onpaste Event</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @see #onpaste(java.lang.Object)
   */
  default <Ex extends Throwable> E onpaste(IOSupplierE<?, Ex> onpaste) throws IOException, Ex {
    return onpaste((onpaste == null) ? null : onpaste.get());
  }

  /**
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-onpaste">3.2.6 Global attributes / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-onpaste">8.1.7.2 Event handlers on elements, Document objects, and Window objects / onpaste</a>.</li>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-onpaste">8.1.7.2.1 IDL definitions / onpaste</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/onpaste">HTMLElement.onpaste</a>.</li>
   * <li>See <a href="https://www.w3schools.com/jsref/event_onpaste.asp">onpaste Event</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @see #onpaste(java.lang.Object)
   */
  default <Ex extends Throwable> E onpaste(JavaScriptWritable<Ex> onpaste) throws IOException, Ex {
    return onpaste((Object) onpaste);
  }
}
