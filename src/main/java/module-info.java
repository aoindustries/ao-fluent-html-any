/*
 * ao-fluent-html-any - Base abstract classes and interfaces for Fluent Java DSL for high-performance HTML generation.
 * Copyright (C) 2021  AO Industries, Inc.
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
 * along with ao-fluent-html-any.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.aoapps.html.any {
	exports com.aoapps.html.any;
	exports com.aoapps.html.any.attributes.Boolean;
	exports com.aoapps.html.any.attributes.Dimension;
	exports com.aoapps.html.any.attributes.Enum;
	exports com.aoapps.html.any.attributes.Integer;
	exports com.aoapps.html.any.attributes.String;
	exports com.aoapps.html.any.attributes.Text;
	exports com.aoapps.html.any.attributes.Url;
	exports com.aoapps.html.any.attributes.event.clipboard;
	exports com.aoapps.html.any.attributes.event.drag;
	exports com.aoapps.html.any.attributes.event.form;
	exports com.aoapps.html.any.attributes.event.keyboard;
	exports com.aoapps.html.any.attributes.event.media;
	// TODO: exports com.aoapps.html.any.attributes.event.misc;
	exports com.aoapps.html.any.attributes.event.mouse;
	exports com.aoapps.html.any.attributes.event.window;
	// Direct
	requires com.aoapps.collections; // <groupId>com.aoapps</groupId><artifactId>ao-collections</artifactId>
	requires com.aoapps.encoding; // <groupId>com.aoapps</groupId><artifactId>ao-encoding</artifactId>
	requires com.aoapps.hodgepodge; // <groupId>com.aoapps</groupId><artifactId>ao-hodgepodge</artifactId>
	requires com.aoapps.lang; // <groupId>com.aoapps</groupId><artifactId>ao-lang</artifactId>
	// Java SE
	requires java.desktop;
}
