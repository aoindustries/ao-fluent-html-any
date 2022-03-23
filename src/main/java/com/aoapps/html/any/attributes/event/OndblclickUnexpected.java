/*
 * ao-fluent-html-any - Base abstract classes and interfaces for Fluent Java DSL for high-performance HTML generation.
 * Copyright (C) 2022  AO Industries, Inc.
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

import com.aoapps.encoding.MediaWritable;
import com.aoapps.html.any.AnyBASE;
import com.aoapps.html.any.AnyBDO;
import com.aoapps.html.any.AnyBR;
import com.aoapps.html.any.AnyHEAD;
import com.aoapps.html.any.AnyHTML;
import com.aoapps.html.any.AnyIFRAME;
import com.aoapps.html.any.AnyMETA;
import com.aoapps.html.any.AnyPARAM;
import com.aoapps.html.any.AnySCRIPT;
import com.aoapps.html.any.AnySTYLE;
import com.aoapps.html.any.AnyTITLE;
import com.aoapps.html.any.AnyWBR;
import com.aoapps.html.any.Attributes;
import com.aoapps.html.any.Element;
import com.aoapps.lang.io.function.IOSupplierE;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-ondblclick">3.2.6 Global attributes / ondblclick</a>.</li>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">8.1.7.2 Event handlers on elements, Document objects, and Window objects / ondblclick</a>.</li>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-ondblclick">8.1.7.2.1 IDL definitions / ondblclick</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick</a>.</li>
 * <li>See <a href="https://www.w3schools.com/jsref/event_ondblclick.asp">ondblclick Event</a>.</li>
 * </ul>
 *
 * @param  <E>   This element type
 *
 * @deprecated  Although the ondblclick attribute is global, it is not expected on
 *              {@linkplain AnyBASE &lt;base&gt;}, {@linkplain AnyBDO &lt;bdo&gt;}, {@linkplain AnyBR &lt;br&gt;},
 *              {@linkplain AnyHEAD &lt;head&gt;}, {@linkplain AnyHTML &lt;html&gt;}, {@linkplain AnyIFRAME &lt;iframe&gt;},
 *              {@linkplain AnyMETA &lt;meta&gt;}, {@linkplain AnyPARAM &lt;param&gt;}, {@linkplain AnySCRIPT &lt;script&gt;},
 *              {@linkplain AnySTYLE &lt;style&gt;}, {@linkplain AnyTITLE &lt;title&gt;}, or {@linkplain AnyWBR &lt;wbr&gt;}.
 *              <p>
 *              See <a href="https://www.w3schools.com/tags/ref_eventattributes.asp">HTML Event Attributes</a>.
 *              </p>
 *
 * @author  AO Industries, Inc.
 */
// Matches Ondblclick
@Deprecated
public interface OndblclickUnexpected<E extends Element<?, ?, E> & OndblclickUnexpected<E>> extends Ondblclick<E> {

	/**
	 * <ul>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-ondblclick">3.2.6 Global attributes / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">8.1.7.2 Event handlers on elements, Document objects, and Window objects / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-ondblclick">8.1.7.2.1 IDL definitions / ondblclick</a>.</li>
	 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick</a>.</li>
	 * <li>See <a href="https://www.w3schools.com/jsref/event_ondblclick.asp">ondblclick Event</a>.</li>
	 * </ul>
	 *
	 * @deprecated  Although the ondblclick attribute is global, it is not expected on
	 *              {@linkplain AnyBASE &lt;base&gt;}, {@linkplain AnyBDO &lt;bdo&gt;}, {@linkplain AnyBR &lt;br&gt;},
	 *              {@linkplain AnyHEAD &lt;head&gt;}, {@linkplain AnyHTML &lt;html&gt;}, {@linkplain AnyIFRAME &lt;iframe&gt;},
	 *              {@linkplain AnyMETA &lt;meta&gt;}, {@linkplain AnyPARAM &lt;param&gt;}, {@linkplain AnySCRIPT &lt;script&gt;},
	 *              {@linkplain AnySTYLE &lt;style&gt;}, {@linkplain AnyTITLE &lt;title&gt;}, or {@linkplain AnyWBR &lt;wbr&gt;}.
	 *              <p>
	 *              See <a href="https://www.w3schools.com/tags/ref_eventattributes.asp">HTML Event Attributes</a>.
	 *              </p>
	 */
	@Deprecated
	@Override
	@Attributes.Funnel
	default E ondblclick(Object ondblclick) throws IOException {
		return Ondblclick.super.ondblclick(ondblclick);
	}

	/**
	 * <ul>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-ondblclick">3.2.6 Global attributes / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">8.1.7.2 Event handlers on elements, Document objects, and Window objects / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-ondblclick">8.1.7.2.1 IDL definitions / ondblclick</a>.</li>
	 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick</a>.</li>
	 * <li>See <a href="https://www.w3schools.com/jsref/event_ondblclick.asp">ondblclick Event</a>.</li>
	 * </ul>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @see #ondblclick(java.lang.Object)
	 *
	 * @deprecated  Although the ondblclick attribute is global, it is not expected on
	 *              {@linkplain AnyBASE &lt;base&gt;}, {@linkplain AnyBDO &lt;bdo&gt;}, {@linkplain AnyBR &lt;br&gt;},
	 *              {@linkplain AnyHEAD &lt;head&gt;}, {@linkplain AnyHTML &lt;html&gt;}, {@linkplain AnyIFRAME &lt;iframe&gt;},
	 *              {@linkplain AnyMETA &lt;meta&gt;}, {@linkplain AnyPARAM &lt;param&gt;}, {@linkplain AnySCRIPT &lt;script&gt;},
	 *              {@linkplain AnySTYLE &lt;style&gt;}, {@linkplain AnyTITLE &lt;title&gt;}, or {@linkplain AnyWBR &lt;wbr&gt;}.
	 *              <p>
	 *              See <a href="https://www.w3schools.com/tags/ref_eventattributes.asp">HTML Event Attributes</a>.
	 *              </p>
	 */
	@Deprecated
	@Override
	default <Ex extends Throwable> E ondblclick(IOSupplierE<?, Ex> ondblclick) throws IOException, Ex {
		return ondblclick((ondblclick == null) ? null : ondblclick.get());
	}

	/**
	 * <ul>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#global-attributes:handler-ondblclick">3.2.6 Global attributes / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#handler-ondblclick">8.1.7.2 Event handlers on elements, Document objects, and Window objects / ondblclick</a>.</li>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/webappapis.html#idl-definitions:handler-ondblclick">8.1.7.2.1 IDL definitions / ondblclick</a>.</li>
	 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/API/GlobalEventHandlers/ondblclick">GlobalEventHandlers.ondblclick</a>.</li>
	 * <li>See <a href="https://www.w3schools.com/jsref/event_ondblclick.asp">ondblclick Event</a>.</li>
	 * </ul>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @see #ondblclick(java.lang.Object)
	 *
	 * @deprecated  Although the ondblclick attribute is global, it is not expected on
	 *              {@linkplain AnyBASE &lt;base&gt;}, {@linkplain AnyBDO &lt;bdo&gt;}, {@linkplain AnyBR &lt;br&gt;},
	 *              {@linkplain AnyHEAD &lt;head&gt;}, {@linkplain AnyHTML &lt;html&gt;}, {@linkplain AnyIFRAME &lt;iframe&gt;},
	 *              {@linkplain AnyMETA &lt;meta&gt;}, {@linkplain AnyPARAM &lt;param&gt;}, {@linkplain AnySCRIPT &lt;script&gt;},
	 *              {@linkplain AnySTYLE &lt;style&gt;}, {@linkplain AnyTITLE &lt;title&gt;}, or {@linkplain AnyWBR &lt;wbr&gt;}.
	 *              <p>
	 *              See <a href="https://www.w3schools.com/tags/ref_eventattributes.asp">HTML Event Attributes</a>.
	 *              </p>
	 */
	@Deprecated
	@Override
	default <Ex extends Throwable> E ondblclick(MediaWritable<Ex> ondblclick) throws IOException, Ex {
		return ondblclick((Object)ondblclick);
	}
}
