// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleTypeDateResponse {
    /**
     * @return Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    private Integer day;
    /**
     * @return Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    private Integer month;
    /**
     * @return Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    private Integer year;

    private GoogleTypeDateResponse() {}
    /**
     * @return Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn&#39;t significant.
     * 
     */
    public Integer day() {
        return this.day;
    }
    /**
     * @return Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    public Integer month() {
        return this.month;
    }
    /**
     * @return Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    public Integer year() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDateResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;
        public Builder() {}
        public Builder(GoogleTypeDateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        @CustomType.Setter
        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        @CustomType.Setter
        public Builder month(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }
        @CustomType.Setter
        public Builder year(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public GoogleTypeDateResponse build() {
            final var o = new GoogleTypeDateResponse();
            o.day = day;
            o.month = month;
            o.year = year;
            return o;
        }
    }
}