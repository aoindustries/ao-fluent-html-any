/*
 * ao-fluent-html-any - Base abstract classes and interfaces for Fluent Java DSL for high-performance HTML generation.
 * Copyright (C) 2019, 2020, 2021, 2022  AO Industries, Inc.
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

import com.aoapps.encoding.Doctype;
import com.aoapps.encoding.MediaWritable;
import com.aoapps.html.any.Attributes;
import static com.aoapps.html.any.Attributes.RESOURCES;
import com.aoapps.html.any.Element;
import com.aoapps.lang.LocalizedIllegalArgumentException;
import com.aoapps.lang.io.function.IOSupplierE;
import java.io.IOException;

/**
 * See <a href="https://www.w3schools.com/tags/ev_onhashchange.asp">HTML onhashchange Event Attribute</a>.
 *
 * @param  <E>   This element type
 *
 * @since HTML 5
 *
 * @author  AO Industries, Inc.
 */
public interface Onhashchange<E extends Element<?, ?, E> & Onhashchange<E>> {

	/**
	 * See <a href="https://www.w3schools.com/tags/ev_onhashchange.asp">HTML onhashchange Event Attribute</a>.
	 *
	 * @since HTML 5
	 */
	@Attributes.Funnel
	default E onhashchange(Object onhashchange) throws IOException {
		@SuppressWarnings("unchecked") E element = (E)this;
		if(element.getDocument().doctype != Doctype.HTML5) {
			throw new LocalizedIllegalArgumentException(
				RESOURCES,
				"onlySupportedInHtml5",
				element.getDocument().doctype,
				"onhashchange"
			);
		}
		return Attributes.Event.attribute(element, "onhashchange", onhashchange);
	}

	/**
	 * See <a href="https://www.w3schools.com/tags/ev_onhashchange.asp">HTML onhashchange Event Attribute</a>.
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @since HTML 5
	 *
	 * @see #onhashchange(java.lang.Object)
	 */
	default <Ex extends Throwable> E onhashchange(IOSupplierE<?, Ex> onhashchange) throws IOException, Ex {
		return onhashchange((onhashchange == null) ? null : onhashchange.get());
	}

	/**
	 * See <a href="https://www.w3schools.com/tags/ev_onhashchange.asp">HTML onhashchange Event Attribute</a>.
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @since HTML 5
	 *
	 * @see #onhashchange(java.lang.Object)
	 */
	default <Ex extends Throwable> E onhashchange(MediaWritable<Ex> onhashchange) throws IOException, Ex {
		return onhashchange((Object)onhashchange);
	}
}