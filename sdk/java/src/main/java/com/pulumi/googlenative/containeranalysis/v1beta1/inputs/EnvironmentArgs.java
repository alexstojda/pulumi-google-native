// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an object for the environment field in in-toto links. The suggested fields are &#34;variables&#34;, &#34;filesystem&#34;, and &#34;workdir&#34;.
 * 
 */
public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="customValues")
    private @Nullable Output<Map<String,String>> customValues;

    public Optional<Output<Map<String,String>>> customValues() {
        return Optional.ofNullable(this.customValues);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.customValues = $.customValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder customValues(@Nullable Output<Map<String,String>> customValues) {
            $.customValues = customValues;
            return this;
        }

        public Builder customValues(Map<String,String> customValues) {
            return customValues(Output.of(customValues));
        }

        public EnvironmentArgs build() {
            return $;
        }
    }

}