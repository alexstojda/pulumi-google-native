// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WeekDayOfMonthResponse {
    /**
     * @return A day of the week.
     * 
     */
    private String dayOfWeek;
    /**
     * @return Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
     * 
     */
    private Integer dayOffset;
    /**
     * @return Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    private Integer weekOrdinal;

    private WeekDayOfMonthResponse() {}
    /**
     * @return A day of the week.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return Optional. Represents the number of days before or after the given week day of month that the patch deployment is scheduled for. For example if `week_ordinal` and `day_of_week` values point to the second day of the month and this `day_offset` value is set to `3`, the patch deployment takes place three days after the second Tuesday of the month. If this value is negative, for example -5, the patches are deployed five days before before the second Tuesday of the month. Allowed values are in range [-30, 30].
     * 
     */
    public Integer dayOffset() {
        return this.dayOffset;
    }
    /**
     * @return Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    public Integer weekOrdinal() {
        return this.weekOrdinal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeekDayOfMonthResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dayOfWeek;
        private Integer dayOffset;
        private Integer weekOrdinal;
        public Builder() {}
        public Builder(WeekDayOfMonthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.dayOffset = defaults.dayOffset;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        @CustomType.Setter
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        @CustomType.Setter
        public Builder dayOffset(Integer dayOffset) {
            this.dayOffset = Objects.requireNonNull(dayOffset);
            return this;
        }
        @CustomType.Setter
        public Builder weekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }
        public WeekDayOfMonthResponse build() {
            final var o = new WeekDayOfMonthResponse();
            o.dayOfWeek = dayOfWeek;
            o.dayOffset = dayOffset;
            o.weekOrdinal = weekOrdinal;
            return o;
        }
    }
}