// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.monitoring.v1.inputs.ColumnArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A simplified layout that divides the available space into vertical columns and arranges a set of widgets vertically in each column.
 * 
 */
public final class ColumnLayoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final ColumnLayoutArgs Empty = new ColumnLayoutArgs();

    /**
     * The columns of content to display.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<ColumnArgs>> columns;

    /**
     * @return The columns of content to display.
     * 
     */
    public Optional<Output<List<ColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    private ColumnLayoutArgs() {}

    private ColumnLayoutArgs(ColumnLayoutArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ColumnLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ColumnLayoutArgs $;

        public Builder() {
            $ = new ColumnLayoutArgs();
        }

        public Builder(ColumnLayoutArgs defaults) {
            $ = new ColumnLayoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns The columns of content to display.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<ColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns The columns of content to display.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<ColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns The columns of content to display.
         * 
         * @return builder
         * 
         */
        public Builder columns(ColumnArgs... columns) {
            return columns(List.of(columns));
        }

        public ColumnLayoutArgs build() {
            return $;
        }
    }

}