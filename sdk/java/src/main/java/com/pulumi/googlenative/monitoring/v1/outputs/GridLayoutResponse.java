// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring.v1.outputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GridLayoutResponse {
    /**
     * @return The number of columns into which the view&#39;s width is divided. If omitted or set to zero, a system default will be used while rendering.
     * 
     */
    private String columns;
    /**
     * @return The informational elements that are arranged into the columns row-first.
     * 
     */
    private List<WidgetResponse> widgets;

    private GridLayoutResponse() {}
    /**
     * @return The number of columns into which the view&#39;s width is divided. If omitted or set to zero, a system default will be used while rendering.
     * 
     */
    public String columns() {
        return this.columns;
    }
    /**
     * @return The informational elements that are arranged into the columns row-first.
     * 
     */
    public List<WidgetResponse> widgets() {
        return this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GridLayoutResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String columns;
        private List<WidgetResponse> widgets;
        public Builder() {}
        public Builder(GridLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.widgets = defaults.widgets;
        }

        @CustomType.Setter
        public Builder columns(String columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }
        @CustomType.Setter
        public Builder widgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }
        public Builder widgets(WidgetResponse... widgets) {
            return widgets(List.of(widgets));
        }
        public GridLayoutResponse build() {
            final var o = new GridLayoutResponse();
            o.columns = columns;
            o.widgets = widgets;
            return o;
        }
    }
}