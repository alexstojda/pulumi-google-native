// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WeeklyScheduleResponse {
    /**
     * @return Day of the week.
     * 
     */
    private String dayOfWeek;

    private WeeklyScheduleResponse() {}
    /**
     * @return Day of the week.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyScheduleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        public Builder() {}
        public Builder(WeeklyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public WeeklyScheduleResponse build() {
            final var o = new WeeklyScheduleResponse();
            o.dayOfWeek = dayOfWeek;
            return o;
        }
    }
}