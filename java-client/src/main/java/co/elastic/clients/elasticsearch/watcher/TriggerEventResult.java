/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TriggerEventResult

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/watcher/_types/Trigger.ts#L39-L43">API
 *      specification</a>
 */
@JsonpDeserializable
public class TriggerEventResult implements JsonpSerializable {
	private final TriggerEvent manual;

	private final String triggeredTime;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private TriggerEventResult(Builder builder) {

		this.manual = ApiTypeHelper.requireNonNull(builder.manual, this, "manual");
		this.triggeredTime = ApiTypeHelper.requireNonNull(builder.triggeredTime, this, "triggeredTime");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static TriggerEventResult of(Function<Builder, ObjectBuilder<TriggerEventResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code manual}
	 */
	public final TriggerEvent manual() {
		return this.manual;
	}

	/**
	 * Required - API name: {@code triggered_time}
	 */
	public final String triggeredTime() {
		return this.triggeredTime;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("manual");
		this.manual.serialize(generator, mapper);

		generator.writeKey("triggered_time");
		generator.write(this.triggeredTime);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TriggerEventResult}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TriggerEventResult> {
		private TriggerEvent manual;

		private String triggeredTime;

		private String type;

		/**
		 * Required - API name: {@code manual}
		 */
		public final Builder manual(TriggerEvent value) {
			this.manual = value;
			return this;
		}

		/**
		 * Required - API name: {@code manual}
		 */
		public final Builder manual(Function<TriggerEvent.Builder, ObjectBuilder<TriggerEvent>> fn) {
			return this.manual(fn.apply(new TriggerEvent.Builder()).build());
		}

		/**
		 * Required - API name: {@code triggered_time}
		 */
		public final Builder triggeredTime(String value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link TriggerEventResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TriggerEventResult build() {
			_checkSingleUse();

			return new TriggerEventResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TriggerEventResult}
	 */
	public static final JsonpDeserializer<TriggerEventResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TriggerEventResult::setupTriggerEventResultDeserializer);

	protected static void setupTriggerEventResultDeserializer(ObjectDeserializer<TriggerEventResult.Builder> op) {

		op.add(Builder::manual, TriggerEvent._DESERIALIZER, "manual");
		op.add(Builder::triggeredTime, JsonpDeserializer.stringDeserializer(), "triggered_time");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
